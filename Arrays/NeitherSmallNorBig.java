import java.util.Scanner;
import java.util.Arrays;
class NeitherSmallNorBig
{
    public static void main(String argd[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("enter " + n + " values into array");
        for(int i=0;i<n;i++)
        {
           a[i] = sc.nextInt();
        }
        if(n<=2)
        {
            System.out.println("enter sufficient values");
        }
        else
        {
          Arrays.sort(a);
          System.out.println("the number which is neither Small nor Big is:"+a[1]);
        }
    }
}