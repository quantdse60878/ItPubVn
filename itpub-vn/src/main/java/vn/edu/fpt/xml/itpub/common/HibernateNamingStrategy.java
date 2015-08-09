/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： HibernateNamingStrategy.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common;

import org.hibernate.cfg.DefaultNamingStrategy;

/**
 * 
 * The wrapper of Hibernate naming strategy.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class HibernateNamingStrategy extends DefaultNamingStrategy {

    /**
     * 
     */
    private static final long serialVersionUID = 1974762185463872548L;

    /* (non-Javadoc)
     * @see org.hibernate.cfg.DefaultNamingStrategy#classToTableName(java.lang.String)
     */
    @Override
    public String classToTableName(final String className) {
        return super.classToTableName(className);
    }

    /* (non-Javadoc)
     * @see org.hibernate.cfg.DefaultNamingStrategy#propertyToColumnName(java.lang.String)
     */
    @Override
    public String propertyToColumnName(final String propertyName) {
        return super.propertyToColumnName(propertyName);
    }
}
