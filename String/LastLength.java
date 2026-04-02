<<<<<<< HEAD
import java.util.Scanner;
class LastLength
{
    public static void main(String argd[])
  {  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    String[] str=s.trim().split(" ");
    System.out.println(str[str.length-1].length());
  }
=======
import java.util.Scanner;
class LastLength{
    public static void main(String argd[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    String[] str=s.trim().split(" ");
    System.out.println(str[str.length-1].length());
}
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}