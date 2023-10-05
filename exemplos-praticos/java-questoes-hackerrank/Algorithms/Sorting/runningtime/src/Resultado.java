import java.util.List;

// A tarefa do problema "Running Time of Algorithms" no 
// HackerRank é calcular o número de deslocamentos ou trocas (inserções) 
// realizados pelo algoritmo de ordenação por inserção (insertion sort) 
// em um array de números inteiros durante o processo de ordenação. O objetivo 
// é determinar o "tempo de execução" do algoritmo, medido pelo número de movimentos necessários para ordenar o array.

// Aqui estão os passos principais da tarefa:

// Você receberá como entrada um array de números inteiros desordenados.

// Sua tarefa é implementar o algoritmo de ordenação por inserção para ordenar o array. 
// O algoritmo de ordenação por inserção funciona inserindo cada elemento na posição 
// correta dentro da parte ordenada do array.

// Enquanto realiza a ordenação, você deve contar o número de deslocamentos ou trocas 
// (inserções) que ocorrem no array. Cada vez que um elemento é movido de uma posição 
// para outra no array, você deve incrementar o contador.

// Após ordenar o array, você deve imprimir o número total de movimentos realizados, 
// que representa o "tempo de execução" do algoritmo.

public class Resultado {

    // public static int runningTime(List<Integer> arr) {

    //     // Obtém o tamanho da lista
    //     int tamanho = arr.size();

    //     // Inicializa uma variável para contar os movimentos (número de movimentos)
    //     int movimentos = 0;

    //     // Inicia o loop a partir do segundo elemento da lista
    //     for (int i = 1; i < tamanho; i++) {
            
    //         // Obtém o elemento atual
    //         int atual = arr.get(i);

    //         // Inicializa um índice para o elemento anterior
    //         int proximo = i - 1;

    //         // Enquanto o índice do elemento anterior é válido 
    //         // e o elemento atual é menor que o elemento anterior
    //         while (proximo >= 0 && atual < arr.get(proximo)) {
                
    //             // Move o elemento anterior para a direita para abrir espaço para o elemento atual
    //             arr.set(proximo + 1, arr.get(proximo));

    //             // Decrementa o índice do elemento anterior
    //             proximo --;

    //             // Incrementa o contador de turnos
    //             movimentos++;
    //         }

    //         // Insere o elemento atual na posição correta na parte ordenada da lista
    //         arr.set(proximo + 1, atual);
    //     }

    //      // Retorna o número total de movimentos
    //     return movimentos;
    // }

    public static int runningTime(List<Integer> arr) {

        // Inicializa uma variável para contar o número de trocas
        int trocas = 0;

        // Obtém o tamanho do array
        int tamanhoArray = arr.size();

        // Loop externo para percorrer o array
        for (int i = 0; i < tamanhoArray; i++) {
            
            // Loop interno para percorrer o array até o final, com ajuste de tamanho
            for (int j = 0; j < tamanhoArray - i - 1; j++) {
                
                // Obtém o elemento atual e o próximo a ser comparado
                Integer atual = arr.get(j);
                Integer proximo = arr.get(j + 1);

                // Verifica se o elemento atual é maior que o próximo
                if (atual > proximo) {
                    
                    // Troca os elementos de posição para ordenar
                    arr.set(j, proximo);
                    arr.set(j + 1, atual);

                    // Incrementa o contador de trocas
                    trocas++;
                }
            }
        }

        // Retorna o número total de trocas realizadas durante a ordenação
        return trocas;
    }
}
