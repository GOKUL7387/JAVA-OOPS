import java.io.*;

public class CreateFile
{
    public static void main(String[] args) 
    {
        try 
        {
            File file=new File("example.txt");
            if(file.createNewFile())
            {
                System.out.println("File is Created - "+file.getName());
                FileWriter writer=new FileWriter(file);
                writer.write("Hello....!");
                writer.close();
                System.out.println("Message added to the file..");
            }
            else
            {
                System.out.println("File Already Exist");
            }

        } 
        catch (IOException e) 
        {
            System.out.println("File Occured an Error!!");
        }

    }
}
