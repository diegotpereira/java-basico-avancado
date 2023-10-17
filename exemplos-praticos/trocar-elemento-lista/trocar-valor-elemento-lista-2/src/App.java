import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Crie uma lista de exemplo
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        for (Integer elemento : lista) {
            
            System.out.print(elemento + " ");
        }

        System.err.println();

        // Índice do elemento que você deseja trocar
        int indice = 2;

        // Novo valor que você deseja atribuir ao elemento
        int novoValor = 10;

        // Verifique se o índice está dentro dos limites da lista
        if (indice >= 0 && indice < lista.size()) {
            
            // Troque o valor do elemento
            lista.set(indice, novoValor);

            // Imprima a lista após a troca
            for (Integer elemento : lista) {
                
                System.out.print(elemento + " ");
            }
        } else {

            System.out.println("Índice fora dos limites da lista.");
        }

    }
}
