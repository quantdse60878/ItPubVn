/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： DeviceType.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 
 * The DeviceType entity.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class DeviceType extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -5385957928684181333L;
    
    /**
     * 
     */
    @Column(name = "deviceType")
    private String name;
    
    /**
     * 
     */
    private String description;

    /**
     * 
     */
    public DeviceType() {
        super();
    }

    /**
     * Get the name attribute.
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name attribute.
     * @param name the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Get the description attribute.
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description attribute.
     * @param description the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }
    
}
