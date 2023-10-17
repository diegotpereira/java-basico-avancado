import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Neste problema, você é dado um conjunto de números inteiros e sua tarefa é encontrar e imprimir todos os pares de números no conjunto que têm a menor diferença absoluta entre eles. Em outras palavras, você precisa encontrar os números mais próximos entre si no conjunto.

// A entrada para o problema geralmente consiste nos seguintes elementos:

// Um número inteiro, N, que representa o tamanho do conjunto de números.
// Os próprios números inteiros no conjunto.
// A saída esperada é uma lista de pares de números que têm a menor diferença absoluta entre eles, ordenados em ordem crescente. Cada par é impresso no formato "a b", onde "a" e "b" são os números do par.

// Para resolver o problema "Closest Numbers", você pode seguir estas etapas:

// Ordene o conjunto de números em ordem crescente.
// Percorra o conjunto e encontre a menor diferença absoluta entre os números adjacentes.
// Em seguida, percorra o conjunto novamente e imprima todos os pares que têm essa menor diferença absoluta.
// O resultado é a lista de pares de números mais próximos entre si no conjunto.

public class Resultado {

    // public static List<Integer> closestNumbers(List<Integer> arr) {

    //     // Cria uma lista para armazenar a resposta final.
    //     List<Integer> resposta = new ArrayList<>();

    //     // Inicializa uma variável para armazenar a menor diferença encontrada, com um valor máximo.
    //     long min = Long.MAX_VALUE;

    //     // Ordena a lista de entrada em ordem crescente.
    //     Collections.sort(arr);

    //     // Passo 1: Encontra a menor diferença entre números adjacentes.
    //     for (int i = 1; i < arr.size() - 1; i++) {
            
    //         if (arr.get(i + 1) - arr.get(i) < min) {

    //             // Atualiza a variável 'min' com a menor diferença encontrada.
    //             min = arr.get(i + 1) - arr.get(i);
    //         }
    //     }

    //     // Passo 2: Encontra pares com a menor diferença e adiciona à lista 'resposta'.
    //     for (int i = 0; i < arr.size() - 1; i++) {
            
    //         if (arr.get(i + 1) - arr.get(i) == min) {
                
    //             // Adiciona os números do par à lista 'resposta'.
    //             resposta.add(arr.get(i));
    //             resposta.add(arr.get(i + 1));
    //         }
    //     }

    //     // Retorna a lista 'resposta' contendo os pares mais próximos.
    //     return resposta;
    // }
    
    public static List<Integer> closestNumbers(List<Integer> arr) {

        // Ordena a lista de entrada em ordem crescente.
        Collections.sort(arr);

        // Calcula a menor diferença entre elementos adjacentes usando Streams.
        int minimaDiferenca = IntStream.range(0, arr.size() - 1)
                                       .map(i -> arr.get(i + 1) - arr.get(i))
                                       .min()
                                       .orElse(Integer.MAX_VALUE);

        // Filtra os pares de elementos que têm a menor diferença e cria uma lista de resultados.
        return IntStream.range(0, arr.size() - 1)
                        .filter(i -> arr.get(i + 1) - arr.get(i) == minimaDiferenca)
                        .mapToObj(i -> Arrays.asList(arr.get(i), arr.get(i + 1)))
                        .flatMap(List::stream)
                        .collect(Collectors.toList());
    }
    
}
