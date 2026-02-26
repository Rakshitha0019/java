import java.util.Scanner;
class SubAndPro
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int rem,sum=0;
        int pro=1;
        while(n!=0)
        {
          rem=n%10;
          sum+=rem;
          pro*=rem;
          n=n/10;
        }
        int result =pro-sum;
         System.out.printf("Differce of product and Sum of given number is %d",result);  
    }
}