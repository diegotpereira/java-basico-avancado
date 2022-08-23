public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("indexOf - Permite localizar a primeira ocorrência de uma sequência de caracteres em uma string.");

        String str_Amostra = "Este é o índice de exemplo";

        // Posição do caracter
        System.out.println("O Indice do caracter 'x': " + str_Amostra.indexOf('x'));
        
        // Caractere na posição após determinado valor de índice
        System.out.println("O indice do caracter 's' depois de 3 indice: " + str_Amostra.indexOf('s', 3));

        // Dê a posição do índice para a substring fornecida
        System.out.println("O indice da substring 'é': " + str_Amostra.indexOf('é'));

        // Dê a posição do índice para a substring fornecida e inicie o índice
        System.out.println("O indice da substring 'é': " + str_Amostra.indexOf("é", 5));
    }
}
