import java.util.*;
public class ArrayListtMethod1
{
        public static void main(String args[])
        {
            ArrayList<String> a =new ArrayList<String>();
            a.add("Geeks");
            a.add("geeks");
            a.add("gfg");
            System.out.println(a);
            a.add(1,"for"); 
            System.out.println(a);
            System.out.println( a.contains("for"));
            a.remove(1);
            System.out.println(a);
            a.remove("geeks");
            System.out.println(a);

        }
 }
