public class App {
    public static void main(String[] args) throws Exception {
        
        // Declaração e inicialização da string original
        String palavra = "Ola mundo!";

        // Declaração da string para armazenar a palavra invertida
        String invertida = "";
        
        // Loop para percorrer a string original de trás para frente
        for (int i = palavra.length() -1; i >= 0; i--) {
            
            // Adiciona cada caractere à string invertida
            invertida += palavra.charAt(i);
        }

        // Imprime a palavra invertida
        System.out.println("A palavra invertida é: " + invertida);
    }
}
