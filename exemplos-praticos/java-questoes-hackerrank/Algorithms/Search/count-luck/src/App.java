import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Inicializa o leitor de entrada e o escritor de saída.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int entrada = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, entrada).forEach(entradaItr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                                 .replaceAll("\\s+$", "")
                                                                 .split(" ");

                int linhas = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int colunas = Integer.parseInt(primeiraMultiplaEntrada[1]);

                List<String> matriz = IntStream.range(0, linhas).mapToObj(i -> {

                    try {
                        
                        return bufferedReader.readLine();

                    } catch (IOException ex) {
                        
                        throw new RuntimeException(ex);
                    }
                }).collect(toList());


                int palpites  = Integer.parseInt(bufferedReader.readLine().trim());

                // Chama o método GridLandMetro para calcular a área não ocupada por faixas de trilhos.
                String resultado = Resultado.countLuck(matriz, palpites);

                // Escreve o resultado no escritor de saída.
                bufferedWriter.write(resultado);
                bufferedWriter.newLine();

            } catch (IOException ex) {
                
                throw new RuntimeException(ex);
            }
        });

        // Fecha os leitores e escritores.
        bufferedReader.close();
        bufferedWriter.close();
    }
}
