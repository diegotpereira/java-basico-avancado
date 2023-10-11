import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        // Inicializa o leitor de entrada e o escritor de saída.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Lê a primeira linha de entrada, que contém os valores de n, m e k.
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // Número de linhas
        int n = Integer.parseInt(firstMultipleInput[0]);

        // Número de colunas
        int m = Integer.parseInt(firstMultipleInput[1]);

        // Número de faixas de trilhos
        int k = Integer.parseInt(firstMultipleInput[2]);

        // Lista para armazenar as faixas de trilhos
        List<List<Integer>> track = new ArrayList<>();

        // Lê as próximas k linhas, cada uma contendo informações sobre as faixas de trilhos.
        IntStream.range(0, k).forEach(i -> {
            try {
                track.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Chama o método GridLandMetro para calcular a área não ocupada por faixas de trilhos.
        long resultado = GridLandMetro.gridlandMetro(n, m, k, track);

        // Escreve o resultado no escritor de saída.
        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        // Fecha os leitores e escritores.
        bufferedReader.close();
        bufferedWriter.close();


    }
}
