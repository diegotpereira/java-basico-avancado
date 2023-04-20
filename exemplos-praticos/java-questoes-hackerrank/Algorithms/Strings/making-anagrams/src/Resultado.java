import java.util.*;

public class Resultado {

    public static int makingAnagrams(String s1, String s2) {

        HashMap<Character, Integer> mapa = new HashMap<>();
        HashMap<Character, Integer> mapa1 = new HashMap<>();

        int contar = 0;

        for (int i = 0; i < s1.length(); i++) {

            Character c = s1.charAt(i);

            if (mapa.containsKey(c)) {

                mapa.put(c, mapa.get(c) + 1);

            } else {

                mapa.put(c, 1);
            }

        }

        for (int i = 0; i < s2.length(); i++) {

            Character c = s2.charAt(i);

            if (mapa1.containsKey(c)) {

                mapa1.put(c, mapa1.get(c) + 1);

            } else {

                mapa1.put(c, 1);
            }

        }

        for (Character c : mapa.keySet()) {

            if (mapa1.containsKey(c)) {

                contar += Math.abs(mapa1.get(c) - mapa.get(c));

            } else {

                contar += mapa.get(c);
            }
        }

        for (Character c : mapa1.keySet()) {

            if (!mapa.containsKey(c)) {

                contar += mapa1.get(c);

            }
        }

        return contar;
    }

    // public static int makingAnagrams(String s1, String s2) {

    // // Cria um mapa para guardar os caracteres que são iguais entre as duas
    // strings
    // Map<Integer, Character> mapa = new HashMap<>();

    // // Loop para comparar os caracteres das duas strings
    // for (int i = 0; i < s1.length(); i++) {

    // for (int j = 0; j < s2.length(); j++) {

    // // Verifica se o caractere na posição i da string s1 é igual ao
    // // caractere na posição j da string s2
    // // E se a posição j ainda não está no mapa
    // if (s1.charAt(i) == s2.charAt(j) && !mapa.containsKey(j)) {

    // // Adiciona a posição j e o caractere na posição j ao mapa
    // mapa.put(j, s2.charAt(j));

    // // Sai do loop interno
    // break;
    // }
    // }
    // }

    // // O tamanho do mapa é o número de caracteres iguais entre as duas strings
    // int contar = mapa.size();

    // // Calcula o número de caracteres que são diferentes entre as duas strings
    // int n = s1.length() - contar + s2.length() - contar;
    // return n;
    // }

    // public static int makingAnagrams(String s1, String s2) {

    // int[] freq1 = new int[26];
    // int[] freq2 = new int[26];
    // int contar = 0;

    // // Conta a frequência de cada caractere na primeira string
    // for (int i = 0; i < s1.length(); i++) {

    // int index1 = s1.charAt(i) - 'a';
    // freq1[index1]++;

    // }

    // // Conta a frequência de cada caractere na segunda string
    // for (int j = 0; j < s2.length(); j++) {

    // int index2 = s2.charAt(j) - 'a';
    // freq2[index2]++;

    // }

    // // Subtrai as frequências e conta o número mínimo de caracteres que precisam
    // ser
    // // removidos
    // for (int i = 0; i < 26; i++) {

    // contar += Math.abs(freq1[i] - freq2[i]);

    // }
    // return contar;
    // }

}
