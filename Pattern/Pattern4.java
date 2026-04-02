<<<<<<< HEAD
class Pattern4
{
    public static void main(String args[])
    {
        int n=4;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j<=2 || i-j>=-(n/2) || i==n/2)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }

    }
=======
import java.util.Scanner;
class Pattern4
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
       int n=sc.nextInt();
       int i,j;
       for(i=0;i<n;i++)
       {
        for(j=0;j<n;j++)
        {
            if(i*j==0 || (i*j%4)==0)
             System.out.print("* ");
            else 
             System.out.print("  ");
        }
       System.out.print("\n");

             
       } 
    }

    
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}