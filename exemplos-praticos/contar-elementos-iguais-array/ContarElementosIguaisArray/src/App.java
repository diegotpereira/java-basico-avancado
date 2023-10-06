import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Crie um array de exemplo com elementos repetidos
        int[] arr = {1, 2, 2, 3, 2, 4, 4, 5};

        // Use um mapa para contar os elementos
        HashMap<Integer, Integer> contador = new HashMap<>();

        // Percorra o array e conte os elementos
        for (int elemento : arr) {
            
            if (contador.containsKey(elemento)) {
                
                contador.put(elemento, contador.get(elemento) + 1);

            } else {

                contador.put(elemento, 1);
            }
        }

        // Imprima a contagem de elementos iguais
        for (Map.Entry<Integer, Integer> entrada : contador.entrySet()) {
            
            System.out.println("Elemento " + entrada.getKey() + ": " + entrada.getValue() + " ocorrência(s)");
        }
    }
}
