import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        // Inicializa o leitor de entrada e o escritor de saída.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Long> preco = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong).collect(toList());

        // Chama o método GridLandMetro para calcular a área não ocupada por faixas de trilhos.
        int resultado = Resultado.minimumLoss(preco);

        // Escreve o resultado no escritor de saída.
        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        // Fecha os leitores e escritores.
        bufferedReader.close();
        bufferedWriter.close();

    }
}
