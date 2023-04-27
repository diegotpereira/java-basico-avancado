import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {

                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int k = Integer.parseInt(primeiraMultiplaEntrada[1]);

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList());

                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt).collect(toList());

                String resultado = Resultado.twoArrays(k, A, B);

                bufferedWriter.write(resultado);
                bufferedWriter.newLine();

            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
