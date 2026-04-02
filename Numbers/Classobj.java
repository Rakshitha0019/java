<<<<<<< HEAD
class Shop
{
    public void games()
    {
    System.out.println("which game");
    }
    public String chocolate(int cost)
    {
      if (cost>=10)
      {
        return"here! is ur chocolate";
      }
     else
     {
     return "nothing";
     }
    }
}
public class Classobj
{
    public static void main(String args[])
    {
        Shop obj=new Shop();
        String str=obj.chocolate(2);
        obj.games();
        System.out.println(str);
    }
}
=======
class Shop
{
    public void games()
    {
    System.out.println("which game");
    }
    public String chocolate(int cost)
    {
      if (cost>=10)
      {
        return"here! is ur chocolate";
      }
     else
     {
     return "nothing";
     }
    }
}
public class Classobj
{
    public static void main(String args[])
    {
        Shop obj=new Shop();
        String str=obj.chocolate(2);
        obj.games();
        System.out.println(str);
    }
}
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
