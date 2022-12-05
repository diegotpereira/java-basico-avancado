import java.util.Scanner;

public class App {

    public static boolean podeGanhar(int salto, int[]jogo, int i) {

        if(i < 0 || jogo[i] == 1)
           return false;

        if(i + 1 >=  jogo.length || i + salto >=  jogo.length)
           return true;

        jogo[i] = 1;

        return podeGanhar(salto, jogo, i + salto) ||
               podeGanhar(salto, jogo, i + 1) ||
               podeGanhar(salto, jogo, i - 1);

        // boolean podeJogar = false;
        // int n = salto;
        // int[] arr = new int[n];

        // for(int i = 0; i < arr.length; i++) {

        //     if(i < 0 || jogo[i] == 1)
        //        podeJogar = false;

        //     if((i == jogo.length -1) || i + salto > jogo.length - 1)
        //        podeJogar = true;
        // }

        // return podeJogar;
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

            System.out.println((podeGanhar(salto, jogo, 0)) ? "SIM" : "NÃO");
        }

        teclado.close();
    }
}
