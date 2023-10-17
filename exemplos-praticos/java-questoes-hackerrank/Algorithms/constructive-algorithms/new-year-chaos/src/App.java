import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int entrada = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, entrada).forEach(iTr -> {

            try {
                
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());

                int resultado = Resultado.minimumBribes(q);

                System.out.println(resultado);

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
    }
}
