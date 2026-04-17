import java.util.Scanner;

public class PerfectNumber{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n==6 || n==28 || n==496 || n==8128 || n==33550336)
        {
            System.out.println("Yes!! it is perfect number");
        }
        else{
             System.out.println("No, it is not perfect number");
        }
    }
}