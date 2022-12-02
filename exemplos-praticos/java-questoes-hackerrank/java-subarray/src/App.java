import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {

            arr[i] = teclado.nextInt();
        }

        int contar = 0;

        for(int j = 0; j < n; j++) {

            int soma = 0;

            for(int k = j; k < n; k++) {

                soma = arr[k] + soma;

                if (soma < 0) {
                    
                    contar++;
                }
            }
        }
        System.out.println(contar);

        teclado.close();
    }
}
