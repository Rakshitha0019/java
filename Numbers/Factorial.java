<<<<<<< HEAD
 import java.util.Scanner;
 Class Fact
 {
    int cal(int num)
   {
     
      int fact=1;
    
      for(int i=1 ; i<=num ; i++)
      {
        fact*=i;
      }
       return fact;

   }
}
 
public class Factorial
{
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        Fact obj=new Fact();
         int fact=obj.cal(n);
         System.out.println("factroial of given num is:" +fact );
    }
}
=======
 import java.util.Scanner;
 Class Fact
 {
    int cal(int num)
   {
     
      int fact=1;
    
      for(int i=1 ; i<=num ; i++)
      {
        fact*=i;
      }
       return fact;

   }
}
 
public class Factorial
{
    public static void main(String args[])
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        Fact obj=new Fact();
         int fact=obj.cal(n);
         System.out.println("factroial of given num is:" +fact );
    }
}
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
