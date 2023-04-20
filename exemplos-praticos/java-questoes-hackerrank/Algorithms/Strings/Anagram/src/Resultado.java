// O problema pede que a string de entrada seja dividida em duas substrings contíguas e de tamanho igual, 
// para que depois as letras de uma substring possam ser rearranjadas para formar a outra substring. A tarefa 
// é determinar o número mínimo de caracteres que precisam ser alterados em uma das substrings para que se tornem anagramas uma da outra.

// Para resolver esse problema, a ideia é percorrer a string de entrada e dividir em duas substrings de tamanho 
// igual. Em seguida, comparar as letras de cada substring e contar quantas letras são diferentes entre elas. Esse 
// número representa o número mínimo de caracteres que precisam ser alterados para que as substrings se tornem anagramas 
// uma da outra. Se as duas substrings não possuem o mesmo tamanho ou não é possível dividi-las em substrings contíguas de tamanho 
// igual, então a função deve retornar -1.

public class Resultado {

    public static int anagram(String s) {

        // verifica se o comprimento da string é ímpar, se sim, não pode ser anagrama
        if (s.length() % 2 != 0) {
            return -1;
        }

        // divide a string em duas partes iguais
        StringBuilder s1 = new StringBuilder(s.substring(0, s.length() / 2));
        StringBuilder s2 = new StringBuilder(s.substring(s.length() / 2));

        // conta o número de caracteres em s2 que não existem em s1
        int contar = s2.toString()
                // converte s2 para uma stream de inteiros (códigos ASCII)
                .chars()
                // converte cada inteiro de volta para char
                .mapToObj(c -> (char) c)
                .mapToInt(c -> {

                    // encontra o índice do primeiro caractere correspondente em s1
                    int index = s1.indexOf(String.valueOf(c));

                    // se encontrou um caractere correspondente
                    if (index != -1) {

                        // remove o caractere de s1 para garantir que não seja contado novamente
                        s1.deleteCharAt(index);

                        // retorna 0 para contar que encontrou um caractere correspondente
                        return 0;
                    }

                    // retorna 1 para contar que não encontrou um caractere correspondente
                    return 1;

                    // soma o número de ocorrências em que não encontrou um caractere correspondente
                }).sum();

        return contar;
    }

    // public static int anagram(String s) {

    // // Verifica se o comprimento da string é par
    // if (s.length() % 2 != 0) {

    // return -1;
    // }

    // // Encontra o ponto médio da string
    // int meioPonto = (s.length() / 2);

    // // Divide a string em duas substrings usando o ponto médio
    // StringBuilder s1 = new StringBuilder(s.substring(0, meioPonto));
    // StringBuilder s2 = new StringBuilder(s.substring(meioPonto));

    // // Verifica cada caractere em s2 e remove da s1 se encontrado
    // for (char c : s2.toString().toCharArray()) {

    // int indice = s1.indexOf(String.valueOf(c));

    // if (indice > -1) {

    // s1 = s1.delete(indice, indice + 1);
    // }
    // }

    // // Retorna o comprimento de s1
    // return s1.length();
    // }

    // public static int anagram(String s) {

    // // Verifica se o comprimento da string é par, caso contrário, não há
    // substrings
    // // com tamanhos iguais.
    // if (s.length() % 2 != 0) {

    // return -1;
    // }

    // // Cria um array de frequência para cada letra do alfabeto
    // int[] freq = new int[26];

    // // Percorre a primeira metade da string e atualiza a frequência de cada letra
    // for (int i = 0; i < s.length() / 2; i++) {

    // freq[s.charAt(i) - 'a']++;
    // }

    // // Contador para armazenar o número de caracteres que precisam ser alterados
    // int contar = 0;

    // // Percorre a segunda metade da string e atualiza a frequência de cada letra
    // for (int i = s.length() / 2; i < s.length(); i++) {

    // int indice = s.charAt(i) - 'a';

    // // Se a letra atual já apareceu na primeira metade da string, decrementa a
    // // frequência da letra correspondente
    // if (freq[indice] > 0) {

    // freq[indice]--;

    // // Caso contrário, incrementa o contador de caracteres que precisam ser
    // // alterados
    // } else {

    // contar++;
    // }
    // }

    // // Retorna o número de caracteres que precisam ser alterados para formar
    // // substrings anagramas
    // return contar;

    // }

    // // Método para verificar o número mínimo de caracteres que precisam ser
    // trocados
    // // para tornar duas substrings em anagramas uma da outra
    // public static int anagram(String s) {

    // // Encontra o ponto médio da string
    // int pontoMeio = s.length() / 2;

    // // Cria a primeira substring
    // String s1 = s.substring(0, pontoMeio);

    // // Cria a segunda substring
    // String s2 = s.substring(pontoMeio, s.length());

    // // Verifica se a string possui um número ímpar de caracteres
    // if (s.length() % 2 != 0) {

    // // Retorna -1 se a string não puder ser dividida em duas substrings iguais
    // return -1;
    // }

    // // Verifica cada caractere da primeira substring
    // for (char c : s1.toCharArray()) {

    // // Se a segunda substring contém o caractere atual
    // if (s2.contains(Character.toString(c))) {

    // // Remove o primeiro caractere correspondente da segunda substring
    // s2 = s2.replaceFirst(Character.toString(c), "");
    // }
    // }

    // // Retorna o comprimento da segunda substring restante
    // return s2.length();
    // }

}
