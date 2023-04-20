import java.util.*;
import java.util.stream.IntStream;

import java.util.stream.Collectors;

// O problema consiste em encontrar a quantidade de elementos gemas em uma lista de rochas.
// Um elemento gema é aquele que está presente em todas as rochas da lista pelo menos uma vez.

// Para resolvê-lo, é necessário criar um conjunto de todos os caracteres possíveis (todas as letras do alfabeto, de a a z). 
// Em seguida, iterar sobre a lista de rochas e criar um conjunto para cada rocha contendo seus caracteres. Então, é preciso 
// realizar a operação de interseção entre o conjunto de cada rocha e o conjunto de todos os caracteres possíveis,mantendo assim 
// apenas os caracteres que aparecem em todas as rochas.Por fim,a quantidade de elementos restantes é o número de elementos gemas.

class Resultado {

    public static int gemstones(List<String> arr) {

        // Conjunto de todos os caracteres possíveis (de 'a' a 'z')
        Set<Character> todoCharacters = IntStream.rangeClosed('a', 'z').mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        // Para cada rocha na lista, cria-se um conjunto de caracteres e remove-se do
        // conjunto
        // de todos os caracteres possíveis aqueles que não pertencem a pelo menos uma
        // rocha
        for (String s : arr) {

            Set<Character> chars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

            todoCharacters.retainAll(chars);
        }

        // Retorna o tamanho do conjunto de caracteres que pertencem a todas as rochas
        return todoCharacters.size();
    }

    // public static int gemstones(List<String> arr) {

    // // Variável que guarda o número de elementos-gema encontrados
    // int numDeGemstones = 0;

    // // Encontra a menor rocha (em ordem lexicográfica) para ser usada como
    // // referência
    // String rocha = Collections.min(arr);

    // // Encontra o índice da referência na lista de rochas
    // int x = arr.indexOf(rocha);

    // // Cria um conjunto para guardar os caracteres da referência
    // Set<Character> mss = new HashSet<>();

    // // Adiciona cada caractere da referência ao conjunto
    // rocha.chars().forEach(m -> mss.add((char) m));

    // // Obtém o número de rochas na lista
    // int n = arr.size();

    // // Para cada caractere presente na referência
    // for (Character mineral : mss) {

    // // Conta quantas rochas contêm o caractere
    // int mc = 1;

    // for (int i = 0; i < n; i++)

    // if (i != x && arr.get(i).contains(String.valueOf(mineral)))
    // mc++;

    // // Se o número de rochas que contêm o caractere é igual ao número total de
    // // rochas,
    // // o caractere é um elemento-gema
    // if (mc >= n)
    // numDeGemstones++;

    // }

    // // Retorna o número de elementos-gema encontrados
    // return numDeGemstones;
    // }
}