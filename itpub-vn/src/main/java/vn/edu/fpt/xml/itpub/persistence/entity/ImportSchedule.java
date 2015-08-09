/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ImportSchedule.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence.entity;

import java.util.Date;

import javax.persistence.Entity;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@Entity
public class ImportSchedule extends AbstractKeyEntity {

    // TODO Re-design import schedule entity
    
    /**
     * 
     */
    private static final long serialVersionUID = -6240649050758126261L;

    /**
     * 
     */
    private String scheduleName;
    
    /**
     * 
     */
    private Date startTime;
    
    /**
     * 
     */
    private Date endTime;
    
    /**
     * 
     */
    private int lastImportId;
    
    /**
     * 
     */
    private int crawlingUrl;

    /**
     * Get the scheduleName attribute.
     * @return the scheduleName
     */
    public String getScheduleName() {
        return scheduleName;
    }

    /**
     * Set the scheduleName attribute.
     * @param scheduleName the scheduleName to set
     */
    public void setScheduleName(final String scheduleName) {
        this.scheduleName = scheduleName;
    }

    /**
     * Get the startTime attribute.
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Set the startTime attribute.
     * @param startTime the startTime to set
     */
    public void setStartTime(final Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the endTime attribute.
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Set the endTime attribute.
     * @param endTime the endTime to set
     */
    public void setEndTime(final Date endTime) {
        this.endTime = endTime;
    }

    /**
     * Get the lastImportId attribute.
     * @return the lastImportId
     */
    public int getLastImportId() {
        return lastImportId;
    }

    /**
     * Set the lastImportId attribute.
     * @param lastImportId the lastImportId to set
     */
    public void setLastImportId(final int lastImportId) {
        this.lastImportId = lastImportId;
    }

    /**
     * Get the crawlingUrl attribute.
     * @return the crawlingUrl
     */
    public int getCrawlingUrl() {
        return crawlingUrl;
    }

    /**
     * Set the crawlingUrl attribute.
     * @param crawlingUrl the crawlingUrl to set
     */
    public void setCrawlingUrl(final int crawlingUrl) {
        this.crawlingUrl = crawlingUrl;
    }

    /**
     * 
     */
    public ImportSchedule() {
        super();
    }
    
}
