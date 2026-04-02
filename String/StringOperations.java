<<<<<<< HEAD
import java.util.Scanner;
class StringOperations{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 strings");
        StringBuilder sb1=new StringBuilder(sc.nextLine());
        StringBuilder sb2=new StringBuilder(sc.nextLine());
        int a=sb1.length();
        System.out.println(a);
        System.out.println(sb2.reverse());
        System.out.println(sb1.toString().toUpperCase());
        System.out.println(sb1.toString().toLowerCase());
        System.out.println(sb1.substring(3));
        System.out.println(sb1.append(sb2));
        System.out.println(sb1.substring(1,6));
        System.out.println(sb2.delete(0,3));
        System.out.println(sb1.insert(1,"hi"));
    }

=======
import java.util.Scanner;
class StringOperations{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 strings");
        StringBuilder sb1=new StringBuilder(sc.nextLine());
        StringBuilder sb2=new StringBuilder(sc.nextLine());
        int a=sb1.length();
        System.out.println(a);
        System.out.println(sb2.reverse());
        System.out.println(sb1.toString().toUpperCase());
        System.out.println(sb1.toString().toLowerCase());
        System.out.println(sb1.substring(3));
        System.out.println(sb1.append(sb2));
        System.out.println(sb1.substring(1,6));
        System.out.println(sb2.delete(0,3));
        System.out.println(sb1.insert(1,"hi"));
    }

>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}