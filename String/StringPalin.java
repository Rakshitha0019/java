<<<<<<< HEAD
import java.util.Scanner;
public class StringPalin
{
    int isPalindrome(String s)
    {
        
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return 0;
            }
           i++;
           j--;
        }
        return 1;
        
        
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a string");
        String st=sc.nextLine();
        StringPalin sp=new StringPalin();
        if(sp.isPalindrome(st)!=0)
        {
            System.out.println(st+ " is a palindrome");
        }
        else
        {
           System.out.println(st+ " is not a palindrome"); 
        }
    } 
=======
import java.util.Scanner;
public class StringPalin
{
    int isPalindrome(String s)
    {
        
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return 0;
            }
           i++;
           j--;
        }
        return 1;
        
        
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter a string");
        String st=sc.nextLine();
        StringPalin sp=new StringPalin();
        if(sp.isPalindrome(st)!=0)
        {
            System.out.println(st+ " is a palindrome");
        }
        else
        {
           System.out.println(st+ " is not a palindrome"); 
        }
    } 
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}