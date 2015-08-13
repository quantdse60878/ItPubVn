/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： ProductDetailServlet.java <br>
 * <p>
 * Created： Aug 13, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 13, 2015         dangquantran         Initial<br>
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

import vn.edu.fpt.xml.itpub.bizlogic.model.ProductModel;
import vn.edu.fpt.xml.itpub.bizlogic.service.ProductService;
import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.common.exception.BizlogicException;
import vn.edu.fpt.xml.itpub.common.util.XmlUtil;
import vn.edu.fpt.xml.itpub.web.common.IJspPage;
import vn.edu.fpt.xml.itpub.web.common.IRequestAttribute;
import vn.edu.fpt.xml.itpub.web.common.IRequestParam;
import vn.edu.fpt.xml.itpub.web.common.IServletMapping;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */
@WebServlet(urlPatterns = IServletMapping.PRODUCT_SERVLET)
public class ProductDetailServlet extends HttpServlet {

    /**
     * 
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductDetailServlet.class);
    
    /**
     * 
     */
    private static final long serialVersionUID = -8629557415768864109L;

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet
     * #doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            String idParam = req.getParameter(IRequestParam.ID);
            Integer id = Integer.parseInt(idParam);
            if (null == id) {
                throw new BizlogicException("Input parameter is NULL/EMPTY: " + idParam);
            }
            ProductService service = new ProductService();
            ProductModel model = service.getDetailById(id);
            if (model == null) {
                throw new BizlogicException("Product with id is not found: " + id);
            }
            String xmlData = XmlUtil.marshallJAXB(ProductModel.class, model, false);
            
            req.setAttribute(IRequestAttribute.PRODUCT_DETAIL, xmlData);
            
            RequestDispatcher rd = req.getRequestDispatcher(IJspPage.PHONE);
            rd.forward(req, resp);
        } catch (BizlogicException e) {
            LOGGER.error("Error at: " + e.getMessage());
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet
     * #doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        super.doPost(req, resp);
    }
    

}
