/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductShortModel.java <br>
 * <p>
 * Created： Aug 12, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 12, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlRootElement(name = "product")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductShortModel implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6150374070333570750L;

    /**
     * 
     */
    @XmlElement(name = "id", required = true)
    private int id;
    
    /**
     * 
     */
    @XmlElement(name = "name", required = true)
    private String name;
    
    /**
     * 
     */
    @XmlElement(name = "price", required = true)
    private int price;
    
    /**
     * 
     */
    @XmlElement(name = "imageUrl", required = true)
    private String imageUrl;

    /**
     * 
     */
    @XmlElement(name = "brand", required = true)
    private String brand;
    
    /**
     * Get the id attribute.
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id attribute.
     * @param id the id to set
     */
    public void setId(final int id) {
        this.id = id;
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
     * Get the price attribute.
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set the price attribute.
     * @param price the price to set
     */
    public void setPrice(final int price) {
        this.price = price;
    }

    /**
     * Get the imageUrl attribute.
     * @return the imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Set the imageUrl attribute.
     * @param imageUrl the imageUrl to set
     */
    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    
    /**
     * Get the brand attribute.
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set the brand attribute.
     * @param brand the brand to set
     */
    public void setBrand(final String brand) {
        this.brand = brand;
    }

    /**
     * 
     */
    public ProductShortModel() {
        super();
    }
}
