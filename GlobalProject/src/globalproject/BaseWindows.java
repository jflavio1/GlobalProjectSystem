
package globalproject;

import java.awt.HeadlessException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Jose Flavio
 */
public abstract class BaseWindows extends javax.swing.JFrame {
    
    protected ResourceBundle strings;
    protected abstract void initUI();

    public BaseWindows() {
        this.strings = Language.getInstance().getStrings();
        //setWindowsTitle(this.strings.getString("app_title"));
    }
    
    protected void setWindowsTitle(String title){
        setTitle(title);
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); 
        setLocationRelativeTo(null);
    }
    
    protected void changeLanguage(String language){
        this.strings = Language.getInstance().setLanguage(language);
    }
    
    protected void log(String text){
        System.out.println(text);
    }
    
}
