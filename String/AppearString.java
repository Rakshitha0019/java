import java.util.Scanner;

public class AppearString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of patterns
        System.out.print("Enter number of patterns: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input patterns
        String[] patterns = new String[n];
        System.out.println("Enter the patterns:");
        for (int i = 0; i < n; i++) {
            patterns[i] = sc.nextLine();
        }

        // Input word
        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        int count = 0;

        // Check each pattern
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }

        // Output result
        System.out.println("Number of patterns found: " + count);

        sc.close();
    }
}