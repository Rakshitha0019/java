import java.util.Scanner;
class H_Index{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[]citations=new int[n];
        System.out.println("enter" + n +"values into array");
        for(int s=0;s<n;s++)
        {
            citations[s]=sc.nextInt();
        }
        System.out.println("array is ");
        for(int s=0;s<n;s++)
        {
             System.out.println(citations[s]);
        }
        int h=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(citations[i]< citations[j])
                {
                    int temp=citations[i];
                    citations[i]=citations[j];
                    citations[j]=temp;
                }
            }
         }
        for(int k=0;k<n;k++)
        {
            if(citations[k]>=k+1)
            {
                h=k+1;
            }
            else
            {
                break;
            }
        }
        System.out.println("H-index is"+h);
    }

}
        