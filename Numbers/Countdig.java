import java.util.Scanner;
class Countdig 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int count=0;
        int rem;
        int temp=num;
        while(num!=0)
        {
            rem=num%10;
            if(temp%rem==0)
            {
                count++;
            }
            num=num/10;
        }
         System.out.printf("%d elements divide the given number",count);
     
    }
}