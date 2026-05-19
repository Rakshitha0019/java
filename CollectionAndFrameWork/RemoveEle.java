import java.util.*;
public class RemoveEle
{
    public static void main(String args[])
    {
        Collection<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        Collection<Integer> toRem=new ArrayList<>();
        toRem.add(30);
        toRem.add(40);
        nums.removeAll(toRem);
        System.out.println(nums);
    }
}