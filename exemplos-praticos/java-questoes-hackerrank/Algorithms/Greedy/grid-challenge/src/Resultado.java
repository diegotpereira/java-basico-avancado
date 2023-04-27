import java.util.*;
import java.util.stream.Collectors;

// A tarefa do problema "Grid Challenge" no Hackerrank é verificar se 
// é possível reorganizar as letras de cada linha de uma matriz de 
// caracteres em ordem não decrescente, de forma que todas as colunas 
// também estejam em ordem não decrescente.

// Ou seja, o objetivo é verificar se é possível rearranjar as letras 
// em cada linha para que, quando as colunas forem consideradas em conjunto, 
// elas formem uma sequência de strings ordenada em ordem não decrescente. 
// Se for possível, a saída deve ser "YES" e se não for possível, a saída deve ser "NO".

public class Resultado {

    // Ler a entrada que consiste em um número inteiro T, representando o número de
    // casos de teste, seguido por T matrizes quadradas de caracteres.

    // Para cada matriz, classificar cada linha em ordem não decrescente.

    // Em seguida, verificar se as colunas também estão em ordem não decrescente,
    // percorrendo cada coluna da esquerda para a direita e comparando os caracteres
    // em pares adjacentes.

    // Se todas as linhas e colunas estiverem em ordem não decrescente, imprimir
    // "YES". Caso contrário, imprimir "NO".

    public static String gridChallenge(List<String> grade) {

        // cria uma nova lista vazia
        ArrayList<String> lista = new ArrayList<>();

        // percorre cada string da lista de entrada
        for (int i = 0; i < grade.size(); i++) {

            // obtém a string atual
            String str = grade.get(i);

            // converte a string em um array de caracteres
            char ch[] = str.toCharArray();

            // ordena o array de caracteres em ordem crescente
            Arrays.sort(ch);

            // adiciona a string ordenada na nova lista
            lista.add(String.valueOf(ch));
        }

        // percorre a lista ordenada
        for (int i = 0; i < lista.size() - 1; i++) {

            // obtém a string atual e a próxima string na lista
            String s = lista.get(i);
            String s1 = lista.get(i + 1);

            // percorre cada caractere das duas strings simultaneamente
            for (int j = 0; j < s1.length(); j++) {

                // verifica se o caractere atual da string anterior
                // é maior que o caractere atual da próxima string
                if (s.charAt(j) > s1.charAt(j)) {

                    // se a condição acima for verdadeira, a grade
                    // não está em ordem lexicográfica e retorna "NO"
                    return "NO";
                }
            }
        }

        // se o loop terminar, a grade está em ordem lexicográfica e retorna "YES"
        return "YES";
    }

    // public static String gridChallenge(List<String> grade) {

    // // cria uma nova lista de matrizes de caracteres a
    // // partir da lista de strings da grade
    // List<char[]> matriz = grade.stream().map(e -> {

    // // converte a string em um array de caracteres
    // char[] r = e.toCharArray();

    // // ordena o array de caracteres em ordem crescente
    // Arrays.sort(r);

    // // retorna o array de caracteres ordenado
    // return r;

    // // coleta os arrays de caracteres ordenados em uma nova lista
    // }).collect(Collectors.toList());

    // // percorre cada coluna da matriz
    // for (int i = 0; i < matriz.get(0).length; i++) {

    // // percorre cada linha, exceto a primeira
    // for (int j = 1; j < matriz.size(); j++) {

    // // verifica se o elemento na linha anterior é maior
    // // do que o elemento na linha atual na mesma coluna
    // if (matriz.get(j - 1)[i] > matriz.get(j)[i]) {

    // // se a condição acima for verdadeira, a grade
    // // não está em ordem lexicográfica e retorna "NO"
    // return "NO";
    // }
    // }
    // }

    // // se o loop terminar, a grade está em ordem
    // // lexicográfica e retorna "YES"
    // return "YES";
    // }

    // public static String gridChallenge(List<String> grade) {

    // // obtém a quantidade de linhas da grade
    // int linhas = grade.size();

    // // obtém a quantidade de colunas da grade
    // // (assumindo que todas as linhas têm o mesmo comprimento)
    // int colunas = grade.get(0).length();

    // // cria uma matriz de caracteres para armazenar a grade
    // char[][] grid = new char[linhas][];

    // // percorre cada linha da grade
    // for (int i = 0; i < linhas; i++) {

    // // converte a linha em um array de caracteres e armazena na matriz
    // grid[i] = grade.get(i).toCharArray();

    // // ordena o array de caracteres em ordem crescente
    // Arrays.sort(grid[i]);
    // }

    // // percorre cada coluna da grade
    // for (int coluna = 0; coluna < colunas; coluna++) {

    // // percorre cada linha, exceto a última
    // for (int linha = 0; linha < linhas - 1; linha++) {

    // // verifica se o elemento na linha atual é maior do que
    // // o elemento na próxima linha na mesma coluna
    // if (grid[linha][coluna] > grid[linha + 1][coluna]) {

    // // se a condição acima for verdadeira, a grade não
    // // está em ordem lexicográfica e retorna "NO"
    // return "NO";
    // }
    // }

    // }

    // // se o loop terminar, a grade está em ordem
    // // lexicográfica e retorna "YES"
    // return "YES";
    // }

    // public static String gridChallenge(List<String> grade) {

    // // variável para armazenar a última string ordenada
    // String s = "";

    // // percorre cada string na lista de strings
    // for (String f : grade) {

    // // converte a string em um array de caracteres
    // char c[] = f.toCharArray();

    // // ordena o array de caracteres em ordem crescente
    // Arrays.sort(c);

    // // cria uma nova string invertendo a ordem dos caracteres
    // String d = new StringBuilder(new String(c)).reverse().toString();

    // // compara a última string ordenada com a string atual invertida
    // if (s.compareTo(d) > 0)

    // // se a última string for maior do que a atual, retorna "NO"
    // return "NO";

    // // atualiza a última string ordenada
    // s = d;

    // }

    // // se o loop terminar, retorna "YES"
    // return "YES";
    // }

}
