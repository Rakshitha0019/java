import java.util.*;

public class SetMethod {

    public static void main(String arg[]) {

        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l);

        ListIterator<Integer> it = l.listIterator();

        while (it.hasNext()) {
            int x = it.next();
            it.set(x * 2);
        }

        System.out.println(l);
    }
}