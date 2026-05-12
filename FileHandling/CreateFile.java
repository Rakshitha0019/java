import java.io.*;
class CreateFile
{
    public static void main(String arrs[])
    {
      File obj=new File("file1.txt");
      try
      {
        if(obj.createNewFile())
        {
            System.out.println("file created");
        }
        else
        {
            System.out.println("file alredy exist");
        }
      }
        catch(IOException e)
        {
          System.out.println("file not created"+e.getMessage());
        }
      }
    }
