<<<<<<< HEAD
import java.util.Scanner;
class CountBin {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter n value");
         int n=sc.nextInt();
        
        if (n == 1) 
        {
          System.out.println("2");
          
        }
       if (n == 2) 
        {
         System.out.println("3");
        
        }

        int a = 2; 
        int b = 3; 

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

       System.out.println(b);
    }
}
=======
import java.util.Scanner;
class CountBin {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter n value");
         int n=sc.nextInt();
        
        if (n == 1) 
        {
          System.out.println("2");
          
        }
       if (n == 2) 
        {
         System.out.println("3");
        
        }

        int a = 2; 
        int b = 3; 

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

       System.out.println(b);
    }
}
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
