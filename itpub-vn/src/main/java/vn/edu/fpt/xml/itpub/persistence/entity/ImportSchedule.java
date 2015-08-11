/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ImportSchedule.java <br>
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
public class ImportSchedule extends AbstractKeyEntity {
    
    /**
     * 
     */
    private static final long serialVersionUID = -6240649050758126261L;

    /**
     * 
     */
    private String scheduleName;
    
    /**
     * 
     */
    private byte status;
    
    
    /**
     * 
     */
    private byte isRunning;
    
    
    /**
     * 
     */
    private String crawlingUrl;
    

    /**
     * 
     */
    private String xpathHrefChild;
    
    /**
     * 
     */
    private String xpathStringName;
    
    /**
     * 
     */
    private String xpathStringQuarantyInfo;
    
    /**
     * 
     */
    private String xpathStringDescription;
    
    /**
     * 
     */
    private String xpathStringPromotion;
    
    /**
     * 
     */
    private String xpathStringImageUrl;
    
    /**
     * 
     */
    private String xpathStringPirce;
    
    /**
     * 
     */
    private String xpathStringDirectLink;
    
    /**
     * 
     */
    private String xpathListStringInfos;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deviceTypeId", nullable = false)
    private DeviceType deviceType;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brandId", nullable = false)
    private Brand brand;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    
    
    /**
     * Get the scheduleName attribute.
     * @return the scheduleName
     */
    public String getScheduleName() {
        return scheduleName;
    }

    /**
     * Set the scheduleName attribute.
     * @param scheduleName the scheduleName to set
     */
    public void setScheduleName(final String scheduleName) {
        this.scheduleName = scheduleName;
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
     * Get the isRunning attribute.
     * @return the isRunning
     */
    public byte getIsRunning() {
        return isRunning;
    }

    /**
     * Set the isRunning attribute.
     * @param isRunning the isRunning to set
     */
    public void setIsRunning(final byte isRunning) {
        this.isRunning = isRunning;
    }

    /**
     * Get the crawlingUrl attribute.
     * @return the crawlingUrl
     */
    public String getCrawlingUrl() {
        return crawlingUrl;
    }

    /**
     * Set the crawlingUrl attribute.
     * @param crawlingUrl the crawlingUrl to set
     */
    public void setCrawlingUrl(final String crawlingUrl) {
        this.crawlingUrl = crawlingUrl;
    }

    /**
     * Get the xpathHrefChild attribute.
     * @return the xpathHrefChild
     */
    public String getXpathHrefChild() {
        return xpathHrefChild;
    }

    /**
     * Set the xpathHrefChild attribute.
     * @param xpathHrefChild the xpathHrefChild to set
     */
    public void setXpathHrefChild(final String xpathHrefChild) {
        this.xpathHrefChild = xpathHrefChild;
    }

    /**
     * Get the xpathStringName attribute.
     * @return the xpathStringName
     */
    public String getXpathStringName() {
        return xpathStringName;
    }

    /**
     * Set the xpathStringName attribute.
     * @param xpathStringName the xpathStringName to set
     */
    public void setXpathStringName(final String xpathStringName) {
        this.xpathStringName = xpathStringName;
    }

    /**
     * Get the xpathStringQuarantyInfo attribute.
     * @return the xpathStringQuarantyInfo
     */
    public String getXpathStringQuarantyInfo() {
        return xpathStringQuarantyInfo;
    }

    /**
     * Set the xpathStringQuarantyInfo attribute.
     * @param xpathStringQuarantyInfo the xpathStringQuarantyInfo to set
     */
    public void setXpathStringQuarantyInfo(final String xpathStringQuarantyInfo) {
        this.xpathStringQuarantyInfo = xpathStringQuarantyInfo;
    }

    /**
     * Get the xpathStringDescription attribute.
     * @return the xpathStringDescription
     */
    public String getXpathStringDescription() {
        return xpathStringDescription;
    }

    /**
     * Set the xpathStringDescription attribute.
     * @param xpathStringDescription the xpathStringDescription to set
     */
    public void setXpathStringDescription(final String xpathStringDescription) {
        this.xpathStringDescription = xpathStringDescription;
    }

    /**
     * Get the xpathStringPromotion attribute.
     * @return the xpathStringPromotion
     */
    public String getXpathStringPromotion() {
        return xpathStringPromotion;
    }

    /**
     * Set the xpathStringPromotion attribute.
     * @param xpathStringPromotion the xpathStringPromotion to set
     */
    public void setXpathStringPromotion(final String xpathStringPromotion) {
        this.xpathStringPromotion = xpathStringPromotion;
    }

    /**
     * Get the xpathStringImageUrl attribute.
     * @return the xpathStringImageUrl
     */
    public String getXpathStringImageUrl() {
        return xpathStringImageUrl;
    }

    /**
     * Set the xpathStringImageUrl attribute.
     * @param xpathStringImageUrl the xpathStringImageUrl to set
     */
    public void setXpathStringImageUrl(final String xpathStringImageUrl) {
        this.xpathStringImageUrl = xpathStringImageUrl;
    }

    /**
     * Get the xpathStringPirce attribute.
     * @return the xpathStringPirce
     */
    public String getXpathStringPirce() {
        return xpathStringPirce;
    }

    /**
     * Set the xpathStringPirce attribute.
     * @param xpathStringPirce the xpathStringPirce to set
     */
    public void setXpathStringPirce(final String xpathStringPirce) {
        this.xpathStringPirce = xpathStringPirce;
    }

    /**
     * Get the xpathStringDirectLink attribute.
     * @return the xpathStringDirectLink
     */
    public String getXpathStringDirectLink() {
        return xpathStringDirectLink;
    }

    /**
     * Set the xpathStringDirectLink attribute.
     * @param xpathStringDirectLink the xpathStringDirectLink to set
     */
    public void setXpathStringDirectLink(final String xpathStringDirectLink) {
        this.xpathStringDirectLink = xpathStringDirectLink;
    }

    /**
     * Get the xpathListStringInfos attribute.
     * @return the xpathListStringInfos
     */
    public String getXpathListStringInfos() {
        return xpathListStringInfos;
    }

    /**
     * Set the xpathListStringInfos attribute.
     * @param xpathListStringInfos the xpathListStringInfos to set
     */
    public void setXpathListStringInfos(final String xpathListStringInfos) {
        this.xpathListStringInfos = xpathListStringInfos;
    }

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
     * Get the user attribute.
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user attribute.
     * @param user the user to set
     */
    public void setUser(final User user) {
        this.user = user;
    }

    /**
     * 
     */
    public ImportSchedule() {
        super();
    }
    
}
