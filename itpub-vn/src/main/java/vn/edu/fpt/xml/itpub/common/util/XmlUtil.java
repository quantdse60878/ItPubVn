/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： XmlUtil.java <br>
 * <p>
 * Created： Aug 9, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 9, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common.util;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import vn.edu.fpt.xml.itpub.common.IConsts;
import vn.edu.fpt.xml.itpub.common.exception.BizlogicException;

/**
 * 
 * The util class for processing XML data.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class XmlUtil {

    /**
     * The logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(XmlUtil.class);
    
    /**
     * 
     * <p>
     * Apply XSL to XML String.
     * </p>
     * @param xmlString {@link String}
     * @param xslFilePath {@link String}
     * @return {@link String}
     * @throws BizlogicException be
     * @see (Related item)
     */
    public static String applyXSL(final String xmlString, final String xslFilePath) throws BizlogicException {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            // Create TransformerFactory instance
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            
            // Create Template instance
            File xslFile = new File(xslFilePath);
            Source xslSource = new StreamSource(xslFile);
            Templates templates = transformerFactory.newTemplates(xslSource);
            
            // Create Transformer instance
            Transformer transformer = templates.newTransformer();
            
            // Create input source from string
            StringReader reader = new StringReader(xmlString);
            Source source = new StreamSource(reader);
            
            // Create output result to string
            StringWriter writer = new StringWriter();
            Result result = new StreamResult(writer);
            
            // Write to output result
            transformer.transform(source, result);
            return writer.toString();
            
        } catch (TransformerConfigurationException e) {
            final String message = "Error while transform XML to XML using XSL: " + e.getMessage(); 
            LOGGER.error(message);
            throw new BizlogicException(message);
        } catch (TransformerException e) {
            final String message = "Error while transform XML to XML using XSL: " + e.getMessage(); 
            LOGGER.error(message);
            throw new BizlogicException(message);
        } finally {
            LOGGER.info(IConsts.END_METHOD);
        }
    }
}
