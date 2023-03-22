import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

import javax.management.RuntimeErrorException;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int r = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int c = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int n = Integer.parseInt(primeiraMultiplaEntrada[3]);

        List<String> grade = IntStream.range(0, r).mapToObj(i -> {
            
            try {
                return bufferedReader.readLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        }).collect(toList());

        List<String> resultado = Resultado.bomberMan(n, grade);

        bufferedWriter.write(resultado.stream().collect(joining("\n")));

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static List<String> bomberMan(int n, List<String> grade) {
        return null;
    }
    
}