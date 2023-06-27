import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Preparando a leitura dos dados de entrada
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Lendo o número de cidades
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Lista para armazenar as estradas entre as cidades
        List<List<Integer>> estradas = new ArrayList<>();

        // Lendo as estradas
        IntStream.range(0, n - 1).forEach(i -> {

            try {
                
                // Lendo uma linha de estradas e convertendo em uma lista de inteiros
                estradas
                    .add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", ""))
                    .map(Integer::parseInt).collect(toList()));

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        // Chamando a função kingdomDivision para calcular o resultado
        int resultado = Resultado.kingdomDivision(n, estradas);

         // Escrevendo o resultado no buffer de saída
        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        // Fechando os leitores e escritores
        bufferedReader.close();
        bufferedWriter.close();

    }
}
