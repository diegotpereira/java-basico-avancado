import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // ArrayList
        List a1 = new ArrayList<>();
        a1.add("Bob");
        a1.add("Peter");
        a1.add("Bunny");
        
        System.out.println("Elementos do ArrayList");
        System.out.print("\t " + a1);

        // LinkedList
        List l1 = new LinkedList();
        l1.add("Bob");
        l1.add("Peter");
        l1.add("Bunny");

        System.out.println("Elementos da LinkedList");
        System.out.print("\t " + l1);

        // HasSet
        Set s1 = new HashSet<>();
        s1.add("Bob");
        s1.add("Peter");
        s1.add("Bunny");

        System.out.println("Elementos Set");
        System.out.print("\t " + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Bob", "8");
        m1.put("Peter", "31");
        m1.put("Bunny", "12");
        m1.put("Ziggy", "14");

        System.out.println();
        System.out.println("Elementos Map");
        System.out.print("\t " + m1);
    }
}
