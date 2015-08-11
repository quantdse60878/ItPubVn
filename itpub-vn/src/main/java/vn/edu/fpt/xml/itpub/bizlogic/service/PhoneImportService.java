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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.bizlogic.model.ProductModel;
import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.common.exception.BizlogicException;
import vn.edu.fpt.xml.itpub.common.util.HtmlUtil;
import vn.edu.fpt.xml.itpub.common.util.XmlUtil;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IImportScheduleStatus;
import vn.edu.fpt.xml.itpub.persistence.entity.ImportSchedule;

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
    private static final String RAW_PHONE_XSL_PATH = IConsts.REAL_PATH + "/WEB-INF/xsl/rawPhoneData.xsl";

    public void importJob() {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            List<ImportSchedule> listSchedule = IMPORT_SCHEDULE_DAO.findByStatus(IImportScheduleStatus.ACTIVE);
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
                        final String rawData = productPage.asXml();
                        final ProductModel phone = this.getPhoneInfo(rawData, schedule, productUrl);
                        if (null != phone) {
                            // TODO Save to db
                        }
                    }
                }

            }

        } finally {
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
     * @return {@link ProductModel}
     * @see (Related item)
     */
    public ProductModel getPhoneInfo(final String rawData, final ImportSchedule setting, final String directUrl) {
        LOGGER.debug(IConsts.BEGIN_METHOD);
        try {
            LOGGER.debug("directUrl[{}]", directUrl);
            LOGGER.debug("rawData[{}]", rawData);
            Map<String, String> paramVals = new HashMap<>();
            // Set param to XSL
            if (null != setting) {
               final String name = setting.getXpathStringName();
               if (null != name && StringUtils.isEmpty(name)) {
                   paramVals.put("name", name);
               }
               final String quarantyInfo = setting.getXpathStringQuarantyInfo();
               if (null != quarantyInfo && StringUtils.isEmpty(quarantyInfo)) {
                   paramVals.put("quarantyInfo", quarantyInfo);
               }
               final String description = setting.getXpathStringDescription();
               if (null != description && StringUtils.isEmpty(description)) {
                   paramVals.put("description", description);
               }
               final String promotion = setting.getXpathStringPromotion();
               if (null != promotion && StringUtils.isEmpty(promotion)) {
                   paramVals.put("promotion", promotion);
               }
               final String imageUrl = setting.getXpathStringImageUrl();
               if (null != imageUrl && StringUtils.isEmpty(imageUrl)) {
                   paramVals.put("imageUrl", imageUrl);
               }
               final String price = setting.getXpathStringPirce();
               if (null != price && StringUtils.isEmpty(price)) {
                   paramVals.put("price", price);
               }
               if (null != directUrl && StringUtils.isEmpty(directUrl)) {
                   paramVals.put("directUrl", directUrl);
               }
               final String infos = setting.getXpathListStringInfos();
               if (null != infos && StringUtils.isEmpty(infos)) {
                   paramVals.put("infos", infos);
               }
            }
            // end set
            
            // Convert RAW data to xml string using XSL
            final String outputXml = XmlUtil.applyXSL(rawData, RAW_PHONE_XSL_PATH, paramVals);
            
            // Binding output to JAXB
            
        } catch (BizlogicException e) {
            LOGGER.error("Error while parsing xml to JAXB model of Phone: " + e.getMessage());
        } finally {
            LOGGER.debug(IConsts.END_METHOD);
        }
        return null;
    }
}
