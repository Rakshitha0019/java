import java.util.Scanner;
public class AddDigit {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int num=sc.nextInt();
       while(num>=10)
        {
         int sum=0;
           while(num!=0)
          {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
           }
          num=sum;
         
        }
        System.out.println(num);
    }
}