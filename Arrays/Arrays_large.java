import java.util.Scanner;
public class Arrays_large
{
    public static void main(String args[])
  {

    int n=6;
    int [] a={21,4,31,5,6,7};
   
    for( int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(a[j]<a[j+1])
           {
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
           }
        }          
    } 
    Scanner sc=new Scanner(System.in);

    System.out.print("enter which largest number you want:_");
    int large=sc.nextInt();
    if(large > 0 && large <= n)
    {
      System.out.println(" 3rd largest num is :"+ a[large-1]);
    }
    else
    {
        System.out.println("invald input for 'large' number");
    }
    sc.close();

  }
   
}