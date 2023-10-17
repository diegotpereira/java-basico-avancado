public class Resultado {

// Dado duas sequências de caracteres, a tarefa é encontrar 
// o tamanho da Maior Subsequência Comum (LCS - Longest Common Subsequence) 
// que pode ser obtida ao remover caracteres de ambas as sequências.

// Uma subsequência comum é uma sequência de caracteres que 
// aparece em ambas as sequências na mesma ordem, mas não 
// necessariamente de forma contígua.

// A entrada provavelmente seria algo como duas strings, 
// e você precisa calcular e retornar o tamanho da LCS.

// A abordagem típica para resolver esse tipo de problema 
// envolve a utilização de programação dinâmica. Isso envolve 
// a criação de uma matriz para armazenar os comprimentos 
// das LCSs entre várias combinações de prefixos das sequências de entrada.

    public static int tutzkiAndLcs(String a, String b) {

        // Obtém os comprimentos das strings a e b
        int m = a.length();
        int n = b.length();

        // Cria matrizes para armazenar os comprimentos das subsequências comuns
        int[][] dp = new int[m + 1][n + 1];
        int[][] dp1 = new int[m + 1][n + 1];

        // Preenche a primeira matriz usando a abordagem de programação dinâmica
        for (int i = 0; i < m; i++) 

            for (int j = 0; j < n; j++) {
                
                if (a.charAt(i) == b.charAt(j)) {
                    
                    dp[i + 1][j + 1] = dp[i][j] + 1;

                } else {

                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);

                }
            }

            // Preenche a segunda matriz de trás para frente
            for (int i = m - 1; i >= 0; i--) 
                
                for (int j = n - 1; j >= 0; j--) {
                    
                    if (a.charAt(i) == b.charAt(j)) {
                        
                        dp1[i][j] = dp1[i + 1][j + 1] + 1;

                    } else {

                        dp1[i][j] = Math.max(dp1[i][j + 1], dp1[i + 1][j]);
                    }

                }
            
                // Inicializa variáveis para armazenar os resultados
                int atual = dp[m][n];
                int ret = 0;

                // Calcula o número de subsequências possíveis
                for (int i = 0; i <= m; i++) {
                    
                    boolean[] usado = new boolean[256];

                    for (int j = 0; j < n; j++) {
                        
                        if (usado[b.charAt(j)]) {
                            
                            continue;

                        }

                        int agora = dp[i][j] + dp1[i][j + 1] + 1;

                        if (agora == atual + 1) {
                            
                            usado[b.charAt(j)] = true;
                            ret++;
                        }
                    }
                }
        
        // Retorna o resultado final
        return ret;
    }
    
}
