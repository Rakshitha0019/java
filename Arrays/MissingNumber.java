import java.util.Scanner;
public class MissingNumber
{
   public static void main(String args[]) 
   {
        
        System.out.print("enter n numbers"+"  ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        System.out.print("enter "+n+ " numbers  ");
        for(int i=0;i<n;i++)
        {
          nums[i]=sc.nextInt();
        }
        System.out.print("array is : ");
        for(int i=0;i<n;i++)
        {
          System.out.println(nums[i]);
        }
        int sum=0;
        for(int j=0;j<n;j++)
        {
            sum=sum+nums[j];
        }
        int totsum=n*(n+1)/2;
        int res=totsum-sum;
        System.out.println("missing number is "+res);


    }
}      