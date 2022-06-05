import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        // criar coleção
        ArrayList<String> carros = new  ArrayList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");


        // buscar o iterator
        Iterator<String> it = carros.iterator();


        System.out.println(it.next());

        // Percorrendo uma coleção
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
