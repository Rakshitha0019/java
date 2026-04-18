import java.util.Scanner;
class MirrorDstanceOfInt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev<temp)
        {
            int res=-(rev-temp);
            System.out.println("Mirror integer of given number is"+rev);
             System.out.println("Distance between mirror integer and given integer is "+res);

        }
        else
        {
            int res=(rev-temp);
            System.out.println("Mirror integer of given number is"+rev);
             System.out.println(" Disteance between mirror integer and given integer is "+res);
        }
    }
}