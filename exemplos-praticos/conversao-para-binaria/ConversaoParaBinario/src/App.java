public class App {
    public static void main(String[] args) throws Exception {

        // Exemplo com um número inteiro
        int numeroInteiro = 42;
        String converterBinarioInteiro = Integer.toBinaryString(numeroInteiro);

        System.out.println("Representação binária de " + numeroInteiro + " é: " + converterBinarioInteiro);

        long numeroLongo = 123456789L;
        String binarioLongo = Long.toBinaryString(numeroLongo);

        System.out.println("Representação binária de " + numeroLongo + " é: " + binarioLongo);
    }
}
