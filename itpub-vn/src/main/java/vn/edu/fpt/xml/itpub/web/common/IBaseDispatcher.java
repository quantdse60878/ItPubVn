/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： IDispatcherServlet.java <br>
 * <p>
 * Created： Jul 24, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 24, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.web.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * The dispatcher interface.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public interface IBaseDispatcher {
    /**
     * 
     * <p>
     * The abstract GET request processor.
     * </p>
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @throws IOException {@link IOException}
     * @throws ServletException {@link ServletException}
     * @see (Related item)
     */
    void dispatchGetService(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException;
    
    /**
     * <p>
     * The abstract POST request processor.
     * </p>
     * @param request {@link HttpServletRequest}
     * @param response {@link HttpServletResponse}
     * @throws IOException {@link IOException}
     * @throws ServletException {@link ServletException}
     * @see (Related item)
     */
    void dispatchPostService(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException;
    
    
//    /**
//     * <p>
//     * Get current url request.
//     * </p>
//     * @param request {@link HttpServletRequest}
//     * @return String
//     * @see (Related item)
//     */
//    String getRequestUrl(final HttpServletRequest request);
}
