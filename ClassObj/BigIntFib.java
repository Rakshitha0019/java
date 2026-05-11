import java.math.BigInteger;
import java.util.Scanner;

class BigIntFib{
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        
        BigInteger a=new BigInteger("1");//1st fib no.
        BigInteger b=new BigInteger("1");//2st fib no.
         int i;
         BigInteger c=null;
         if(n==1)
         {
            System.out.print(n+"th fibnoccie number is "+a );
            
         }
         for(i=3;i<=n;i++)
         {
             c=a.add(b);
             a=b;
             b=c;
         }
        System.out.print(n+"th fibnoccie number is"+c );
    }
}