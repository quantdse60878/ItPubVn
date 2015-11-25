/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： RawDataModel.java <br>
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlRootElement(name = "rawData")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "name", "quarantyInfo", "description", "promotion",
    "imageUrl", "price", "directLink", "infos" })
public class RawDataModel implements Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = 8519875414358013092L;

    /**
     * The name.
     */
    @XmlElement(name = "name")
    private String name;
    
    /**
     * The quaranty info.
     */
    @XmlElement(name = "quarantyInfo")
    private String quarantyInfo;
    
    /**
     * The description.
     */
    @XmlElement(name = "description")
    private String description;
    
    /**
     * The promotion.
     */
    @XmlElement(name = "promotion")
    private String promotion;
    
    /**
     * The image url.
     */
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = "imageUrl")
    private String imageUrl;
    
    /**
     * The price.
     */
    @XmlElement(name = "price")
    private String price;
    
    /**
     * The directLink.
     */
    @XmlSchemaType(name = "anyURI")
    @XmlElement(name = "directLink")
    private String directLink;
    
    /**
     * The infos.
     */
    @XmlElement(name = "infos")
    private RawInfoModel infos;

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
     * Get the price attribute.
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Set the price attribute.
     * @param price the price to set
     */
    public void setPrice(final String price) {
        this.price = price;
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
     * Get the infos attribute.
     * @return the infos
     */
    public RawInfoModel getInfos() {
        return infos;
    }

    /**
     * Set the infos attribute.
     * @param infos the infos to set
     */
    public void setInfos(final RawInfoModel infos) {
        this.infos = infos;
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
     * 
     */
    public RawDataModel() {
        super();
    }
    
}
