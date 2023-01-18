import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {

    private static final Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = teclado.nextInt();
        teclado.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int index = 0; index < q; index += 1) {
            
            String[] xyz = teclado.nextLine().split(" ");

            int gatoA = Integer.parseInt(xyz[0]);
            int gatoB = Integer.parseInt(xyz[1]);
            int ratoC= Integer.parseInt(xyz[2]);

            String resultado = catAndMouse(gatoA, gatoB, ratoC);

            bufferedWriter.write(String.valueOf(resultado));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
        teclado.close();

    }

    static String catAndMouse(int x, int y, int z) {
        
        int gatoA = x;
        int gatoB = y;
        int rato = z;
        
        if((Math.abs(rato - gatoA)) < (Math.abs(rato - gatoB))) {
            
            return "Cat A";
            
        } else if((Math.abs(rato - gatoA)) == (Math.abs(rato - gatoB))) {
            
            return "Mouse C";
            
        } else {
            
            return "Cat B";
        }

    }

    // private static String catAndMouse(int gatoA, int gatoB, int ratoC) {
        
    //     int distanciaGatoA = Math.abs(gatoA - ratoC);
    //     int distanciaGatoB = Math.abs(gatoB - ratoC);

    //     if (distanciaGatoA < distanciaGatoB) {
            
    //         return "Gato A";

    //     } else if(distanciaGatoB < distanciaGatoA) {

    //         return "Gato B";

    //     } else {

    //         return "Mouse C";
    //     }
    // }
}

