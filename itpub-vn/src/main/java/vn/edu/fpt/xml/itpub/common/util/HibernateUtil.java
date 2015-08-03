/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： HibernateUtil.java <br>
 * <p>
 * Created： Jul 27, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 27, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.common.IConsts;

/**
 * 
 * The context loader for persistence entity by Hibernate.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebListener
public class HibernateUtil implements ServletContextListener {
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HibernateUtil.class);
    /**
     * The session factory.
     */
    private static SessionFactory sessionFactory;
    
    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(final ServletContextEvent arg0) {
        HibernateUtil.shutdown();
    }

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(final ServletContextEvent arg0) {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }

    /**
     * Get the sessionFactory attribute.
     * @return the sessionFactory
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void shutdown() {
        sessionFactory.close();
    }
}
