import java.util.Scanner;

public class NullPointer
{
    public static void main(String args[])
    {
        String s = null;

        try
        {
            int n = s.length();
            System.out.println("Length is " + n);
        }
        catch(NullPointerException e)
        {
            System.out.println("Enter valid string " + e.getMessage());
        }
    }
}