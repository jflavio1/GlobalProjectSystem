/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package globalproject.ui;


import javax.swing.JOptionPane;


/**
 *
 * @author alumno
 */
public class LoggedOut_Q {
    
    public static void main(String[] args) {
        JOptionPane.showOptionDialog(null, "¿Realmente Quieres Salir?", 
                "Cerrar Sesión", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[] { "SI", "NO" },"NO");
    }
    
}
