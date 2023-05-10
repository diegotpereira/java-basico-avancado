import java.util.*;

// A tarefa do problema "Unbounded Knapsack" é determinar a soma máxima 
// que pode ser obtida selecionando alguns elementos de um conjunto, 
// permitindo a seleção de um elemento mais de uma vez, de modo que a 
// soma não exceda um valor limite dado.

// O problema fornece um conjunto de números inteiros positivos e um valor 
// limite. O objetivo é encontrar a maior soma que pode ser alcançada selecionando 
// alguns elementos do conjunto, considerando que é permitido selecionar um elemento 
// várias vezes e a soma resultante não pode exceder o valor limite.

// Em termos mais simples, imagine que você está "enchendo uma mochila" com elementos 
// do conjunto, e o objetivo é maximizar a soma dos elementos dentro das restrições de 
// peso (valor limite).

// No link fornecido para o problema no HackerRank, você pode encontrar mais detalhes 
// sobre a tarefa, incluindo exemplos de entrada e saída, que ajudarão a compreender 
// melhor o problema e a implementar uma solução adequada.

public class Resultado {

    public static int unboundedKnapsack(int k, List<Integer> arr) {

        // Cria um array para armazenar as somas máximas
        final int[] maxSoma = new int[arr.get(0) * (k + 1)];

        // Loop para preencher o array com as somas máximas
        for (int i = 1; i < k + 1; i++) {

            // Variável para armazenar o índice atual
            final int atualIndice = i;

            // Filtra os elementos da lista que podem ser usados na soma
            // e calcula a soma máxima para o índice atual
            maxSoma[i] = arr.stream()
                    // Verifica se o número pode ser usado na soma
                    .filter(num -> atualIndice - num >= 0)
                    // Calcula a soma máxima
                    .mapToInt(num -> maxSoma[atualIndice - num] + num)
                    // Encontra o valor máximo da soma
                    .max()
                    // Se não houver soma máxima, usa o valor anterior
                    .orElse(maxSoma[atualIndice]);
        }

        // Retorna a soma máxima para o valor k
        return maxSoma[k];
    }

    // public static int unboundedKnapsack(int k, List<Integer> arr) {

    // // Cria um array para armazenar as somas máximas para cada valor de i
    // int[] max_soma = new int[arr.get(0) * (k + 1)];

    // // Loop para percorrer cada valor de i, de 1 até k
    // for (int i = 1; i < k + 1; i++) {

    // // Loop para percorrer cada número na lista arr
    // for (Integer num : arr) {

    // // Verifica se é possível incluir o número atual (num) na soma
    // if (i - num >= 0) {

    // // Atualiza a soma máxima para o valor atual de i
    // // Escolhe o maior entre a soma atual e a soma anterior com o
    // // número atual adicionado
    // max_soma[i] = Math.max(max_soma[i - num] + num, max_soma[i]);
    // }
    // }
    // }

    // // Retorna a soma máxima para o valor k
    // return max_soma[k];
    // }

    // public static int unboundedKnapsack(int k, List<Integer> arr) {

    // // Chamada para a função auxiliar uk para calcular o valor máximo do problema
    // return uk(arr, k, arr.size());
    // }

    // public static int uk(List<Integer> arr, int soma, int n) {

    // // Caso base: se a soma for zero ou o número de
    // // elementos for zero, retorna zero
    // if (soma == 0 || n == 0)
    // return 0;

    // // Se o valor do último elemento for menor ou igual à soma
    // if (arr.get(n - 1) <= soma) {

    // // Retorna o máximo entre:
    // // - Incluir o último elemento no resultado e recursivamente chamar a função
    // // para a soma reduzida
    // // - Excluir o último elemento do resultado e recursivamente chamar a função
    // // para o próximo elemento
    // return Math.max(arr.get(n - 1) + uk(arr, soma - arr.get(n - 1), n), uk(arr,
    // soma, n - 1));

    // } else

    // // Caso contrário, exclui o último elemento e recursivamente chama a função
    // para
    // // o próximo elemento
    // return uk(arr, soma, n - 1);
    // }

    // public static int unboundedKnapsack(int k, List<Integer> arr) {

    // // Obtém o tamanho da lista arr
    // int n = arr.size();

    // // Cria um array dp para armazenar os valores
    // // máximos para diferentes capacidades
    // int dp[] = new int[k + 1];

    // // Percorre todas as capacidades de 1 até k
    // for (int i = 1; i <= k; i++) {

    // // Percorre todos os elementos da lista arr
    // for (int j = 0; j < n; j++) {

    // // Verifica se o valor do elemento é menor ou igual à capacidade atual
    // if (arr.get(j) <= i) {

    // // Atualiza o valor máximo para a capacidade atual i
    // // Se incluir o elemento arr[j], o valor máximo é dp[i - arr.get(j)] +
    // arr.get(j)
    // // Caso contrário, mantém o valor máximo anterior dp[i]
    // dp[i] = Math.max(dp[i], dp[i - arr.get(j)] + arr.get(j));
    // }
    // }
    // }

    // // Retorna o valor máximo para a capacidade k
    // return dp[k];
    // }

}
