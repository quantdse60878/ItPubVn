/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： Order.java <br>
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
public class Order extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -752609508298966229L;

    /**
     * 
     */
    private String orderNo;
    
    /**
     * 
     */
    private String barcode;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;
    
    /**
     * 
     */
    private Date createdDate;
    
    /**
     * 
     */
    private Date approvedDate;
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "approvedUser", nullable = false)
    private User approvedUser;
    
    /**
     * 
     */
    private byte status;

    /**
     * Get the orderNo attribute.
     * @return the orderNo
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Set the orderNo attribute.
     * @param orderNo the orderNo to set
     */
    public void setOrderNo(final String orderNo) {
        this.orderNo = orderNo;
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
     * Get the customer attribute.
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Set the customer attribute.
     * @param customer the customer to set
     */
    public void setCustomer(final Customer customer) {
        this.customer = customer;
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
     * Get the approvedDate attribute.
     * @return the approvedDate
     */
    public Date getApprovedDate() {
        return approvedDate;
    }

    /**
     * Set the approvedDate attribute.
     * @param approvedDate the approvedDate to set
     */
    public void setApprovedDate(final Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    /**
     * Get the approvedUser attribute.
     * @return the approvedUser
     */
    public User getApprovedUser() {
        return approvedUser;
    }

    /**
     * Set the approvedUser attribute.
     * @param approvedUser the approvedUser to set
     */
    public void setApprovedUser(final User approvedUser) {
        this.approvedUser = approvedUser;
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
     * 
     */
    public Order() {
        super();
    }
    
}
