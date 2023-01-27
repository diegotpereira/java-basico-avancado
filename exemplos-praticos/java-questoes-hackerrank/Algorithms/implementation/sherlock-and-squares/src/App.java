import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int a = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int b = Integer.parseInt(primeiraMultiplaEntrada[1]);

                int resultado = Resultado.squares(a, b);

                bufferedWriter.write(String.valueOf(resultado));
                bufferedWriter.newLine();


            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static int squares(int a, int b) {
        
        a = (int) Math.ceil(Math.sqrt(a));
        b = (int) Math.floor(Math.sqrt(b));
        
        int quadrado = b - a + 1;
        
        return quadrado;
    }

    // public static int squares(int a, int b) {

    //     int contar = 0;
    //     int i = a;

    //     while (i <= b) {

    //         int sqrt = (int) Math.sqrt(i); // sqrt = 1 2 3 4

    //         if (Math.pow(sqrt, 2) == i) {
                
    //             contar++;
    //         }
    //         i = (int) Math.pow(sqrt + 1, 2); // i = 3 4 16
    //     }

    //     return contar;
    // }

    // public static int squares(int a, int b) {
        
    //     return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a)) + 1);
    // }

    // public static int squares(int a, int b) {

    //     int resultado = 0;
    //     double c = 0;
    //     int k = 0;

    //     if (Math.sqrt(a) % 1 == 0) {
            
    //         resultado++;
    //     }

    //     k = (int) Math.sqrt(a);
    //     c = (double) k++;

    //     while (Math.pow(c, 2) <= b) {
            
    //         resultado++;
    //         c++;
    //     }
    //     return resultado - 1;
    // }

    // public static int squares(int a, int b) {

    //     int sqrtA = (int)Math.floor(Math.sqrt((double)a));// sqrtA = 1 4
    //     int sqrtB = (int)Math.floor(Math.sqrt((double)b));// sqrtB = 3 4

    //     if (sqrtA * sqrtA == a) {
            
    //         return sqrtB - sqrtA + 1;

    //     } else {

    //         return sqrtB - sqrtA;
    //     }
    // }    
}