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
//propOrder = {"pageNumber", "pageSize", "totalPage", "totalElements", "numberOfElements",  "dataList"})
propOrder = { "dataList"})
public class AbstractPageModel<M> {
//    /**
//     * 
//     */
//    private int pageNumber;
//    
//    /**
//     * 
//     */
//    private int pageSize;
//    
//    /**
//     * 
//     */
//    private int totalPage;
//    
//    /**
//     * 
//     */
//    private int totalElements;
//    
//    /**
//     * 
//     */
//    private int numberOfElements;
    
    /**
     * 
     */
    private AbstractModel<M> dataList;

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
     * 
     */
    public AbstractPageModel() {
        super();
        dataList = new AbstractModel<>();
    }
    
    
}
