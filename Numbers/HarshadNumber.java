<<<<<<< HEAD
import java.util.Scanner;
public class HarshadNumber {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value");
        int x=sc.nextInt();
        int sum=0;
        int rem;
        int temp=x;
        while(x!=0)
        {
            rem=x%10;
            sum=sum+rem;
            x=x/10;

        }
        if(temp%sum==0)
        {
          System.out.print("Hrashad Number");  
        }
        else
        {
          System.out.print(" not Hrashad Number");  
        }
    }
=======
import java.util.Scanner;
public class HarshadNumber {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value");
        int x=sc.nextInt();
        int sum=0;
        int rem;
        int temp=x;
        while(x!=0)
        {
            rem=x%10;
            sum=sum+rem;
            x=x/10;

        }
        if(temp%sum==0)
        {
          System.out.print("Hrashad Number");  
        }
        else
        {
          System.out.print(" not Hrashad Number");  
        }
    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}