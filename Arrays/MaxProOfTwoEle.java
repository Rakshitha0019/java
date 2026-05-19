import java.util.*;

public class MaxProOfTwoEle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value");
        int n = sc.nextInt();

        int[] a = new int[n];   // Array declaration

        System.out.println("Enter " + n + " values into array");

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int product = (a[n-1] - 1) * (a[n-2] - 1);

        System.out.println("Maximum product is: " + product);
    }
}