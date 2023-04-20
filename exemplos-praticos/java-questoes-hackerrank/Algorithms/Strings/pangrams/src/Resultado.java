import java.util.*;
import java.util.stream.Collectors;

public class Resultado {

    public static String pangrams(String s) {

        // Cria um array booleano de 26 elementos para rastrear as letras do alfabeto
        boolean[] hash = new boolean[26];

        // Percorre cada caractere na string
        for (char ch : s.toCharArray()) {

            // Se o caractere estiver entre 'a' e 'z', marca o elemento correspondente
            // no array
            if ('a' <= ch && ch <= 'z')

                hash[ch - 'a'] = true;

            // Se o caractere estiver entre 'A' e 'Z', marca o elemento correspondente
            // no array
            if ('A' <= ch && ch <= 'Z')

                hash[ch - 'A'] = true;

        }

        // Percorre cada elemento no array e retorna "not pangram" se algum elemento for
        // falso (ou seja, uma letra do alfabeto está ausente)
        for (boolean b : hash)

            if (!b)

                return "not pangram";

        // Se todos os elementos do array forem verdadeiros (ou seja, todas as letras do
        // alfabeto estiverem presentes), retorna "pangram"
        return "pangram";
    }

    // public static String pangrams(String s) {

    // // Remove todos os espaços em branco da string
    // int saida = s.replaceAll("\\s", "")

    // // converte todas as letras para minúsculas
    // .toLowerCase()

    // // Converte a string para um fluxo de valores inteiros representando os
    // // caracteres
    // .chars()

    // // Converte cada valor inteiro em seu caractere correspondente
    // .mapToObj(i -> (char) i)

    // // Coleta os caracteres em um conjunto para remover duplicatas
    // .collect(Collectors.toSet())

    // // Obtém o tamanho do conjunto, que é o número de caracteres exclusivos na
    // // string
    // .size();

    // // Se a string tiver exatamente 26 caracteres exclusivos, é um pangrama
    // return saida == 26 ? "pangram" : "not pangram";
    // }

    // public static String pangrams(String s) {

    // // Número total de letras no alfabeto inglês
    // int c = 26;

    // // Array para armazenar o número de ocorrências de cada letra do alfabeto
    // int dp[] = new int[27];

    // // Loop através de cada caractere na string
    // for (int i = 0; i < s.length(); i++) {

    // // Obter o caractere atual
    // char ch = s.charAt(i);

    // // Converter o caractere para minúsculo
    // ch = Character.toLowerCase(ch);

    // // Obter o índice da letra no alfabeto
    // int idx = ch - 'a';

    // // Verificar se o caractere não é uma letra do alfabeto
    // if (idx < 0 || idx >= 26)

    // continue;

    // // Incrementar o contador para a letra atual
    // dp[idx]++;

    // // Se a letra já apareceu anteriormente, continue
    // if (dp[idx] > 1)

    // continue;

    // // Decrementar o contador de letras ausentes
    // c--;

    // // Se todas as letras já apareceram, retornar "pangrama"
    // if (c == 0)

    // return "pangram";
    // }

    // // Se não todas as letras apareceram, retornar "não pangrama"
    // return "not pangram";
    // }

    // public static String pangrams(String s) {

    // // Verifica se a string tem pelo menos 26 caracteres
    // if (s.length() < 26) {

    // return "not pangram";
    // }

    // // Cria um mapa com todas as letras do alfabeto
    // Map<Character, Integer> map = new HashMap<>();

    // // loop for percorre os valores decimais da letra minúscula 'a' (97) até a
    // letra
    // // minúscula 'z' (122) na tabela ASCII
    // for (int i = 97; i <= 122; i++) {

    // map.put((char) i, 1);
    // }

    // // Transforma a string em minúsculas
    // s = s.toLowerCase();

    // for (int i = 0; i < s.length(); i++) {

    // if (map.containsKey(s.charAt(i))) {

    // map.put(s.charAt(i), 0);
    // }
    // }

    // // Se o mapa ainda contém letras não encontradas, a string não é um pangrama
    // if (map.containsValue(1)) {

    // return "not pangram";

    // } else {

    // return "pangram";
    // }
    // }

    // public static String pangrams(String s) {

    // // Inicializa a string resultado como pangram
    // String resultado = "pangram";

    // // Cria um array de caracteres com as letras do alfabeto
    // char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    // // Itera sobre o alfabeto
    // for (int i = 0; i < alfabeto.length; i++) {

    // // Verifica se a letra atual do alfabeto está presente na string s em
    // maiúsculas
    // if (s.toUpperCase().indexOf(alfabeto[i]) == -1) {

    // // Se a letra não estiver presente, a string não é um pangram e retorna "not
    // // pangram"
    // return "not pangram";
    // }

    // }
    // // Se todas as letras do alfabeto estiverem presentes na string s, retorna
    // // "pangram"
    // return resultado;
    // }

    // /**
    // * Verifica se a string fornecida é um pangrama em inglês, ou seja, se contém
    // * todas as letras do alfabeto.
    // *
    // * @param s a string a ser verificada
    // * @return "pangram" se a string é um pangrama, "not pangram" caso contrário
    // */

    // public static String pangrams(String s) {

    // HashSet<Character> set = setChars(s.toLowerCase());

    // // Verifica se o tamanho do HashSet é igual a 26, que é o número de letras do
    // // alfabeto em inglês
    // return (set.size() == 27) ? "pangram" : "not pangram";
    // }

    // // Método que recebe uma string e retorna um HashSet de caracteres
    // public static HashSet<Character> setChars(String str) {

    // HashSet<Character> hashSet = new HashSet<>();

    // // Percorre a string e adiciona cada caractere ao HashSet
    // for (char ch : str.toCharArray()) {

    // hashSet.add(ch);
    // }

    // return hashSet;
    // }

    // public static String pangrams(String s) {

    // // Transforma a string em minúsculas e remove todos os espaços em branco
    // String str = s.toLowerCase().replaceAll(" ", "");

    // // Cria um conjunto para armazenar todos os caracteres da string
    // Set<Character> set = new HashSet<>();

    // // Percorre a string e adiciona cada caractere ao conjunto
    // for (int i = 0; i < str.length(); i++)

    // set.add(str.charAt(i));

    // // Retorna "pangram" se o conjunto contém todas as letras do alfabeto (26
    // // letras), caso contrário, retorna "not pangram"
    // return set.size() == 26 ? "pangram" : "not pangram";
    // }

    // public static String pangrams(String s) {

    // for (int i = 0; i < s.length(); i++) {

    // s.toLowerCase();

    // }

    // String letras_alfabeto = "abcdefghijklmnopqrstuvwxyz";

    // int contar = 0;

    // for (int i = 0; i < letras_alfabeto.length(); i++) {

    // int j = 0;

    // while (j < s.length()) {

    // if (letras_alfabeto.charAt(i) == s.charAt(j)) {

    // contar++;
    // break;

    // }

    // j++;
    // }

    // }

    // if (contar == 26)
    // return "pangram";

    // else
    // return "not pangram";

    // }

}
