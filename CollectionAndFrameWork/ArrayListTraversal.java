/*4 methods
1) get()
2) for each loop
3) iterator
4) for each()*/
import java.util.*;
public class ArrayListTraversal
{
    public static void main(String args[])
    {
       ArrayList <Integer> al=new ArrayList<>();
       al.add(10);
       al.add(20);
       al.add(30);
       /* 1) get
       for(int i=0;i<al.size();i++)
       {
       System.out.print(al.get(i)+" ");
       } */
      /* 2)for each loop
      for(int x : al)
      {
      System.out.print(x+" ");
      }*/
      /* 3)interator
      Iterator it=al.iterator();
      while(it.hasNext())
      {
        System.out.print(it.next()+" ");
      } */
     //* 4)for each method
     al.forEach(x->System.out.print(x+" "));
    }
}
