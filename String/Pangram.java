<<<<<<< HEAD
import java.util.Scanner;
public class Pangram
{
   int isPangram(String st)
   {
        for(int i='a';i<='z';i++)
        {
            if(st.indexOf(i)==-1)
            {
               return 0;
            }
            
        }
       return 1;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String st=sc.nextLine();
        st=st.toLowerCase();
        Pangram p=new Pangram();
        int res=p.isPangram(st);
        if(res!=0)
        {
          System.out.println("Given string is Pagram");
        }
        else
        {
          System.out.println("Given string is not a Pagram");
        }
    }

}
=======
import java.util.Scanner;
public class Pangram
{
   int isPangram(String st)
   {
        for(int i='a';i<='z';i++)
        {
            if(st.indexOf(i)==-1)
            {
               return 0;
            }
            
        }
       return 1;
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String st=sc.nextLine();
        st=st.toLowerCase();
        Pangram p=new Pangram();
        int res=p.isPangram(st);
        if(res!=0)
        {
          System.out.println("Given string is Pagram");
        }
        else
        {
          System.out.println("Given string is not a Pagram");
        }
    }

}
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
