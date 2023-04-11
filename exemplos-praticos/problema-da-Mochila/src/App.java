public class App {

    public static int mochila(int capacidade, int[] pesos, int[] valores, int n) {

        int[][] tabela = new int[n + 1][capacidade + 1];

        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j <= capacidade; j++) {
                
                if (i == 0 || j == 0) {
                    
                    tabela[i][j] = 0;

                } else if (pesos[i - 1] <= j) {
                    
                    tabela[i][j] = Math.max(valores[i - 1] + tabela[i - 1][j - pesos[i - 1]], tabela[i - 1][j]);

                } else {

                    tabela[i][j] = tabela[i - 1][j];
                }
            }
        }
        return tabela[n][capacidade];
    }
    public static void main(String[] args) throws Exception {

        int capacidade = 10;
        int[] pesos = { 2, 3, 4, 5};
        int[] valores = { 10, 20, 30, 40};
        int n = pesos.length;

        int maxValor = mochila(capacidade, pesos, valores, n);

        System.out.println("Valor máximo que pode ser transportado:" + maxValor);
    }
}
