/**
 * ALL Rights Reserved, (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： IServletInfo.java <br>
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
 * The request mapping of servlets.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public interface IServletMapping {
    /**
     * The prefix.
     */
    String PREFIX = "/servlet";

    /**
     * The main controller.
     */
    String CONTROLLER = "/";
    
    /**
     * The user servlet.
     */
    String USER_SERVLET = PREFIX + "/userServlet";
    
    /**
     * The home servlet.
     */
    String HOME_SERVLET = PREFIX + "/homeServlet";
    
}
