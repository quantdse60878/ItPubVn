/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： AbstractPageModel.java <br>
 * <p>
 * Created： Aug 12, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 12, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @param <M> model class
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlType(name = "", 
propOrder = {"pageNumber", "pageSize", "totalPage", "totalElements", "numberOfElements",  "dataList"})
public class AbstractPageModel<M> {
    /**
     * 
     */
    private int pageNumber;
    
    /**
     * 
     */
    private int pageSize;
    
    /**
     * 
     */
    private int totalPage;
    
    /**
     * 
     */
    private int totalElements;
    
    /**
     * 
     */
    private int numberOfElements;
    
    
    /**
     * 
     */
    private AbstractModel<M> dataList;

    /**
     * Get the pageNumber attribute.
     * @return the pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Set the pageNumber attribute.
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(final int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Get the pageSize attribute.
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Set the pageSize attribute.
     * @param pageSize the pageSize to set
     */
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Get the totalElements attribute.
     * @return the totalElements
     */
    public int getTotalElements() {
        return totalElements;
    }

    /**
     * Set the totalElements attribute.
     * @param totalElements the totalElements to set
     */
    public void setTotalElements(final int totalElements) {
        this.totalElements = totalElements;
    }

    /**
     * Get the numberOfElements attribute.
     * @return the numberOfElements
     */
    public int getNumberOfElements() {
        return numberOfElements;
    }

    /**
     * Set the numberOfElements attribute.
     * @param numberOfElements the numberOfElements to set
     */
    public void setNumberOfElements(final int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }
    
    /**
     * Get the dataList attribute.
     * @return the dataList
     */
    public AbstractModel<M> getDataList() {
        return dataList;
    }

    /**
     * Set the dataList attribute.
     * @param dataList the dataList to set
     */
    public void setDataList(final AbstractModel<M> dataList) {
        this.dataList = dataList;
    }

    /**
     * Get the totalPage attribute.
     * @return the totalPage
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Set the totalPage attribute.
     * @param totalPage the totalPage to set
     */
    public void setTotalPage(final int totalPage) {
        this.totalPage = totalPage;
    }

    /**
     * 
     */
    public AbstractPageModel() {
        super();
        dataList = new AbstractModel<>();
    }
    
    
}
