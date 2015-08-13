/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project <br>
 * File： HomeServlet.java <br>
 * <p>
 * Created： Aug 12, 2015<br>
 * History： <br>
 * Date Person Reason <br>
 * Aug 12, 2015 dangquantran Initial<br>
 * 
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.bizlogic.model.ProductPageModel;
import vn.edu.fpt.xml.itpub.bizlogic.service.PhoneImportService;
import vn.edu.fpt.xml.itpub.bizlogic.service.ProductService;
import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.common.util.XmlUtil;
import vn.edu.fpt.xml.itpub.web.common.IJspPage;
import vn.edu.fpt.xml.itpub.web.common.IRequestAttribute;
import vn.edu.fpt.xml.itpub.web.common.IServletMapping;

/**
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebServlet(urlPatterns = IServletMapping.HOME_SERVLET)
public class HomeServlet extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = -4938613572252583872L;

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeServlet.class);

    /*
     * (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#
     * doGet(javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException,
            IOException {
        // super.doGet(req, resp);
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            // Get data list
            ProductService productService = new ProductService();
            ProductPageModel pageModel = productService.getDataList();
            final String xmlData = XmlUtil.marshallJAXB(ProductPageModel.class, pageModel, false);
            LOGGER.debug("xmlData[{}]", xmlData);
            req.setAttribute(IRequestAttribute.DATA_LIST, xmlData);
            RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
            rd.forward(req, resp);
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }
}
