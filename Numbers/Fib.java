import java.util.Scanner;
public class Fib{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num of digits");
        int n=sc.nextInt();
        int a=0;
        int b=1; 
        int fib;
        System.out.println(a + " " + b + " ");
        for(int i=3;i<=n;i++)
        {
             fib=a+b;
             System.out.print(fib+" ");
            a=b;
            b=fib;
            
        }
        


    }
}