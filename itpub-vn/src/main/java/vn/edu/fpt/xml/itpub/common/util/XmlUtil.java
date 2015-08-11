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
import java.util.Map;
import java.util.Set;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

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
     * @param xslPath {@link String}
     * @param paramVals {@link Map}
     * @return {@link String}
     * @throws BizlogicException be
     * @see (Related item)
     */
    public static String applyXSL(final String xmlString, final String xslPath, final Map<String, String> paramVals)
            throws BizlogicException {
        LOGGER.info(IConsts.BEGIN_METHOD);
        try {
            // Create TransformerFactory instance
            final TransformerFactory transformerFactory = TransformerFactory.newInstance();
            
            // Create Template instance
            final File xslFile = new File(xslPath);
            final Source xslSource = new StreamSource(xslFile);
            final Templates templates = transformerFactory.newTemplates(xslSource);
            // Create Transformer instance
            final Transformer transformer = templates.newTransformer();
            
            // Set parameter to transformer
//            if (null != paramVals && !paramVals.isEmpty()) {
//                Set<String> keys = paramVals.keySet();
//                for (String key : keys) {
//                    transformer.setParameter(key, paramVals.get(key));
//                }
//            }
            
            // Create input source from string
            final StringReader reader = new StringReader(xmlString);
            final Source source = new StreamSource(reader);
            
            // Create output result to string
            final StringWriter writer = new StringWriter();
            final Result result = new StreamResult(writer);
            
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

    /**
     * <p>
     * Unmarshall xml string to JAXB object.
     * </p>
     * @param clazz {@link Class}
     * @param xml {@link String}
     * @param schemaPath {@link String}
     * @param <T> POJO class
     * @return T
     * @see (Related item)
     */
    @SuppressWarnings("unchecked")
    public static <T> T unmarshallJAXB(final Class<T> clazz, final String xml, final String schemaPath) {
        LOGGER.debug(IConsts.BEGIN_METHOD);
        try {
            // Create JAXB context
            final JAXBContext context = JAXBContext.newInstance(clazz);
            final Unmarshaller unmarshaller = context.createUnmarshaller();
            
            // Set schema validator
            if (null != schemaPath && StringUtils.isNotEmpty(schemaPath)) {
                final SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
                final Schema schema = sf.newSchema(new File(schemaPath));
                unmarshaller.setSchema(schema);
            }
            
            // Create input source
            final StringReader sr = new StringReader(xml);
            final Source source = new StreamSource(sr);
            
            
            // Unmarshall step
            final T instance = (T) unmarshaller.unmarshal(source);
            if (null == instance) {
                LOGGER.warn("Unmarshalling step having problem. Check this");
            }
            return instance;
        } catch (JAXBException | SAXException e) {
            LOGGER.error("Exception at: " + e.getMessage());
            return null;
        } finally {
            LOGGER.debug(IConsts.END_METHOD);
        }
    }
}
