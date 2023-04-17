import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                String s = bufferedReader.readLine();

                String resultado = Resultado.funnyString(s);

                bufferedWriter.write(resultado);
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

    // consiste em iterar por pares de caracteres da string, verificando se a
    // diferença absoluta entre os dois caracteres atuais é a mesma que a diferença
    // absoluta entre os dois caracteres correspondentes da string inversa. Se em
    // algum momento a diferença não for a mesma, a função retorna "Not Funny". Caso
    // contrário, retorna "Funny".

    public static String funnyString(String s) {

        int n = s.length();

        // Cria um fluxo de inteiros de 0 a n/2 e atribui a variável isFunny
        boolean isFunny = IntStream.range(0, n / 2).allMatch(i -> { // erifica se todos os elementos do fluxo satisfazem
                                                                    // a condição dada, que neste caso é uma expressão
                                                                    // lambda que recebe como parâmetro um índice i e
                                                                    // retorna um valor booleano.

            // Obtém o valor absoluto da diferença entre o caractere atual e o próximo
            // caractere da string de entrada e armazena em uma variável d1.
            int d1 = Math.abs(s.charAt(i + 1) - s.charAt(i));

            // Obtém o valor absoluto da diferença entre o caractere atual (contando a
            // partir do final da string) e o caractere anterior a ele e armazena em uma
            // variável d2.
            int d2 = Math.abs(s.charAt(n - i - 1) - s.charAt(n - i - 2));

            return d1 == d2;
        });

        // Retorna um valor booleano que indica se as diferenças d1 e d2 são iguais.
        return isFunny ? "FUNNY" : "NOT FUNNY";
    }

    // public static String funnyString(String s) {

    // // Loop que itera por pares de caracteres da string, utilizando "i" para
    // // percorrer a string da esquerda para a direita e "j" para percorrer da
    // direita
    // // para a esquerda

    // for (int i = 0, j = s.length() - 1; i < s.length() - 1; i += 2, j -= 2) {

    // // Verifica se a diferença absoluta entre os dois caracteres atuais é
    // diferente
    // // da diferença absoluta entre os dois caracteres correspondentes da string
    // // inversa
    // if (Math.abs(((int) s.charAt(i) - (int) s.charAt(i + 1))) != Math
    // .abs((int) s.charAt(j) - (int) s.charAt(j - 1))) {

    // // Retorna "Not Funny" se a diferença não for a mesma nos dois pares de
    // // caracteres
    // return "NOT FUNNY";
    // }
    // }

    // // Retorna "Funny" se todas as diferenças forem iguais
    // return "FUNNY";
    // }

    // public static String funnyString(String s) {

    // // Obtém o comprimento da string de entrada e armazena na variável "n"
    // int n = s.length();

    // // Loop que itera pela metade da string de entrada
    // for (int i = 0; i < n / 2; i++) {

    // // Calcula a diferença absoluta entre o caractere atual e o próximo caractere
    // int d1 = Math.abs(s.charAt(i + 1) - s.charAt(i));

    // // Calcula a diferença absoluta entre o caractere atual do final da string e
    // o
    // // caractere anterior
    // int d2 = Math.abs(s.charAt(n - i - 1) - s.charAt(n - i - 2));

    // // Compara as diferenças e verifica se são iguais
    // if (d1 != d2) {

    // // Retorna "NOT FUNNY" se as diferenças não forem iguais
    // return "NOT FUNNY";
    // }
    // }

    // // Retorna "FUNNY" se todas as diferenças forem iguais
    // return "FUNNY";
    // }

}