/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalproject.ui;


import java.awt.Component;
import javax.swing.JOptionPane;


/**
 *
 * @author David Tejeda
 * @author Jose Flavio
 */
public class LoggedOut_Q {
    
    public static int showDialog(Component component, String title, String btnText, String yes, String no){
        return JOptionPane.showOptionDialog(component, title, 
                btnText, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { yes, no },no);
    }
    
}
