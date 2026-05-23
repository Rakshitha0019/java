import java.util.*;
public class AddEle
{
    public static void main(String args[])
    {
        Collection<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");
        System.out.println(fruits);
        Collection<String> toAdd=new ArrayList<>();
        toAdd.add("papaya");
        toAdd.add("watermelon");
        fruits.addAll(toAdd);
        System.out.println(fruits);

    }
}
