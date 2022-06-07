import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        HashSet<String> carros = new HashSet<String>();

        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");

        System.out.println(carros);

        System.out.println(carros.contains("Mazda"));

        carros.remove("Volvo");

        System.out.println(carros);
        

        HashSet<Cachorro> dset = new HashSet<Cachorro>();
        dset.add(new Cachorro(2));
        dset.add(new Cachorro(1));
        dset.add(new Cachorro(3));
        dset.add(new Cachorro(5));
        dset.add(new Cachorro(4));

        Iterator<Cachorro> iterator = dset.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(12);
        tree.add(63);
        tree.add(34);
        tree.add(45);

        Iterator<Integer> iterator2 = tree.iterator();

        System.out.println("Dados do conjunto tree: ");

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next() + " ");
        }
    }
}
