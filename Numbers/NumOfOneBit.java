<<<<<<< HEAD
import java.util.Scanner;
class NumOfOneBit {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            if(n%2==1)
            {
                count++;
                n=n/2;
            }
            else
            {
                n=n/2;
            }

            
        }
         System.out.println("Number of 1-bits in given number are " +count );
       

        
    }
=======
import java.util.Scanner;
class NumOfOneBit {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            if(n%2==1)
            {
                count++;
                n=n/2;
            }
            else
            {
                n=n/2;
            }

            
        }
         System.out.println("Number of 1-bits in given number are " +count );
       

        
    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}