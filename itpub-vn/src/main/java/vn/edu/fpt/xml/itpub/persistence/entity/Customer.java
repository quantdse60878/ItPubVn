/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： Customer.java <br>
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
 * The Customer entity.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class Customer extends AbstractKeyEntity {
    
    /**
     * 
     */
    private static final long serialVersionUID = -5477262159058434130L;

    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = true)
    private User user;
    
    /**
     * 
     */
    private String customerName;
    
    /**
     * 
     */
    private String address;
    
    /**
     * 
     */
    private String mobile;

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
    public Customer() {
        super();
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
     * Get the customerName attribute.
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Set the customerName attribute.
     * @param customerName the customerName to set
     */
    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    /**
     * Get the address attribute.
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the address attribute.
     * @param address the address to set
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Get the mobile attribute.
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Set the mobile attribute.
     * @param mobile the mobile to set
     */
    public void setMobile(final String mobile) {
        this.mobile = mobile;
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
