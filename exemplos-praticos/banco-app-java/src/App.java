import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu 'Nome' e 'ClienteId' para acessar sua conta bancária:");

        String nome = teclado.nextLine();
        String clienteId = teclado.nextLine();

        BancoConta bancoConta = new BancoConta(nome, clienteId);
        bancoConta.menu();

    }
}
