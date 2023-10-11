import java.io.*;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        // Inicializa o leitor de entrada e o escritor de saída.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        // Chama o método GridLandMetro para calcular a área não ocupada por faixas de trilhos.
        int resultado = Resultado.shortPalindrome(s);

        // Escreve o resultado no escritor de saída.
        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        // Fecha os leitores e escritores.
        bufferedReader.close();
        bufferedWriter.close();
    }
}
