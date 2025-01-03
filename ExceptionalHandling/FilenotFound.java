import java.io.*;

public class FilenotFound 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream file = new FileInputStream("missingfile.txt"); // Throws FileNotFoundException
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}