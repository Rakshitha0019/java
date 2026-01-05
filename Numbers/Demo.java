// ***ADDITION USING CLASSES AND OBJECTS***
class Calculator
{
    public int in_add(int n1,int n2)
    {
        int r=n1+n2;
        return r;
    }
}

public class Demo
{
    public static void main(String args[])
    {
        int num1=3;
        int num2=5;

        Calculator cal =new Calculator();
        int result= cal.in_add(num1,num2)
        System.out.println(result);

    }
}