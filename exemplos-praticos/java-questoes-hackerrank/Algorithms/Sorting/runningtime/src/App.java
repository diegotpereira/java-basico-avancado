import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        // Cria um leitor de entrada (BufferedReader) para ler a entrada do sistema
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Cria um escritor de saída (BufferedWriter) para escrever a saída no sistema
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        // Lê o número de elementos (n) da primeira linha da entrada e o converte para um inteiro
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        // Lê a segunda linha da entrada, que contém os elementos do array separados por espaços,
        // remove espaços em branco no final da linha e converte os valores para uma lista de inteiros
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s + $", "")).map(Integer::parseInt).collect(toList());

        // Chama o método "runningTime" da classe "Resultado" para calcular o número de movimentos
        int resultado = Resultado.runningTime(arr);

        // Escreve o resultado no BufferedWriter
        bufferedWriter.write(String.valueOf(resultado));

        // Adiciona uma nova linha após o resultado
        bufferedWriter.newLine();

        // Fecha o leitor de entrada e o escritor de saída para liberar recursos
        bufferedReader.close();
        bufferedWriter.close();
    }
}
