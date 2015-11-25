/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： InventoryTracking.java <br>
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
public class InventoryTracking extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 6246345910405347566L;

    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId")
    private Product product;
    
    /**
     * 
     */
    private byte type;
    
    /**
     * 
     */
    private int quantity;
    
    /**
     * 
     */
    private Date createdDate;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stockInUser", nullable = true)
    private User stockInUser;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stockOutUser", nullable = true)
    private User stockOutUser;

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
     * Get the type attribute.
     * @return the type
     */
    public byte getType() {
        return type;
    }

    /**
     * Set the type attribute.
     * @param type the type to set
     */
    public void setType(final byte type) {
        this.type = type;
    }

    /**
     * Get the quantity attribute.
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity attribute.
     * @param quantity the quantity to set
     */
    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the stockInUser attribute.
     * @return the stockInUser
     */
    public User getStockInUser() {
        return stockInUser;
    }

    /**
     * Set the stockInUser attribute.
     * @param stockInUser the stockInUser to set
     */
    public void setStockInUser(final User stockInUser) {
        this.stockInUser = stockInUser;
    }

    /**
     * Get the stockOutUser attribute.
     * @return the stockOutUser
     */
    public User getStockOutUser() {
        return stockOutUser;
    }

    /**
     * Set the stockOutUser attribute.
     * @param stockOutUser the stockOutUser to set
     */
    public void setStockOutUser(final User stockOutUser) {
        this.stockOutUser = stockOutUser;
    }

    /**
     * 
     */
    public InventoryTracking() {
        super();
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
}
