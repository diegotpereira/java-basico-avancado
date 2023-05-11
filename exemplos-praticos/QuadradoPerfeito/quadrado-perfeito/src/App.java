public class App {
    public static void main(String[] args) throws Exception {
        
        // Declaração e inicialização da variável 'numero'
        int numero = 9;

        // Declaração e inicialização da variável booleana 'QuadradoPerfeito'
        boolean QuadradoPerfeito = false;

        // Loop para verificar se o número é um quadrado perfeito
        for (int i = 1; i <= numero; i++) {
            
            // Verifica se o quadrado do número atual é igual a 'numero'
            if (i * i == numero) {
                
                // Define a variável 'QuadradoPerfeito' como true se for encontrado um quadrado perfeito
                QuadradoPerfeito = true;

                // Sai do loop, pois não é necessário continuar a busca
                break;
            }
        }

        // Verifica se a variável 'QuadradoPerfeito' é true
        if (QuadradoPerfeito) {
            
            // Imprime que o número é um quadrado perfeito
            System.err.println(numero + " é um QuadradoPerfeito");

        } else {

            // Imprime que o número não é um quadrado perfeito
            System.out.println(numero + " não é um QuadradoPerfeito");
        }
    }
}
