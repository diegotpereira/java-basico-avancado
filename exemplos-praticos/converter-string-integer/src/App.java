public class App {
    public static void main(String[] args) throws Exception {

        String str_Teste = "100";

        int iTeste = Integer.parseInt(str_Teste);

        System.out.println("String Atual: " + str_Teste);
        System.out.println("Convertendo para Int: " + iTeste);

        // Isso agora mostrará algumas operações aritméticas
        System.out.println("Operação aritmética em Int: " + (iTeste/4));
    }
}
