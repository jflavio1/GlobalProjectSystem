package globalproject;

import globalproject.ui.Menu;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Jose Flavio
 */
public abstract class BaseModuleWindows extends BaseWindows {

    public BaseModuleWindows() {
        super();
    }
   
    protected void runBackButton(){
        if(getBackButton() != null){
            getBackButton().setText(strings.getString("btn_back"));
            getBackButton().addActionListener((ActionEvent e) -> {
                backToMenu();
            });
        }
    }
    
    protected void backToMenu(){
        Menu menu = new Menu();
        dispose();
        menu.setVisible(true);
    }
    
    public abstract JButton getBackButton();
    
}
