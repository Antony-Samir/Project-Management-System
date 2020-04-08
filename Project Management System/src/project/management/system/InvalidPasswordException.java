package project.management.system;
public class InvalidPasswordException extends Exception
{
    static public int InvalidCount = 3;
    
    public InvalidPasswordException(String x)
    {// Constructor that calls the constructor of parent Exception
        super(x);
    }
    
    
    public static void setInvalidCount(int InvalidCount)
    {
        InvalidPasswordException.InvalidCount = InvalidCount;
    }
    
    public static int getInvalidCount()
    {
        return InvalidCount;
    }

    
}
