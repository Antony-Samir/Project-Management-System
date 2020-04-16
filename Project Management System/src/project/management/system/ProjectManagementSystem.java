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
    public static void main(String[] args) throws IOException
    {
        
        ReadFile RF = new ReadFile();
        RF.fileLines();
        RF.readResources();
        
        
        //JCheckBox cb1 = new JCheckBox("Task 1");
        
        Forms.LoginForm Login = new  Forms.LoginForm();
        Login.setVisible(true);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JOptionPane.showMessageDialog(null, "Thank you using our system", "Logout Successfully", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
