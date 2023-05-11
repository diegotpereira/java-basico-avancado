import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grade = IntStream.range(0, n).mapToObj(i -> {

                    try {

                        return bufferedReader.readLine();
                    } catch (IOException e) {

                        throw new RuntimeException(e);
                    }
                }).collect(toList());

                String resultado = Resultado.gridChallenge(grade);

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
