import java.util.*;
import java.util.stream.Collectors;

// O problema "Two Arrays" do HackerRank é um desafio de programação que envolve a criação 
// de um algoritmo para verificar se é possível selecionar pares de números de duas listas 
// de números inteiros, de modo que a soma de cada par de números seja igual a um valor inteiro K.

// A tarefa é implementar uma função chamada "twoArrays", que recebe como parâmetros duas 
// listas de inteiros "a" e "b", e um valor inteiro "k". A função deve retornar a string "YES" 
// se for possível selecionar pares de números que atendam às condições especificadas, e "NO" caso contrário.

// O problema é considerado resolvido quando a função "twoArrays" passa em todos os 
// testes de exemplo fornecidos pelo HackerRank.

public class Resultado {

    public static String twoArrays(int k, List<Integer> a, List<Integer> b) {

        // Ordena as duas listas
        List<Integer> classA = a.stream().sorted().collect(Collectors.toList());
        List<Integer> classB = b.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        // Pega o tamanho da lista classA
        int n = classA.size();

        // Converte a lista classB em um array de inteiros
        int[] reverterB = classB.stream().mapToInt(Integer::intValue).toArray();

        // Itera sobre a lista classA
        for (int i = 0; i < n; i++) {

            // Verifica se a soma do elemento i da lista classA com o elemento i do array
            // reverterB é menor que k
            if (classA.get(i) + reverterB[i] < k) {

                // Se for menor que k, retorna "NO"
                return "NO";
            }
        }

        // Se não houver nenhum par (i, j) em que a[i] + b[j] < k, retorna "YES"
        return "YES";
    }

    // public static String twoArrays(int k, List<Integer> a, List<Integer> b) {

    // Collections.sort(a);
    // Collections.sort(b);

    // int n = a.size();
    // int p = n - 1;

    // int c = 0;

    // for (int i = 0; i < a.size() - 1; i++, i--) {

    // c++;
    // }

    // p--;

    // String s = c == n ? "YES" : "NO";

    // return s;
    // }

    // Ordenar as listas "a" e "b" em ordem crescente.
    // Inverter a ordem da lista "b" em ordem decrescente.
    // Para cada par de elementos nas listas "a" e "b", verificar se a soma dos
    // elementos é menor ou igual a "k".
    // Se houver pelo menos um par de elementos que atenda à condição, retornar
    // "YES", caso contrário, retornar "NO".
    // A razão pela qual devemos ordenar as listas é que isso nos permite comparar
    // os elementos das listas de forma mais eficiente, facilitando a verificação da
    // soma dos pares de elementos. Invertendo a ordem da lista "b", podemos
    // garantir que os maiores elementos serão comparados com os menores elementos
    // de "a", o que aumenta as chances de encontrar um par de elementos que atenda
    // à condição de soma.

    // Essa abordagem é eficiente porque evita a necessidade de gerar todas as
    // possíveis combinações de elementos nas duas listas, o que levaria a uma
    // complexidade de tempo exponencial. Em vez disso, ela usa a propriedade de
    // ordenação das listas para encontrar a solução de forma mais rápida e
    // eficiente.

    // public static String twoArrays(int limiteDeSoma, List<Integer> a,
    // List<Integer> b) {

    // // Ordena a lista "a" em ordem crescente.
    // Collections.sort(a);

    // // Ordena a lista "b" em ordem decrescente.
    // Collections.sort(b, Collections.reverseOrder());

    // // Verifica se a soma dos elementos das listas "a" e "b"
    // // atendem ao limite de soma.
    // for (int i = 0; i < a.size(); i++) {

    // if (a.get(i) + b.get(i) < limiteDeSoma) {

    // // Retorna "NO" se a soma dos elementos for menor que o limite de soma.
    // return "NO";
    // }
    // }

    // // Se todas as somas forem maiores ou iguais ao limite de soma, retorna
    // "YES".
    // return "YES";
    // }

}
