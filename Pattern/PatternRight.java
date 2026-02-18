import java.util.Scanner;

public class PatternRight {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i-j>=0)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.print("\n");
        }
    }
}
