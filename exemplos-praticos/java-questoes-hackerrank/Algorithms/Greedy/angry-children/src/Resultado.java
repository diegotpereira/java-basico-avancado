import java.util.*;
import java.util.stream.IntStream;

// A tarefa do problema "Angry Children" do site HackerRank é encontrar 
// a diferença mínima entre o valor máximo e o valor mínimo de um subconjunto 
// contíguo de uma lista de números inteiros. O número de elementos no subconjunto 
// é definido como um parâmetro de entrada para a função.

// O problema requer que você implemente uma função chamada maxMin, que recebe 
// dois parâmetros: um inteiro k, que representa o número de elementos no subconjunto, 
// e uma lista de inteiros arr, que contém os números a serem analisados. A função 
// deve retornar a diferença mínima possível entre o valor máximo e o valor mínimo do subconjunto.

// Em outras palavras, a função deve encontrar o menor valor possível de 
// max(arr[i..i+k-1]) - min(arr[i..i+k-1]), onde i é a posição inicial do subconjunto na lista.

public class Resultado {

    // int k: o número de elementos para selecionar
    // int arr[n]: : um array de inteiros

    public static int maxMin(int k, List<Integer> arr) {

        // Ordena a lista em ordem crescente.
        Collections.sort(arr);

        // Calcula a diferença mínima entre o maior e o menor elemento em um subconjunto
        // de tamanho k.
        return IntStream.range(0, arr.size() - (k - 1))
                .map(i -> arr.get(i + k - 1) - arr.get(i))
                .min()
                .getAsInt();
    }

    // public static int maxMin(int k, List<Integer> arr) {

    // // Ordena a lista em ordem crescente
    // Collections.sort(arr);

    // // Inicializa a variável de diferença mínima
    // int min = 999999999;

    // // Percorre a lista e avalia a diferença entre o menor
    // // e o maior elemento de cada subconjunto
    // for (int i = 0; i <= arr.size() - k; i++) {

    // // Se a diferença do subconjunto atual for menor que
    // // a diferença mínima encontrada até agora, atualiza o valor mínimo
    // if (arr.get(i + k - 1) < min) {

    // min = arr.get(i + k - 1) - arr.get(i);
    // }
    // }

    // // Retorna o valor mínimo encontrado
    // return min;
    // }

    // public static int maxMin(int k, List<Integer> arr) {

    // // Ordena a lista em ordem crescente
    // Collections.sort(arr);

    // // Inicializa a variável de diferença mínima com o maior valor possível em
    // Java
    // int minDif = Integer.MAX_VALUE;

    // // Percorre o array usando a técnica de janela deslizante
    // for (int i = 0; i <= arr.size() - k; i++) {

    // // Calcula a diferença entre o maior e o menor elemento da janela
    // int dif = arr.get(i + k - 1) - arr.get(i);

    // // Atualiza a variável de diferença mínima caso a diferença atual seja menor
    // if (dif < minDif) {

    // minDif = dif;
    // }
    // }

    // // Retorna a diferença mínima encontrada
    // return minDif;
    // }

}
