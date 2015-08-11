/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： PhoneImportService.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.bizlogic.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.common.exception.BizlogicException;
import vn.edu.fpt.xml.itpub.common.util.HtmlUtil;
import vn.edu.fpt.xml.itpub.common.util.XmlUtil;

import com.gargoylesoftware.htmlunit.html.DomElement;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class PhoneImportService extends AbstractService {
    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneImportService.class);
    /**
     * 
     */
    private static final String RAW_PHONE_XSL_PATH = IConsts.REAL_PATH + "/WEB-INF/xsl/rawPhoneData.xsl"; 

    
    public void importJob(){
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            List<String> tags = new ArrayList<>();
//            tags.add("script");
//            tags.add("noscript");
//            tags.add("style");
            HtmlPage html = HtmlUtil.getHtmlPage("http://hcm.cellphones.com.vn/mobile/iphone-5s.html", tags);
            
            /*
             * Remove html attribute
             */
//            List<DomElement> htmlHead = html.getElementsByTagName("html");
//            if (null != htmlHead && !htmlHead.isEmpty()) {
//                LOGGER.debug("html list size: " + htmlHead.size());
//                htmlHead.get(0).removeAttribute("xmlns");
//                htmlHead.get(0).removeAttribute("xml:lang");
//                htmlHead.get(0).removeAttribute("lang");
//            }
            /*
             * End remove
             */
            @SuppressWarnings("unchecked")
            List<DomElement> list =  (List<DomElement>) html.getByXPath("//div[@class='category-products']//h2[@class='product-name']//a");
            String xml = html.asXml();
            String xslFile = RAW_PHONE_XSL_PATH;
//            xml = XmlUtil.applyXSL(xml, xslFile, null);
            LOGGER.debug("--------------------------------------------");
            LOGGER.debug(xml);
            LOGGER.debug("--------------------------------------------");
//        } catch (BizlogicException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }
}
