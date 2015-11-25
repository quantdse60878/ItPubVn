/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductInfoModel.java <br>
 * <p>
 * Created： Aug 13, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 13, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlRootElement(name = "info")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"key", "value"})
public class ProductInfoModel implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 3082380871110476657L;

    /**
     * 
     */
    @XmlElement
    private String key;
    
    /**
     * 
     */
    @XmlElement
    private String value;

    /**
     * Get the key attribute.
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Set the key attribute.
     * @param key the key to set
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * Get the value attribute.
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Set the value attribute.
     * @param value the value to set
     */
    public void setValue(final String value) {
        this.value = value;
    }
    
}
