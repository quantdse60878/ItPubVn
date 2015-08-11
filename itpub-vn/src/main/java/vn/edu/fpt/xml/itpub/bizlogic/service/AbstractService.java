/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： AbstractService.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.persistence.dao.ImportScheduleDao;

/**
 * 
 * The abstract service.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class AbstractService {

    
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractService.class);
    
    /**
     * The import schedule dao.
     */
    protected static final ImportScheduleDao IMPORT_SCHEDULE_DAO = new ImportScheduleDao();
}
