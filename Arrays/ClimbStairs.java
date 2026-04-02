import java.util.Scanner;
public class ClimbStairs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Steps you want to climb");
        int n=sc.nextInt();       //__0_1_2___3___4__5_
        
        if(n==1||n==2)
        {
           System.out.println("Given no of Steps can be climb in "+n+  "  ways"); 
        }
        else if(n>=3)
        {
          int []dp=new int[n+1];   //|_0_|1_|2__|3___|5__|_8_|
          dp[1]=1;
          dp[2]=2;
          for(int i=3;i<=n;i++)
          {
            dp[i]=dp[i-1]+dp[i-2];
            
          }
          System.out.println("Given no of Steps can be climb in "+dp[n] + "ways");
         
        }
        
    }
} 