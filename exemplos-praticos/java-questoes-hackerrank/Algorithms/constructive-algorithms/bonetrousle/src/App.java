import java.io.*;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int entradas =  Integer.parseInt(bufferedReader.readLine().trim());
        
        IntStream.range(0, entradas).forEach(iTr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("s+$", "").split(" ");

                long numeroTones = Long.parseLong(primeiraMultiplaEntrada[0]);
                long tamanhoCaixas = Long.parseLong(primeiraMultiplaEntrada[1]);
                int quantidadeCaixas = Integer.parseInt(primeiraMultiplaEntrada[2]);

                List<Long> resultado = Resultado.bonetrousle(numeroTones, tamanhoCaixas, quantidadeCaixas);

                bufferedWriter.write(resultado.stream().map(Object::toString).collect(joining(" ")) + "\n");


            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}
