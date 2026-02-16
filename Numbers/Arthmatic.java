 import java.util.Scanner;
 
  public class Arthmatic {
    


public static void main(String args[]){
    
Scanner sc=new Scanner(System.in);
System.out.println("enter a val:");
int a=sc.nextInt();
System.out.println("enter d val:");
int d=sc.nextInt();
System.out.println("enter n val:");
int n=sc.nextInt();
int  result=a+(n-1)*d;
System.out.println("result=" +result);

}
}