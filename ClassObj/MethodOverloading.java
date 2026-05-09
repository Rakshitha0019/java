import java.util.Scanner;
class Calculator
{
    int sum(int a,int b)
    {
        return a+b; 
    }
    int sum(int a,int b,int c)
    {
        return a+b+c; 
    }
    double sum(double x,double y)
    {
        return x+y; 
    }
}
class MethodOverloading
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        System.out.println("enter c value");
        int c=sc.nextInt();
        System.out.println("enter x(double) value");
        double x=sc.nextDouble();
        System.out.println("enter y(double) value");
        double y=sc.nextDouble();


        Calculator cal=new Calculator();
        System.out.println(cal.sum(a,b));
        System.out.println(cal.sum(a,b,c));
        System.out.println(cal.sum(x,y));
        
    }
}