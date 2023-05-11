import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(null));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {

                int arrContar = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader
                        .readLine()
                        .replaceAll("\\s+$", "")
                        .split(""))
                        .map(Integer::parseInt)
                        .collect(toList());

                int resultado = Resultado.bricksGame(arr);

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
