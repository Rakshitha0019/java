import java.util.*;

public class Linkedlist2{
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.remove(1);

        System.out.println(l);
    }
}
