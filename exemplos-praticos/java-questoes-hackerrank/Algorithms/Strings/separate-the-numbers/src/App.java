import java.io.*;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {

                String s = bufferedReader.readLine();

                Resultado.separateNumbers(s);

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
    }
}

class Resultado {

    // O objetivo principal do programa é encontrar uma sequência de números em uma
    // string, onde cada número subsequente na sequência é um a mais do que o
    // anterior.

    public static void separateNumbers(String s) {

        // Laço para iterar através da string "s" e encontrar a menor sequência
        // "primeira"
        for (int n = 1; n < s.length(); n++) {

            // Obter a primeira substring de "s"
            String primeira = s.substring(0, n);

            // Converter a substring para um objeto BigInteger
            BigInteger segunda = new BigInteger(primeira);

            // Definir um índice para rastrear o progresso na string "s"
            int idx = n;

            // Laço para adicionar a sequência "primeira" em incrementos à "segunda" e
            // verificar se a próxima sequência coincide com a próxima substring de "s"
            while (true) {

                // Adicionar a sequência "primeira" a "segunda"
                segunda = segunda.add(BigInteger.ONE);

                // Verificar se a próxima sequência coincide com a próxima substring de "s"
                if (s.indexOf(segunda.toString(), idx) == idx) {

                    // Atualizar o índice para acompanhar o progresso na string "s"
                    idx += segunda.toString().length();

                } else {

                    // Se a próxima sequência não coincidir, sair do laço interno
                    break;
                }

                // Se a string "s" for percorrida completamente, imprimir "YES" e a sequência
                // "primeira" correspondente
                if (idx == s.length()) {

                    System.out.println("YES " + primeira);

                    return;
                }
            }
        }

        // Se não houver correspondência, imprimir "NO"
        System.out.println("NO");
    }

    // public static void separateNumbers(String s) {

    // // Laço for que percorre todas as possíveis substrings da string s
    // for (int n = 1; n < s.length() / 2 + 1; n++) {

    // // Obtém a substring da posição 0 até a posição n da string s
    // String substr = s.substring(0, n);

    // // Cria um objeto BigInteger a partir da substring obtida acima
    // BigInteger numero = new BigInteger(substr);

    // int idx = n;

    // // Laço while que percorre a string s em busca de números sequenciais a
    // partir
    // // da substring obtida
    // while (true) {

    // // Adiciona 1 ao objeto BigInteger "numero"
    // numero = numero.add(BigInteger.ONE);

    // // Verifica se a string s possui a string do objeto BigInteger "numero" a
    // partir
    // // da posição "idx"
    // if (s.indexOf(numero.toString(), idx) == idx) {

    // // Atualiza a posição "idx" para o final da string do objeto BigInteger
    // "numero"
    // idx += numero.toString().length();

    // } else {

    // break;
    // }

    // // Se a posição "idx" for igual ao comprimento da string s, então encontramos
    // // uma sequência válida
    // if (idx == s.length()) {

    // System.out.println("YES " + substr);

    // return;
    // }
    // }
    // }

    // // Se não encontrarmos nenhuma sequência válida, então a resposta é "NO"
    // System.out.println("NO");
    // }
}