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

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * The Role entity.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
@Table(name = "Role")
public class Role extends AbstractKeyEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5344834686238451568L;
    
}
