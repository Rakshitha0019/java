import java.util.*;
public class ArrayListtMethod3
{
        public static void main(String args[])
        {
            ArrayList<String> a =new ArrayList<String>();
            a.add("Geeks");
            a.add("geeks");
            a.add("gfg");
            a.add("geeks");
            System.out.println(a.isEmpty());

            
            a.clear();
            System.out.println(a.isEmpty());

            
        }
 }
