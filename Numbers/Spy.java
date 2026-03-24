import java.util.Scanner;
public class Spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int temp=n;
        int rem;
        int pro=1;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        if(sum==pro)
        {
          System.out.println(temp+" is a spy number");  
        }
        else
        {
             System.out.println(temp+" is not a spy number");  
        }
    }
}