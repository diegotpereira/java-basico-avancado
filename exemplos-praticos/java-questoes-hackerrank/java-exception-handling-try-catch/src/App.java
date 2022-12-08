import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            
            Scanner teclado = new Scanner(System.in);

            int x = teclado.nextInt();
            int y = teclado.nextInt();

            System.out.println(x / y);
            

            teclado.close();
        } catch (Exception e) {
            
            if(e instanceof java.lang.ArithmeticException)

                System.out.println(e.toString());

            if(e instanceof java.util.InputMismatchException)

                System.out.println("java.util.InputMismatchException");
        }
    }
}
