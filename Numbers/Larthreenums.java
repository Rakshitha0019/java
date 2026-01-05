import java.util.Scanner;
public class Larthreenums
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a value");
         int a=sc.nextInt();
         System.out.println("enter b value");
         int b=sc.nextInt();

         System.out.println("enter c value"); 
         int c=sc.nextInt();
         if(a>b && a>c)
          System.out.println("a is greater value "); 
         else if (b>c)
          System.out.println("b is greater value "); 
        else
          System.out.println("c is greater value "); 



    }
}