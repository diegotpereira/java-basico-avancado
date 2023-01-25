import java.io.*;
import java.util.List;
import java.util.stream.*;

import javax.management.RuntimeErrorException;

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tIt -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                                 .replaceAll("\\s+$", "")
                                                                 .split(" ");

                int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int k = Integer.parseInt(primeiraMultiplaEntrada[1]);

                List<Integer> a = Stream.of(bufferedReader.readLine()
                                                          .replaceAll("\\s+$", "")
                                                          .split(" "))
                                                          .map(Integer::parseInt)
                                                          .collect(toList());

                String resultado = Resultado.angryProfessor(k, a);

                bufferedWriter.write(resultado);
                bufferedWriter.newLine();

            } catch (IOException e) {
                
                new RuntimeException(e);
            }
        });
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static String angryProfessor(int k, List<Integer> a) {

        int contar = 0;

        for(Integer entrada : a) {

            if(entrada <= 0) contar++;
        }
        return k > contar ? "SIM" : "NAO";
    }

    // public static String angryProfessor(int k, List<Integer> a) {

    //     int contar = 0;

    //     for (int i = 0; i < a.size(); i++) {
            
    //         if (a.get(i) <= 0) {
                
    //             contar++;

    //             if (k <= contar) {
                    
    //                 return "NAO";
    //             }
    //         }
    //     }
    //     return "SIM";
    // }
}