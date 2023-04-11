import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int pessoas = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> B = Stream.of(bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "")
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList());
        
        String resultado = Resultado.fairRations(B);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static String fairRations(List<Integer> b) {

        int contar = 0;

        for (int indice = 0; indice < b.size() - 1; indice += 1) {
            
            int atual = b.get(indice);
            int prox = b.get(indice + 1);

            if (atual % 2 != 0) {
                
                b.set(indice, ++ atual);
                b.set(indice + 1, ++prox);

                contar += 2;
            }
        }
        return b.get(b.size() - 1) % 2 == 0 ? Integer.toString(contar) : "NO";
    }

    // public static String fairRations(List<Integer> b) {

    //     int contar = 0;

    //     for (int indice = 0; indice < b.size() - 1; indice += 1) {
            
    //         if (b.get(indice) % 2 == 1) {
                
    //             b.set(indice, b.get(indice) + 1);
    //             b.set(indice + 1, b.get(indice + 1) + 1);

    //             contar += 2;
    //         }
    //     }

    //     if (b.get(b.size() - 1) % 2 == 1) {
            
    //         return "NO";
    //     } else
    //     return Integer.toString(contar);
    // }
}