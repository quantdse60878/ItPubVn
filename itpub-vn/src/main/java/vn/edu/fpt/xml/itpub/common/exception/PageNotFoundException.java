/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： PageNotFoundException.java <br>
 * <p>
 * Created： Aug 3, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 3, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common.exception;

/**
 * 
 * The exception for error 404.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class PageNotFoundException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 923274451122085350L;
    /**
     * 
     */
    private String url;
    
    /**
     * @param url The request url
     */
    public PageNotFoundException(final String url) {
        super();
        this.url = url;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return "Not found result for request url: " + url;
    }
}
