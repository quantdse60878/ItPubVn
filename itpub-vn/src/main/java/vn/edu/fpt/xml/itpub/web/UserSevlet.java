/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： UserSevlet.java <br>
 * <p>
 * Created： Jul 24, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Jul 24, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.web.common.IServletMapping;

/**
 * 
 * The Servlet for handling User business: login, register, change password, profile, etc.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebServlet(urlPatterns = IServletMapping.USER_SERVLET)
public class UserSevlet extends HttpServlet {
    
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
    
    /**
     * 
     */
    private static final long serialVersionUID = -7102095107259731405L;

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet
     * (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        super.doGet(req, resp);
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost
     * (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);
    }

    
}
