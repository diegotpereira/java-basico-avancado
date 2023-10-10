import java.io.*;
import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {
                
                long n = Long.parseLong(bufferedReader.readLine().trim());
                long resultado = Resultado.flippingBits(n);

                bufferedWriter.write(String.valueOf(resultado));
                bufferedWriter.newLine();

            } catch (Exception e) {
                
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();

    }
}
