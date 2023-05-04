// A tarefa do problema "Common Child" em HackerRank é encontrar o comprimento
// da maior sequência comum de caracteres entre duas strings dadas.

// Dado duas strings s1 e s2, a ideia é encontrar o comprimento da maior
// subsequência que é comum a ambas as strings, ou seja, a maior subsequência
// que aparece em ambas as strings na mesma ordem, mas não necessariamente
// consecutivamente. Por exemplo, se s1 é "ABCD" e s2 é "ACDF", a maior
// subsequência comum é "ACD" e seu comprimento é 3.

// O programa deve ler duas strings s1 e s2 como entrada e imprimir um único
// número, que é o comprimento da maior subsequência comum. O tamanho máximo das
// strings é de 5000 caracteres.

// Este é um problema clássico de programação dinâmica e pode ser resolvido
// usando a técnica de tabela de programação dinâmica.

public class Resultado {

    public static int commonChild(String s1, String s2) {

        // Obtém o comprimento de cada string
        int n = s1.length();
        int m = s2.length();

        // Cria uma matriz para armazenar o comprimento da maior subsequência comum
        // entre os sufixos de s1 e s2
        int LCS[][] = new int[n + 1][m + 1];

        // Percorre as strings de trás para frente, preenchendo a matriz LCS
        for (int i = n - 1; i >= 0; i--) {

            for (int j = m - 1; j >= 0; j--) {

                // Se os caracteres das strings s1 e s2 na posição i e j são iguais, incrementa
                // a LCS na posição (i,j)
                if (s1.charAt(i) == s2.charAt(j)) {

                    LCS[i][j] = 1 + LCS[i + 1][j + 1];

                    // Senão, armazena o máximo entre LCS[i+1][j] e LCS[i][j+1] na posição (i,j)
                } else {

                    LCS[i][j] = Math.max(LCS[i + 1][j], LCS[i][j + 1]);
                }
            }
        }

        // Retorna o comprimento da maior subsequência comum entre as strings s1 e s2
        return LCS[0][0];
    }

    // public static int commonChild(String s1, String s2) {

    // // cria uma tabela de programação dinâmica com tamanho (s1.length() + 1) x
    // // (s2.length() + 1)
    // int[][] tabela = new int[s1.length() + 1][s2.length() + 1];

    // // percorre cada posição da tabela
    // for (int i = 0; i <= s1.length(); i++) {

    // for (int j = 0; j <= s2.length(); j++) {

    // // inicializa as bordas da tabela com valor 0
    // if (i == 0 || j == 0) {

    // tabela[i][j] = 0;

    // // se os caracteres s1[i-1] e s2[j-1] são iguais, adiciona 1 ao valor
    // anterior
    // // na diagonal da tabela
    // } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {

    // tabela[i][j] = tabela[i - 1][j - 1] + 1;

    // // se os caracteres são diferentes, o valor é o máximo entre o valor acima e
    // o
    // // valor à esquerda
    // } else {

    // tabela[i][j] = Math.max(tabela[i - 1][j], tabela[i][j - 1]);
    // }

    // }
    // }

    // // retorna o valor da última posição da tabela, que contém o comprimento da
    // // maior subsequência comum
    // return tabela[s1.length()][s2.length()];
    // }

}
