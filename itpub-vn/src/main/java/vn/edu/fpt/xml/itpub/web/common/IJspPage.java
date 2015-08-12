/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： IJspPage.java <br>
 * <p>
 * Created： Jul 24, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 24, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.web.common;

/**
 * 
 * The JSP name definition.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public interface IJspPage {
    /**
     * The page post-fix.
     */
    String POSTFIX = ".jsp";
    /**
     * Login page.
     */
    String LOGIN = "/login" + POSTFIX;
    /**
     * Index page.
     */
    String INDEX = "/index" + POSTFIX;
    
    /**
     * Home page.
     */
    String HOME = "/home" + POSTFIX;
    
}
