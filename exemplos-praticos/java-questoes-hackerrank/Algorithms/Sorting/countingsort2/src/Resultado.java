import java.util.*;

// Neste problema, você é solicitado a implementar o algoritmo de ordenação 
// por contagem (Counting Sort) para ordenar uma lista de inteiros não ordenados em ordem não decrescente.

// A entrada para o problema geralmente consiste nos seguintes elementos:

// Um número inteiro, N, que representa o tamanho da lista.
// A própria lista de inteiros que precisa ser ordenada.
// A saída esperada é a lista de inteiros ordenada em ordem não decrescente.

// O algoritmo de ordenação por contagem funciona contando o número de ocorrências 
// de cada valor na lista de entrada e, em seguida, reconstruindo a lista ordenada com base nas contagens.

// Para resolver o problema "Counting Sort 2", você pode seguir estas etapas:

// Inicialize um array de contagem com um tamanho suficientemente grande para acomodar 
// todos os valores possíveis na lista (por exemplo, se os valores estiverem no intervalo de 0 a 99, crie um array de tamanho 100).
// Percorra a lista de entrada e, para cada número encontrado, incremente o valor correspondente no array de contagem.
// Em seguida, percorra o array de contagem e reconstrua a lista ordenada, levando em consideração as contagens.
// O resultado é a lista original ordenada em ordem não decrescente.

public class Resultado {

    // public static List<Integer> countingSort(List<Integer> arr) {

    //     // Ordena a lista de entrada em ordem não decrescente usando o comparador natural.
    //     arr.sort(Comparator.naturalOrder());

    //     // Retorna a lista ordenada.
    //     return arr;
    // }

    public static List<Integer> countingSort(List<Integer> arr) {

        // Cria um array para armazenar a frequência das ocorrências de cada valor (0 a 99).
        int[] frequencia = new int[100];

        // Cria uma lista para armazenar os valores classificados.
        List<Integer> classificados = new ArrayList<>();

        // Passo 1: Contagem das ocorrências de cada valor na lista de entrada.
        for (int i = 0; i < arr.size(); i++) {
            
            // Incrementa a contagem na posição correspondente ao valor encontrado.
            frequencia[arr.get(i)] ++;

        }

        // Passo 2: Preenchimento da lista classificados com os valores ordenados.
        for (int i = 0; i < frequencia.length; i++) {
            
            // Se a frequência for 0, passa para o próximo valor.
            int contar = frequencia[i];

            if (contar == 0) {
                
                continue;
            }

            // Adiciona o valor 'i' à lista 'classificados' 'contar' vezes.
            for (int j = 0; j < contar; j++) {
                
                classificados.add(i);
            }
        }

        // Retorna a lista 'classificados' ordenada.
        return classificados;
    }
    
}
