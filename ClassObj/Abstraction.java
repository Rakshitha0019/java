abstract class Shape
{
    String colour;
    Shape(String c)
    {
        colour=c;
    }
    String getColour()
    {
        return colour;
    }
    abstract double getArea();
}
class Square extends Shape
{
    double side;
    Square(String c,double side)
    {
        super(c);
        this.side=side;
    }
    double getArea()
    {
        return side*side;
    }
}
class Abstraction
{
    public static void main(String a[])
    {
        Square sq1=new Square("red",2.4);
        System.out.println(sq1.getColour()+" "+sq1.getArea() );
        
    }
}