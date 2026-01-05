import java.util.Scanner;
public class Fact{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         System.out.println("enter a num");
        int n = sc.nextInt();
        Long fact=1;
        for(int i=2;i<=n;i++)
        {
        fact = fact * i;
        }
         System.out.println("the factorial  of given num is " +fact);
    }
}