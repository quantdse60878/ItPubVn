/**
 * ALL Rights Reserved, Copyright (C) FPT University 2015. <br>
 * Program： XML Project  <br>
 * File： IDbConsts.java <br>
 * <p>
 * Created： Aug 11, 2015<br>
 * History： <br>
 * Date            Person          Reason <br>
 * Aug 11, 2015         dangquantran         Initial<br>
 *  
 * @author dangquantran
 */
package vn.edu.fpt.xml.itpub.persistence;

/**
 * 
 * Class summary.
 * 
 * @author dangquantran <br>
 * @version 1.0 <br>
 * @see (Related item)
 */

public interface IDbConsts {
    
    /**
     * 
     */
    public interface IUserStatus {
        /**
         * 
         */
        byte ACTIVE = 0;
        
        /**
         * 
         */
        byte IN_ACTIVE = 1;
    }
    
    /**
     * 
     */
    public interface ICustomerStatus {
        /**
         * 
         */
        byte ACTIVE = 0;
        
        /**
         * 
         */
        byte IN_ACTIVE = 1;
    }
    
    /**
     * 
     */
    public interface IImportScheduleStatus {
        /**
         * 
         */
        byte ACTIVE = 0;
        
        /**
         * 
         */
        byte IN_ACTIVE = 1;
    }
    
    /**
     * 
     */
    public interface IImportScheduleRunning {
        /**
         * 
         */
        byte STOPPED = 0;
        
        /**
         * 
         */
        byte RUNNING = 1;
    }
    
    
    /**
     * 
     */
    public interface IProductStatus {
        /**
         * 
         */
        byte ACTIVE = 0;
        
        /**
         * 
         */
        byte IN_ACTIVE = 1;
        
        /**
         * 
         */
        byte UP_COMMING = 2;
        
        /**
         * 
         */
        byte SECOND_HAND = 3;
    }
    
    /**
     * 
     */
    public interface IInventoryTrackingType {
        /**
         * 
         */
        byte IMPORT = 0;
        
        /**
         * 
         */
        byte EXPORT = 1;
    }
    
    /**
     * 
     */
    public interface IOrderStatus {
        /**
         * 
         */
        byte ENTRY = 0;
        /**
         * 
         */
        byte APPROVED = 1;
        /**
         * 
         */
        byte CANCEL = 2;
        /**
         * 
         */
        byte REFUSE = 3;
    }
    
    /**
     * 
     */
    public interface IOrderDetailStatus {
        /**
         * 
         */
        byte ENTRY = 0;
        /**
         * 
         */
        byte DELIVERED = 1;
    }
    
    
}
