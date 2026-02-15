import java.util.*;
class FirstAndLastDig{
    public static void main(String args[])
    {
        int n=2319;
        String s=Integer.toString(n);
        int first_digit=s.charAt(0)-'0';
         int last_digit=s.charAt(s.length()-1)-'0';
         System.out.println("first digit of " + n + " is " + first_digit);
           System.out.println("last digit of " + n + " is "  +   last_digit);
        
    }
}