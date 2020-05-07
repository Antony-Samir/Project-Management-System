package project.management.system;
import Forms.SignUpForm;
import java.io.*;

public class WriteFile
{
    
    private static WriteFile uniqueWF = null;
    
    private WriteFile()
    {
        //Using Singleton Design Pattern    
    }
    
    public static WriteFile getInstance()
    {
        if (uniqueWF == null)
        {
            uniqueWF = new WriteFile();
        }
        return uniqueWF;
    }
    
    
    
    
    static SignUpForm SignObj = new SignUpForm();
    
    static private FileWriter FW;
    static private PrintWriter PW;

    //static Department newDep;
    public static void writeDepartment(String ID, String Name) throws IOException
    {        
        try 
        {
            FW = new FileWriter("Department.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(ID);
            PW.write(" # ");
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
            PW.write(" # ");
            PW.write(Name);
            PW.write(" # ");
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
            PW.write(" # ");
            PW.write(Name);
            PW.write(" # ");
            PW.write(Address);
            PW.write(" # ");
            PW.write(Phone);
            PW.write(" # ");
            PW.write(Email);
            PW.write(" # ");
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
    public static void writeResource(String ID, String Name, String Used) throws IOException
    {
        try 
        {
            FW = new FileWriter("Resources.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(ID);
            PW.write(" # ");
            PW.write(Name);
            PW.write(" # ");
            PW.println(Used); //Used or not //Initialy = 0;

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
    public static void writeTask(String taskID, String projectID, String Title, String fromDate, String toDate, String[] memberID, String[] Resources, String Status) throws IOException
    {
        try 
        {
            FW = new FileWriter("Tasks.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(taskID);
            PW.write(" # ");
            PW.write(projectID);
            PW.write(" # ");
            PW.write(Title);
            PW.write(" # ");
            PW.write(fromDate);
            PW.write(" # ");
            PW.write(toDate);
            PW.write(" # ");
            
            
            //PW.write(memberID);
            for (int i = 0; i < ReadFile.MemberNums; i++)
            {//For Members
                if (memberID[i] != null)
                {
                    PW.write(",");
                    PW.write(memberID[i]);
                }                
            }
            PW.write(" # ");
            
            
            
            //PW.write(Resources);
            for (int i = 0; i < ReadFile.ResourceNums; i++)
            {//For Members
                if (Resources[i] != null)
                {
                    PW.write(",");
                    PW.write(Resources[i]);
                }                
            }
            PW.write(" # ");
            
            
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
        catch (IOException ex)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    //static Tasks newTask;
    public static void writeDelayedTask(String taskID, String projectID, String Title, String fromDate, String toDate) throws IOException
    {
        try 
        {
            FW = new FileWriter("DelayedTasks.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(taskID);
            PW.write(" # ");
            PW.write(projectID);
            PW.write(" # ");
            PW.write(Title);
            PW.write(" # ");
            PW.write(fromDate);
            PW.write(" # ");
            PW.println(toDate);
            
            
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
        catch (IOException ex)
        {
            System.out.println("File Doesn't exist!");
        }
    }
    
    
    
    
    
    
    
    
    public static void writeLog(String memberID, String memberName, String date_time) throws IOException
    {
        try 
        {
            FW = new FileWriter("LogProgress.txt", true);
            PW = new PrintWriter(FW);
            
            PW.write(memberID);
            PW.write(" # ");
            PW.write(memberName);
            PW.write(" # ");
            PW.println(date_time);
            
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
    
    
    
    
     public static void clearDelayedFile() throws IOException
     {
        PrintWriter pw = new PrintWriter("DelayedTasks.txt");
        pw.println("Task ID # Project ID # Title # From Date # To Date");
        pw.close();
        
     }
}
