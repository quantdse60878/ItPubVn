/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： OrderDetail.java <br>
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
public class OrderDetail extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = -5508829871011477391L;

    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;
    
    
    /**
     * 
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productId", nullable = false)
    private Product product;
    
    /**
     * 
     */
    private int quantity;
    
    /**
     * 
     */
    private byte status;

    /**
     * 
     */
    public OrderDetail() {
        super();
    }

    /**
     * Get the order attribute.
     * @return the order
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Set the order attribute.
     * @param order the order to set
     */
    public void setOrder(final Order order) {
        this.order = order;
    }

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
    
}
