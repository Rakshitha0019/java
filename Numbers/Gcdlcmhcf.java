import java.util.Scanner;
public class Gcdlcmhcf{
    public static void main(String args[])
    {
        int gcd,lcm,a,b,x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
         a=sc.nextInt();
         System.out.println("enter b value");
         b=sc.nextInt();
        x=a;
        y=b;
        while(y!=0)
        {
            int temp=y;
               y=x%y;
               x=temp;
        }
        gcd=x;
        int hcf=x;
        lcm=a*b/gcd;
        System.out.println("gcd of given nums is" +gcd);
        System.out.println("hcf of given nums is" +hcf);
        System.out.println("lcm of given nums is" +lcm);
        
    }
}