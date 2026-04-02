import java.util.Scanner;
public class Linear
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter  N value:");
    int n=sc.nextInt();
    int []a=new int[n];
    int i;
    System.out.print("Enter " + n +" values into array");
    for( i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.print("Array is:\n");
    for( i=0;i<n;i++)
    {
       System.out.println(a[i]);
    }
    System.out.print("Enter  key value:");
    int key=sc.nextInt();
    int flag=0;
    for(i=0 ; i<n ; i++)
    {
        if(a[i]==key)
        {
           flag=1;
           break;
        }
    }
    if(flag==1)
    {
     System.out.print("key value "+key+"  is found at index "+i);
    }
    else
    {
     System.out.print("key element not found");
    }

  }
}