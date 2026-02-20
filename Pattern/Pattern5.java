import java.util.Scanner;
public class Pattern5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter n value");
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for( j=0;j<n;j++)
            {
                if(i+j==n/2 || i-j==-(n/2) || i-j==n/2 || i+j==3*n/2)
                {
                  System.out.print("*");
                }
                else
                {
                  System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}