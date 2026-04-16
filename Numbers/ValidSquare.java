import java.util.Scanner;

public class ValidSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("valid square");
            return;
        }

        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sq = (long) mid * mid;

            if (sq == n) {
                System.out.println("valid square");
                return; 
            } else if (sq < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

    
        System.out.println("not a valid square");
    }
}