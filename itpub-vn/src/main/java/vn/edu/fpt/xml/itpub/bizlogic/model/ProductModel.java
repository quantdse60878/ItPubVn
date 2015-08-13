/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductModel.java <br>
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
import javax.xml.bind.annotation.XmlSeeAlso;

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
@XmlSeeAlso(InfoListModel.class)
public class ProductModel implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -6966037429086055576L;

    /**
     * 
     */
    private int id;
    
    /**
     * 
     */
    @XmlElement(name = "brand")
    private String brand;
    
    /**
     * 
     */
    @XmlElement(name = "name")
    private String name;
    
    /**
     * 
     */
    @XmlElement(name = "barcode")
    private String barcode;
    
    /**
     * 
     */
    @XmlElement(name = "quarantyInfo")
    private String quarantyInfo;
    
    /**
     * 
     */
    @XmlElement(name = "description")
    private String description;

    /**
     * 
     */
    @XmlElement(name = "promotion")
    private String promotion;
    
    /**
     * 
     */
    @XmlElement(name = "promotion")
    private String imageUrl;
    
    
    /**
     * 
     */
    @XmlElement(name = "internalImageUrl")
    private String internalImageUrl;
    
    /**
     * 
     */
    @XmlElement(name = "price")
    private int price;
    
    /**
     * 
     */
    @XmlElement(name = "status")
    private byte status;
    
    /**
     * 
     */
    @XmlElement(name = "directLink")
    private String directLink;

    /**
     * 
     */
    @XmlElement(name = "infos")
    private InfoListModel infos;
    
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
     * Get the barcode attribute.
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Set the barcode attribute.
     * @param barcode the barcode to set
     */
    public void setBarcode(final String barcode) {
        this.barcode = barcode;
    }

    /**
     * Get the quarantyInfo attribute.
     * @return the quarantyInfo
     */
    public String getQuarantyInfo() {
        return quarantyInfo;
    }

    /**
     * Set the quarantyInfo attribute.
     * @param quarantyInfo the quarantyInfo to set
     */
    public void setQuarantyInfo(final String quarantyInfo) {
        this.quarantyInfo = quarantyInfo;
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
     * Get the promotion attribute.
     * @return the promotion
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * Set the promotion attribute.
     * @param promotion the promotion to set
     */
    public void setPromotion(final String promotion) {
        this.promotion = promotion;
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
     * Get the internalImageUrl attribute.
     * @return the internalImageUrl
     */
    public String getInternalImageUrl() {
        return internalImageUrl;
    }

    /**
     * Set the internalImageUrl attribute.
     * @param internalImageUrl the internalImageUrl to set
     */
    public void setInternalImageUrl(final String internalImageUrl) {
        this.internalImageUrl = internalImageUrl;
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
     * Get the status attribute.
     * @return the status
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Set the status attribute.
     * @param status the status to set
     */
    public void setStatus(final byte status) {
        this.status = status;
    }

    /**
     * Get the directLink attribute.
     * @return the directLink
     */
    public String getDirectLink() {
        return directLink;
    }

    /**
     * Set the directLink attribute.
     * @param directLink the directLink to set
     */
    public void setDirectLink(final String directLink) {
        this.directLink = directLink;
    }

    /**
     * 
     */
    public ProductModel() {
        super();
    }

    

    /**
     * Get the infos attribute.
     * @return the infos
     */
    public InfoListModel getInfos() {
        return infos;
    }

    /**
     * Set the infos attribute.
     * @param infos the infos to set
     */
    public void setInfos(final InfoListModel infos) {
        this.infos = infos;
    }

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

}
