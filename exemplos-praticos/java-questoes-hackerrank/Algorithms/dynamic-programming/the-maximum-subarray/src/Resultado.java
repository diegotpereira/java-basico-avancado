import java.util.*;

// A tarefa do problema "Max Array Sum" do HackerRank é encontrar 
// a soma máxima de um subconjunto de elementos de um array. O array 
// dado pode conter números positivos e negativos, e a tarefa é encontrar 
// o subconjunto contíguo de elementos com a soma máxima possível.

// O problema possui duas partes:

// Encontrar a soma máxima de um subconjunto não adjacente de elementos do array.
// Encontrar a soma máxima de um subconjunto contíguo de elementos do array.
// A primeira parte do problema pode ser resolvida usando a abordagem do algoritmo 
// de Kadane para encontrar a soma máxima de uma submatriz. A ideia é percorrer o 
// array uma vez, mantendo a soma acumulada máxima até o momento. Isso é feito 
// escolhendo o valor máximo entre o elemento atual e a soma acumulada mais o elemento 
// atual. No final, o valor máximo será a soma máxima de um subconjunto não adjacente.

// A segunda parte do problema pode ser resolvida usando uma abordagem semelhante ao 
// algoritmo de Kadane para submatrizes. A ideia é percorrer o array uma vez, mantendo 
// a soma acumulada máxima até o momento. Isso é feito escolhendo o valor máximo entre 
// o elemento atual e a soma acumulada mais o elemento atual. No final, o valor máximo 
// será a soma máxima de um subconjunto contíguo.

// Em resumo, o problema envolve a aplicação de técnicas de programação dinâmica e 
// algoritmo de Kadane para encontrar a soma máxima de um subconjunto em um array.

public class Resultado {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        // Crie uma lista para armazenar os resultados
        List<Integer> resultados = new ArrayList<>();

        // Variáveis para acompanhar a soma do subarray,
        // soma da subsequência e soma máxima do subarray
        int subArraySoma = 0;
        int somaSubSeq = 0;
        int subArraySomaMax = 0;

        for (int i = 0; i < arr.size(); i++) {

            // Atualize a soma do subarray incluindo o elemento atual
            // ou reiniciando a soma a partir do elemento atual
            subArraySoma += arr.get(i);

            // Se a soma do subarray se tornar negativa,

            if (subArraySoma < 0) {

                // reinicie a soma a partir do próximo elemento
                subArraySoma = 0;
            }

            // Atualize a soma máxima do subarray
            subArraySomaMax = Math.max(subArraySomaMax, subArraySoma);

            // Adicione o valor do elemento atual à soma da subsequência, caso seja positivo
            Integer valor = arr.get(i);

            if (valor > 0) {

                somaSubSeq += valor;
            }
        }

        // Se a soma da subsequência for positiva,
        if (somaSubSeq > 0) {

            // adicione a soma máxima do subarray
            resultados.add(subArraySomaMax);

            // e a soma da subsequência aos resultados
            resultados.add(somaSubSeq);

            // Caso contrário,
        } else {

            // encontre o valor máximo do array
            final int max = Collections.max(arr);

            // e adicione-o duas vezes aos resultados
            resultados.add(max);
            resultados.add(max);
        }
        return resultados;
    }

    // public static List<Integer> maxSubarray(List<Integer> arr) {

    // // Crie uma lista para armazenar a soma máxima da submatriz
    // // e a soma dos elementos positivos
    // List<Integer> somaMaxima = new ArrayList<>();

    // // Inicialize as variáveis para acompanhar a soma máxima da submatriz
    // int maximo_ate_agora = arr.get(0);

    // // Define o máximo inicial como o primeiro elemento do array
    // int final_maximo_aqui = 0;

    // for (int j = 0; j < arr.size(); j++) {

    // // Atualize a soma máxima local incluindo o elemento atual
    // // ou reiniciando a soma a partir do elemento atual
    // final_maximo_aqui = Math.max(arr.get(j), final_maximo_aqui + arr.get(j));

    // // Atualize o máximo global da submatriz
    // maximo_ate_agora = Math.max(maximo_ate_agora, final_maximo_aqui);
    // }

    // // Calcule a soma dos elementos positivos usando a Stream API
    // int soma = arr.stream()

    // // Filtra apenas os elementos positivos
    // .filter(i -> i > 0)
    // .mapToInt(Integer::intValue)
    // .sum();

    // // Caso a soma dos elementos positivos seja zero,
    // if (soma == 0) {

    // // atualize para o valor máximo da submatriz
    // soma = maximo_ate_agora;
    // }

    // // Adicione os resultados na lista e retorne
    // somaMaxima.add(maximo_ate_agora);
    // somaMaxima.add(soma);

    // return somaMaxima;
    // }

    // public static List<Integer> maxSubarray(List<Integer> arr) {

    // // O método maxSubarray implementa o algoritmo de Kadane para encontrar a
    // soma
    // // máxima de um subarray e a soma máxima dos elementos positivos em um array.

    // // A lógica do algoritmo é a seguinte:

    // // Inicializa duas variáveis: maximo_ate_agora para armazenar o máximo
    // // encontrado até o momento e final_maximo_aqui para armazenar o máximo atual
    // // considerando o elemento atual.
    // // Percorre o array arr elemento por elemento.
    // // Atualiza final_maximo_aqui somando o elemento atual.
    // // Verifica se final_maximo_aqui é maior que maximo_ate_agora. Se for,
    // atualiza
    // // maximo_ate_agora.
    // // Se final_maximo_aqui se tornar negativo, reinicia-o para 0, já que um
    // // subarray com soma negativa não contribui para a soma máxima.
    // // Após percorrer todos os elementos do array, maximo_ate_agora conterá a
    // soma
    // // máxima de um subarray.
    // // Em seguida, o algoritmo realiza as seguintes etapas para calcular a soma
    // dos
    // // elementos positivos:

    // // Inicializa a variável soma como 0.
    // // Ordena o array arr em ordem crescente.
    // // Verifica se o maior elemento do array é menor ou igual a 0. Se for,
    // atribui
    // // esse valor a soma, pois não há elementos positivos.
    // // Caso contrário, percorre o array e soma os elementos positivos a soma.
    // // Após percorrer todos os elementos, soma conterá a soma dos elementos
    // // positivos.
    // // Finalmente, as duas somas são adicionadas a uma lista somaMaxima, que é
    // // retornada como resultado da função.

    // // Lista para armazenar as somas máximas
    // List<Integer> somaMaxima = new ArrayList<Integer>();

    // // Variável para armazenar o máximo encontrado até o momento
    // int maximo_ate_agora = arr.get(0);

    // // Variável para armazenar o máximo atual encontrado
    // int final_maximo_aqui = 0;

    // for (int i = 0; i < arr.size(); i++) {

    // // Atualiza o máximo atual considerando o elemento atual
    // final_maximo_aqui += arr.get(i);

    // if (final_maximo_aqui > maximo_ate_agora) {

    // // Se o máximo atual for maior que o máximo encontrado
    // // até o momento, atualiza-o
    // maximo_ate_agora = final_maximo_aqui;
    // }

    // if (final_maximo_aqui < 0) {

    // // Se o máximo atual se tornar negativo, reinicia-o para 0
    // final_maximo_aqui = 0;
    // }
    // }

    // // Variável para armazenar a soma dos elementos positivos
    // int soma = 0;

    // Collections.sort(arr);

    // if (arr.get(arr.size() - 1) <= 0) {

    // // Se o maior elemento do array for menor ou igual a 0,
    // // atribui esse valor à soma
    // soma = arr.get(arr.size() - 1);

    // } else {

    // for (Integer i : arr) {

    // if (i > 0) {

    // // Calcula a soma dos elementos positivos
    // soma += i;
    // }
    // }
    // }

    // // Adiciona a soma máxima encontrada à lista de resultados (somaMaxima)
    // somaMaxima.add(maximo_ate_agora);

    // // Adiciona a soma dos elementos positivos à lista de resultados (somaMaxima)
    // somaMaxima.add(soma);

    // // Retorna a lista com as somas máximas
    // return somaMaxima;
    // }

    // public static List<Integer> maxSubarray(List<Integer> arr) {

    // ArrayList<Integer> somaMaxima = new ArrayList<>();

    // // Variável para armazenar a soma atual
    // int soma = 0;

    // // Variável para calcular a soma dos elementos positivos
    // int j = 0;

    // // Variável para armazenar a soma máxima do subarray
    // // int maxI = -999999;
    // int maxI = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.size(); i++) {

    // // Adiciona o elemento atual à soma
    // soma += arr.get(i);

    // // Se a soma se tornar negativa,
    // if (soma < 0)

    // // reinicia para 0
    // soma = 0;

    // // Atualiza a soma máxima do subarray (maxI) com o valor máximo encontrado
    // maxI = Math.max(maxI, soma);

    // if (arr.get(i) > 0)

    // // Calcula a soma dos elementos positivos
    // j += arr.get(i);
    // }

    // // Se a soma dos elementos positivos for 0,
    // if (j == 0) {

    // // define j como o maior elemento do array
    // j = Collections.max(arr);

    // // Atualiza a soma máxima do subarray (maxI) com o novo valor de j
    // maxI = j;
    // }

    // // Adiciona a soma máxima do subarray à lista de resultados (somaMaxima)
    // somaMaxima.add(maxI);

    // // Adiciona a soma dos elementos positivos à lista de resultados (somaMaxima)
    // somaMaxima.add(j);

    // // Retorna a lista com as somas máximas
    // return somaMaxima;
    // }

    // public static List<Integer> maxSubarray(List<Integer> arr) {

    // // Variável para armazenar a soma máxima do subarray
    // int somaMaxSubArray = arr.get(0);

    // // Variável para armazenar a soma máxima do subarray
    // // terminando no elemento atual
    // int somaMaxElemento = arr.get(0);

    // // Variável para armazenar a soma máxima até o elemento atual
    // int max = arr.get(0);

    // for (int i = 1; i < arr.size(); i++) {

    // // Escolhe o valor máximo entre a soma acumulada mais o
    // // elemento atual e o próprio elemento atual
    // max = Math.max(max + arr.get(i), arr.get(i));

    // // Atualiza a soma máxima do subarray
    // somaMaxSubArray = Math.max(somaMaxSubArray, max);

    // // Escolhe o valor máximo entre o elemento atual, a soma máxima do subarray
    // // anterior e a soma acumulada mais o elemento atual
    // somaMaxElemento = Math.max(Math.max(somaMaxElemento, arr.get(i)),
    // somaMaxElemento + arr.get(i));
    // }

    // ArrayList<Integer> lista = new ArrayList<>();

    // // Adiciona a soma máxima do subarray na lista
    // lista.add(somaMaxSubArray);

    // // Adiciona a soma máxima do subarray terminando no elemento atual na lista
    // lista.add(somaMaxElemento);

    // // Retorna a lista contendo as duas somas máximas
    // return lista;
    // }

}
