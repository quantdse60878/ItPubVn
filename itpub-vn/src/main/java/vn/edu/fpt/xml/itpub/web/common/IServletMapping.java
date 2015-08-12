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
     * The main controller.
     */
    String CONTROLLER = "/controller";
    
    /**
     * The user servlet.
     */
    String USER_SERVLET = "/userServlet";
    
    /**
     * The home servlet.
     */
    String HOME_SERVLET =  "/homeServlet";
    
}
