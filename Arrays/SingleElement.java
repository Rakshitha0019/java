import java.util.*;
public class SingleElement
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int []arr=new int[n];
         System.out.println("enter "+ n + " elements into array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for( int k=0;k<n;k++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[k]==arr[j])
                {
                    count++;
                }

            }
            if(count==1)
            {
                System.out.println("single element "+ arr[k]+ " ");
            }
            
        }

        
    }
}
 