import java.util.Scanner;
import java.util.Arrays;
public class Anagram{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st string");
        String s1=sc.nextLine();
         System.out.println("enter 2st string");
        String s2=sc.nextLine();
        int n=s1.length();
        int m=s2.length();
        if(n!=m)
        {
        System.out.println("not Anagaram");  
        }
        else
        {
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
               System.out.println("not Anagaram");  
               System.exit(0);  
               
            }
        }
        }

        System.out.println(" it is Anagaram");  
    }
}