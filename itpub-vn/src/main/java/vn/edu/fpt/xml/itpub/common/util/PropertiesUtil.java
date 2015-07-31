/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： PropertiesUtil.java <br>
 * <p>
 * Created： Jul 27, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 27, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common.util;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * The properties reader.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebListener
public class PropertiesUtil implements ServletContextListener {
    
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtil.class);
    
    /**
     * 
     */
    private static final String CONFIG_FILE = "appconfig.properties";
    /**
     * The properties collection.
     */
    private Properties props;
    /**
     * The instance.
     */
    private static PropertiesUtil instance;
    
    /**
     * 
     */
    public PropertiesUtil() {
        super();
        props = new Properties();
    }

    /**
     * Get the props attribute.
     * @return the props
     */
    private Properties getProps() {
        return props;
    }

    /**
     * Set the props attribute.
     * @param props the props to set
     */
    public void setProps(final Properties props) {
        this.props = props;
    }

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextDestroyed(final ServletContextEvent arg0) {
        try {
            getInstance().props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(CONFIG_FILE));
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    /* (non-Javadoc)
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
    @Override
    public void contextInitialized(final ServletContextEvent arg0) {
        
    }

    /**
     * Get the instance.
     * @return the instance
     */
    public static PropertiesUtil getInstance() {
        if (null == instance) {
            instance = new PropertiesUtil();
        }
        return instance;
    }

    /**
     * 
     * <p>
     * Get string value from props.
     * </p>
     * @param key String
     * @return String
     * @see (Related item)
     */
    public String getString(final String key) {
        return instance.getProps().getProperty(key);
    }
    
    /**
     * <p>
     * Get Integer value from props.
     * </p>
     * @param key String
     * @return Integer
     * @see (Related item)
     */
    public Integer getInt(final String key) {
        return Integer.parseInt(instance.getProps().getProperty(key));
    }
    
    /**
     * <p>
     * Get Double property.
     * </p>
     * @param key String
     * @return Double
     * @see (Related item)
     */
    public Double getDouble(final String key) {
        return Double.parseDouble(instance.getProps().getProperty(key));
    }
    
    /**
     * <p>
     * Get Float property.
     * </p>
     * @param key String
     * @return Float
     * @see (Related item)
     */
    public Float getFloat(final String key) {
        return Float.parseFloat(instance.getProps().getProperty(key));
    }
}
