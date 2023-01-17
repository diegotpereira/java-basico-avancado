import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> quadrados  = Stream.of(bufferedReader
                                         .readLine()
                                         .replaceAll("\\s+$", "")
                                         .split(" "))
                                         .map(Integer::parseInt)
                                         .collect(toList());

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int dia = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int mes = Integer.parseInt(primeiraMultiplaEntrada[1]);

        int resultado = Resultado.birthday(quadrados, dia, mes);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static int birthday(List<Integer> quadrados, int dia, int mes) {

        int contar = 0;

        for (int index = 0; index < (quadrados.size() - mes); index++) {
            
            int soma = 0;

            for (int compare = 0; compare < mes; compare += 1) {
                
                soma += quadrados.get(index + compare);
            }

            if (soma == dia) {
                
                contar++;
            }
        }
        return contar;
    }

    // public static int birthday(List<Integer> quadrados, int dia, int mes) {

    //     int contar = 0;

    //     for (int index = 0; index <= quadrados.size() - mes; index += 1) {
            
    //         int soma = 0;

    //         for (int compare = index; compare < index + mes; compare += 1) {
                
    //             soma += quadrados.get(compare);
    //         }

    //         if (soma == dia) {
                
    //             contar++;
    //         }
    //     }
    //     return contar;
    // }    
}