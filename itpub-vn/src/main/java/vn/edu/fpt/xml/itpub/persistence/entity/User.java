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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class User extends AbstractKeyEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5722527982142340610L;

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
     * 
     */
    @Column(name = "fullname")
    private String fullname;
    
    /**
     * 
     */
    @Column(name = "gender")
    private byte gender;
    
    /**
     * 
     */
    @Column(name = "locale")
    private String locale;
    
    /**
     * 
     */
    @Column(name = "lastLogin")
    private Date lastLogin;
    
    /**
     * 
     */
    @Column(name = "createTime")
    private Date createTime;
    
    /**
     * 
     */
    @Column(name = "updateTime")
    private Date updateTime;

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
     * 
     */
    public User() {
        super();
    }
    
    
}
