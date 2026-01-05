
// code is wrong***
import java.util.Scanner;
Class Rev
{
    int rem,rev
    public int num(int n)
    {
        int rem;
        int rev=0;
         rem=n%10;
         rev=rev*10+rem;
        


    }
}
public Class Reverse
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       
        System.out.println("enter a num");
        int a=sc.nextInt();
        Rev n=new Rev();
        int revv=n.Rev(a);
        
        System.out.println("reverse of num is" +revv);



    }
}