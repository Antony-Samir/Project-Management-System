/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management.system;

/**
 *
 * @author Dr Tony
 */
public class Log
{
    private int memberID;
    private String memberName;
    private String date_time;

    
    public int getMemberID()
    {
        return memberID;
    }

    public void setMemberID(int memberID)
    {
        this.memberID = memberID;
    }

    public String getMemberName()
    {
        return memberName;
    }

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public String getDate_time()
    {
        return date_time;
    }

    public void setDate_time(String date_time)
    {
        this.date_time = date_time;
    }
         
}
