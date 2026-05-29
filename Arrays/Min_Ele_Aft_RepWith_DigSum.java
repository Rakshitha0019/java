import java.util.*;
class Min_Ele_Aft_RepWith_DigSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("enter "+n+ " elements into array:");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int temp=nums[i];
            int sum=0;
            while(temp !=0)
            {
               
                int rem=temp%10;
                sum=sum+rem;
                temp=temp/10;
            }
            nums[i]=sum;
            min=Math.min(min,nums[i]);

        }
        System.out.println("min sum digit is "+min);


    }
}