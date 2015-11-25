/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： PermissionDeniedException.java <br>
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
 * The exception for error 403.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class PermissionDeniedException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = -7211785093501056899L;
    /**
     * 
     */
    private String username;
    
    /**
     * @param username The username
     */
    public PermissionDeniedException(final String username) {
        this.username  = username;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Throwable#getMessage()
     */
    @Override
    public String getMessage() {
        return "This user is trying to access resource without permission: " + username;
    }
}
