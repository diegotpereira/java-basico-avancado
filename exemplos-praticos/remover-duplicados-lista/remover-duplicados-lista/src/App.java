import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(5);
        lista.add(3);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);

        HashSet<Integer> semDuplicadas = new HashSet<>(lista);


        lista.clear();
        lista.addAll(semDuplicadas);

        System.out.println("Lista sem duplicadas: " + lista);
    }
}
