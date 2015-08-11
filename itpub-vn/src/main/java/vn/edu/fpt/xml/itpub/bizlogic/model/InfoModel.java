/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： InfoModel.java <br>
 * <p>
 * Created： Aug 11, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 11, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
public class InfoModel implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -836537033942862529L;
    /**
     * The list of property.
     */
    protected List<String> property;

    /**
     * Get the property attribute.
     * @return the property
     */
    public List<String> getProperty() {
        return property;
    }

    /**
     * Set the property attribute.
     * @param property the property to set
     */
    public void setProperty(final List<String> property) {
        this.property = property;
    }
    
}
