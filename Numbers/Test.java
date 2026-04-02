
class Calculator
{
  int add(int a,int b)
  { 
    return a+b;
  }
 int add(int a,int b,int c)
  {
   return a+b+c;
  }
}
Public class Test{
  public static void main(String args[]){
     int x=2;
     int y=3;
     int z=1; 
  Calculator cal=new Calculator()
    int result1=cal.add(x,y);
    int result2=cal.add(x,y,z);
   System.out.println(result1);
   System.out.println(result1);}
}
   

