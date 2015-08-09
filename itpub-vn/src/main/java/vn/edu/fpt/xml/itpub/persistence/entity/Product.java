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
    private double price;
    
    /**
     * 
     */
    private byte status;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "createUser")
    private User createdUser;

    
    /**
     * 
     */
    private Date createTime;
    
    /**
     * 
     */
    private Date updateTime;

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
     * Get the createTime attribute.
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Set the createTime attribute.
     * @param createTime the createTime to set
     */
    public void setCreateTime(final Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Get the updateTime attribute.
     * @return the updateTime
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Set the updateTime attribute.
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(final Date updateTime) {
        this.updateTime = updateTime;
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
    
}
