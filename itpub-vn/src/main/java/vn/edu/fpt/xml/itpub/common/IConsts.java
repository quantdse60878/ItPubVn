/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： IConsts.java <br>
 * <p>
 * Created： Jul 27, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 27, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common;

import vn.edu.fpt.xml.itpub.common.util.PropertiesUtil;

/**
 * 
 * The project common param.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public interface IConsts {
    /**
     * The begin log.
     */
    String BEGIN_METHOD = "----begin----";
    /**
     * The end log.
     */
    String END_METHOD = "----end----";
    
    /**
     * The flag is allow running job or not.
     */
    boolean ENABLE_CRONJOB = PropertiesUtil.getInstance().getBoolean("cronjob.enable");
}
