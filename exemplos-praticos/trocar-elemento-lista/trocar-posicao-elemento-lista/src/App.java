import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Crie uma lista de exemplo
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

        // Índices dos elementos que você deseja trocar
        int indice1 = 1;
        int indice2 = 3;

        // Verifique se os índices estão dentro dos limites da lista
        if (indice1 >= 0 && indice1 < lista.size() && indice2 >= 0 && indice2 < lista.size()) {

            // Troque os elementos usando Collections.swap()
            Collections.swap(lista, indice1, indice2);

            // Imprima a lista após a troca
            for (String elemento : lista) {
                
                System.out.print(elemento + " ");
            }
            
        } else {

            System.out.println("Índices fora dos limites da lista.");
        }
    }
}
