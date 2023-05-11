public class Resultado {

    public static int playWithWords(String s) {

        // Obtém o tamanho da string de entrada
        int n = s.length();

        // Variável para armazenar o resultado
        int m = 0;

        // Matriz dp para armazenar os valores intermediários
        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++) {

            // Inicializa cada linha da matriz dp
            dp[i] = new int[n];

            // Define a diagonal principal como 1 (caso base para palíndromo de tamanho 1)
            dp[i][i] = 1;
        }

        for (int cl = 2; cl <= n; cl++) {

            // Percorre todos os possíveis tamanhos de palíndromos (de 2 até n)
            for (int i = 0; i < n - cl + 1; i++) {

                // Define o índice da coluna para a posição atual
                int j = i + cl - 1;

                // Se os caracteres nas extremidades são iguais e o tamanho do palíndromo é 2
                if (s.charAt(i) == s.charAt(j) && cl == 2)

                    // Define o valor como 2
                    dp[i][j] = 2;

                // Se os caracteres nas extremidades são iguais
                else if (s.charAt(i) == s.charAt(j))

                    // Incrementa o valor do palíndromo anterior e adiciona 2
                    dp[i][j] = dp[i + 1][j - 1] + 2;

                // Se os caracteres nas extremidades são diferentes
                else

                    // Escolhe o máximo entre o palíndromo excluindo o último caractere e o
                    // excluindo o primeiro caractere
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);

            }
        }

        for (int i = 0; i < n - 1; i++) {

            // Percorre todas as partições da string
            if (dp[0][i] * dp[i + 1][n - 1] > m)

                // Calcula o produto dos valores de palíndromos nas partições e verifica se é
                // maior que m
                // Atualiza o valor de m
                m = dp[0][i] * dp[i + 1][n - 1];

        }

        // Retorna o resultado final
        return m;
    }

}
