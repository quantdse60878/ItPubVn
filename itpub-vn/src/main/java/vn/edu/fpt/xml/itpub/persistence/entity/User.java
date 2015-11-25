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

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * The User entity.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

@Entity
public class User extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 5722527982142340610L;

    /**
     * 
     */
    private String username;
    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String fullname;
    
    /**
     * 
     */
    private byte gender;
    
    /**
     * 
     */
    private String locale;
    
    /**
     * 
     */
    private Date lastLogin;
    
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
    private byte status;
    
    /**
     * List of roles.
     */
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "UserRole", joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    private List<Role> roles;
    
    /**
     * Get the username attribute.
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the username attribute.
     * @param username the username to set
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Get the password attribute.
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the password attribute.
     * @param password the password to set
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Get the fullname attribute.
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Set the fullname attribute.
     * @param fullname the fullname to set
     */
    public void setFullname(final String fullname) {
        this.fullname = fullname;
    }

    /**
     * Get the gender attribute.
     * @return the gender
     */
    public byte getGender() {
        return gender;
    }

    /**
     * Set the gender attribute.
     * @param gender the gender to set
     */
    public void setGender(final byte gender) {
        this.gender = gender;
    }

    /**
     * Get the locale attribute.
     * @return the locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Set the locale attribute.
     * @param locale the locale to set
     */
    public void setLocale(final String locale) {
        this.locale = locale;
    }

    /**
     * Get the lastLogin attribute.
     * @return the lastLogin
     */
    public Date getLastLogin() {
        return lastLogin;
    }

    /**
     * Set the lastLogin attribute.
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(final Date lastLogin) {
        this.lastLogin = lastLogin;
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

    /**
     * Get the roles attribute.
     * @return the roles
     */
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * Set the roles attribute.
     * @param roles the roles to set
     */
    public void setRoles(final List<Role> roles) {
        this.roles = roles;
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
    public User() {
        super();
    }
    
    
}
