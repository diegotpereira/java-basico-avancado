import java.util.Scanner;

public class App {

    public static boolean podeGanhar(int salto, int[]jogo) {

        boolean podeJogar = false;
        int n = salto;
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {

            if(i < 0 || jogo[i] == 1)
               podeJogar = false;

            if((i == jogo.length -1) || i + salto > jogo.length - 1)
               podeJogar = true;
        }

        return podeJogar;
    }
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int q = teclado.nextInt();

        while (q--> 0) {
            
            int n = teclado.nextInt();
            int salto = teclado.nextInt();
            int[] jogo = new int[n];

            for(int i = 0; i < n; i++) {

                jogo[i] = teclado.nextInt();
            }

            System.out.println((podeGanhar(salto, jogo)) ? "SIM" : "NÃO");
        }

        teclado.close();

      

        System.out.println("Hello meu app");
    }
}
