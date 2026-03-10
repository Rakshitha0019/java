import java.util.Scanner;
public class RevArray{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.println("enter" + n + "elements into array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Array before reverse");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+ " "); 
        }
        
       int j=0;
       int k=n-1;
       int temp;
       while(j<k)
       {
        temp=a[j];
        a[j]=a[k];
        a[k]=temp;
        j++;
        k--;

       }
       System.out.println("Array after reverse");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " "); 
       
         }
     }

}