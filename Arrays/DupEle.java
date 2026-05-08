import java.util.Scanner;
public class DupEle{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("enter "+ n + " value into array");
        int i;
        boolean found=false;
        for( i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int j;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    System.out.println("duplicate element is "+ nums[i]);
                    found=true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates");
        }
    }
}