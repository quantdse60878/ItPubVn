/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： StringUtil.java <br>
 * <p>
 * Created： Aug 11, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 11, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.common.util;

/**
 * 
 * The String processor.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public class StringUtil {

    public static String cleanupHtml(final String input) {
        String rs =  input.replaceAll("(?i)<(/?script[^>]*)>", "");
//        rs =  rs.replaceAll("(?i)<(/?noscript[^>]*)>", "");
//        rs =  rs.replaceAll("(?i)<(/?style[^>]*)>", "");
        rs = rs.replaceAll( "(?s)<!--.*?-->", "" );
        return rs;
    }
    
    public static String replaceQuote(final String input) {
        return input.replaceAll("'", "|");
    }
}
