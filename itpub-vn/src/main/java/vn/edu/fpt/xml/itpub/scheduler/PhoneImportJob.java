/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： PhoneImportJob.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.scheduler;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.bizlogic.service.PhoneImportService;
import vn.edu.fpt.xml.itpub.common.IConsts;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class PhoneImportJob implements Job {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneImportJob.class);
    
    /* (non-Javadoc)
     * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
     */
    @Override
    public void execute(final JobExecutionContext context) throws JobExecutionException {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            
            if (IConsts.ENABLE_CRONJOB) {
                LOGGER.debug("Starting schedule job at {}", new Date());
                PhoneImportService job = new PhoneImportService();
                job.importJob();
                
                LOGGER.debug("Ending schedule job at {}", new Date());
            } else {
                LOGGER.debug("Import job setting is disabled");
            }
            
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
        
    }

}
