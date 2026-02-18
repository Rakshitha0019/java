import java.util.Scanner;

public class PatternInvert {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value");
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                  System.out.print("* ");
                }
                  System.out.print("\n");
                  
            }
          
        }
    }

