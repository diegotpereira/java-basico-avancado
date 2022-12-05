import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        BigInteger a;
        BigInteger b;
        BigInteger soma;
        BigInteger multiplica;

        a = new BigInteger(teclado.nextLine());
        b = new BigInteger(teclado.nextLine());

        soma = a.add(b);
        multiplica = a.multiply(b);

        System.out.println(soma);
        System.out.println(multiplica);

        teclado.close();
    }
}
