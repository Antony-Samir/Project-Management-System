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
        try
        {
            WriteFile WF = new WriteFile();
            String test = Integer.toString(456);
            WF.writeTask("ab", "cd", "ef", "gh", "ij", "kl", "mn", "op");
        }
        catch(IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
        
        
        //JOptionPane.showMessageDialog(null, "Just to check", "Main", JOptionPane.INFORMATION_MESSAGE);
        
        /*Forms.LoginForm Login = new  Forms.LoginForm();
        Login.setVisible(true);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
        //JOptionPane.showMessageDialog(null, "Thank you using our system", "Logout Successfully", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
