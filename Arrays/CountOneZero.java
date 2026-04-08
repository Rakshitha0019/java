import java.util.Scanner;
class Count
{
    void iscount(int arr[])
    {
        int n=arr.length;
        int []ans=new int[n];
        int i;
        int k=0;
        int j=n-1;
        for(i=0;i<n;i++)
        {
            
                if(arr[i]==0)
                {
                    ans[k]=0;
                    k++;
                }
                else
                {
                    ans[j]=1;
                    j--;
                }
            
        }
        for(int s=0;s<n;s++)
        {
            System.out.print(ans[s]);
        }
    }
}
public class CountOneZero
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
    int m=sc.nextInt();
    int []arr=new int[m];
    System.out.println ("enter " + m + " values into array ");
    for(int s=0;s<m;s++)
    {
        arr[s]=sc.nextInt();
    }
    Count c =new Count();

    System.out.println ("array is:");
    c.iscount(arr);
  }

}