import java.util.*;
import java.util.stream.Collectors;

// A tarefa é resolver o problema "Minimum Absolute Difference in an Array" do site HackerRank. 
// O problema pode ser resumido da seguinte forma:

// Dado um array de inteiros, encontre o menor valor absoluto da diferença entre quaisquer dois 
// elementos do array. Ou seja, encontre o menor valor absoluto entre a diferença de quaisquer dois elementos do array.

// Por exemplo, se o array for [1, 2, 3, 4, 5], a menor diferença absoluta entre quaisquer dois elementos 
// é 1, que ocorre entre 4 e 5.

// O objetivo é implementar uma função em uma linguagem de programação que resolva este problema.

public class Resultado {

    public static int minimumAbsoluteDifference(List<Integer> arr) {

        // Converte a lista em um array de inteiros ordenados.
        int[] intArr = arr.stream().sorted().mapToInt(Integer::intValue).toArray();

        // Define a diferença mínima inicial como o maior valor possível de inteiro.
        int minDif = Integer.MAX_VALUE;

        // Percorre o array comparando cada elemento adjacente e atualizando a diferença
        // mínima.
        for (int i = 0; i < intArr.length - 1; i++) {

            int a = intArr[i];
            int b = intArr[i + 1];

            // Compara a diferença absoluta entre os elementos adjacentes com a diferença
            // mínima atual.
            // Atualiza a diferença mínima caso a diferença absoluta seja menor.
            minDif = Math.min(minDif, Math.abs(a - b));
        }
        return minDif;
    }

    // public static int minimumAbsoluteDifference(List<Integer> arr) {

    // // Ordena a lista utilizando stream e a função sorted, e depois a coleta em
    // uma
    // // nova lista com Collectors.toList()
    // List<Integer> lista = arr.stream().sorted().collect(Collectors.toList());

    // // Define um valor máximo para a resposta
    // int resposta = Integer.MAX_VALUE;

    // // Loop que itera sobre os elementos da lista, exceto o último
    // for (int i = 0; i < lista.size() - 1; i++) {

    // // Calcula o valor absoluto da diferença entre o elemento atual e o próximo
    // // elemento
    // if (Math.abs(lista.get(i) - lista.get(i + 1)) < resposta) {

    // resposta = Math.abs(lista.get(i) - lista.get(i + 1));
    // }
    // }

    // // Retorna a resposta final
    // return resposta;
    // }

    // public static int minimumAbsoluteDifference(List<Integer> arr) {

    // // Ordena a lista em ordem crescente
    // Collections.sort(arr);

    // // Define um valor inicial para a variável min que irá armazenar o menor
    // valor
    // // absoluto
    // int min = Integer.MAX_VALUE;

    // // Percorre a lista de inteiros até o penúltimo elemento
    // for (int i = 0; i < arr.size() - 1; i++) {

    // // Calcula o valor absoluto da diferença entre o elemento atual e o próximo
    // // elemento na lista
    // int resposta = Math.abs(arr.get(i) - arr.get(i + 1));

    // // Se o valor absoluto for menor que o valor mínimo encontrado até o momento,
    // // atualiza o valor mínimo
    // if (resposta < min)
    // min = resposta;
    // }

    // // Retorna o menor valor absoluto encontrado
    // return min;
    // }

    // public static int minimumAbsoluteDifference(List<Integer> arr) {

    // // Ordena a lista em ordem crescente
    // Collections.sort(arr);

    // // Inicializa a variável minDif com a diferença absoluta entre o primeiro e o
    // // segundo elemento da lista
    // int minDif = Math.abs(arr.get(0) - arr.get(1));

    // // Itera sobre a lista a partir do segundo elemento até o penúltimo
    // for (int i = 1; i < arr.size() - 1; i++) {

    // // Verifica se a diferença absoluta entre o elemento atual e o próximo é
    // menor
    // // do que a diferença absoluta atual
    // if (Math.abs(arr.get(i) - arr.get(i + 1)) < minDif) {

    // // Se a diferença absoluta atual for menor, atualiza a variável minDif
    // minDif = Math.abs(arr.get(i) - arr.get(i + 1));
    // }

    // }

    // // Retorna a diferença absoluta mínima
    // return minDif;
    // }

}
