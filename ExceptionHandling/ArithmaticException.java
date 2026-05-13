import java.io.*;
import java.util.Scanner;
public class ArithmaticException
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter b number");
        int b=sc.nextInt();
        try
        {
            int c =a/b;
            System.out.println("result is:"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("number cannot be divided "+e.getMessage());
        }

    }
}