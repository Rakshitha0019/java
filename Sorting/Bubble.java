import java.util.Scanner;
public class Bubble
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter  N value:");
    int n=sc.nextInt();
    int []a=new int[n];
    int i;
    int temp;
    System.out.print("Enter " + n +" values into array ");
    for( i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
   
    System.out.print("Array before sorting:\n");
    for( i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }
    for(i=0;i<n-1;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
            {
             temp=a[j+1];
             a[j+1]=a[j];
             a[j]=temp;
            }
        }
    }
    System.out.print("Array After sorting:\n");
    for( i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }

  }
}