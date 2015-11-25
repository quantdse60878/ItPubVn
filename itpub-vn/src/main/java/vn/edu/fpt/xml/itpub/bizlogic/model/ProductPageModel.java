/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductPageModel.java <br>
 * <p>
 * Created： Aug 12, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 12, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(ProductShortModel.class)
public class ProductPageModel extends AbstractPageModel<ProductShortModel> {
}
