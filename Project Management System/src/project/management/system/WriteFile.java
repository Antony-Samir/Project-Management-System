package project.management.system;
import Forms.SignUpForm;
import java.io.*;

public class WriteFile
{
    static SignUpForm SignObj = new SignUpForm();
    //test this
    
    static private  FileWriter FW;
    static private PrintWriter PW;

    //static Department newDep;
    public static void writeDepartment(String ID, String Name) throws IOException
    {        
        try 
        {
            FW = new FileWriter("Department.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(ID);
            PW.write(" | ");
            PW.println(Name);
            
            PW.close();
            
            if (PW != null)
            {
                PW.close();
            }
            if (FW != null)
            {
                FW.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    
    
    //static Project newProject;
    public static void writeProject(String ID, String Name, String DepID) throws IOException
    {
        try 
        {
            FW = new FileWriter("Project.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(ID);
            PW.write(" | ");
            PW.write(Name);
            PW.write(" | ");
            PW.println(DepID);
            
            PW.close();
            
            if (PW != null)
            {
                PW.close();
            }
            if (FW != null)
            {
                FW.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
        
    
    //static TeamMember newMember;    
    public static void writeMember(String ID, String Name, String Address, String Phone, String Email, String Password) throws IOException
    {
        try 
        {
            FW = new FileWriter("Members.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(ID);
            PW.write(" | ");
            PW.write(Name);
            PW.write(" | ");
            PW.write(Address);
            PW.write(" | ");
            PW.write(Phone);
            PW.write(" | ");
            PW.write(Email);
            PW.write(" | ");
            PW.println(Password);
            
            PW.close();
            
            if (PW != null)
            {
                PW.close();
            }
            if (FW != null)
            {
                FW.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    
    
    //static Resources newResource;
    public static void writeResources(String ID, String Name) throws IOException
    {
        try 
        {
            FW = new FileWriter("Resources.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(ID);
            PW.write(" | ");
            PW.println(Name);
            
            PW.close();
            
            if (PW != null)
            {
                PW.close();
            }
            if (FW != null)
            {
                FW.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    

    
    //static Tasks newTask;
    public static void writeTask(String taskID, String projectID, String Title, String fromDate, String toDate, String memberID, String Resources, String Status) throws IOException
    {
        try 
        {
            FW = new FileWriter("Tasks.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(taskID);
            PW.write(" | ");
            PW.write(projectID);
            PW.write(" | ");
            PW.write(Title);
            PW.write(" | ");
            PW.write(fromDate);
            PW.write(" | ");
            PW.write(toDate);
            PW.write(" | ");
            PW.write(memberID);
            PW.write(" | ");
            PW.write(Resources);
            PW.write(" | ");
            PW.println(Status);
            
            PW.close();
            
            if (PW != null)
            {
                PW.close();
            }
            if (FW != null)
            {
                FW.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    
}
