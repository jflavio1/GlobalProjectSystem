package globalproject.data;

import com.sun.org.apache.xml.internal.dtm.ref.DTMManagerDefault;
import globalproject.ModuleConstants;
import globalproject.data.callback.ResponseCallback;
import globalproject.domain.User;

/**
 *
 * @author Jose Flavio
 */
public final class LoginHelper {
    
    public static final int ERROR_WRONG_PASSWORD = 100;
    public static final int ERROR_USERNAME_NOT_EXISTS = 101;
    
    public static void login(String username, String userpassword, ResponseCallback<User> callback){
        
        boolean isLogged = false;
        String userFormalName = null;
        
        switch(username){
            
            case "cocacola": {
                if("coke1".equals(userpassword)){
                    isLogged = true;
                    userFormalName = "The Coca-Cola Company";
                } else {
                    
                }
                break;
            }
            
            case "pacifico": {
                if("pacifico1".equals(userpassword)){
                    isLogged = true;
                    userFormalName = "Pacífico Seguros SAC";
                }
                break;
            }
            
            case "storagedata": {
                if("storage123data".equals(userpassword)){
                    isLogged = true;
                    userFormalName = "Storage Data";
                }
                break;
            }
            
            default: {
                callback.onFailure(ERROR_USERNAME_NOT_EXISTS);
                return;
            }
            
        }
        
        if(isLogged){
            User loggedUser = new User(username, userpassword);
            loggedUser.setUserFormalName(userFormalName);
            Session.getCurrentSession().login(loggedUser);
            callback.onSuccess(loggedUser);
        } else {
            callback.onFailure(ERROR_WRONG_PASSWORD);
        }
        
    }
    
    public static boolean userHasModulePermission(int MODULE_CODE){
        
        switch(MODULE_CODE){
            
            case ModuleConstants.MODULE_PRODUCTS:{
                
                switch(Session.getCurrentSession().getLoggedUser().getUserName()){
                    
                    case "cocacola": 
                    case "pacifico": 
                    case "storagedata": return true;
                    default: return false;
                    
                }
                
            }
            
            case ModuleConstants.MODULE_SERVICES:{
                switch(Session.getCurrentSession().getLoggedUser().getUserName()){
                    
                    case "cocacola": 
                    case "pacifico": 
                    case "storagedata": return true;
                    default: return false;
                    
                }
            }
            
            case ModuleConstants.MODULE_EMPLOYEES:{
                
                switch(Session.getCurrentSession().getLoggedUser().getUserName()){
                     
                    case "pacifico": 
                    case "storagedata": return true;
                    default: return false;
                    
                }

            }
            
            case ModuleConstants.MODULE_ACCOUNTING: 
                return "storagedata".equals(Session.getCurrentSession().getLoggedUser().getUserName());
            
            default: return false;
            
        }
        
    }
    
}
