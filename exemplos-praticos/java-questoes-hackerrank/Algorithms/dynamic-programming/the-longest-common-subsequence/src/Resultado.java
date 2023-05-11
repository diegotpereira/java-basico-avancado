import java.util.*;
// A tarefa do problema "Dynamic Programming Classics: The Longest 
// Common Subsequence" é encontrar o tamanho da maior subsequência 
// comum entre duas sequências de números. Uma subsequência comum 
// é uma sequência que pode ser obtida a partir das duas sequências 
// originais removendo-se alguns elementos, sem alterar a ordem dos elementos restantes.

// O problema recebe duas sequências de números, A e B, e o objetivo 
// é determinar o tamanho da maior subsequência comum entre elas. Por 
// exemplo, se A = [1, 2, 3, 4, 5] e B = [2, 4, 6, 8], a maior subsequência 
// comum entre elas é [2, 4], e o tamanho dessa subsequência é 2.

// A solução envolve a aplicação da programação dinâmica. É necessário 
// construir uma matriz de dimensões (M+1) x (N+1), onde M e N são os 
// tamanhos das sequências A e B, respectivamente. Cada elemento da matriz 
// representa o tamanho da maior subsequência comum até aquele ponto.

// A matriz é preenchida iterativamente, comparando-se os elementos das 
// sequências A e B. Se os elementos forem iguais, o valor correspondente 
// na matriz é atualizado para o valor na diagonal superior esquerda mais 1. 
// Caso contrário, o valor é definido como o máximo entre o valor acima e o 
// valor à esquerda na matriz.

// No final, o valor na posição (M+1, N+1) da matriz representa o tamanho da 
// maior subsequência comum entre as sequências A e B, e esse valor é retornado 
// como resultado.

// Em resumo, a tarefa é determinar o tamanho da maior subsequência comum entre 
// duas sequências de números usando programação dinâmica.

public class Resultado {

    public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {

        // Obter o tamanho das listas a e b
        int m = a.size();
        int n = b.size();

        // Matriz dp para armazenar os pares (contagem, sequência) para
        // cada combinação de elementos
        Par[][] dp = new Par[m + 1][n + 1];

        // Inicializando a matriz dp com pares (0, "") em todas as células
        for (int i = 0; i <= m; i++) {

            dp[i] = new Par[n + 1];

            for (int j = 0; j <= n; j++) {

                dp[i][j] = new Par(0, "");

            }
        }

        // Preenchendo a matriz dp
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (a.get(i - 1).equals(b.get(j - 1))) {

                    // Se os elementos forem iguais, incrementa o contador e concatena a sequência
                    dp[i][j] = new Par(1 + dp[i - 1][j - 1].contar, dp[i - 1][j - 1].sequencia + " " + a.get(i - 1));

                } else {

                    // Caso contrário, escolhe o máximo entre os contadores dos elementos anteriores
                    if (dp[i - 1][j].contar > dp[i][j - 1].contar) {

                        dp[i][j] = dp[i - 1][j];

                    } else {

                        dp[i][j] = dp[i][j - 1];

                    }
                }
            }
        }

        // Converter a sequência em um ArrayList de inteiros
        String[] sequenciaArr = dp[m][n].sequencia.substring(1).split(" ");

        List<Integer> resultado = new ArrayList<>();

        for (String num : sequenciaArr) {
            resultado.add(Integer.parseInt(num));
        }

        // Retornar a sequência comum mais longa
        return resultado;
    }

    // Classe Pair para representar um par (contagem, sequência)
    static class Par {
        int contar;
        String sequencia;

        // Construtor da classe Pair
        Par(int contar, String sequencia) {
            this.contar = contar;
            this.sequencia = sequencia;
        }
    }

    // public static List<Integer> longestCommonSubsequence(List<Integer> a,
    // List<Integer> b) {

    // // Lista para armazenar a subsequência comum mais longa
    // List<Integer> resposta = new ArrayList<>();

    // // Matriz para armazenar os comprimentos das subsequências comuns
    // int[][] dp = new int[a.size() + 1][b.size() + 1];

    // // Inicialização da primeira linha da matriz dp
    // for (int i = 0; i <= a.size(); i++) {

    // dp[i][0] = 0;
    // }

    // // Inicialização da primeira coluna da matriz dp
    // for (int i = 0; i <= b.size(); i++) {

    // dp[0][i] = 0;
    // }

    // // Preenchimento da matriz dp
    // for (int i = 1; i <= a.size(); i++) {

    // for (int j = 1; j <= b.size(); j++) {

    // // Se os elementos forem iguais,
    // if (a.get(i - 1) == b.get(j - 1)) {

    // // incrementa o comprimento da subsequência comum
    // dp[i][j] = 1 + dp[i - 1][j - 1];

    // // Caso contrário,
    // } else {

    // // escolhe o máximo entre os comprimentos das subsequências anteriores
    // dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
    // }
    // }
    // }

    // int i = a.size();
    // int j = b.size();

    // // Reconstrução da subsequência comum mais longa
    // while (i > 0 && j > 0) {

    // if (a.get(i - 1) == b.get(j - 1)) {

    // // Adiciona o elemento à subsequência comum
    // resposta.add(a.get(i - 1));

    // i--;
    // j--;

    // } else {

    // if (dp[i - 1][j] > dp[i][j - 1]) {

    // // Move para a célula acima
    // i--;

    // } else {

    // // Move para a célula à esquerda
    // j--;
    // }
    // }
    // }

    // // Inverte a ordem da subsequência
    // Collections.reverse(resposta);

    // // Retorna a subsequência comum mais longa
    // return resposta;
    // }

}
