import java.util.Scanner;
public class Posnegzero
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any whole number "); 
        int a=sc.nextInt();
        if(a>0)
          System.out.println("a is +ve value ");
        else if(a<0)
          System.out.println("a is -ve value "); 
        else 
          System.out.println("a is zero "); 
        
    }
}