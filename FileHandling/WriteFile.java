import java.io.*;
import java.io.FileWriter;
public class  WriteFile
{
    public static void main(String args[])
    {
        try{
        FileWriter obj=new FileWriter("file1.txt",true);
        obj.write("Welcome!!");
        obj.close();
        System.out.println("successfully written in file");
        }
        catch(IOException e)
        {
            System.out.println("file not found"+e.getMessage());
        }
    }
}