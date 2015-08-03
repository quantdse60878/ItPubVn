/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project <br>
 * File： User.java <br>
 * <p>
 * Created： Aug 3, 2015<br>
 * History： <br>
 * Date Person Reason <br>
 * Aug 3, 2015 dangquantran Initial<br>
 * 
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The User entity.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

@Entity
@Table(name = "User")
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5722527982142340610L;
    /**
     * 
     */
    @Id
    @Column(name = "id")
    private int id;

    /**
     * 
     */
    @Column(name = "username")
    private String username;
    /**
     * 
     */
    @Column(name = "password")
    private String password;

    /**
     * Get the id attribute.
     * 
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * Set the id attribute.
     * 
     * @param id the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }
    /**
     * Get the username attribute.
     * 
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    /**
     * Set the username attribute.
     * 
     * @param username the username to set
     */
    public void setUsername(final String username) {
        this.username = username;
    }
    /**
     * Get the password attribute.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * Set the password attribute.
     * 
     * @param password the password to set
     */
    public void setPassword(final String password) {
        this.password = password;
    }
}
