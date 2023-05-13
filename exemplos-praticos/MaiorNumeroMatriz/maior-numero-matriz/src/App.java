public class App {
    public static void main(String[] args) throws Exception {
        
        // Definindo a matriz com os elementos
        int[][] matriz = {

            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
            { 10, 11, 12 },
            { 13, 14, 15 }
        };

        // Inicializando a variável para armazenar o maior número
        int maior = matriz[0][0];

        // Percorrendo a matriz para encontrar o maior número
        for(int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                
                // Verificando se o elemento atual é maior que o maior encontrado até agora
                if (matriz[i][j] > maior) {
                    
                    // Atualizando o maior número encontrado
                    maior = matriz[i][j];
                }
            }
        }

        // Imprimindo o resultado
        System.out.println("O maior número na matiz é: " + maior);
    }
}
