import java.util.Scanner;
import java.io.*;
public class Finally
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        int a[]={23,19,3,8,20};
        try{
            int res=n/b;
            System.out.println("enter value to access");
            int i=sc.nextInt();
            System.out.println(a[i]);           
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot be divided"+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("enter valid index"+e.getMessage());
        }
        catch(Exception e)
        {
          System.out.println("Error!!!!!"+e.getMessage());  
        }
        finally{
            System.out.println("Finally will execute whether an exception occurs or not");  
        }

    }
}