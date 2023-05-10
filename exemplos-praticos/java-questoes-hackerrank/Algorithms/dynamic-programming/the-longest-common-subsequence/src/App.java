import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int m = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> a = Stream.of(bufferedReader
                .readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader
                .readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> resultado = Resultado.longestCommonSubsequence(a, b);

        bufferedWriter.write(resultado.stream().map(Object::toString).collect(joining()) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}
