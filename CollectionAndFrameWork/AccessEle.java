import java.util.*;
public class AccessEle
{
    public static void main(String args[])
    {
        List <String> colour=new ArrayList<>();
        colour.add("red");
        colour.add("green");
        colour.add("blue");
        colour.add("pink");
        System.out.println("first colour is: "+colour.get(0));
        System.out.println("last colour is: "+colour.get(colour.size()-1));
    }
}