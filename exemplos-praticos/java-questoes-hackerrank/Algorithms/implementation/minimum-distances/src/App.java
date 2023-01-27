import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "")
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList());

        int resultado = Resultado.minimumDistances(a);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int minimumDistances(List<Integer> a) {

        Map<Integer, Integer> mapa = new HashMap<>();

        int distanciaMinima = Integer.MAX_VALUE;

        for (int indice = 0; indice < a.size(); indice += 1) {
            
            int n = a.get(indice);

            if (mapa.containsKey(n)) {
                
                int distancia = indice - mapa.get(n);

                distanciaMinima = Math.min(distanciaMinima, distancia);
            }

            mapa.put(n, indice);
        }

        if(distanciaMinima == Integer.MAX_VALUE)

            return -1;

        else 

            return distanciaMinima;
    }

    
}