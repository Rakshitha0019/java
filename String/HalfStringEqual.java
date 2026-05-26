import java.util.Scanner;
class HalfStringEqual
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        String vowels = "aeiouAEIOU";
        int mid = s.length() / 2;

        int first = 0, second = 0;

        for (int i = 0; i < mid; i++) {
            if (vowels.contains(s.charAt(i) + "")) {
                first++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i) + "")) {
                second++;
            }
        }

        if(first==second)
        {
            System.out.println("Equal");
            return;
        }
        System.out.println(" not Equal");
        
    }
}
    