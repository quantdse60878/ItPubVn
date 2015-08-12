/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project <br>
 * File： IBaseDao.java <br>
 * <p>
 * Created： Aug 3, 2015<br>
 * History： <br>
 * Date Person Reason <br>
 * Aug 3, 2015 dangquantran Initial<br>
 * 
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.dao;

import java.io.Serializable;
import java.util.List;

/**
 * The base DAO.
 * 
 * @author dangquantran <br>
 * @param <E> An entity class
 * @param <ID> ID type
 * @version 1.0 <br>
 * @see (Related item)
 */
public interface IBaseDao<E, ID extends Serializable> {
    /**
     * <p>
     * Save entity to db.
     * </p>
     * @param e entity object
     * @return E
     * @see (Related item)
     */
    E save(E e);

    /**
     * <p>
     * Update entity to db.
     * </p>
     * @param e entity obj
     * @see (Related item)
     */
    void update(E e);
    
    /**
     * <p>
     * Delete entity obj.
     * </p>
     * @param e entity obj
     * @see (Related item)
     */
    void delete(E e);
    
    
    /**
     * <p>
     * Find all entity with type E.
     * </p>
     * @return List
     * @see (Related item)
     */
    List<E> findAll();
    
    /**
     * <p>
     * Find one E entity by id.
     * </p>
     * @param id ID
     * @return E
     * @see (Related item)
     */
    E findById(ID id);
    
    /**
     * 
     * <p>
     * Flush change to db.
     * </p>
     * @see (Related item)
     */
    void flush();
    
    /**
     * 
     * <p>
     * Save and flush entity to db.
     * </p>
     * @param e E
     * @see (Related item)
     */
    void saveAndFlush(E e);
    
    /**
     * <p>
     * Save or update entity.
     * </p>
     * @param e E.
     * @see (Related item)
     */
    void saveOrUpdate(E e);
    
}
