
package globalproject;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Jose Flavio
 */
public abstract class BaseWindows extends javax.swing.JFrame {
    
    protected ResourceBundle strings;
    protected abstract void initUI();
    
    protected void changeLanguage(String language){
        Locale locale = new Locale(language);
        strings = ResourceBundle.getBundle("globalproject.strings",locale);
    }
    
    protected void log(String text){
        System.out.println(text);
    }
    
}
