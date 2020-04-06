package project.management.system;

public class Tasks
{
    private int Id;
    public Project Proj;
    private String Title;
    private String FromDate;
    private String ToDate;
    public TeamMember Member;
    public Resources Resource;
    private String Status;

    public int getId()
    {
        return Id;
    }

    public void setId(int Id)
    {
        this.Id = Id;
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
