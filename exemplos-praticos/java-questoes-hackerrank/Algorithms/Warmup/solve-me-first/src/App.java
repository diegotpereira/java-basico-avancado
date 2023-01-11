import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int a;
        a = teclado.nextInt();

        int b;
        b = teclado.nextInt();

        int soma = resolverPrimeiro(a, b);

        System.out.println(soma);

        teclado.close();
    }

    static int resolverPrimeiro(int a, int b) {

        int resultado = 0;

        resultado = a + b;

        return resultado;
    }
}
