/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： Product.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class Product extends AbstractKeyEntity {
    
    /**
     * 
     */
    private static final long serialVersionUID = 461639940974524876L;

    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deviceTypeId")
    private DeviceType deviceType;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brandId")
    private Brand brand;
    
    /**
     * 
     */
    private String name;
    
    /**
     * 
     */
    private String barcode;
    
    /**
     * 
     */
    private String quarantyInfo;
    
    /**
     * 
     */
    private String description;

    /**
     * 
     */
    private String promotion;
    
    /**
     * 
     */
    private String imageUrl;
    
    
    /**
     * 
     */
    private String internalImageUrl;
    
    /**
     * 
     */
    private double price;
    
    /**
     * 
     */
    private byte status;
    
    /**
     * 
     */
    private String directLink;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createdUser")
    private User createdUser;

    
    /**
     * 
     */
    private Date createdDate;
    
    /**
     * 
     */
    private Date updatedDate;

    /**
     * 
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<ProductInfo> productInfos;
    
    /**
     * Get the deviceType attribute.
     * @return the deviceType
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Set the deviceType attribute.
     * @param deviceType the deviceType to set
     */
    public void setDeviceType(final DeviceType deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * Get the brand attribute.
     * @return the brand
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * Set the brand attribute.
     * @param brand the brand to set
     */
    public void setBrand(final Brand brand) {
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
     * Get the price attribute.
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price attribute.
     * @param price the price to set
     */
    public void setPrice(final double price) {
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
     * Get the createdUser attribute.
     * @return the createdUser
     */
    public User getCreatedUser() {
        return createdUser;
    }

    /**
     * Set the createdUser attribute.
     * @param createdUser the createdUser to set
     */
    public void setCreatedUser(final User createdUser) {
        this.createdUser = createdUser;
    }


    /**
     * Get the productInfos attribute.
     * @return the productInfos
     */
    public List<ProductInfo> getProductInfos() {
        return productInfos;
    }

    /**
     * Set the productInfos attribute.
     * @param productInfos the productInfos to set
     */
    public void setProductInfos(final List<ProductInfo> productInfos) {
        this.productInfos = productInfos;
    }

    /**
     * 
     */
    public Product() {
        super();
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
     * Get the createdDate attribute.
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * Set the createdDate attribute.
     * @param createdDate the createdDate to set
     */
    public void setCreatedDate(final Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Get the updatedDate attribute.
     * @return the updatedDate
     */
    public Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Set the updatedDate attribute.
     * @param updatedDate the updatedDate to set
     */
    public void setUpdatedDate(final Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    
}
