public class Resultado {
    

    // Define um método público chamado "insertionSort" que ordena um array de inteiros
    public static void insertionSort(int[] arr) {

        // Inicia um loop para percorrer o array a partir do segundo elemento
        for (int i = 1; i < arr.length; i++) {
            
            // Armazena o valor do elemento atual em "valor"
            int valor = arr[i];

            // Inicia uma variável "j" para rastrear a posição na parte ordenada do array
            int j = i - 1;

            // (Solução para o Problema, incluir sinal igualdade)
            // Enquanto "j" é maior ou igual a 0 e o elemento atual é maior que "valor"
            while (j >= 0 && arr[j] > valor) {
                
                // Move os elementos maiores para a direita para abrir espaço para "valor"
                arr[j + 1] = arr[j];

                // Decrementa "j" para verificar o próximo elemento à esquerda
                j = j - 1;
            }

            // Coloca "valor" na posição correta na parte ordenada do array
            arr[j + 1] = valor;
        }

        // Chama o método "exibir" da classe "Exibir" para exibir o array ordenado
        Exibir.exibir(arr);
    }
}
