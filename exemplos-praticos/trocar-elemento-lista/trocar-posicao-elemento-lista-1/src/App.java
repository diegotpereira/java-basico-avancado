import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");

        for (String elemento : lista) {
            
            System.out.print(elemento + " ");
        }

        System.out.println();


        int indice1 = 1;
        int indice2 = 3;

        if (indice1 >= 0 && indice1 < lista.size() && indice2 >= 0 && indice2 < lista.size()) {

            String elemento1 = lista.get(indice1);
            String elemento2 = lista.get(indice2);

            lista.set(indice1, elemento2);
            lista.set(indice2, elemento1);

            for (String elemento : lista) {
                
                System.out.print(elemento + " ");
            }
            
        } else {

            System.out.println("Índices fora dos limites da lista.");
        }
    }
}
