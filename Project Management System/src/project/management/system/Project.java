package project.management.system;

public class Project
{
    
    private int Id;
    private String Name;
    private int depId;
   

    
        
    public int getId()
    {
        return Id;
    }

    public void setId(int Id)
    {
        this.Id = Id;
    }
    
    public String getName()
    {
        return Name;
    }

    public void setName(String ProjectName)
    {
        this.Name = ProjectName;
    }
        
    public int getDepId()
    {
        return depId;
    }

    public void setDepId(int depId)
    {
        this.depId = depId;
    }
}
