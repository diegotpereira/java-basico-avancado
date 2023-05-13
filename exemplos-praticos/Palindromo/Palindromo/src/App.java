public class App {
    public static void main(String[] args) throws Exception {

        // Declaração e inicialização da string 'palavra'
        String palavra = "radar";

        // Declaração e inicialização da variável booleana 'palindromo'
        boolean palindromo = true;

        // Loop para percorrer a string 'palavra' da esquerda para a direita e da direita para a esquerda
        for (int i = 0, j = palavra.length() - 1; i < j; i++, j--) {
            
            // Verifica se os caracteres nas posições 'i' e 'j' são diferentes
            if (palavra.charAt(i) !=  palavra.charAt(j)) { 
                
                // Define a variável 'palindromo' como false se os caracteres são diferentes
                palindromo = false;

                // Sai do loop, pois não é necessário continuar a verificação
                break;
            }
        }

        // Verifica se a variável 'palindromo' é true
        if (palindromo) {
            
            // Imprime que a palavra é um palíndromo
            System.out.println(palavra +" é um palindromo");

        } else {

            // Imprime que a palavra não é um palíndromo
            System.out.println(palavra + " não é um palindromo");
        }
    }
}
