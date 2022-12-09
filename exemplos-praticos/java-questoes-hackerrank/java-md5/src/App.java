import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        String entrada = teclado.nextLine();

        System.out.println(gerarHash(entrada));

        teclado.close();
    }

    public static String gerarHash(String entrada) {

        MessageDigest md; 

        try {
            
            md = MessageDigest.getInstance("MD5");

        } catch (NoSuchAlgorithmException e) {
            
            throw new RuntimeException(e);
        }
        BigInteger hash = new BigInteger(1, md.digest(entrada.getBytes()));

        return hash.toString(16);
    }
}
