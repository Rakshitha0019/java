import java.util.*;
public class ToArray2
{
    public static void main(String args[])
    {
        List <String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");
        System.out.println(fruits);
        Object []arr=fruits.toArray();
        System.out.println("Element of array"+Arrays.toString(arr));
    }
}