import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> arr = Stream.of(bufferedReader.readLine()
                                                    .replaceAll("\\s+$", "")
                                                    .split(" "))
                                                    .map(Integer::parseInt)
                                                    .collect(toList());

        Resultado.miniMaxSum(arr); // saída: 10 14

        bufferedReader.close();
    }
}

class Resultado {

    // public static void miniMaxSum(List<Integer> arr) {

    //     long soma = 0;

    //     arr.sort(null);

    //     for(Integer in : arr) {

    //         soma += in;
    //     }

    //     System.out.println((soma - arr.get(arr.size() - 1)) + " " + (soma - arr.get(0)));
    // }
    
    // public static void miniMaxSum(List<Integer> arr) {

    //     arr.sort(null);

    //     long soma = arr.stream().mapToLong(Integer::intValue).sum();
    //     long minSoma  = soma - arr.get(arr.size() - 1);
    //     long maxSoma = soma - arr.get(0);

    //     System.out.println(minSoma + " " + maxSoma);
    // }

    // public static void miniMaxSum(List<Integer> arr) {

    //     int n = arr.size();
    //     long max = arr.get(n - 1);
    //     long min = arr.get(0);
    //     long soma = 0;

    //     for (int index = 0; index < n; index += 1) {
            
    //         soma += arr.get(index);
    //     }

    //     long arrMax = soma - min;
    //     long arrMin = soma - max;

    //     System.out.println(arrMin + " " + arrMax);
    // }

    // public static void miniMaxSum(List<Integer> arr) {

    //     int min = arr.get(0);
    //     int max = arr.get(1);

    //     long soma = 0;

    //     // Long[] ar=new Long[arr];

    //     for (Integer num : arr) {

    //         soma = soma + num;
            
    //         if (num > max) {
                
    //             max = num;
    //         }

    //         if (num < min) {
                
    //             min = num;

    //         }
    //     }

    //     long minimaSoma = (soma - max);
    //     long maximaSoma = (soma - min);

    //     System.out.print(minimaSoma + " " + maximaSoma);
    
    // }

    public static void miniMaxSum(List<Integer> arr) {

        int tamanho = arr.size();
        long somaArr[] = new long[tamanho];

        for (int index = 0; index < tamanho; index += 1) {
            
            somaArr[index] = 0;

            for (int compara = 0; compara < tamanho; compara += 1) {
                
                if (index != compara) {
                    
                    somaArr[index] += arr.get(compara);
                }
            }
        }

        Arrays.sort(somaArr);

        System.out.println(somaArr[0] + " " + somaArr[tamanho - 1]);
    }
}