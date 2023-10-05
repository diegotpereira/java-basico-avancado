import java.util.*;
import java.util.stream.Collectors;

// Você receberá um array de números inteiros desordenados como entrada.

// Sua tarefa é ordenar o array usando o algoritmo de ordenação por inserção.

// Em cada etapa do algoritmo de ordenação por inserção, você deve inserir o 
// próximo elemento não ordenado na parte ordenada do array de forma que a 
// parte ordenada continue a ser ordenada.

// Após cada passo, você deve imprimir o array resultante.

// Continue esse processo até que todo o array esteja ordenado.

public class Resultado {

    // public static void insertionSort2(int n, List<Integer> arr) {
        
    //     // Loop para percorrer o array da esquerda para a direita
    //     for(int i = 0; i < n -1; i++) {

    //         // Obtém o elemento atual e o próximo elemento
    //         int curr = arr.get(i);
    //         int next = arr.get(i+1);
    //         int j = i;

    //         // Enquanto o próximo elemento for menor que o elemento atua
    //         while(next < curr) {
                
    //             // Troca os elementos (swap)
    //             arr.set(j,next);
    //             arr.set(j+1,curr);
    //             j--;

    //             // Atualiza os valores de 'curr' e 'next'
    //             curr = (j>=0) ? arr.get(j) : 0;
    //             next = arr.get(j+1);                
    //         }

    //         // Converte o array em uma string e a exibe
    //         String s = arr.stream().map(x -> String.valueOf(x)).collect(Collectors.joining(" "));
    //         System.out.println(s);            
    //     }
    // }

    // public static void insertionSort2(int n, List<Integer> meuArr) {

    //     // Loop para percorrer o array
    //     for (int i = 1; i < n; i++) {
            
    //         // Valor-chave a ser inserido no local apropriado
    //         int chave = meuArr.get(i);

    //         // Índice para comparar e deslocar elementos
    //         int j = i - 1;                              

    //         // Enquanto o índice for maior ou igual a 0 
    //         // e o elemento anterior for maior que a chave
    //         while (j >= 0 && meuArr.get(j) > chave) {
                
    //             // Desloca o elemento para a direita
    //             meuArr.set(j + 1, meuArr.get(j));

    //             // Decrementa o índice
    //             j--;
    //         }

    //         // Insere a chave no local apropriado
    //         meuArr.set(j + 1, chave);

    //         // Chama a função para exibir o array após cada iteração
    //         exibir(meuArr);
    //     }
    // }

    // private static void exibir(List<Integer> arr) {

    //     // Converte o array em uma string e exibe no formato especificado
    //     System.out.println(arr.stream().map(item -> String.valueOf(item)).collect(Collectors.joining(" ")));
    // }

    public static void insertionSort2(int n, List<Integer> arr) {

        // Itera através do array a partir do segundo elemento (índice 1)
        for (int i = 1; i < arr.size(); i++) {
            
            // Itera através da parte ordenada do array, até o índice i
            for (int j = 0; j < i; j++) {
                
                // Verifica se o elemento na posição i 
                // é menor que o elemento na posição j
                if (arr.get(i) < arr.get(j)) {

                    // Armazena o valor do elemento na posição i
                    int valor = arr.get(i);

                    // Remove o elemento na posição i 
                    // da sublista e o insere na posição j
                    arr.subList(i, i + 1).clear();
                    arr.add(j, valor);

                    // Interrompe o loop interno, 
                    // pois o elemento foi inserido corretamente
                    break;
                }
            }

            // Imprime o array após cada passo do algoritmo de ordenação
            for (Integer valor : arr) {
                
                System.out.print(valor + " ");
            }

            // Imprime uma nova linha para separar os arrays intermediários
            System.out.println();
        }
    }
}
