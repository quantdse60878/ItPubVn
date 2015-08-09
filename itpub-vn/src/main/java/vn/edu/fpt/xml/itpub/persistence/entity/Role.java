/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： Role.java <br>
 * <p>
 * Created： Aug 5, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 5, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * 
 * The Role entity.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class Role extends AbstractKeyEntity {

    /**
     * 
     */
    private static final long serialVersionUID = 5344834686238451568L;
    
    /**
     * 
     */
    private String roleName;
    
    /**
     * 
     */
    private String roleDescription;

    /**
     * 
     */
    @ManyToMany
    @JoinTable(name = "UserRole", 
    joinColumns = @JoinColumn(name = "roleId"), inverseJoinColumns = @JoinColumn(name = "userId"))
    private List<User> users;
    
    /**
     * Get the roleName attribute.
     * @return the roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Set the roleName attribute.
     * @param roleName the roleName to set
     */
    public void setRoleName(final String roleName) {
        this.roleName = roleName;
    }

    /**
     * Get the roleDescription attribute.
     * @return the roleDescription
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * Set the roleDescription attribute.
     * @param roleDescription the roleDescription to set
     */
    public void setRoleDescription(final String roleDescription) {
        this.roleDescription = roleDescription;
    }

    /**
     * 
     */
    public Role() {
        super();
    }

}
