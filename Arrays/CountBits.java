import java.util.Scanner;
//Count number of 1's from 0 to n
class CountBits{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value ");
        int n=sc.nextInt();
        int ans[]=new int[n+1];
        ans[0]=0;
        int bin;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            int num=i;
            while(num>0)
            {
               bin=num%2;
               num=num/2;
               if(bin==1)
               {
                count++;
               }

            }
            ans[i]=count;

        }
        for(int i=0;i<=n;i++)
        {
         System.out.print(ans[i]+ " ");
        }
     
    }
}