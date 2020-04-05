package project.management.system;

import javax.swing.JFrame;
import java.io.IOException;
import javax.swing.*;
//import Forms.LoginForm;
/**
 * @version 1.1
 * @author Antony Samir
 * @author Youssef Wael
 * @author Martino Sherien
 * @author Kirollos Nayer
 * @author Bashnona Gamal
 */
public class ProjectManagementSystem
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Just to check", "Main", JOptionPane.INFORMATION_MESSAGE);
        
        Forms.LoginForm Login = new  Forms.LoginForm();
        Login.setVisible(true);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }
    
}
