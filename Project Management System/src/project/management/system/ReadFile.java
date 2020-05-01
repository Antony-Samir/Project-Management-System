package project.management.system;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;


public class ReadFile
{
    private static ReadFile uniqueRF = null;
    
    private ReadFile()
    {
        //Using Singleton Design Pattern    
    }
    
    public static ReadFile getInstance()
    {
        if (uniqueRF == null)
        {
            uniqueRF = new ReadFile();
        }
        return uniqueRF;
    }
    
    
    
    static FileReader FR;
    static BufferedReader BR;
    
    
    static public int DepartmentNums;
    static public int ProjectNums;
    static public int MemberNums;
    static public int ResourceNums;
    static public int TaskNums;
    
    static public int LogNums;
    
    public static void fileLines() throws IOException
    {//Read 
        try
        (
           FileReader DepartmentInput = new FileReader("Department.txt");
           LineNumberReader DepartmentCount = new LineNumberReader(DepartmentInput);
                
           FileReader ProjectInput = new FileReader("Project.txt");
           LineNumberReader ProjectCount = new LineNumberReader(ProjectInput);
                
           FileReader MemberInput = new FileReader("Members.txt");
           LineNumberReader MemberCount = new LineNumberReader(MemberInput);
                
           FileReader ResourceInput = new FileReader("Resources.txt");
           LineNumberReader ResourceCount = new LineNumberReader(ResourceInput);
                
           FileReader TaskInput = new FileReader("Tasks.txt");
           LineNumberReader TaskCount = new LineNumberReader(TaskInput);
                
                
           FileReader LogInput = new FileReader("LogProgress.txt");
           LineNumberReader LogCount = new LineNumberReader(LogInput);
        )
        {
            // Loop just in case the file is > Long.MAX_VALUE or skip() decides to not read the entire file
           while (DepartmentCount.skip(Long.MAX_VALUE) > 0){}
           while (ProjectCount.skip(Long.MAX_VALUE) > 0){}
           while (MemberCount.skip(Long.MAX_VALUE) > 0){}
           while (ResourceCount.skip(Long.MAX_VALUE) > 0){}
           while (TaskCount.skip(Long.MAX_VALUE) > 0){}
           
           while (LogCount.skip(Long.MAX_VALUE) > 0){}
           
           //+1 because line index starts at 0
           DepartmentNums = DepartmentCount.getLineNumber() - 1;
           ProjectNums = ProjectCount.getLineNumber() - 1;
           MemberNums = MemberCount.getLineNumber() - 1;
           ResourceNums = ResourceCount.getLineNumber() - 1;
           TaskNums = TaskCount.getLineNumber() - 1;
           
           LogNums = LogCount.getLineNumber() - 1;
        }
        System.out.println("Departments: " + DepartmentNums);
        System.out.println("Projects: " + ProjectNums);
        System.out.println("Members: " + MemberNums);
        System.out.println("Resources: " + ResourceNums);
        System.out.println("Tasks: " + TaskNums);
        
        System.out.println("Log: " + LogNums);
    }
    
        
    
    
    static public List<Department> DEPARTMENT = new ArrayList<Department>();
    static public List<Project> PROJECT = new ArrayList<Project>();
    static public List<TeamMember> MEMBERS = new ArrayList<TeamMember>();
    static public List<Resource> RESOURCE = new ArrayList<Resource>();
    static public List<Task> TASK = new ArrayList<Task>();
    
    
    static public List<Log> LOG = new ArrayList<Log>();
    
    
    public static void readDepartments() throws IOException
    {//Read All Departments
        Department department;
        
        try
        {
            FR = new FileReader("Department.txt");
            BR = new BufferedReader(FR);
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found!!");
        }
        
        
        
        String sentence;
        String[] parts = new String[2]; //for splitting by delameter
        sentence = BR.readLine(); //for skipping first line in file
        
        for (int i = 0; i < DepartmentNums; i++)
        {
            department = new Department();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");
            
            
            
            department.setID(Integer.parseInt(parts[0].toString()));
            department.setName(parts[1].toString());
            DEPARTMENT.add(department);
        }
        
        BR.close();
        FR.close();
        
        //Check the input data
        /*if (DepartmentNums == 0)
        {
            return;
        }
        else
        {
            for (int i = 0; i < DepartmentNums; i++)
            {
                System.out.println(DEPARTMENT.get(i).getID());
                System.out.println(DEPARTMENT.get(i).getName());
            }
        }*/
    }
    
    
    public static void readProjects() throws IOException
    {//Read All Projects
        Project project;
                
        try
        {
            FR = new FileReader("Project.txt");
            BR = new BufferedReader(FR);
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found!!");
        }
        
        
        
        String sentence;
        String[] parts = new String[3]; //for splitting by delameter
        sentence = BR.readLine(); //for skipping first line in file
        
        for (int i = 0; i < ProjectNums; i++)
        {
            project = new Project();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");
            
            project.setID(Integer.parseInt(parts[0].toString()));
            project.setName(parts[1].toString());
            project.setDepartmentID(Integer.parseInt(parts[2].toString()));
            PROJECT.add(project);
        }
        
        BR.close();
        FR.close();
        
        //Check the input data
        /*if (ProjectNums == 0)
        {
            return;
        }
        else
        {
            for (int i = 0; i < ProjectNums; i++)
            {
                System.out.println(PROJECT.get(i).getID());
                System.out.println(PROJECT.get(i).getName());
                System.out.println(PROJECT.get(i).getDepartmentID());
            }
        }*/
    }
    
    
    public static void readMembers() throws IOException
    {//Read All Members
        TeamMember member;
        
        try
        {
            FR = new FileReader("Members.txt");
            BR = new BufferedReader(FR);
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found!!");
        }
        
        
        
        String sentence;
        String[] parts = new String[6]; //for splitting by delameter
        sentence = BR.readLine(); //for skipping first line in file
        
        for (int i = 0; i < MemberNums; i++)
        {
            member = new TeamMember();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");  
            
            member.setID(Integer.parseInt(parts[0].toString()));
            member.setName(parts[1].toString());
            member.setAddress(parts[2].toString());
            member.setPhone(parts[3].toString());
            member.setEmail(parts[4].toString());
            member.setPassword(parts[5].toString());
            MEMBERS.add(member);
        }
        
        BR.close();
        FR.close();
        
        //Check the input data
        /*if (MemberNums == 0)
        {
            return;
        }
        else
        {
            for (int i = 0; i < MemberNums; i++)
            {
                System.out.println(MEMBERS.get(i).getID());
                System.out.println(MEMBERS.get(i).getName());
                System.out.println(MEMBERS.get(i).getAddress());
                System.out.println(MEMBERS.get(i).getPhone());
                System.out.println(MEMBERS.get(i).getEmail());
                System.out.println(MEMBERS.get(i).getPassword());
            }
        }*/
    }
    
    
    public static void readResources() throws IOException
    {//Read All Resources
        Resource resource;
        
        try
        {
            FR = new FileReader("Resources.txt");
            BR = new BufferedReader(FR);
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found!!");
        }
        
        
        
        String sentence;
        String[] parts = new String[3]; //for splitting by delameter
        sentence = BR.readLine(); //for skipping first line in file
        
        for (int i = 0; i < ResourceNums; i++)
        {
            resource = new Resource();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");  
            
            resource.setID(Integer.parseInt(parts[0].toString()));
            resource.setName(parts[1].toString());
            resource.setUsed(Integer.parseInt(parts[2].toString()));
            RESOURCE.add(resource);
        }
        
        BR.close();
        FR.close();
        
        //Check the input data
        /*if (ResourceNums == 0)
        {
            return;
        }
        else
        {
            for (int i = 0; i < ResourceNums; i++)
            {
                System.out.println(RESOURCE.get(i).getID());
                System.out.println(RESOURCE.get(i).getName());
                System.out.println(RESOURCE.get(i).getUsed());
            }
        }*/
    }
    
    
    public static int MemberNumbersInTask[];
    public static int ResourcesUsedInTask[];
    public static void readTasks() throws IOException
    {//Read All Tasks
        Task task;
        MemberNumbersInTask = new int[TaskNums];
        ResourcesUsedInTask = new int[TaskNums];
        
        
        try
        {
            FR = new FileReader("Tasks.txt");
            BR = new BufferedReader(FR);
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found!!");
        }
        
        
        
        String sentence;
        String[] parts = new String[8]; //for splitting by delameter
        String[] partsMembers = new String[MemberNums]; //forsplitting members
        String[] partsResources = new String[ResourceNums]; //for splitting resources
        sentence = BR.readLine(); //for skipping first line in file
        
        for (int i = 0; i < TaskNums; i++)
        {
            task = new Task();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");  
            
            task.setID(Integer.parseInt(parts[0].toString()));
            task.setProjectID(Integer.parseInt(parts[1].toString()));
            task.setTitle(parts[2].toString());
            task.setFromDate(parts[3].toString());
            task.setToDate(parts[4].toString());
            
            
            partsMembers = parts[5].split(",");
            for (int j = 0; j < MemberNums+1; j++)
            {
                try
                {
                    task.MemberID[j] = Integer.parseInt(partsMembers[j+1]);
                }
                catch(Exception ex)
                {
                    
                    break;
                    
                }
                MemberNumbersInTask[i] = (j+1);
            }
            
            partsResources = parts[6].split(",");
            for (int j = 0; j < ResourceNums+1; j++)
            {
                try
                {
                    task.ResourceID[j] = Integer.parseInt(partsResources[j+1]);
                }
                catch(Exception ex)
                {
                    break;
                }
                ResourcesUsedInTask[i] = (j+1);
            }
            
            task.setStatus(parts[7].toString());
            TASK.add(task);
        }
        
        BR.close();
        FR.close();
        
        //Check the input data
        /*if (TaskNums == 0)
        {
            return;
        }
        else
        {
            for (int i = 0; i < TaskNums; i++)
            {
                System.out.println("ID: " + TASK.get(i).getID());
                System.out.println("Project ID: " + TASK.get(i).getProjectID());
                System.out.println("Title: " + TASK.get(i).getTitle());
                System.out.println("From Date: " + TASK.get(i).getFromDate());
                System.out.println("To Date: " + TASK.get(i).getToDate());
                
                System.out.println("Number of Member Work in Task:" + MemberNumbersInTask[i]);
                for (int j = 0; j < MemberNumbersInTask[i]; j++)
                {
                    System.out.println("Members: " + TASK.get(i).MemberID[j]);
                }
                
                System.out.println("Number of Resources Used: " + ResourcesUsedInTask[i]);
                for (int j = 0; j < ResourcesUsedInTask[i]; j++)
                {
                    System.out.println("Resources: " + TASK.get(i).ResourceID[j]);
                }
                
                System.out.println("Status: " + TASK.get(i).getStatus());
                System.out.println();
            }
        }*/
    }
    
    
    
    
    public static void readLog() throws IOException
    {//Read All Projects
        Log log;
                
        try
        {
            FR = new FileReader("LogProgress.txt");
            BR = new BufferedReader(FR);
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found!!");
        }
        
        
        
        String sentence;
        String[] parts = new String[3]; //for splitting by delameter
        sentence = BR.readLine(); //for skipping first line in file
        
        for (int i = 0; i < LogNums; i++)
        {
            log = new Log();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");
            
            log.setMemberID(Integer.parseInt(parts[0].toString()));
            log.setMemberName(parts[1].toString());
            log.setDate_time(parts[2].toString());
            LOG.add(log);
        }
        
        BR.close();
        FR.close();
        
        //Check the input data
        /*if (LogNums == 0)
        {
            return;
        }
        else
        {
            for (int i = 0; i < LogNums; i++)
            {
                System.out.println(LOG.get(i).getMemberID());
                System.out.println(LOG.get(i).getMemberName());
                System.out.println(LOG.get(i).getDate_time());
            }
        }*/
    }
    
}
