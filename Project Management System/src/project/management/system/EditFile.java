package project.management.system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditFile
{
    public static void deleteDepartment(int rowNum) throws IOException
    {
        deleteRow("Department.txt", "myTemp.txt", rowNum);
    }
    
    public static void deleteProject(int rowNum) throws IOException
    {
        deleteRow("Project.txt", "myTemp.txt", rowNum);
    }

    public static void deleteResource(int rowNum) throws IOException
    {
        deleteRow("Resources.txt", "myTemp.txt", rowNum);
    }
    
    public static void deleteTask(int rowNum) throws IOException
    {
        deleteRow("Tasks.txt", "myTemp.txt", rowNum);
    }
    
    
    
    public static void updateDepartment(int rowNum) throws IOException
    {
        deleteRow("Department.txt", "myTemp.txt", rowNum);
    }
    
    public static void updateProject(int rowNum) throws IOException
    {
        deleteRow("Department.txt", "myTemp.txt", rowNum);
    }

    public static void updateResource(int rowNum) throws IOException
    {
        deleteRow("Resources.txt", "myTemp.txt", rowNum);
    }
    
    public static void updateTask(int rowNum) throws IOException
    {
        deleteRow("Tasks.txt", "myTemp.txt", rowNum);
    }
    
    
    
    
    
    private static void deleteRow(String from, String to, int rowNum) throws IOException
    {
    
        FileReader FR = new FileReader(from);
        BufferedReader BR = new BufferedReader(FR);
                
        String lineToRemove = null;
        for (int i = 0; i < rowNum; i++)
        {
            lineToRemove = BR.readLine();
        }
                
        
        File inputFile = new File(from);
        File tempFile = new File(to);

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        
        String currentLine;

        while((currentLine = reader.readLine()) != null)
        {//Trim newline when comparing with lineToRemove
            
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) 
            {
                continue;
            }
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close(); 
        reader.close(); 

        
        
        copyFile(to, from); //Call the helper funtion
    }
    
    private static void copyFile(String from, String to) throws IOException
    {
        
         
        FileInputStream instream = null;
        FileOutputStream outstream = null;
 
    	  try
        {
            File infile =new File(from);
            File outfile =new File(to);

            instream = new FileInputStream(infile);
            outstream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;
            /*copying the contents from input stream to
             * output stream using read and write methods
             */
            while ((length = instream.read(buffer)) > 0)
            {
                outstream.write(buffer, 0, length);
            }

            //Closing the input/output file streams
            instream.close();
            outstream.close();

            System.out.println("File copied successfully!!");
 
        }
        catch(IOException ioe)
        {
             ioe.printStackTrace();
        }
    }
}
