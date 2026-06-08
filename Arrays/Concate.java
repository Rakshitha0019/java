import java.util.Scanner;
public class Concate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int []arr=new int [n];
        int []ans=new int[2*n];
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          ans[i]=arr[i];
          ans[i+n]=arr[i];
        }
          System.out.println("concated array is:");


        for(int i=0;i<2*n;i++)
        {
            System.out.print(ans[i]+" ");
        }

        
      
    }
}