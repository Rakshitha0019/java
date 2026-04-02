<<<<<<< HEAD
import java.util.Scanner;
class Countdig 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=0;
        int rem;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            if(temp%rem==0)
            {
                count++;
            }
            num=num/10;
        }
         System.out.printf("%d elements divide the given number",count);
     
    }
=======
import java.util.Scanner;
class Countdig 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=0;
        int rem;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            if(temp%rem==0)
            {
                count++;
            }
            num=num/10;
        }
         System.out.printf("%d elements divide the given number",count);
     
    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}