import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Crie uma lista de exemplo com elementos repetidos
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(4);
        lista.add(4);
        lista.add(5);

        // Use um mapa para contar os elementos
        Map<Integer, Integer> contador = new HashMap<>();

        // Percorra a lista e conte os elementos
        for (Integer elemento : lista) {
            
            if (contador.containsKey(elemento)) {
                
                contador.put(elemento, contador.get(elemento) + 1);

            } else {

                contador.put(elemento, 1);
            }
        }

        // Imprima a contagem de elementos iguais
        for (Map.Entry<Integer, Integer> entrada : contador.entrySet()) {
            
            System.out.println("O elemento " + entrada.getKey() + ": " + entrada.getValue() + " ocorrência(s)");
        }
    }
}
