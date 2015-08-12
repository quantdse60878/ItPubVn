/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： Controller.java <br>
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

import vn.edu.fpt.xml.itpub.bizlogic.service.PhoneImportService;
import vn.edu.fpt.xml.itpub.web.common.IServletMapping;

/**
 * 
 * The main controller.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebServlet(urlPatterns = IServletMapping.CONTROLLER)
public class Controller extends HttpServlet {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);
    
    /**
     * 
     */
    private static final long serialVersionUID = -8369258361212785551L;

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet
     * (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
//        this.test();
        DispatcherService dispatcher = new DispatcherService();
        dispatcher.dispatchGetService(request, response);
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost
     * (javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        DispatcherService dispatcher = new DispatcherService();
        dispatcher.dispatchPostService(request, response);
    }
    
    public void test() {
        PhoneImportService service = new PhoneImportService();
        service.importJob();
    }
}
