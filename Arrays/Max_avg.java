import java.util.Scanner;

public class Max_avg {

    // Method to find maximum average
    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Maximum Average Subarray ===");

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the size of the subarray (k): ");
        int k = sc.nextInt();

        // Validation
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k! It should be between 1 and " + n);
        } else {
            double result = findMaxAverage(nums, k);
            System.out.printf("Maximum Average = %.5f%n", result);
        }

        sc.close();
    }
}