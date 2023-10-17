import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para a entrada padrão (teclado)
        Scanner in = new Scanner(System.in);

        // Lê o número de elementos no array a partir da entrada
        int n = in.nextInt();

        // Cria um array de inteiros com o tamanho especificado
        int[] arr = new int[n];

        // Preenche o array com os elementos fornecidos como entrada
        for (int i = 0; i < n; i++) {
            
            arr[i] = in.nextInt();
        }
        
        // Chama o método "insertionSort" da classe "Resultado" para ordenar o array
        Resultado.insertionSort(arr);

        // Fecha o objeto Scanner para liberar recursos
        in.close();
    }
}
