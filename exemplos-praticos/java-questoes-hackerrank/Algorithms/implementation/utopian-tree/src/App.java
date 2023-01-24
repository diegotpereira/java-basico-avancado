import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {

                int n = Integer.parseInt(bufferedReader.readLine().trim());
                int resultado = Resultado.utopianTree(n);

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

    public static int utopianTree(int n) {
        // Write your code here
        if(n == 0) {
            
            return 1;
        }
        
        int alturaAtual = 1;
        
        for (int i = 1; i <= n; i++) {
            
            if (i % 2 != 0) {
                
                alturaAtual *= 2;
                
            } else {
                
                alturaAtual += 1;
            }
        }
        
        return alturaAtual;
    }

    // public static int utopianTree(int n) {

    //     int maispróximoÍmpar = n % 2 == 0 ? n + 1 : n;

    //     int indice = ((maispróximoÍmpar - 1) / 2) + 2;
    //     int resposta = (int) Math.pow(2, indice) - 2;

    //     if(n % 2 == 0) {

    //         resposta /= 2;
    //     }
    //     return resposta;
    // }

    // public static int utopianTree(int n) {

    //     int altura = 1;

    //     for (int i = 1; i <= n; i++) {
            
    //         if (i % 2 == 0) {
                
    //             altura += 1;

    //         } else {

    //             altura *= 2;
    //         }
    //     }
    //     return altura;
    // }

    // public static int utopianTree(int n) {

    //     int altura = 0;

    //     if(n % 2 == 0) {

    //         altura = ((int)Math.pow(2, (n / 2) + 1) -1);

    //     } else {

    //         altura = ((int)Math.pow(2, ((n + 1) / 2) + 1) -2);
    //     }

    //     return altura;
    // }
}