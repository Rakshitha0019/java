import java.io.*;
import java.util.Scanner;
public class Throw{
    public static void main(String[] args) {
        int age = 23;

        if (age < 18) {
            throw new ArithmeticException("You are not eligible to vote");
        }

        System.out.println("You can vote");
    }
}