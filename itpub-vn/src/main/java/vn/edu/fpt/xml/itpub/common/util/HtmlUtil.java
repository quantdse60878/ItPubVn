/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： HtmlUtil.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.common.IConsts;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
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

public class HtmlUtil {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlUtil.class);
    
    /**
     * <p>
     * Getting HTML content.
     * </p>
     * @param url String 
     * @return {@link HtmlPage}
     * @see (Related item)
     */
    public static HtmlPage getHtmlPage(final String url, final List<String> replacedTags) {
        LOGGER.info(IConsts.BEGIN_METHOD);
        WebClient webClient = null;
        try {
            LOGGER.debug("Starting scrapping HTML for url[{}]", url);
            webClient = new WebClient(BrowserVersion.FIREFOX_38);
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setThrowExceptionOnScriptError(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.getOptions().setJavaScriptEnabled(false);
            final HtmlPage page = webClient.getPage(url);
            /*
             * Replace unnecessary tag
             */
            if (null != replacedTags && !replacedTags.isEmpty()) {
                for (String tag: replacedTags) {
                    List<DomElement> ls = page.getElementsByTagName(tag);
                    if (null != ls && ls.isEmpty()) {
                        for (DomElement el: ls) {
                            el.setTextContent(null);
                            el.removeAllChildren();
                        }
                    }
                }
            }
            /*
             * End replace.
             */
            LOGGER.debug("End scrapping HTML");
            return page;
        } catch (Exception e) {
            LOGGER.error("Error while parsing HTML for url[{}]", url);
            return null;
        }  finally {
            webClient.close();
            LOGGER.info(IConsts.END_METHOD);
        }
    }
}
