import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Configurar os leitores e escritores de buffer
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    
        // Ler o número de vértices da árvore
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Ler os valores associados aos vértices da árvore e armazená-los em uma lista
        List<Integer> data = Stream.of(bufferedReader.readLine().replaceAll("\\s + $", "")).map(Integer::parseInt).collect(toList());

        // Armazenar as arestas da árvore em uma lista de listas de inteiros
        List<List<Integer>> arestas = new ArrayList<>();

        // Ler as arestas da árvore e adicioná-las à lista de arestas
        IntStream.range(0, n - 1).forEach(i -> {

            try {
            
                // Ler a linha contendo os vértices da aresta e convertê-los para uma lista de inteiros
                arestas.add(Stream.of(bufferedReader.readLine().replaceAll("\\s + $", "").split(" ")).map(Integer::parseInt).collect(toList()));

            // Lançar uma exceção em caso de erro na leitura
            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        // Chamar o método "cutTheTree" para calcular o resultado do problema
        int resultado = Resultado.cutTheTree(data, arestas);

        // Escrever o resultado no buffer de saída
        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        // Fechar os leitores e escritores
        bufferedReader.close();
        bufferedWriter.close();
    }
}
