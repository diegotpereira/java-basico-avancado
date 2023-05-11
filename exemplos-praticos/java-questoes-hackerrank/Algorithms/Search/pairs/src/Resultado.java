import java.util.*;

// A tarefa do problema "Pairs" do HackerRank é 
// encontrar o número de pares distintos de elementos 
// em um array de inteiros que têm a diferença k. Em 
// outras palavras, dado um array de inteiros e um inteiro k, 
// a tarefa é contar quantos pares únicos de elementos no array têm diferença k.

public class Resultado {

    public static int pairs(int k, List<Integer> arr) {

        int res = 0;

        Map<Integer, Integer> mapa = new HashMap<>();

        for (Integer i : arr)

            mapa.put(i, 0);

        for (Integer j : arr)

            if (mapa.get(j + k) != null)

                res++;

        return res;
    }

    // public static int pairs(int k, List<Integer> arr) {

    // // Inicializa um contador para armazenar a quantidade de pares
    // // que satisfazem a condição
    // int contar = 0;

    // // Inicializa um conjunto brr para armazenar os elementos
    // // de arr com k adicionado
    // Set<Integer> brr = new HashSet<>();

    // // Verifica para cada elemento i em arr se brr contém i
    // // Se sim, incrementa o contador
    // for (Integer i : arr) {

    // brr.add(i + k);
    // }

    // for (Integer i : arr) {

    // if (brr.contains(i)) {

    // contar++;
    // }
    // }

    // // Retorna a quantidade de pares que satisfazem a condição
    // return contar;
    // }

    // public static int pairs(int k, List<Integer> arr) {

    // // inicializa o contador de pares
    // int contar = 0;

    // // ordena a lista em ordem crescente
    // Collections.sort(arr);

    // // percorre a lista com um loop for
    // for (int i = 0; i < arr.size(); i++) {

    // // percorre a lista a partir do índice seguinte ao do loop externo
    // for (int j = i + 1; j < arr.size(); j++) {

    // // se a diferença entre os elementos i e j for igual a k, incrementa o
    // contador
    // if (Math.abs(arr.get(i) - arr.get(j)) == k) {

    // contar++;
    // continue;
    // }

    // // se a diferença entre os elementos i e j for maior que k, encerra o loop
    // // interno
    // if (Math.abs(arr.get(i) - arr.get(j)) > k) {

    // break;
    // }
    // }
    // }

    // // retorna o número de pares que têm diferença igual a k
    // return contar;
    // }

    // public static int pairs(int k, List<Integer> arr) {

    // // cria um conjunto (Set) a partir da lista de inteiros
    // Set set = new HashSet<>(arr);

    // // inicializa contador
    // int contar = 0;

    // // percorre cada elemento da lista
    // for (int a : arr) {

    // // se o conjunto contém o valor "a - k", incrementa o contador
    // if (set.contains(a - k)) {

    // contar++;
    // }
    // }

    // // retorna o valor final do contador
    // return contar;
    // }

}
