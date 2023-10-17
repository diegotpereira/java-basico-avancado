public class App {
    public static void main(String[] args) throws Exception {

        // Defina uma string que você deseja verificar se é um palíndromo
        String[] palavras = {"bola", "radar"};

        for (String string : palavras) {
            
            // Chame a função para verificar se a string é um palíndromo
            boolean resultado = ehPalindrome(string);

            // Verifique o resultado e imprima uma mensagem apropriada
            if (resultado) {
                
                System.out.println("A palavra " + string + " não é palindrome ");

            } else {

                System.out.println("A palavra " + string + " é palindrome ");

            }
        }

    }

    public static boolean ehPalindrome(String str) {

        // Remova todos os caracteres não alfabéticos da string e torne-a minúscula
        str = str.replaceAll("[^a-zA-Z]", "");
        int esquerda = 0;
        int direita = str.length() - 1;

        // Verifique se a string é um palíndromo
        while (esquerda < direita) {
            
            if (str.charAt(esquerda) != str.charAt(direita)) {
                
                // Se os caracteres nas extremidades não coincidirem, não é um palíndromo
                return false;
            }

            esquerda++;
            direita--;
        }

        // Se o loop terminar sem retornar "false", a string é um palíndromo
        return true;
    }
}
