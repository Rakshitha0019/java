import java.util.Scanner;
public class SubSeq
{
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string");
      String a=sc.nextLine();
      System.out.println("enter b string");
      String b=sc.nextLine();
      int n=a.length();
      int m=b.length();
      int j=0;
      for(int i=0;i<n && j<m;i++)
      {
        if(a.charAt(i)==b.charAt(j))
        {
            j++;
        }
      }
      System.out.println(m-j);
    }
}