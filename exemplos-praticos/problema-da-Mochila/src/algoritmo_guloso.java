public class algoritmo_guloso {

    // array de inteiros valores disponíveis das moedas.
    public static int[] moedas = {1, 5, 10, 25, 50};

    public static void encontrarTroco(int valor) {

        // maior valor de moeda disponível
        int i = moedas.length - 1;

        // enquanto o valor do troco é maior do que zero e o índice é maior ou igual a zero.
        while (valor > 0 && i >= 0) {
            
            // verificamos se a moeda atual é menor ou igual ao valor restante do troco. 
            if (moedas[i] <= valor) {
                
                // Se for, imprimimos uma mensagem na tela informando que estamos usando a moeda e subtraímos seu valor do troco restante.
                System.out.println("Usando moeda de " + moedas[i] + " centavos");
                valor -= moedas[i];

            } else {

                // Caso contrário, passamos para a próxima moeda, diminuindo o índice i.
                i--;
            }
        }
    }
    
    public static void main(String[] args) {
        
        int troco = 57;

        encontrarTroco(troco);
    }
}
