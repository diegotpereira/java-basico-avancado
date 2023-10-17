import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int tamanhoString = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int numeroMaximaMudancas = Integer.parseInt(primeiraMultiplaEntrada[1]);
        String s = bufferedReader.readLine();

        String resultado = Resultado.highestValuePalindrome(s, tamanhoString, numeroMaximaMudancas);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
