import java.io.*;
import java.util.HashMap;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                String s = bufferedReader.readLine();

                int resultado = Resultado.alternatingCharacters(s);

                bufferedWriter.write(String.valueOf(resultado));
                bufferedWriter.newLine();

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int alternatingCharacters(String s) {

        // Math.toIntExact() é utilizado para converter o resultado do método count()
        // para um int.
        // IntStream.range(1, s.length()), que gera uma sequência de inteiros a partir
        // de 1 (inclusivo) até o comprimento da string s (exclusivo).
        return Math.toIntExact(IntStream.range(1, s.length())
                // filter() é utilizado para manter apenas os elementos da sequência que
                // satisfazem uma condição, que no caso é que o caractere na posição atual é
                // igual ao caractere na posição anterior.
                .filter(i -> s.charAt(i) == s.charAt(i - 1))
                // count() retorna o número de elementos na sequência resultante da operação de
                // filtro
                .count());
    }

    // public static int alternatingCharacters(String s) {

    // // cria um HashMap para contar os caracteres repetidos
    // HashMap<Character, Integer> contar = new HashMap<>();
    // // variável que armazena o número total de caracteres deletados
    // int somaTotal = 0;

    // // percorre todos os caracteres da string a partir do segundo caractere
    // for (int i = 1; i < s.length(); i++) {

    // // verifica se o caractere atual é igual ao anterior
    // if (s.charAt(i) == s.charAt(i - 1)) {

    // // adiciona o caractere repetido ao HashMap, se já existir, incrementa a
    // // contagem, senão, adiciona com contagem 1
    // contar.put(s.charAt(i - 1), contar.containsKey(s.charAt(i - 1)) ?
    // contar.get(s.charAt(i - 1)) + 1 : 1);
    // }
    // }

    // // corre todos os valores do HashMap
    // for (int num : contar.values()) {

    // // soma o número de caracteres repetidos
    // somaTotal += num;
    // }

    // // retorna o número total de caracteres deletados
    // return somaTotal;
    // }

    // public static int alternatingCharacters(String s) {

    // // variável que armazena o número de caracteres deletados
    // int numeroDeDeletados = 0;

    // // converte a string em um array de caracteres
    // char[] arr = s.toCharArray();

    // // percorre todos os caracteres da string
    // for (int i = 0; i < arr.length; i++) {

    // // verifica se não é o primeiro caractere
    // if (i != 0) {

    // // verifica se o caractere atual é igual ao anterior
    // if (arr[i] == arr[i - 1]) {

    // // incrementa o número de caracteres deletados
    // numeroDeDeletados++;
    // }
    // }
    // }

    // // retorna o número de caracteres deletados
    // return numeroDeDeletados;
    // }

    // public static int alternatingCharacters(String s) {

    // // variável que armazena o número de caracteres deletados
    // int resultado = 0;

    // // percorre todos os caracteres da string a partir do segundo caractere
    // for (int i = 1; i <= s.length() - 1; i++)

    // // verifica se o caractere atual é igual ao anterior
    // if (s.charAt(i) == s.charAt(i - 1))

    // // incrementa a variável resultado se houver caracteres consecutivos iguais
    // resultado++;

    // // retorna o número de caracteres deletado
    // return resultado;
    // }

}