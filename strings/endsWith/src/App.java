public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("endsWith() da string java verifica se a string termina com um sufixo especificado");

        String str_Amostra = "Java String endWith exemplo";

        // Verifique se termina com uma sequência específica
        System.out.println("EndsWith caracter 'e': " + str_Amostra.endsWith("e"));
        System.out.println("EndsWith caracter 'plo': " + str_Amostra.endsWith("plo"));
        System.out.println("EndsWith caracter 'Java': " + str_Amostra.endsWith("Java"));
    }
}
