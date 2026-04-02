import java.util.Scanner;
class Sum
{
    public static void main(String argd[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int [] a=new int[n];
        int sum=0;
        System.out.println("enter " + n + " values into array");
        for(int i=0;i<n;i++)
        {
           a[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            sum+=a[j];
        }
         System.out.println("Sum of given number is " + sum );



    }
}