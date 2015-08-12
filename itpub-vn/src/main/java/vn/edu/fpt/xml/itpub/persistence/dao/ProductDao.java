/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductDao.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.dao;

import java.util.List;

import org.hibernate.Query;

import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IProductStatus;
import vn.edu.fpt.xml.itpub.persistence.entity.Product;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class ProductDao extends AbstractDao<Product, Integer> {

    /**
     * <p>
     * Find one by direct link.
     * </p>
     * @param directLink {@link String}
     * @return {@link Product}
     * @see (Related item)
     */
    @SuppressWarnings("unchecked")
    public Product findByDirectLink(final String directLink) {
        final Query query = getSession().createQuery("from Product where directLink = :directLink");
        query.setParameter("directLink", directLink);
        final List<Product> ls = query.list();
        if (null != ls && !ls.isEmpty()) {
            return ls.get(0);
        }
        return null;
    }
    
    /**
     * <p>
     * Find by status.
     * </p>
     * @param status {@link IProductStatus}
     * @return {@link List}
     * @see (Related item)
     */
    @SuppressWarnings("unchecked")
    public List<Product> findByStatus(final byte status) {
        final Query query = getSession().createQuery("from Product where status = :status");
        query.setParameter("status", status);
        return query.list();
    }
}
