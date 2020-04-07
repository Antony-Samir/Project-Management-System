package project.management.system;
import Forms.SignUpForm;
import java.io.*;

public class WriteFile
{
    static SignUpForm SignObj = new SignUpForm();
    //test this
    
    
    //static Department newDep;
    public static void writeDepartment(int ID, String Name) throws IOException
    {
        
        FileWriter FWDepartment = null;
        PrintWriter PWDepartment = null;
        
        try 
        {
            FWDepartment = new FileWriter("Department.txt", true);
            PWDepartment = new PrintWriter(FWDepartment);
            
            PWDepartment.write(ID);
            PWDepartment.write(" | ");
            PWDepartment.println(Name);
            
            PWDepartment.close();
            
            if (PWDepartment != null)
            {
                PWDepartment.close();
            }
            if (FWDepartment != null)
            {
                FWDepartment.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    
    
    //static Project newProject;
    public static void writeProject(int ID, String Name, int DepID) throws IOException
    {
        
        FileWriter FWProject = null;
        PrintWriter PWProject = null;
        
        try 
        {
            FWProject = new FileWriter("Project.txt", true);
            PWProject = new PrintWriter(FWProject);
            
            PWProject.write(ID);
            PWProject.write(" | ");
            PWProject.println(Name);
            PWProject.write(" | ");
            PWProject.println(DepID);
            
            PWProject.close();
            
            if (PWProject != null)
            {
                PWProject.close();
            }
            if (FWProject != null)
            {
                FWProject.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
        
    
    //static TeamMember newMember;    
    public static void writeMember(int ID, String Name, String Address, String Phone, String Email, String Password) throws IOException
    {
            
        FileWriter FWMember = null;
        PrintWriter PWMember = null;
        
        try 
        {
            FWMember = new FileWriter("Members.txt", true);
            PWMember = new PrintWriter(FWMember);
            
            PWMember.write(ID);
            PWMember.write(" | ");
            PWMember.write(Name);
            PWMember.write(" | ");
            PWMember.write(Address);
            PWMember.write(" | ");
            PWMember.write(Phone);
            PWMember.write(" | ");
            PWMember.write(Email);
            PWMember.write(" | ");
            PWMember.println(Password);
            
            PWMember.close();
            
            if (PWMember != null)
            {
                PWMember.close();
            }
            if (FWMember != null)
            {
                FWMember.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    
    
    //static Resources newResource;
    public static void writeResources(int ID, String Name) throws IOException
    {

        FileWriter FWDepartment = null;
        PrintWriter PWDepartment = null;
        
        try 
        {
            FWDepartment = new FileWriter("Resources.txt", true);
            PWDepartment = new PrintWriter(FWDepartment);
            
            PWDepartment.write(ID);
            PWDepartment.write(" | ");
            PWDepartment.println(Name);
            
            PWDepartment.close();
            
            if (PWDepartment != null)
            {
                PWDepartment.close();
            }
            if (FWDepartment != null)
            {
                FWDepartment.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    

    
    //static Tasks newTask;
    public static void writeTask(int taskID,int projectID, String Title, String fromDate, String toDate, int memberID, String Name) throws IOException
    {
    
        FileWriter FWDepartment = null;
        PrintWriter PWDepartment = null;
        
        try 
        {
            FWDepartment = new FileWriter("Tasks.txt", true);
            PWDepartment = new PrintWriter(FWDepartment);
            
            PWDepartment.write(taskID);
            PWDepartment.write(" | ");
            PWDepartment.write(projectID);
            PWDepartment.write(" | ");
            PWDepartment.write(Title);
            PWDepartment.write(" | ");
            PWDepartment.write(fromDate);
            PWDepartment.write(" | ");
            PWDepartment.println(toDate);
            
            PWDepartment.close();
            
            if (PWDepartment != null)
            {
                PWDepartment.close();
            }
            if (FWDepartment != null)
            {
                FWDepartment.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
}
