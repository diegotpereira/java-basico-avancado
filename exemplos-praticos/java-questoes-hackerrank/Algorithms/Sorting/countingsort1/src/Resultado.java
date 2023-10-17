import java.util.*;
import java.util.stream.*;

// O problema em questão, do HackerRank, é chamado de "Counting Sort 1". 
// A tarefa consiste em implementar o algoritmo de ordenação por 
// contagem (counting sort) para contar o número de ocorrências de 
// cada elemento em uma lista de inteiros não ordenados.

public class Resultado {

    // public static List<Integer> countingSort(List<Integer> arr) {

    //     // Define o número máximo de valores possíveis (intervalo de 0 a 99).
    //     int indice_classificado = 100;

    //     // Inicializa uma lista para contar as ocorrências de cada valor.
    //     List<Integer> contador = new ArrayList<>();

    //     // Preenche a lista de contador com zeros, inicializando todas as contagens como zero.
    //     contador.addAll(Collections.nCopies(indice_classificado, 0));

    //     // Percorre a lista de entrada para contar as ocorrências de cada valor.
    //     for (int valor : arr) {
            
    //         // Obtém a frequência atual do valor na lista de contador.
    //         int frequencia = contador.get(valor);

    //         // Atualiza a contagem para este valor, incrementando em 1.
    //         contador.set(valor, frequencia + 1);
    //     }

    //     // Retorna a lista de contador que contém as contagens finais.
    //     return contador;
    // }

    // public static List<Integer> countingSort(List<Integer> arr) {

    //     // Cria um array para armazenar as contagens dos valores (0 a 99).
    //     int[] ar = new int[100];

    //     // Percorre a lista de entrada.
    //     for (int i = 0; i < arr.size(); i++) {
            
    //         // Obtém o valor atual da lista de entrada e usa como índice no array de contagem.
    //         // Incrementa a contagem para esse valor.
    //         ar[arr.get(i)] = ar[arr.get(i)] + 1;
    //     }

    //     // Converte o array de contagem em uma lista de Integer antes de retorná-lo.
    //     return Arrays.stream(ar).boxed().collect(Collectors.toList());
    // }

    // public static List<Integer> countingSort(List<Integer> arr) {

    //     // Cria uma lista para armazenar a resposta final.
    //     ArrayList<Integer> resposta = new ArrayList<>();

    //     // Inicializa a lista de resposta com zeros para cada posição (valores de 0 a 99).
    //     for (int i = 0; i < 100; i++) {
            
    //         resposta.add(0);
    //     }

    //     // Percorre a lista de entrada.
    //     for (int i = 0; i < arr.size(); i++) {
            
    //         // int a = resposta.get(arr.get(i)) + 1;

    //         // resposta.set(arr.get(i), a);

    //         // Obtém o valor atual da lista de entrada.
    //         int valor = arr.get(i);

    //         // Obtém o valor atual da lista de resposta e incrementa em 1.
    //         int contadorAtual = resposta.get(valor);
    //         int novoContador = contadorAtual + 1;

    //         // Define o novo valor na lista de resposta para a 
    //         // posição correspondente ao valor da lista de entrada.
    //         resposta.set(valor, novoContador);
    //     }

    //     return resposta;
    // }

    // public static List<Integer> countingSort(List<Integer> arr) {

    //     // Cria um mapa para armazenar as contagens dos valores.
    //     Map<Integer, Integer> mapaContador = new HashMap<>();

    //     // Cria uma lista para armazenar a resposta final.
    //     List<Integer> lista = new ArrayList<>();

    //     // Passo 1: Contagem das ocorrências de cada valor na lista de entrada.
    //     for (int i = 0; i < arr.size(); i++) {
            
    //         // Verifica se o valor já existe no mapa de contagem.
    //         if(mapaContador.containsKey(arr.get(i)))

    //            // Se existir, incrementa a contagem.
    //            mapaContador.put(arr.get(i), mapaContador.get(arr.get(i)) + 1);

    //         else

    //            // Se não existir, inicializa a contagem como 1.
    //            mapaContador.put(arr.get(i), 1);
    //     }

    //     // Passo 2: Preenchimento da lista de resposta com as contagens.
    //     for (int j = 0; j < 100; j++) {
            
    //         // Verifica se o valor foi contado anteriormente.
    //         if (mapaContador.containsKey(j)) {
                
    //             // Se foi contado, adiciona a contagem à lista de resposta.
    //             lista.add(mapaContador.get(j));
    //         }
            
    //         else 

    //            // Se não foi contado, adiciona 0 à lista de resposta.
    //            lista.add(0);
    //     }

    //     // Retorna a lista de resposta que contém as contagens finais.
    //     return lista;
    // }

    public static List<Integer> countingSort(List<Integer> arr) {

        // Cria uma lista para armazenar o resultado final.
        List resultado = new ArrayList<>();

        // Percorre valores de 0 a 99 para contar as ocorrências na lista de entrada.
        for (int i = 0; i < 100; i++) {
            
            // resultado.add(i, Collections.frequency(arr, i));

             // Usa a função Collections.frequency para contar quantas vezes o valor 'i' aparece na lista.
            int contagem = Collections.frequency(arr, i);

            // Adiciona a contagem à lista de resultado na posição 'i'.
            resultado.add(i, contagem);
        }

        // Retorna a lista de resultado que contém as contagens finais.
        return resultado;
    }
}
