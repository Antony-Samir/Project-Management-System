package project.management.system;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class ReadFile
{
    static FileReader FR;
    static BufferedReader BR;
    
    
    static public int DepartmentNums;
    static public int ProjectNums;
    static public int MemberNums;
    static public int ResourceNums;
    static public int TaskNums;
    
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
        )
        {
            // Loop just in case the file is > Long.MAX_VALUE or skip() decides to not read the entire file
           while (DepartmentCount.skip(Long.MAX_VALUE) > 0){}
           while (ProjectCount.skip(Long.MAX_VALUE) > 0){}
           while (MemberCount.skip(Long.MAX_VALUE) > 0){}
           while (ResourceCount.skip(Long.MAX_VALUE) > 0){}
           while (TaskCount.skip(Long.MAX_VALUE) > 0){}
           
           //+1 because line index starts at 0
           DepartmentNums = DepartmentCount.getLineNumber() - 1;
           ProjectNums = ProjectCount.getLineNumber() - 1;
           MemberNums = MemberCount.getLineNumber() - 1;
           ResourceNums = ResourceCount.getLineNumber() - 1;
           TaskNums = TaskCount.getLineNumber() - 1;
        }
        System.out.println(DepartmentNums);
        System.out.println(ProjectNums);
        System.out.println(MemberNums);
        System.out.println(ResourceNums);
        System.out.println(TaskNums);
    }
    
        
    
    
    
    
    static public Department department[]; 
    static public Project project[];
    static public TeamMember member[];
    static public Resource resource[];
    static public Task task[];
    
    
    public static void readDepartments() throws IOException
    {//Read All Departments
        department = new Department[DepartmentNums];
        
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
            department[i] = new Department();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");
            
            department[i].setId(Integer.parseInt(parts[0].toString()));
            department[i].setName(parts[1].toString());
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
                System.out.println(department[i].getId());
                System.out.println(department[i].getName());
            }
        }*/
    }
    
    
    public static void readProjects() throws IOException
    {//Read All Projects
        project = new Project[ProjectNums];
                
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
            project[i] = new Project();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");
            
            project[i].setId(Integer.parseInt(parts[0].toString()));
            project[i].setName(parts[1].toString());
            project[i].setDepId(Integer.parseInt(parts[2].toString()));
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
                System.out.println(project[i].getId());
                System.out.println(project[i].getName());
                System.out.println(project[i].getDepId());
            }
        }*/        
    }
    
    public static void readMembers() throws IOException
    {//Read All Members
        member = new TeamMember[MemberNums];
        
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
            member[i] = new TeamMember();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");  
            
            member[i].setId(Integer.parseInt(parts[0].toString()));
            member[i].setName(parts[1].toString());
            member[i].setAddress(parts[2].toString());
            member[i].setPhone(parts[3].toString());
            member[i].setEmail(parts[4].toString());
            member[i].setPassword(parts[5].toString());
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
                System.out.println(member[i].getId());
                System.out.println(member[i].getName());
                System.out.println(member[i].getAddress());
                System.out.println(member[i].getPhone());
                System.out.println(member[i].getEmail());
                System.out.println(member[i].getPassword());
            }
        }*/
    }
    
    public static void readResources() throws IOException
    {//Read All Resources
        resource = new Resource[ResourceNums];
        
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
            resource[i] = new Resource();
            sentence = BR.readLine();
                                   
            parts = sentence.split(" # ");  
            
            resource[i].setId(Integer.parseInt(parts[0].toString()));
            resource[i].setName(parts[1].toString());
            resource[i].setUsed(Integer.parseInt(parts[2].toString()));
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
                System.out.println(resource[i].getId());
                System.out.println(resource[i].getName());
                System.out.println(resource[i].getUsed());
            }
        }*/
    }
    
    public static void readTasks() throws IOException
    {//Read All Tasks
        task = new Task[TaskNums];
        
        
        
        
        
    }
}
