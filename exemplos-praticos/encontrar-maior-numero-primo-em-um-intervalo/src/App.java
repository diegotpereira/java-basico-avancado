public class App {
    public static void main(String[] args) throws Exception {

        // Defina o intervalo inicial e final
        int inicial = 1;
        int fim = 9;

        // Encontre o maior número primo no intervalo
        int resultado = encontrarMaiorPrime(inicial, fim);

        // Exiba o resultado
        System.out.println("O maior primo da faixa [" + inicial + ", " +  fim + "]: " + resultado);
    }

    public static boolean encontrarPrimo(int n) {

        // Verifique se n é menor ou igual a 1 (não é primo)
        if (n <= 1) {
            
            return false;
        }

        // Verifique se n é divisível por algum número no intervalo de 2 a sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            
            if (n % i == 0) {
                
                return false;
            }
        }

        // Se não for divisível por nenhum número, é um número primo
        return true;
    }

    public static int encontrarMaiorPrime(int inicial, int fim) {

        // Inicialize a variável para armazenar o maior número primo
        int maiorPrimo = -1;

        // Percorra os números do intervalo em ordem decrescente
        for (int i = fim; i >= inicial; i--) {
            
            // Verifique se o número atual é primo
            if (encontrarPrimo(i)) {
                
                // Se for primo, atualize o maior número primo e encerre o loop
                maiorPrimo = i;

                break;
            }
        }

        // Retorne o maior número primo encontrado no intervalo
        return maiorPrimo;
    }
}
