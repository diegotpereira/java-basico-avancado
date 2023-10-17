import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Inicializa o leitor de entrada e o escritor de saída.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String resultado = Resultado.encryption(s);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        // Fecha os leitores e escritores.
        bufferedReader.close();
        bufferedWriter.close();
    }
}
