import java.util.Scanner;
public class RemoveSpace
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string :");
        String s=sc.nextLine();
        String st=s.replace(" ","");
         System.out.println("string after removing spaces:"+ st);

    }
}