import java.util.Scanner;
public class MergeArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st array size");
        int m=sc.nextInt();
        int []num1=new int[m];
        System.out.println("enter " +3+" elements into array in sorted list");
        for(int i=0;i<3;i++)
        {
            num1[i]=sc.nextInt();
        }
        System.out.println("1st array is");
        for(int i=0;i<m;i++)
        {
        System.out.println(num1[i]+" ");
        }
        System.out.println("enter 2nd array size");
        int n=sc.nextInt();
        int []num2=new int[n];
        System.out.print("enter " +n+" elements into array in sorted list");
        for(int i=0;i<n;i++)
        {
            num2[i]=sc.nextInt();
        }
        System.out.println("2nd array is");
        for(int i=0;i<n;i++)
        {
        System.out.print(num2[i]+" ");
        }
        for(int k=0;k<m+n;k++)
        {
            for(int j=0;j<n;j++)
            {
                if(num2[k]<num1[j])

                {
                    int temp=num1[j];
                    num1[j]=num2[k];
                    num2[k]=temp;
                }

            }
        }
        for(int i=0;i<m;i++)
        {
        System.out.println(num1[i]+" ");
        }


    }
}