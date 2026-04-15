// if n=16 return true as (2 pow 4 )is 16
// if n=3return false as 3 does not exit in 2 power
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfTwo(n)) {
            System.out.println("true, it is power of 2");
        } else {
            System.out.println("false, it is not power of 2");
        }

        sc.close();
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}