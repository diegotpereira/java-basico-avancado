import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int entrada = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, entrada).forEach(tItr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int m = Integer.parseInt(primeiraMultiplaEntrada[1]);
                List<Integer> x = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
                List<Integer> D = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", " ")).map(Integer::parseInt).collect(toList());
                int resultado = Resultado.gridWalking(m, x, D);

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
