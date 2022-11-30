import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        String palavra = teclado.next();
        String aux = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(aux)) {
            
            System.out.println("Sim");

        } else {

            System.out.println("Não");
        }
    }
}
