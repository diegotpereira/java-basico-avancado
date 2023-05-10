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

        int n = a.size();
        int m = b.size();

        // int n = a.length, m = b.length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {

            for (int j = 0; j <= n; j++) {
                if (j == 0 || i == 0) {
                    dp[i][j] = 0;
                } else if (a.get(j - 1) == b.get(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        int index = dp[m][n];
        // int[] res = new int[index];
        List<Integer> res = new ArrayList<>();

        int i = n, j = m;
        while (i > 0 && j > 0) {

            if (a.get(i - 1) == b.get(j - 1)) {
                res[index - 1] = a.get(i - 1);
                index--;
                i--;
                j--;
            } else if (dp[j - 1][i] > dp[j][i - 1]) {
                j--;
            } else {
                i--;
            }
        }
        return res;

        // List<Integer> dp[][] = new ArrayList[n + 1][m + 1];

        // for (int i = 0; i <= n; i++) {

        // for (int j = 0; j <= m; j++) {

        // dp[i][j] = new ArrayList<>();
        // }
        // }

        // for (int i = 0; i <= n; i++) {

        // for (int j = 0; j <= m; j++) {

        // if (i == 0 || j == 0)

        // dp[i][j].add(0);

        // else {

        // int x = a.get(i - 1), y = b.get(j - 1);
        // if (x == y) {

        // dp[i][j].addAll(dp[i - 1][j - 1]);
        // dp[i][j].add(a.get(i - 1));

        // } else {

        // if (dp[i - 1][j].size() >= dp[i][j - 1].size()) {

        // dp[i][j].addAll(dp[i - 1][j]);

        // } else {

        // dp[i][j].addAll(dp[i][j - 1]);

        // }
        // }
        // }
        // }

        // }

        // dp[n][m].remove(0);
        // return dp[n][m];

        // int m = a.size();
        // int n = b.size();

        // int t[][] = new int[m + 1][n + 1];
        // // base code or initialization
        // for (int i = 0; i < m + 1; i++) {
        // for (int j = 0; j < n + 1; j++) {
        // if (i == 0 || j == 0) {
        // t[i][j] = 0;
        // }
        // }

        // }
        // for (int i = 1; i < m + 1; i++) {
        // for (int j = 1; j < n + 1; j++) {
        // if (a.get(i - 1) == b.get(j - 1)) {
        // t[i][j] = 1 + t[i - 1][j - 1];
        // } else {
        // t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);

        // }

        // }
        // }
        // List<Integer> res = new ArrayList<>();
        // int i = m;
        // int j = n;
        // while (i > 0 && j > 0) {

        // if (a.get(i - 1) == b.get(j - 1)) { // matrix is compulsory to understand
        // this

        // // push stat

        // res.add(a.get(i - 1));
        // // s+=s+Character.toString(x.charAt(i-1));
        // i--;
        // j--;
        // } else {

        // if (t[i][j - 1] > t[i - 1][j]) { // make matrix to understand this

        // j--;
        // } else {
        // i--;
        // }

        // }

        // }
        // Collections.reverse(res);
        // return res;

        // int n = a.size(), m = b.size();
        // // vector<vector<int>> dp(n+1, vector<int> (m+1, 0));
        // int[][] dp = new int[n + 1][m + 1];
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (a.get(i - 1) == b.get(j - 1))
        // dp[i][j] = 1 + dp[i - 1][j - 1];
        // else {
        // dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        // }
        // }
        // }
        // int i = n, j = m;
        // // vector<int> ans;
        // ArrayList<Integer> ans = new ArrayList<>();
        // while (i > 0 && j > 0) {
        // if (a.get(i - 1) == b.get(j - 1)) {
        // ans.add(a.get(i - 1));
        // i -= 1;
        // j -= 1;
        // } else {
        // if (dp[i - 1][j] > dp[i][j - 1])
        // i--;
        // else
        // j--;
        // }
        // }

        // Collections.reverse(ans);
        // return ans;

        // int[] arr1 = new int[a.size()];
        // int[] arr2 = new int[b.size()];

        // for (int i = 0; i < a.size(); i++) {

        // arr1[i] = a.get(i);
        // }

        // for (int i = 0; i < b.size(); i++) {

        // arr2[i] = b.get(i);
        // }

        // int n = arr1.length;
        // int m = arr2.length;
        // int[][] dp = new int[n + 1][m + 1];

        // for (int i = 0; i < m + 1; i++) {

        // for (int j = 0; j < n + 1; j++) {

        // if (i == 0 || j == 0) {

        // dp[i][j] = 0;

        // }
        // }
        // }

        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= m; j++) {

        // if (arr1[i - 1] == arr2[j - 1]) {

        // dp[i][j] = 1 + dp[i - 1][j - 1];

        // } else

        // dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        // }
        // }
        // ArrayList<Integer> resposta = new ArrayList<>();
        // int i = n;
        // int j = m;

        // while (i > 0 && j > 0) {

        // if (arr1[i - 1] == arr2[j - 1]) {

        // resposta.add(arr1[i - 1]);
        // i -= 1;
        // j -= 1;

        // } else {

        // if (dp[i - 1][j] > dp[i][j - 1])
        // i--;
        // else
        // j--;

        // // if (dp[i][j - 1] > dp[i - 1][j]) {

        // // // resposta.add(arr2[j - 1]);
        // // j--;

        // // } else

        // // // resposta.add(arr1[i - 1]);
        // // i--;
        // }
        // }

        // Collections.reverse(resposta);

        // return resposta;
    }

}
