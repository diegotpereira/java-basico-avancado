import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class App {

    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = teclado.nextLine().split(" ");
        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int k = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int[] c = new int[n];
        String[] cItens = teclado.nextLine().split(" ");
        teclado.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            
            int cItem = Integer.parseInt(cItens[i]);
            c[i] = cItem;
        }

        int resultado = Resultado.jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedWriter.close();
        teclado.close();
    }
}


class Resultado {

    public static int jumpingOnClouds(int[] c, int k) {

        int energia = 100;
        int i = 0;
        boolean bandeira = true;

        while (bandeira) {
            
            if(c[i % c.length] == 0)

                energia -= 1;

            else if(c[i % c.length] == 1)

                energia -= 3;
                i += k;

            if(i % c.length == 0)

                bandeira = false;
        }
        return energia;
    }

    // public static int jumpingOnClouds(int[] c, int k) {

    //     int energia = 100;
    //     int indice = 0;

    //     while (true) {
            
    //         indice = indice + k;

    //         if(indice >= c.length) 
            
    //             indice = indice % c.length;

    //         if(c[indice] == 1)

    //             energia = energia - 2 - 1;

    //         if(c[indice] == 0)

    //             energia = energia - 1;

    //         if(indice == 0)

    //             break;
    //     }
    //     return energia;
    // }

    // public static int jumpingOnClouds(int[] c, int k) {

    //     int energia = 100;
    //     int rotulo = -1;

    //     for (int i = k; rotulo != 0; i += k) {
            
    //         rotulo = i % c.length;
    //         energia = c[rotulo] == 0 ? energia - 1 : energia - 3;
    //     }
    //     return energia;
    // }
}