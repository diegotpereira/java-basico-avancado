import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int numeroAstronautas = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int idAstronautas = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<List<Integer>> astronauta = new ArrayList<>();

        IntStream.range(0, idAstronautas).forEach(i -> {

            try {
                
                astronauta.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "")).map(Integer::parseInt).collect(toList()));
            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        long resultado = Resultado.journeyToMoon(numeroAstronautas, astronauta);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }
}
