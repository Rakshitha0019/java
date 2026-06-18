import java.util.*;
public class ArrayListOperations
{
        public static void main(String args[])
        {
            ArrayList<Integer> al=new ArrayList<Integer>();
            al.add(10);
            al.add(20);
            al.add(30);
            al.add(40);
            System.out.println("original list "+al);
            al.add(1,10);
            System.out.println("After adding 1st index "+al);
            al.remove(0);
            System.out.println("After removing 0th index "+al);
            al.remove(Integer.valueOf(10));
            System.out.println("After removing 10th element "+al);
            al.set(2,25);
            System.out.println("After updated list "+al);
            
        }
}
