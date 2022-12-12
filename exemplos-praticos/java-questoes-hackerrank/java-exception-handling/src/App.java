import java.util.Scanner;

public class App {

    public static final MinhaCalculadora minha_calculadora = new MinhaCalculadora();
    public static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (teclado.hasNextInt()) {
            
            int n = teclado.nextInt();
            int p = teclado.nextInt();

            try {
                
                System.out.println(minha_calculadora.forca(n, p));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class MinhaCalculadora {

    public static int forca(int n, int p) throws Exception {

        if(n < 0 || p < 0) {

            throw new Exception("n ou p não deve ser negativo.");

        } else if (n == 0 && p == 0) {
            
            throw new Exception("n e p não devem ser zero.");

        } else {

            return ((int) Math.pow(n, p));
        }
    }
}
