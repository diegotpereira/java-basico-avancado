import java.util.*;

// O problema "Larry's Array" do Hackerrank consiste em 
// verificar se é possível ordenar um array de inteiros 
// utilizando uma operação especial chamada "flip". A operação 
// "flip" permite inverter a ordem dos elementos em um intervalo 
// contínuo do array. O objetivo é determinar se é possível ordenar 
// o array em ordem crescente apenas utilizando a operação "flip".

public class Resultado {

    public static String larrysArray(List<Integer> a) {

        // Converte a lista em um array primitivo de inteiros
        int arr[] = a.stream().mapToInt(x -> x).toArray();
        int contarInversao = 0;

        // Loop pelos elementos do array
        for (int i = 0; i < arr.length; i++) {

            // Loop pelos elementos após o elemento atual
            for (int j = i + 1; j < arr.length; j++) {

                // Se houver uma inversão, incrementa a contagem
                if (arr[i] > arr[j]) {

                    contarInversao++;
                }
            }
        }

        // Verifica se a contagem de inversões é par ou ímpar e retorna a resposta
        if (contarInversao % 2 == 0) {

            return "YES";
        }

        return "NO";
    }

    // public static String larrysArray(List<Integer> A) {

    // // Inicializa o contador de inversões como zero
    // int contar = 0;

    // // Percorre o array do fim para o começo
    // for (int i = A.size() - 1; i > 0; i--) {

    // // Percorre o subarray anterior ao índice atual
    // for (int j = i - 1; j >= 0; j--) {

    // // Se o elemento atual for menor que um elemento anterior
    // if (A.get(i) < A.get(j))

    // // Incrementa o contador de inversões
    // contar++;
    // }
    // }

    // // Retorna "YES" se o número de inversões for par e "NO" caso contrário
    // return contar % 2 == 0 ? "YES" : "NO";
    // }

}
