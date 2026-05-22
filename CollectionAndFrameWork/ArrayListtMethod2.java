import java.util.*;
public class ArrayListtMethod2
{
        public static void main(String args[])
        {
            ArrayList<String> a =new ArrayList<String>();
            a.add("Geeks");
            a.add("geeks");
            a.add("gfg");
            a.add("geeks");
            System.out.println(a.get(0));
            a.set(0,"for"); 
            System.out.println(a.get(0));
            System.out.println(a.indexOf("geeks"));
            System.out.println(a.lastIndexOf("geeks"));
            System.out.println(a);
            
        }
 }
