import java.util.Scanner;
class Pattern1
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
       int n=sc.nextInt();
       int i,j;
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=i;j++)
        {
          System.out.print("*");
        }
            System.out.println();
       } 
    }

    
}