import java.util.Scanner;
import java.util.Arrays;
public class Binary
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter  N value:");
    int n=sc.nextInt();
    int []a=new int[n];
    int i;
    System.out.println("Enter " + n +" values into array");
    for( i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    System.out.println(" sorted array is:\n");
    for( i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }
    System.out.println("Enter  key value:");
    int key=sc.nextInt();
    int low=0;
    int high=n-1;
    int mid;
    while(low<=high)
    {
      mid=(low+high)/2;
      if(a[mid]==key)
      {
         System.out.print("key value "+key+"  is found at index "+mid);
         break;
      }
      else if(key>a[mid])
      {
        low=mid+1;
      }
      else
      {
        high=mid-1;
      }
    }
    
  }
}