
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int t = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> largura = Stream.of(bufferedReader
                                      .readLine()
                                      .replace("\\s+$", "")
                                      .split(" "))
                                      .map(Integer::parseInt)
                                      .collect(toList());

        List<List<Integer>> casos = new ArrayList<>();

        IntStream.range(0, t).forEach(i -> {

            try {
                
                casos.add(Stream
                     .of(bufferedReader
                     .readLine()
                     .replaceAll("\\s+$", "")
                     .split(" "))
                     .map(Integer::parseInt)
                     .collect(toList()));

                     
            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        List<Integer> resultado = Resultado.serviceLane(n, casos, largura);

        bufferedWriter.write(resultado
                      .stream()
                      .map(Object::toString)
                      .collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();

    }
}


class Resultado {

    public static List<Integer> serviceLane(int n, List<List<Integer>> casos, List<Integer> largura) {

        List<Integer> lista = new ArrayList<>();

        for(List<Integer> c : casos) {

            int min = largura.get(c.get(0));

            for(int indice = c.get(0); indice <= c.get(1); indice += 1) 

                if(largura.get(indice) < min)

                    min = largura.get(indice);

                lista.add(min);
    
        }
        
        return lista;
    }

    // public static List<Integer> serviceLane(int n, List<List<Integer>> casos, List<Integer> largura) {

    //     List<Integer> resposta = new ArrayList<>();

    //     for(List<Integer> c : casos) {

    //         resposta.add(Collections.min(largura.subList(c.get(0), c.get(1) + 1)));
    //     }
    //     return resposta;
    // }

    // public static List<Integer> serviceLane(int n, List<List<Integer>> casos, List<Integer> largura) {

    //     List<Integer> valorMax = new ArrayList<>();

    //     for(List<Integer> c : casos) {

    //         int min = Integer.MAX_VALUE;

    //         for (int i = c.get(0); i <= c.get(1); i++) {
                
    //             min = Math.min(largura.get(i), min);
    //         }

    //         valorMax.add(min);
    //     }

    //     return valorMax;
    // }
}