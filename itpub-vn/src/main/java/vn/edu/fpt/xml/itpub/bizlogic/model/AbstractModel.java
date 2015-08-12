/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： AbstractModel.java <br>
 * <p>
 * Created： Aug 12, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 12, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 * 
 * The abstract model class.
 * 
 * @author dangquantran <br>
 * @param <M> Model class
 * @version 1.0 <br>
 * @see (Related item)
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AbstractModel<M> {
   
    /**
     * 
     */
    private List<M> model;

    /**
     * Get the model attribute.
     * @return the model
     */
    public List<M> getModel() {
        return model;
    }

    /**
     * Set the model attribute.
     * @param model the model to set
     */
    public void setModel(final List<M> model) {
        this.model = model;
    }

    /**
     * 
     */
    public AbstractModel() {
        super();
    } 

    
}
