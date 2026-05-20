import java.util.*;
public class ToArray1
{
    public static void main(String ar[])
    {
        List <Integer> l =new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        Integer arr[]=new Integer[l.size()];
        arr=l.toArray(arr);
        for(Integer x: arr)
          System.out.println(x+" ");

       System.out.println("Elements of list to array is:"+Arrays.toString(arr));
    }
} 