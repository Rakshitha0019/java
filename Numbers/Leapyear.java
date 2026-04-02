<<<<<<< HEAD
import java.util.Scanner;
public class Leapyear{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a year");
        int y=sc.nextInt();
       
       System.out.println((y%400==0)||(y%4==0 && y%100!=0)?"leap year" : "not a leapyear");
    }
}

=======
import java.util.Scanner;
public class Leapyear{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a year");
        int y=sc.nextInt();
       
       System.out.println((y%400==0)||(y%4==0 && y%100!=0)?"leap year" : "not a leapyear");
    }
}

>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
