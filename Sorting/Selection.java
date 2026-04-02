import java.util.Scanner;
public class Selection
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter  N value:");
    int n=sc.nextInt();
    int []a=new int[n];
    int i;
    int temp;
    System.out.println("Enter " + n +" values into array");
    for( i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
   
    System.out.println("Array before sorting:");
    for( i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }
    for(i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
             temp=a[j];
             a[j]=a[i];
             a[i]=temp;
            }
        }
    }
    System.out.println("Array After sorting:");
    for( i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }

  }
}