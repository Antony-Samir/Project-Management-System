package project.management.system;

public class TeamMember
{
    private int ID;
    private String Name;
    private String Address;
    private String Phone; //Numbers Only
    private String Email; //Mail Format Only
    private String Password;
    private String Title;

    
    
    public int getID()
    {
        return ID;
    }

    public void setID(int ID)
    {
        this.ID = ID;
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
    
    public int giveId()
    {
        if (ReadFile.getInstance().MemberNums == 0)
        {
            return 1;
        }
        else
        {
            return ReadFile.getInstance().MemberNums+1;
        }
    }
    
}
