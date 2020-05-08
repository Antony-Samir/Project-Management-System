package project.management.system;

import Forms.LoginForm;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogViewer implements Observer
{
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss:mm:HH dd/MM/yyyy");  
    LocalDateTime now = LocalDateTime.now();
    
    @Override
    public void updateLog(int memberID)
    {
        try
        {
            WriteFile.writeLog(String.valueOf(ReadFile.MEMBERS.get(memberID).getID()), ReadFile.MEMBERS.get(memberID).getName(), dtf.format(now));
        } catch (IOException ex)
        {
            Logger.getLogger(LogViewer.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
