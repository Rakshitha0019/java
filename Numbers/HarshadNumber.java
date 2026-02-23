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
}