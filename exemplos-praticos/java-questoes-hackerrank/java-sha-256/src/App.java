import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class App {

    public static byte[] getSHA(String entrada) throws NoSuchAlgorithmException {

        // O método estático getInstance é chamado com hash SHA
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        
        // método digest() chamado
        // para calcular o digest(resumo) da mensagem de uma entrada
        // e retorna array de bytes
        return md.digest(entrada.getBytes(StandardCharsets.UTF_8));
    }

    public static String toHexString(byte[] hash) {

        // Converter matriz de bytes em representação signum 
        // O java.math.BigDecimal.signum() é um método embutido em 
        // Java que retorna a função signum deste BigDecimal. A função 
        // de sinal ou função de sinal é uma função matemática ímpar 
        // que extrai o sinal de um número real. Em expressões matemáticas, 
        // a função de sinal é freqüentemente representada como sgn.
        BigInteger numero = new BigInteger(1, hash);

        // Converter o digest da mensagem em valor hexadecimal
        StringBuilder hexString = new StringBuilder(numero.toString(16));

        // Pad com zeros à esquerda
        while (hexString.length() < 64) {
            
            hexString.insert(0, '0');
        }

        return hexString.toString();
    }


    public static void main(String[] args) throws Exception {

        // Solução 1
        Scanner teclado = new Scanner(System.in);
            
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(teclado.nextLine().getBytes());
        
        for(byte i : md.digest()) {
            
            System.out.print(String.format("%02x", i));
        }
        
        System.out.println();
        
        teclado.close();

        // //mMetodo Alternativo

        // try {
        //     Scanner teclado = new Scanner(System.in);

        //     String entrada = teclado.nextLine();

        //     System.out.println(toHexString(getSHA(entrada)));

        //     teclado.close();

        // } catch (NoSuchAlgorithmException e) {

        //     System.out.println("Exception thrown for incorrect algorithm: " + e);
        // }

    }
}
