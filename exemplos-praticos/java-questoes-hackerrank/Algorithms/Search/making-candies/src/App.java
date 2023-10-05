import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        long numeroInicialMaquinas = Long.parseLong(primeiraMultiplaEntrada[0]);
        long numeroInicialTrabalhadores = Long.parseLong(primeiraMultiplaEntrada[1]);
        long custoOperacao = Long.parseLong(primeiraMultiplaEntrada[2]);
        long numeroDocesAhProduzir = Long.parseLong(primeiraMultiplaEntrada[3]);

        long resultado = Resultado.minimumPasses(numeroInicialMaquinas, numeroInicialTrabalhadores, custoOperacao, numeroDocesAhProduzir);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}
