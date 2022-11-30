import java.math.BigInteger;
import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        BigInteger num = teclado.nextBigInteger();

        teclado.close();

        System.out.println(num.isProbablePrime(1000) ? "É primo" : "Não é primo");
    }
}
