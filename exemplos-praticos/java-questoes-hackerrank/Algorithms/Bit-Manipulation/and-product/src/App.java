import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, n).forEach(nItr -> {

            try {
                
                String [] primeiraMultiplaEntrda = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                long a = Long.parseLong(primeiraMultiplaEntrda[0]);
                long b = Long.parseLong(primeiraMultiplaEntrda[1]);

                long resultado = Resultado.andProduct(a, b);

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
