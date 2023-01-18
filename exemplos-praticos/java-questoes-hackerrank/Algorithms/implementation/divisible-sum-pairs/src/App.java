import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                         .replaceAll("\\s+$", " ")
                                                         .split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int k = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine()
                                                    .replaceAll("\\s+$", "")
                                                    .split(" "))
                                                    .map(Integer::parseInt)
                                                    .collect(toList());

        int resultado = Resultado.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    // public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

    //     int quantidadeParesDivisiveis = 
    //         (int) IntStream
    //         .range(0, ar.size())                                           
    //         .mapToLong(i -> {
    //         return IntStream.range(0, ar.size()).mapToObj(j -> {
    //             return i < j && 
    //                 ((ar.get(i) + ar.get(j)) % k == 0) ? true : false;
    //                 }).filter(t -> t).count();
    //                 }).sum();
    //     return quantidadeParesDivisiveis;

    // }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int quantidadeParesDivisiveis = 0;

        for (int index = 0; index < n; index += 1) {
            
            for (int par = 0; par < n; par += 1) {
                
                if (index != par) {
                    
                    if ((ar.get(index) + ar.get(par)) % k == 0) {
                        
                        quantidadeParesDivisiveis += 1;
                    }
                }
            }
        }
        return quantidadeParesDivisiveis / 2;
    }
}
