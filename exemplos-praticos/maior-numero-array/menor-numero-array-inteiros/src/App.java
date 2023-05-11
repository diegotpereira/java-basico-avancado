public class App {
    public static void main(String[] args) throws Exception {
        
        // Declaração e inicialização de um array de inteiros
        int[] numeros = {10, 5, 8, 20, 3};

        // Inicialização da variável 'maior' com o primeiro elemento do array
        int maior = numeros[0];

        // Loop para percorrer os elementos do array
        for (int i = 1; i < numeros.length; i++) {
            
            // Verifica se o elemento atual é maior que o 'maior' atual
            if (numeros[i] > maior) {
                
                // Atualiza o valor de 'maior' com o elemento atual
                maior = numeros[i];
            }
        }

        // Imprime o resultado
        System.out.println("O maior número é: " + maior);
    }
}
