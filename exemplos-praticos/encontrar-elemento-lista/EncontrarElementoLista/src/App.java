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

        // Elemento que você deseja encontrar
        String elementoDesejado = "C";

        // Use um loop para encontrar o elemento na lista
        boolean encontrado = false;
        int indiceEncontrado = -1;

        for (int i = 0; i < lista.size(); i++) {
            
            if (lista.get(i).equals(elementoDesejado)) {
                
                encontrado = true;
                indiceEncontrado = i;

                // O elemento foi encontrado, saia do loop
                break;
            }
        }

        // Verifique se o elemento foi encontrado
        if (encontrado) {
            
            System.out.println("O elemento '" + elementoDesejado + "' foi encontrado no índice " + indiceEncontrado);

        } else {

            System.out.println("O elemento '" + elementoDesejado + "' não foi encontrado na lista.");
        }
    }
}
