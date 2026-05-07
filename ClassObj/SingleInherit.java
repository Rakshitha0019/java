class Animal
{
    void sound()
    {
        System.out.println("animal make sound");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("dog is eating");
    }
}
public class  SingleInherit
{
    public static void main(String args[])
    {
     Dog d =new Dog();
     d.sound();
     d.eat(); 
    }
}