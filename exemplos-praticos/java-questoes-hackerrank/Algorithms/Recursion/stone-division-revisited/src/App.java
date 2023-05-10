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

                long n = Long.parseLong(primeiraMultiplaEntrada[0]);
                int m = Integer.parseInt(primeiraMultiplaEntrada[1]);

                List<Long> s = Stream.of(bufferedReader
                        .readLine()
                        .replaceAll("\\s+$", ""))
                        .map(Long::parseLong)
                        .collect(toList());

                long resultado = Resultado.stoneDivision(n, s);

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
