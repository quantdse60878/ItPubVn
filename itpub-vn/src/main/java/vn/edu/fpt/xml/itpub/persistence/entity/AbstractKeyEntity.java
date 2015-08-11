/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： AbstractKeyEntity.java <br>
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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 
 * The entity has primary key only.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@MappedSuperclass
public class AbstractKeyEntity implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 4628280798960958179L;
    /**
     * 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * @param id The id
     */
    public AbstractKeyEntity(final Integer id) {
        super();
        this.id = id;
    }

    /**
     * 
     */
    public AbstractKeyEntity() {
        super();
    }

    /**
     * Get the id attribute.
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the id attribute.
     * @param id the id to set
     */
    public void setId(final Integer id) {
        this.id = id;
    }
    
}
