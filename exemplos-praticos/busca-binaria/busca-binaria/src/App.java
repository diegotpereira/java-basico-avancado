import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Declaração do array de números
        int[] numeros = { 3, 5, 8, 10, 20};

        // Valor a ser buscado
        int chave = 8;

        // Realiza a busca binária no array
        int resultado = Arrays.binarySearch(numeros, chave);

        // Verifica se o valor foi encontrado no array
        if (resultado >= 0) {
            
             // Imprime a mensagem de que o valor foi encontrado
            System.out.println(chave + " foi encontrado no índice " + resultado);

        } else {

            // Imprime a mensagem de que o valor não foi encontrado
            System.out.println(chave + " não foi encontrado no array!");
        }
    }
}
