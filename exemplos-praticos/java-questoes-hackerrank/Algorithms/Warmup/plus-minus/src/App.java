import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine()
                                                    .replaceAll("\\s+$", "")
                                                    .split(" "))
                                                    .map(Integer::parseInt)
                                                    .collect(toList());

        Resultado.plusMinus(arr);

        bufferedReader.close();
    }
}

class Resultado {

    // public static void plusMinus(List<Integer> arr) {

    //     System.out.format("%.6f\n", arr.stream().filter(n -> n > 0).count() / Double.valueOf(arr.size()));
    //     System.out.format("%.6f\n", arr.stream().filter(n -> n < 0).count() / Double.valueOf(arr.size()));
    //     System.out.format("%.6f", arr.stream().filter(n -> n == 0).count() / Double.valueOf(arr.size()));
    // }

    // public static void plusMinus(List<Integer> arr) {

    //     float pos = 0;
    //     float neg = 0;
    //     float media = 0;

    //     for (int index = 0; index < arr.size(); index += 1) {
            
    //         if (arr.get(index) > 0) {
                
    //             pos++;

    //         } else if (arr.get(index) < 0) {
                
    //             neg++;

    //         } else {

    //             media++;
    //         }
    //     }

    //     System.out.printf("%.6f", pos / arr.size());
    //     System.out.printf("\n%.6f", neg / arr.size());
    //     System.out.printf("\n%.6f", media / arr.size());

    // }

    public static void plusMinus(List<Integer> arr) {

        double[] resultado = new double[3];
        int contarPositivo = 0;
        int contarNegativo = 0;
        int contarZeros = 0;

        for (int index = 0; index < arr.size(); index += 1) {
            
            int valor = arr.get(index);

            if (valor > 0) {
                
                contarPositivo += 1;

            } else if (valor < 0) {
                
                contarNegativo += 1;

            } else {

                contarZeros += 1;
            }
        }

        double dividir = arr.size();

        resultado[0] = contarPositivo / dividir;
        resultado[1] =  contarNegativo / dividir;
        resultado[2] = contarZeros / dividir;

        System.out.println(String.format("%,.6f", resultado[0]));
        System.out.println(String.format("%,.6f", resultado[1]));
        System.out.println(String.format("%,.6f", resultado[2]));
    }
}