/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： QuartzListener.java <br>
 * <p>
 * Created： Aug 3, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 3, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.scheduler;

import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.ee.servlet.QuartzInitializerListener;
import org.quartz.impl.StdSchedulerFactory;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebListener
public class QuartzListener extends QuartzInitializerListener {
    @Override
    public void contextInitialized(final ServletContextEvent sce) {
        Properties props = new Properties();
        props.setProperty("org.quartz.scheduler.skipUpdateCheck", "true");
        
        // set other properties ...such as
        props.setProperty("org.quartz.jobStore.class", "org.quartz.simpl.RAMJobStore");
        props.setProperty("org.quartz.threadPool.class", "org.quartz.simpl.SimpleThreadPool");
        props.setProperty("org.quartz.threadPool.threadCount", "1");
        try {
            SchedulerFactory schedulerFactory = new StdSchedulerFactory(props);
            Scheduler scheduler = schedulerFactory.getScheduler();
            // TODO set to call PhoneImportJob
            JobDetail jobDetail = JobBuilder.newJob(JobTest.class).build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("simple").withSchedule(
                    CronScheduleBuilder.cronSchedule("0 0/5 * 1/1 * ? *")).startNow().build();
            scheduler.scheduleJob(jobDetail, trigger);
//            scheduler.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
