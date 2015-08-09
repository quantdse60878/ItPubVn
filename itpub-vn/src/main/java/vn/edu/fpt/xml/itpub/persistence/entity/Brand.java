/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： Brand.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.entity;

import javax.persistence.Entity;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class Brand extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 5956392183065613376L;

    /**
     * 
     */
    private String brandName;
    
    /**
     * 
     */
    private String description;

    /**
     * Get the brandName attribute.
     * @return the brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Set the brandName attribute.
     * @param brandName the brandName to set
     */
    public void setBrandName(final String brandName) {
        this.brandName = brandName;
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

    /**
     * @param id int
     * @param brandName int
     * @param description int
     */
    public Brand(final int id, final String brandName, final String description) {
        super(id);
        this.brandName = brandName;
        this.description = description;
    }

    /**
     * 
     */
    public Brand() {
        super();
    }
    
}
