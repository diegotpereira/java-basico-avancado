import java.util.stream.IntStream;

// O problema consiste em determinar o índice de um caractere em uma string que pode ser removido para que a string se torne um palíndromo. Um palíndromo é uma palavra ou frase que é lida da mesma maneira da esquerda para a direita e da direita para a esquerda. Por exemplo, "aba" e "radar" são palíndromos.

// A ideia é verificar se a string já é um palíndromo. Se não for, pode haver duas possibilidades:

// Remover um caractere da posição inicial pode tornar a string um palíndromo.
// Remover um caractere da posição final pode tornar a string um palíndromo.
// Se nenhuma das duas opções acima funcionar, a última opção é comparar o caractere na posição inicial e o caractere na posição final. Se a diferença entre o caractere na posição inicial e 'a' for menor que a diferença entre o caractere na posição final e 'a', o caractere na posição final pode ser removido para tornar a string um palíndromo. Caso contrário, o caractere na posição inicial pode ser removido.

// Se a string já for um palíndromo, não há necessidade de remover nenhum caractere e o valor -1 é retornado.

// Método para encontrar o índice de um caractere que pode ser removido para tornar a string um palíndromo

public class Resultado {

    public static int palindromeIndex(String s) {

        // Verifica se a string é nula ou vazia
        if (s == null || s.length() == 0) {
            return -1;
        }

        // Verifica se a string é um palíndromo
        if (isPalindrome(s)) {

            return -1;
        }

        // Utiliza Stream para filtrar o índice do primeiro caractere que não faz parte
        // de um palíndromo
        return IntStream.range(0, s.length())
                .filter(i -> isPalindrome(s.substring(0, i) + s.substring(i + 1)))
                .findFirst()
                .orElse(-1);
    }

    public static boolean isPalindrome(String s) {

        // Verifica se a string é um palíndromo
        if (s == null || s.length() == 0) {
            return false;
        }

        // Verifica se a string é um palíndromo
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    // // Método para encontrar o índice do primeiro caractere que pode ser removido
    // // para tornar a string um palíndromo ou -1 se já for um palíndromo
    // public static int palindromeIndex(String s) {

    // // Cria um StringBuilder com a string original
    // StringBuilder f = new StringBuilder(s);

    // // Cria um StringBuilder com a string original invertida
    // StringBuilder r = new StringBuilder(s).reverse();

    // // Verifica se a string original é um palíndromo
    // if (s.equals(r.toString())) {

    // // Se for um palíndromo, retorna -1
    // return -1;
    // }

    // // Percorre a string original
    // for (int i = 0; i < s.length(); i++) {

    // // Verifica se o caractere atual em f é diferente do caractere atual em r
    // if (f.charAt(i) != r.charAt(i)) {

    // // Se o caractere atual em f for removido e a string resultante for um
    // // palíndromo, retorna o índice atual
    // if (ehPalindrome(f.deleteCharAt(i).toString())) {

    // return i;

    // // Se o caractere atual em r for removido e a string resultante for um
    // // palíndromo, retorna o índice correspondente na string original
    // } else if (ehPalindrome(r.deleteCharAt(i).toString())) {

    // return s.length() - 1 - i;
    // }
    // }
    // }

    // // Se não houver um caractere que possa ser removido para tornar a string um
    // // palíndromo, retorna -1
    // return -1;
    // }

    // // Método para verificar se uma string é um palíndromo
    // public static boolean ehPalindrome(String s) {

    // // Retorna verdadeiro se a string original for igual a string invertida
    // return s.equals(new StringBuilder(s).reverse().toString());
    // }

    // public static int palindromeIndex(String s) {

    // // Inicializa variáveis de índice inicial e final
    // int inicial = 0;
    // int fim = s.length() - 1;

    // // Loop para verificar se a string é um palíndromo
    // while (inicial < fim) {

    // // Se o caractere na posição inicial é diferente do caractere na posição
    // final
    // if (s.charAt(inicial) != s.charAt(fim)) {

    // // Verifica se a string se torna um palíndromo ao remover o caractere na
    // posição
    // // inicial + 1
    // if (ehPalindrome(s, inicial + 1, fim)) {

    // return inicial;

    // // Verifica se a string se torna um palíndromo ao remover o caractere na
    // posição
    // // final - 1
    // } else if (ehPalindrome(s, inicial, fim - 1)) {

    // return fim;

    // // Se não for possível tornar a string um palíndromo ao remover apenas um
    // // caractere, verifica a diferença entre os caracteres da posição inicial e
    // // final
    // } else {

    // // Se a diferença entre o caractere da posição inicial e 'a' for menor que a
    // // diferença entre o caractere da posição final e 'a', retorna o índice da
    // // posição final
    // int dif1 = s.charAt(inicial) - 'a';
    // int dif2 = s.charAt(fim) - 'a';

    // if (dif1 < dif2) {

    // return fim;

    // } else {

    // // Caso contrário, retorna o índice da posição inicial
    // return inicial;
    // }
    // }
    // }

    // // Incrementa o índice inicial e decrementa o índice final para continuar a
    // // verificação dos caracteres
    // inicial++;
    // fim--;
    // }

    // // Se a string já é um palíndromo, retorna -1
    // return -1;
    // }

    // // Método para verificar se uma substring é um palíndromo
    // public static boolean ehPalindrome(String s, int inicial, int fim) {

    // // Loop para verificar se a substring é um palíndromo
    // while (inicial < fim) {

    // // Se o caractere na posição inicial é diferente do caractere na posição
    // final,
    // // a substring não é um palíndromo
    // if (s.charAt(inicial) != s.charAt(fim)) {

    // return false;
    // }

    // // Incrementa o índice inicial e decrementa o índice final para continuar a
    // // verificação dos caracteres da substring
    // inicial++;
    // fim--;
    // }

    // // Se a substring for um palíndromo, retorna true
    // return true;
    // }

}
