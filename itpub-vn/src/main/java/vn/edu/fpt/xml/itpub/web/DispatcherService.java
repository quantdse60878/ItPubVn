/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project <br>
 * File： DispatcherService.java <br>
 * <p>
 * Created： Jul 24, 2015<br>
 * History： <br>
 * Date Person Reason <br>
 * Jul 24, 2015 dangquantran Initial<br>
 * 
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.web.common.IBaseDispatcher;
import vn.edu.fpt.xml.itpub.web.common.IRequestAction;
import vn.edu.fpt.xml.itpub.web.common.IServletMapping;

/**
 * The Servlet dispatcher implementation. Handling input request url and forward
 * to suitable servlet.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class DispatcherService implements IBaseDispatcher {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DispatcherService.class);
    
    /*
     * (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.web.IBaseDispatcher#dispatchGetService
     * (javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    public void dispatchGetService(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        String dispatcherServlet = "";
        final String action  = request.getParameter("action");
        switch (action) {
            case IRequestAction.LOGIN:
                dispatcherServlet = IServletMapping.USER_SERVLET;
                break;
            case IRequestAction.HOME:
                dispatcherServlet = IServletMapping.HOME_SERVLET;
                break;
            default :
                dispatcherServlet = IServletMapping.HOME_SERVLET;
                break;
        }
        final RequestDispatcher rd = request.getRequestDispatcher(dispatcherServlet);
        rd.forward(request, response);
    }

    /*
     * (non-Javadoc)
     * @see vn.edu.fpt.xml.itpub.web.IBaseDispatcher#dispatchPostService
     * (javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    public void dispatchPostService(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        String dispatcherServlet = "";
        final String url  = getRequestUrl(request);
        LOGGER.debug(url);
        switch (getRequestUrl(request)) {
            case IRequestAction.LOGIN:
                dispatcherServlet = IServletMapping.USER_SERVLET;
                break;
            default :
                dispatcherServlet = IServletMapping.CONTROLLER;
                break;
        }
        final RequestDispatcher rd = request.getRequestDispatcher(dispatcherServlet);
        rd.forward(request, response);
    }


    /**
     * <p>
     * Return the request url.
     * </p>
     * @param request {@link HttpServletRequest}
     * @return String
     * @see (Related item)
     */
    public static String getRequestUrl(final HttpServletRequest request) {
        return request.getServletPath().trim();
    }
}
