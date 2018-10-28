
package globalproject.ui;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose Flavio
 */
public class WarningMessageUi {
    
    public static int showDialog(Component component, String title, String msg){
        return JOptionPane.showConfirmDialog(component, msg, title, JOptionPane.WARNING_MESSAGE);
    }
    
}