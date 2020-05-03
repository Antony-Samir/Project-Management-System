package project.management.system;

import javax.swing.JFrame;
import java.io.IOException;
import javax.swing.*;

//import Forms.LoginForm;
/**
 * @version 2.1
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
        
        ReadFile.fileLines();
        ReadFile.readAllClasses();
        System.out.println("////////////////////////////////");
        System.out.println("////////////////////////////////");
        
        
        
        
        
        
        
        
                
        Forms.LoginForm Login = new  Forms.LoginForm();
        Login.setVisible(true);
        Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
