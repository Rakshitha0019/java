import java.util.Scanner;
class Target
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter" +n+ "values");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element from array");
        int tar=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            if(arr[j]==tar)
            {
                System.out.println("Target is fouund at" +j+ "index");
                break;
            }
    
        }
        System.out.println("enter valid Target ");
         



    }
}