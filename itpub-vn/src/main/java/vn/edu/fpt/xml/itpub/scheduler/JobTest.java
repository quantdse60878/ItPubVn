/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： JobTest.java <br>
 * <p>
 * Created： Aug 3, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 3, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.scheduler;

import java.sql.Timestamp;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class JobTest implements Job {

    private static final Logger LOGGER = LoggerFactory.getLogger(JobTest.class);
    
    /* (non-Javadoc)
     * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
     */
    @Override
    public void execute(final JobExecutionContext arg0) throws JobExecutionException {
        LOGGER.info("Current time:" + new Timestamp(System.currentTimeMillis()));
    }

}
