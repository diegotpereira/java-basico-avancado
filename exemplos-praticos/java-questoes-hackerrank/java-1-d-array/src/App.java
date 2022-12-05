import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < n; i++) {

            a[i] = teclado.nextInt();
        }

        teclado.close();

        for(int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }
}
