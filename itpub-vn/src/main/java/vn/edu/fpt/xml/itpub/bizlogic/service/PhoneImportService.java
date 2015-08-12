/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project <br>
 * File： PhoneImportService.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date Person Reason <br>
 * Aug 9, 2015 dangquantran Initial<br>
 * 
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.bizlogic.model.InfoModel;
import vn.edu.fpt.xml.itpub.bizlogic.model.RawDataModel;
import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.common.exception.BizlogicException;
import vn.edu.fpt.xml.itpub.common.util.HtmlUtil;
import vn.edu.fpt.xml.itpub.common.util.StringUtil;
import vn.edu.fpt.xml.itpub.common.util.XmlUtil;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IImportScheduleStatus;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IInventoryTrackingType;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IProductStatus;
import vn.edu.fpt.xml.itpub.persistence.dao.ImportScheduleDao;
import vn.edu.fpt.xml.itpub.persistence.dao.InventoryDao;
import vn.edu.fpt.xml.itpub.persistence.dao.InventoryTrackingDao;
import vn.edu.fpt.xml.itpub.persistence.dao.ProductDao;
import vn.edu.fpt.xml.itpub.persistence.dao.ProductInfoDao;
import vn.edu.fpt.xml.itpub.persistence.dao.UserDao;
import vn.edu.fpt.xml.itpub.persistence.entity.ImportSchedule;
import vn.edu.fpt.xml.itpub.persistence.entity.Inventory;
import vn.edu.fpt.xml.itpub.persistence.entity.InventoryTracking;
import vn.edu.fpt.xml.itpub.persistence.entity.Product;
import vn.edu.fpt.xml.itpub.persistence.entity.ProductInfo;
import vn.edu.fpt.xml.itpub.persistence.entity.User;

import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class PhoneImportService extends AbstractService {
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneImportService.class);
    /**
     * 
     */
    private static final String RAW_PRODUCT_XSL_PATH = IConsts.REAL_PATH + "/WEB-INF/xsl/rawFilter.xsl";

    /**
     * 
     */
    private static final String PRODUCT_SCHEMA_PATH = IConsts.REAL_PATH + "/WEB-INF/xsd/product.xsd";
    
    public void importJob() {
        LOGGER.info(IConsts.BEGIN_METHOD);
        ImportScheduleDao isDao = new ImportScheduleDao();
        ProductDao productDao = new ProductDao();
        UserDao userDao = new UserDao();
        ProductInfoDao piDao = new ProductInfoDao();
        InventoryDao inventoryDao = new InventoryDao();
        InventoryTrackingDao iTrackingDao = new InventoryTrackingDao();
        try {
            User user = userDao.findById(IConsts.DEFAULT_SYSTEM_USER);
            List<ImportSchedule> listSchedule = isDao.findByStatus(IImportScheduleStatus.ACTIVE);
            if (null != listSchedule && !listSchedule.isEmpty()) {
                for (ImportSchedule schedule : listSchedule) {
                    // Craw root url
                    HtmlPage rootPage = HtmlUtil.getHtmlPage(schedule.getCrawlingUrl(), null);

                    @SuppressWarnings("unchecked")
                    List<DomElement> list = (List<DomElement>) rootPage.getByXPath(schedule.getXpathHrefChild());
                    for (DomElement el : list) {
                        // Get HTML result from page
                        List<String> tags = new ArrayList<>();
                        tags.add("script");
                        tags.add("noscript");
                        tags.add("style");
                        final String productUrl = el.getAttribute("href");
                        final HtmlPage productPage = HtmlUtil.getHtmlPage(productUrl, tags);
                        /*
                         * Remove html attribute
                         */
                        List<DomElement> htmlHead = productPage.getElementsByTagName("html");
                        if (null != htmlHead && !htmlHead.isEmpty()) {
                            LOGGER.debug("html list size: " + htmlHead.size());
                            htmlHead.get(0).removeAttribute("xmlns");
                            htmlHead.get(0).removeAttribute("xml:lang");
                            htmlHead.get(0).removeAttribute("lang");
                        }
                        // End remove
                        
                        // Parse raw data to POJO object
                        String rawData = productPage.asXml();
                        
                        // TODO remove comment tags, special tag
                        // Remove comments data
                        rawData = StringUtil.cleanupHtml(rawData);
                        // End remove comments data
                        
                        final RawDataModel model = this.getPhoneInfo(rawData, schedule, productUrl);
                        if (null != model) {
                            
                            // Save product data
                            productDao.beginTransaction();
                            boolean createNew = false;
                            // TODO set param to XSL to use real data
                            Product product = productDao.findByDirectLink(productUrl);
                            if (null == product) {
                                product = new Product();
                                createNew = true;
                            }
                            product.setBrand(schedule.getBrand());
                            product.setDeviceType(schedule.getDeviceType());
                            product.setName(model.getName());
                            product.setBarcode("");
                            product.setQuarantyInfo(model.getQuarantyInfo());
                            product.setDescription(model.getDescription());
                            product.setPromotion(model.getPromotion());
                            product.setImageUrl(model.getImageUrl());
                            String strPrice = model.getPrice();
                            StringBuilder sb = new StringBuilder();
                            for (char c: strPrice.toCharArray()) {
                                if (c >= 48 && c <= 57) {
                                    sb.append(c);
                                }
                            }
                            String rs = sb.toString();
                            if (null != rs && !rs.isEmpty()) {
                                final int price = Integer.parseInt(rs);
                                product.setPrice(price);
                                product.setStatus(IProductStatus.ACTIVE);
                            } else {
                                product.setPrice(0);
                                product.setStatus(IProductStatus.IN_ACTIVE);
                            }
                            product.setDirectLink(productUrl);
                            if (createNew) {
                                product.setCreatedDate(new Date());
                            }
                            product.setUpdatedDate(new Date());
                            product.setCreatedUser(user);
                            
                            productDao.saveOrUpdate(product);
                            
                            productDao.flush();
                            productDao.commitTransaction();
                            
                            // Save product information
                            final InfoModel infos = model.getInfos();
                            if (null != infos && createNew) {
                                final List<String> properties = infos.getProperty();
                                if (null != properties && !properties.isEmpty()) {
                                   piDao.beginTransaction();
                                   for (String prop : properties) {
                                       String[] data = prop.split(":");
                                       if (null != data && data.length == 2) {
                                           ProductInfo pi = new ProductInfo();
                                           pi.setProduct(product);
                                           pi.setPropertyName(data[0]);
                                           pi.setPropertyValue(data[1]);
                                           piDao.save(pi);
                                       }
                                   }
                                   piDao.flush();
                                   piDao.commitTransaction();
                                }
                            }
                            
                            // Save product inventory and tracking data
                            if (createNew) {
                                Random random = new Random();
                                int quantity = random.nextInt(10);
                                inventoryDao.beginTransaction();
                                Inventory inventory = new Inventory();
                                inventory.setProduct(product);
                                inventory.setQuantity(quantity);
                                inventoryDao.save(inventory);
                                inventoryDao.commitTransaction();
                                
                                iTrackingDao.beginTransaction();
                                InventoryTracking tracking = new InventoryTracking();
                                tracking.setCreatedDate(new Date());
                                tracking.setProduct(product);
                                tracking.setQuantity(quantity);
                                tracking.setStockInUser(user);
                                tracking.setType(IInventoryTrackingType.IMPORT);
                                iTrackingDao.save(tracking);
                                iTrackingDao.commitTransaction();
                            }
                            
                        }
                    }
                }
            }
            
        } finally {
            isDao = null;
            productDao = null;
            userDao = null;
            piDao = null;
            LOGGER.info(IConsts.END_METHOD);
        }
    }
    
    
    /**
     * <p>
     * Get product information from raw data.
     * </p>
     * @param rawData {@link String}
     * @param setting {@link ImportSchedule}
     * @param directUrl {@link String}
     * @return {@link RawDataModel}
     * @see (Related item)
     */
    public RawDataModel getPhoneInfo(final String rawData, final ImportSchedule setting, final String directUrl) {
        LOGGER.debug(IConsts.BEGIN_METHOD);
        try {
            LOGGER.debug("directUrl[{}]", directUrl);
//            LOGGER.debug("rawData[{}]", rawData);
            Map<String, String> paramVals = new HashMap<>();
            // Set param to XSL
            if (null != setting) {
               final String name = setting.getXpathStringName();
               if (null != name && StringUtils.isNotEmpty(name)) {
                   paramVals.put("name", name);
               }
               final String quarantyInfo = setting.getXpathStringQuarantyInfo();
               if (null != quarantyInfo && StringUtils.isNotEmpty(quarantyInfo)) {
                   paramVals.put("quarantyInfo", quarantyInfo);
               }
               final String description = setting.getXpathStringDescription();
               if (null != description && StringUtils.isNotEmpty(description)) {
                   paramVals.put("description", description);
               }
               final String promotion = setting.getXpathStringPromotion();
               if (null != promotion && StringUtils.isNotEmpty(promotion)) {
                   paramVals.put("promotion", promotion);
               }
               final String imageUrl = setting.getXpathStringImageUrl();
               if (null != imageUrl && StringUtils.isNotEmpty(imageUrl)) {
                   paramVals.put("imageUrl", imageUrl);
               }
               final String price = setting.getXpathStringPirce();
               if (null != price && StringUtils.isNotEmpty(price)) {
                   paramVals.put("price", price);
               }
               if (null != directUrl && StringUtils.isNotEmpty(directUrl)) {
                   paramVals.put("directUrl", directUrl);
               }
               final String infos = setting.getXpathListStringInfos();
               if (null != infos && StringUtils.isNotEmpty(infos)) {
                   paramVals.put("infos", infos);
               }
            }
            // end set
            
            // Convert RAW data to xml string using XSL
            final String outputXml = XmlUtil.applyXSL(rawData, RAW_PRODUCT_XSL_PATH, paramVals);
            
            // Binding output to JAXB
            RawDataModel model = XmlUtil.unmarshallJAXB(RawDataModel.class, outputXml, PRODUCT_SCHEMA_PATH);
            return model;
        } catch (BizlogicException e) {
            LOGGER.error("Error while parsing xml to JAXB model of Phone: " + e.getMessage());
            return null;
        } finally {
            LOGGER.debug(IConsts.END_METHOD);
        }
    }
}
