import java.util.Scanner;

public class ArrayOut
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] a = {23,12,3,8,20};

        try
        {
            System.out.println("Enter index you want to access:");
            int n = sc.nextInt();

            System.out.println("Accessed element is " + a[n]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Enter valid index: " + e.getMessage());
        }
    }
}
