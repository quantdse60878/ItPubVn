/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： AbstractDao.java <br>
 * <p>
 * Created： Jul 29, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 29, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import vn.edu.fpt.xml.itpub.common.util.HibernateUtil;

/**
 * 
 * The abstract database access object.
 * 
 * @author dangquantran <br>
 * @param <E> An entity class
 * @param <ID> Id column
 * @version 1.0 <br>
 * @see (Related item)
 */
public abstract class AbstractDao<E, ID extends Serializable> implements IBaseDao<E, ID> {
    /**
     * 
     */
    private SessionFactory sessionFactory;
    /**
     * 
     */
    private Session session;

    /**
     * 
     */
    private Class<E> clazz;
    
    /**
     * 
     */
    @SuppressWarnings("unchecked")
    public AbstractDao() {
        super();
        sessionFactory = HibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
          ParameterizedType pt = (ParameterizedType) genericSuperclass;
          Type type = pt.getActualTypeArguments()[0];
          clazz = (Class<E>) type;
        }
    }

    /**
     * <p>
     * Begin a transaction.
     * </p>
     * @see (Related item)
     */
    public void beginTransaction() {
        session.beginTransaction();
    }
    
    /**
     * <p>
     * Commit transaction.
     * </p>
     * @see (Related item)
     */
    public void commitTransaction() {
        session.getTransaction().commit();
    }

    /**
     * <p>
     * Method summary.
     * </p>
     * @see (Related item)
     */
    public void closeSession() {
        if (null != session) {
            session.close();
        }
    }
    
    /**
     * Get the session attribute.
     * @return the session
     */
    public Session getSession() {
        return session;
    }

    /* (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.persistence.dao.IBaseDao#save(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    @Override
    public E save(final E e) {
        return (E) getSession().save(e);
    }

    /* (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.persistence.dao.IBaseDao#update(java.lang.Object)
     */
    @Override
    public void update(final E e) {
        getSession().update(e);
    }

    /* (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.persistence.dao.IBaseDao#delete(java.lang.Object)
     */
    @Override
    public void delete(final E e) {
        getSession().delete(e);
        
    }

    /* (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.persistence.dao.IBaseDao#findAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<E> findAll() {
        List<E> list = new ArrayList<E>();
        Query query = getSession().createQuery("from " + clazz.getSimpleName());
        list = query.list();
        return list;
    }

    /* (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.persistence.dao.IBaseDao#findById(java.io.Serializable)
     */
    @SuppressWarnings("unchecked")
    @Override
    public E findById(final ID id) {
        return (E) getSession().get(clazz, id);
    }
    
}
