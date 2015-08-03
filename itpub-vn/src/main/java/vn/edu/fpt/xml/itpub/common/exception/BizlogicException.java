/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： BizlogicException.java <br>
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
 * The business logic failure exception.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class BizlogicException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -9141268477822143636L;
    /**
     * 
     */
    private String message;
    /**
     * @param message The message
     */
    public BizlogicException(final String message) {
        super();
        this.message = message;
    }
}
