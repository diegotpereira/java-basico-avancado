import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int numeroPresentesPretos = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int numeroPresentesBrancos = Integer.parseInt(primeiraMultiplaEntrada[1]);


                String[] segunaMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int custoPresentePreto = Integer.parseInt(segunaMultiplaEntrada[0]);
                int custoPresenteBranco = Integer.parseInt(segunaMultiplaEntrada[1]);
                int custoParaConverter = Integer.parseInt(segunaMultiplaEntrada[2]);

                long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoParaConverter);

                bufferedWriter.write(String.valueOf(resultado));
                bufferedWriter.newLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
