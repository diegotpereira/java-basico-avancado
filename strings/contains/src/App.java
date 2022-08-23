public class App {
    public static void main(String[] args) throws Exception {

        String str_Amostra = "Esta é uma String contém Exemplo";

        // Verifique se String contém uma sequência
        System.out.println("Contém a sequência 'ing': " + str_Amostra.contains("ing"));

        // A string contém o método diferencia maiúsculas de minúsculas
        System.out.println("Contém a sequência 'exemplo': " + str_Amostra.contains("exemplo"));
    }
}
