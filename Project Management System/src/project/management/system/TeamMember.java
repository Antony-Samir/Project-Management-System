package project.management.system;

public class TeamMember
{    
    
    ReadFile RF = new ReadFile();
    static public int IdCount = 0;
    //For checking the last ID number in file
    //Giving the new member the last ID in file + 1  
    
    private int Id;
    private String Name;
    private String Address;
    private String Phone; //Numbers Only
    private String Email; //Mail Format Only
    private String Password;
    private String Title;

    public TeamMember()
    {
    }

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

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String Password)
    {
        this.Password = Password;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setTitle(String Title)
    {
        this.Title = Title;
    }
    
    
    
    
}
