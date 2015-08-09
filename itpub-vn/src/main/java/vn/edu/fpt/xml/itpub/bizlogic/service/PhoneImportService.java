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
import vn.edu.fpt.xml.itpub.common.util.HtmlUtil;

import com.gargoylesoftware.htmlunit.html.DomElement;
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
    
    public void importJob() {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            List<String> tags = new ArrayList<>();
            tags.add("script");
            tags.add("noscript");
            HtmlPage html = HtmlUtil.getHtmlPage("http://cellphones.com.vn/iphone-6-16-gb.html", tags);
            String xml = html.asXml();
            
            LOGGER.debug("--------------------------------------------");
            LOGGER.debug(xml);
            LOGGER.debug("--------------------------------------------");
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }
}
