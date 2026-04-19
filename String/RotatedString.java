import  java.util.Scanner;
public class RotatedString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
         System.out.println("Enter goal string");
        String goal=sc.nextLine();
        if(s.length()!=goal.length())
        {
             System.out.println("invalid!!");
             return;
        }
        String str=s+s;
        if(str.contains(goal))
        {
           System.out.println("True");  
        }
        else
        {
           System.out.println("false");  
        }


    }
}