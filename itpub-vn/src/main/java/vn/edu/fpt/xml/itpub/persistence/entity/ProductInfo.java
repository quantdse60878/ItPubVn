/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductInfo.java <br>
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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class ProductInfo extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -7823480428615538018L;

    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;
    
    /**
     * 
     */
    private String propertyName;
    
    /**
     * 
     */
    private String propertyValue;

    /**
     * Get the product attribute.
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Set the product attribute.
     * @param product the product to set
     */
    public void setProduct(final Product product) {
        this.product = product;
    }

    /**
     * Get the propertyName attribute.
     * @return the propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Set the propertyName attribute.
     * @param propertyName the propertyName to set
     */
    public void setPropertyName(final String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * Get the propertyValue attribute.
     * @return the propertyValue
     */
    public String getPropertyValue() {
        return propertyValue;
    }

    /**
     * Set the propertyValue attribute.
     * @param propertyValue the propertyValue to set
     */
    public void setPropertyValue(final String propertyValue) {
        this.propertyValue = propertyValue;
    }

    /**
     * 
     */
    public ProductInfo() {
        super();
    }
    
    
}
