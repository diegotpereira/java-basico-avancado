import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {

            try {
                arr.add(Stream.of(bufferedReader.readLine()
                                                .replaceAll("\\s+$", "")
                                                .split(" "))
                                                .map(Integer::parseInt)
                                                .collect(toList()));
            } catch (IOException e) {
                
                throw new RuntimeException(e);

            }
        });

        int resultado = Resultado.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(resultado)); // saída: 15
        bufferedWriter.newLine();
    
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    // public static int diagonalDifference(List<List<Integer>> arr) {

    //     int diagonal_direita = 0;
    //     int diagonal_esquerda = 0;
    //     int i = 0;

    //     for(List<Integer> temp : arr) {

    //         diagonal_direita += temp.get(i);
    //         diagonal_esquerda += temp.get(temp.size() - 1 - i);
    //         i += 1;
    //     }
    //     int resposta = Math.abs(diagonal_direita - diagonal_esquerda);
    //     return resposta;
    // }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int a = IntStream.range(0, arr.size())
                         .map(i -> arr.get(i).get(i))
                         .sum();

        int b = IntStream.range(0, arr.size())
                         .map(i -> arr.get(i).get(arr.size() - 1 - i))
                         .sum();

        return Math.abs(a - b);
    }
}
