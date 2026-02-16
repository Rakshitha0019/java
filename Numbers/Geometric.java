import java.util.Scanner;
 
  public class Geometric {
public static void main(String args[]){
    
Scanner sc=new Scanner(System.in);
System.out.println("enter a val:");
int a=sc.nextInt();
System.out.println("enter r val:");
int r=sc.nextInt();
System.out.println("enter n val:");
int n=sc.nextInt();
int result=a;
for(int i=1;i<n-1;i++)
{
result=result*r;
}
System.out.println("result=" +result);

}
}