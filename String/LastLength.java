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
}