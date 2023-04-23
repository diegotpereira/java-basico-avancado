import java.util.*;

public class Teste {

    public static String reverterString(String s) {

        StringBuilder rev = new StringBuilder(s);

        rev.reverse();

        return rev.toString();
    }

    public static boolean verificarPalindromo(String s) {

        StringBuilder rev = new StringBuilder(s);

        rev.reverse();

        return s.equals(rev.toString());
    }

    public static boolean verificarAnagrama(String s1, String s2) {

        if (s1.length() != s2.length()) {

            return false;
        }

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();

        palavras.add("arara");
        palavras.add("asa");
        palavras.add("banana");

        for (String palavra : palavras) {

            String palavraRevertida = reverterString(palavra);

            if (verificarPalindromo(palavraRevertida)) {

                System.out.println(palavra + " é um palindromo.");

            } else {

                System.out.println(palavra + " não é um palindromo.");
            }
        }

        List<String> lista1 = Arrays.asList("amor", "cão", "futebol");
        List<String> lista2 = Arrays.asList("roma", "não", "botafogo");

        for (String s1 : lista1) {

            for (String s2 : lista2) {

                if (verificarAnagrama(s1, s2)) {

                    System.out.println(s1 + " e " + s2 + " são anagramas");

                }
            }
        }

    }
}
