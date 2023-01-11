import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arContar = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine()
                                                .replaceAll("\\s+$", "")
                                                .split(" "))
                                                .map(Long::parseLong)
                                                .collect(toList());

        long resultado = Resultado.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    // public static long aVeryBigSum(List<Long> ar) {

    //     long soma = 0;

    //     for (int index = 0; index < ar.size(); index += 1) {
            
    //         soma += ar.get(index);
    //     }
    //     return soma;
    // }

    public static long aVeryBigSum(List<Long> ar) {


        return ar.stream().mapToLong(v -> v).reduce(0, (a, b) -> (a + b));
    }
}