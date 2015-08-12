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

import vn.edu.fpt.xml.itpub.bizlogic.model.ProductPageModel;
import vn.edu.fpt.xml.itpub.bizlogic.model.ProductShortModel;
import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IProductStatus;
import vn.edu.fpt.xml.itpub.persistence.dao.ProductDao;
import vn.edu.fpt.xml.itpub.persistence.entity.Product;

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
    
}
