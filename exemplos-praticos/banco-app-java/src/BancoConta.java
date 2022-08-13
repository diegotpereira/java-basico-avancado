import java.util.Scanner;

public class BancoConta {
    
    double balanco;
    double anteriorTransacao;
    String clienteNome;
    String clienteId;

    public BancoConta(String clienteNome, String clienteId) {
        this.clienteNome = clienteNome;
        this.clienteId = clienteId;
    }
    void menu() {

        char opcao;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo: " + clienteNome);
        System.out.println("Seu Id: " + clienteId);
        System.out.println("\n");
        System.out.println("a) Verificar saldo");
        System.out.println("b) Valor do depósito");
        System.out.println("c) Retirar montante");
        System.out.println("d) Transação anterior");
        System.out.println("e) Sair");

        do {

            System.out.println("**********************");
            System.out.println("Escolha uma opção");
            opcao = teclado.next().charAt(0);
            System.out.println("\n");

            switch (opcao) {
                case 'a':
                    System.out.println(".................................");
                    System.out.println("Balanço : " + balanco);
                    System.out.println(".................................");
                    System.out.println("\n");

                    break;

                case 'b':
                   System.out.println(".................................");
                   System.out.println("Insira um valor para depositar : ");
                   System.out.println(".................................");
                   double valorDeposito = teclado.nextDouble();

                   depositar(valorDeposito);
                   System.out.println("\n");

                   break;

                case 'c':
                    System.out.println(".................................");
                    System.out.println("Insira um valor para sacar :     ");
                    double valorSaque = teclado.nextDouble();
                    sacar(valorSaque);
                    System.out.println("\n");

                    break;

                case 'd':
                    System.out.println(".................................");
                    System.out.println("Transação anterior :     ");
                    buscarTransacaoAnterior();

                    System.out.println(".................................");
                    System.out.println("\n");

                    break;

                case 'e':
                   System.out.println(".................................");
                   
                   break;

                default:
                  System.out.println("Escolha uma opção correta para prosseguir");
                    break;
            }
        } while (opcao != 'e');

        System.out.println("Obrigado por usar nossos serviços bancários");

        teclado.close();
    }
    void depositar(double valorDeposito) {

        if (valorDeposito != 0) {
            balanco += valorDeposito;
            anteriorTransacao = valorDeposito;
        }
    }
    void sacar(double valorSaque) {
        
        if (valorSaque != 0 && balanco >= valorSaque) {
            
            balanco -= valorSaque;
            anteriorTransacao =- valorSaque;

        } else if (balanco < valorSaque) {
            System.out.println("Saldo da conta insuficiente");
        }
    }
    void buscarTransacaoAnterior() {
        
        if (anteriorTransacao > 0) {
            System.out.println("Depositado: " + anteriorTransacao);

        } else if (anteriorTransacao < 0) {
            System.out.println("Saque: " + Math.abs(anteriorTransacao));

        } else {
            System.out.println("Nenhuma transação ocorreu");
        }
    }
}
