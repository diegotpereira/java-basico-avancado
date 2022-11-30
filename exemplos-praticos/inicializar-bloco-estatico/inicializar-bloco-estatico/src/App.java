import java.util.Scanner;

public class App {

    static boolean bandeira;
    static int B;
    static int H;

    static {

        Scanner teclado = new Scanner(System.in);

        B = teclado.nextInt();
        H = teclado.nextInt();

        if(B > 0 && H > 0) {

            bandeira = true;

        } else {

            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        teclado.close();
    }
    public static void main(String[] args) throws Exception {

        // exercicio retirado hackerrank
        if (bandeira) {
            int area = B * H;

            System.out.println(area);

        }
    }
}
