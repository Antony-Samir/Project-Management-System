package project.management.system;
import Forms.SignUpForm;
import java.io.*;

public class WriteFile
{
    static SignUpForm SignObj = new SignUpForm();
    
    
    
    static Department newDep;
    public static void writeDepartment(String ID, String Name) throws IOException
    {
        ID = null;
        Name = null;
    
        FileWriter FWDepartment = null;
        PrintWriter PWDepartment = null;
        
        try 
        {
            FWDepartment = new FileWriter("Department.txt", true);
            PWDepartment = new PrintWriter(FWDepartment);
            
            PWDepartment.write(newDep.getId());
            PWDepartment.write(" | ");
            PWDepartment.println(newDep.getName());
            
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
    
    
    
    static Project newProject;
    public static void writeProject(String ID, String Name, String DepID) throws IOException
    {
        ID = null;
        Name = null;
        DepID = null;
        
        FileWriter FWProject = null;
        PrintWriter PWProject = null;
        
        try 
        {
            FWProject = new FileWriter("Project.txt", true);
            PWProject = new PrintWriter(FWProject);
            
            PWProject.write(newProject.getId());
            PWProject.write(" | ");
            PWProject.println(newProject.getName());
            PWProject.write(" | ");
            PWProject.println(newProject.dep.getId());
            
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
    
        
    
    static TeamMember newMember;    
    public static void writeMember(String Name, String Address, String Password, String Email) throws IOException
    {
        Name = null;
        Address = null;
        Password = null;
        Email = null;
    
        FileWriter FWMember = null;
        PrintWriter PWMember = null;
        
        try 
        {
            FWMember = new FileWriter("Members.txt", true);
            PWMember = new PrintWriter(FWMember);
            
            PWMember.write(newMember.getId());
            PWMember.write(" | ");
            PWMember.write(newMember.getName());
            PWMember.write(" | ");
            PWMember.write(newMember.getPassword());
            PWMember.write(" | ");
            PWMember.write(newMember.getEmail());
            PWMember.write(" | ");
            PWMember.println(newMember.getAddress());
            
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
    
    
    
    static Resources newResource;
    public static void writeResources(String ID, String Name) throws IOException
    {
        ID = null;
        Name = null;
    
        FileWriter FWDepartment = null;
        PrintWriter PWDepartment = null;
        
        try 
        {
            FWDepartment = new FileWriter("Resources.txt", true);
            PWDepartment = new PrintWriter(FWDepartment);
            
            PWDepartment.write(newResource.getId());
            PWDepartment.write(" | ");
            PWDepartment.println(newResource.getName());
            
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
    
    //need to be checked
    static Tasks newTask;
    public static void writeTask(String ID, String Name) throws IOException
    {
        ID = null;
        Name = null;
    
        FileWriter FWDepartment = null;
        PrintWriter PWDepartment = null;
        
        try 
        {
            FWDepartment = new FileWriter("Tasks.txt", true);
            PWDepartment = new PrintWriter(FWDepartment);
            
            PWDepartment.write(newResource.getId());
            PWDepartment.write(" | ");
            PWDepartment.println(newResource.getName());
            
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
