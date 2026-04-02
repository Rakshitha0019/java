import java.util.Scanner;
public class Neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int sq=n*n;
        int rem;
        int sum=0;
        while(sq!=0)
        {
            rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        if(n==sum)
        {
          System.out.println(n+" is a neon number");  
        }
        else
        {
             System.out.println(n+" is not a neon number");  
        }
        
    }
}