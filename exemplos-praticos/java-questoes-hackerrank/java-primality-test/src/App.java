import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        BigInteger num = teclado.nextBigInteger();

        if(num.isProbablePrime(1000)) {

            System.out.println("É primo");

        } else {

            System.out.println("Não é primo");
        }
    }
}
