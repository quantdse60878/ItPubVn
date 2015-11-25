/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductService.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.bizlogic.model.InfoListModel;
import vn.edu.fpt.xml.itpub.bizlogic.model.ProductInfoModel;
import vn.edu.fpt.xml.itpub.bizlogic.model.ProductModel;
import vn.edu.fpt.xml.itpub.bizlogic.model.ProductPageModel;
import vn.edu.fpt.xml.itpub.bizlogic.model.ProductShortModel;
import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IProductStatus;
import vn.edu.fpt.xml.itpub.persistence.dao.ProductDao;
import vn.edu.fpt.xml.itpub.persistence.entity.Product;
import vn.edu.fpt.xml.itpub.persistence.entity.ProductInfo;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class ProductService extends AbstractService {
    
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);
    
    /**
     * <p>
     * Get ACTIVE product.
     * </p>
     * @return {@link ProductPageModel}
     * @see (Related item)
     */
    public ProductPageModel getDataList() {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            ProductPageModel pageModel = new ProductPageModel();
            ProductDao productDao = new ProductDao();
            List<Product> products = productDao.findByStatus(IProductStatus.ACTIVE);
            if (null != products && !products.isEmpty()) {
                List<ProductShortModel> dataList = new ArrayList<>();
                for (Product p: products) {
                    ProductShortModel model = new ProductShortModel();
                    model.setId(p.getId());
                    model.setBrand(p.getBrand().getBrandName());
                    model.setName(p.getName());
                    model.setPrice(p.getPrice());
                    model.setImageUrl(p.getImageUrl());
                    dataList.add(model);
                }
                pageModel.getDataList().setModel(dataList);
            }
            return pageModel;
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }
    
    
    /**
     * <p>
     * Build product model by id.
     * </p>
     * @param id {@link Integer}
     * @return {@link ProductModel}
     * @see (Related item)
     */
    public ProductModel getDetailById(final int id) {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            ProductDao dao = new ProductDao();
            Product product = dao.findById(id);
            ProductModel model = null;
            if (null != product) {
                model = new ProductModel();
                model.setId(product.getId());
                model.setBarcode(product.getBarcode());
                model.setName(product.getName());
                model.setBrand(product.getBrand().getBrandName());
                model.setDescription(product.getDescription());
                model.setQuarantyInfo(product.getQuarantyInfo());
                model.setImageUrl(product.getImageUrl());
                model.setDirectLink(product.getDirectLink());
                model.setPrice(product.getPrice());
                model.setInternalImageUrl(product.getInternalImageUrl());
                model.setPromotion(product.getPromotion());
                model.setStatus(product.getStatus());
                List<ProductInfo> listInfo = product.getProductInfos();
                if (null != listInfo && !listInfo.isEmpty()) {
                   List<ProductInfoModel> listInfoModel = new ArrayList<>();
                   for (ProductInfo info: listInfo) {
                       ProductInfoModel infoModel = new ProductInfoModel();
                       infoModel.setKey(info.getPropertyName());
                       infoModel.setValue(info.getPropertyValue());
                       listInfoModel.add(infoModel);
                   }
                   InfoListModel ilm = new InfoListModel();
                   ilm.setInfo(listInfoModel);
                   model.setInfos(ilm);
                }
            }
            return model;
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }
}
