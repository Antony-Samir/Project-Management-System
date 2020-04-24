package project.management.system;

public class Task
{
    private int ID;
    public int ProjectID;
    private String Title;
    private String FromDate;
    private String ToDate;
    public int MemberID[];
    public int ResourceID[];
    private String Status;

    public Task()
    {
        MemberID = new int[ReadFile.MemberNums];
        ResourceID = new int[ReadFile.ResourceNums];
    }

    
    
    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
    }

    public int getProjectID()
    {
        return ProjectID;
    }

    public void setProjectID(int ProjectID)
    {
        this.ProjectID = ProjectID;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String Title)
    {
        this.Title = Title;
    }

    public String getFromDate()
    {
        return FromDate;
    }

    public void setFromDate(String FromDate)
    {
        this.FromDate = FromDate;
    }

    public String getToDate()
    {
        return ToDate;
    }

    public void setToDate(String ToDate)
    {
        this.ToDate = ToDate;
    }

    public String getStatus()
    {
        return Status;
    }

    public void setStatus(String Status)
    {
        this.Status = Status;
    }

    
    
}
