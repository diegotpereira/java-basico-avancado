public class App {
    public static void main(String[] args) throws Exception {

        String str_teste = "100";

        // Converta a String para Integer usando Integer.valueOf
        int iTeste = Integer.valueOf(str_teste);

        System.out.println("Atual String: " + str_teste);
        System.out.println("Convertendo para int:" + iTeste);
        
        // Isso agora mostrará algumas operações aritméticas
        System.out.println("Operação aritmética em Int: " + (iTeste / 4));
    }
}
