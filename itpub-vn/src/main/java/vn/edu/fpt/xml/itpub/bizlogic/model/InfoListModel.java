/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： InfoListModel.java <br>
 * <p>
 * Created： Aug 13, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 13, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlRootElement(name = "info")
@XmlSeeAlso(ProductInfoModel.class)
public class InfoListModel {

    /**
     * 
     */
    private List<ProductInfoModel> info;

    
    
    /**
     * Get the info attribute.
     * @return the info
     */
    public List<ProductInfoModel> getInfo() {
        return info;
    }

    /**
     * Set the info attribute.
     * @param info the info to set
     */
    public void setInfo(final List<ProductInfoModel> info) {
        this.info = info;
    }

    /**
     * 
     */
    public InfoListModel() {
        super();
        info = new ArrayList<>();
    }
    
}
