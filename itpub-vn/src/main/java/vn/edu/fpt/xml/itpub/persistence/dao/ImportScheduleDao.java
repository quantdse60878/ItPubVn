/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ImportScheduleDao.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.dao;


import java.util.List;

import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.persistence.IDbConsts.IImportScheduleStatus;
import vn.edu.fpt.xml.itpub.persistence.entity.ImportSchedule;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class ImportScheduleDao extends AbstractDao<ImportSchedule, Integer> {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ImportScheduleDao.class);
    
    /**
     * <p>
     * Find by status.
     * </p>
     * @param status {@link IImportScheduleStatus}
     * @return {@link List}
     * @see (Related item)
     */
    @SuppressWarnings("unchecked")
    public List<ImportSchedule> findByStatus(final byte status) {
        LOGGER.debug(IConsts.BEGIN_METHOD);
        try {
            LOGGER.debug("status[{}]", status);
            final Query query = getSession().createQuery("from ImportSchedule where status = :status");
            query.setParameter("status", status);
            return query.list();
        } finally {
            LOGGER.debug(IConsts.END_METHOD);
        }
    }
}
