import java.util.Scanner;

public class App {

    public static void jogoAdivinhacao() {

        Scanner teclado = new Scanner(System.in);

        // gerar os números
        int numero = 1 + (int)(100 * Math.random());

        // Dadas K tentativas
        int tentativas = 5;
        
        // iniciando tentativa
        int tentativa;

        // posições
        int i;

        System.out.println(
            "Escolha um número"
             + " entre 1 a 100."
             + " Adivinhe o número"
             + " em 5 tentativas.");

             // iterar entre k tentativas
             for(i = 0; i < tentativas; i++) {
                 System.out.println("Adivinhe o número: ");

                 // Tome entrada para adivinhar
                 tentativa = teclado.nextInt();

                 // Se o número for adivinhado
                 if (numero == tentativa) {
                     
                    System.out.println("Parabéns!"
                    + " Você adivinhou o número.");
                    // se o número form maior que o número digitado 
                    // e se está ainda quarta tentativa.
                 } else if (numero > tentativa && i != tentativas -1) {
                     
                    System.out.println("O número é "
                    + "maior que " + tentativa);
                 } else if (numero < tentativa && i != tentativas - 1) {
                     
                    System.out.println("O número é"
                    + " menor que " + tentativa);
                 }
             }
             if (i == tentativas) {
                 System.out.println("Você esgotou"
                 + " seu número de tentativas.");

                 System.out.println("O número foi " + numero);
             }
    }
    public static void main(String[] args) throws Exception {
        jogoAdivinhacao();
    }
}
