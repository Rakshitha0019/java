import java.util.Scanner;
public class Palindrome{
    public static void main(String args[])
    {
        int s,e;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting value");
        s=sc.nextInt();
        System.out.println("enter ending value");
        e=sc.nextInt();
        for(int i=s;i<=e;i++)
        {
    
        int num=i;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==i)
        {
              System.out.println(i);
        }
        
        }
    }
}