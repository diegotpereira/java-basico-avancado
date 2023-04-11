import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {

            try {

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<List<Integer>> container = new ArrayList<>();

                IntStream.range(0, n).forEach(i -> {

                    try {
                        
                        container.add(Stream
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

                String resultado = Resultado.organizingContainers(container);

                bufferedWriter.write(resultado);
                bufferedWriter.newLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static String organizingContainers(List<List<Integer>> container) {

        Set<Integer> bolas = container.stream()
                                      .map(b -> b
                                      .stream()
                                      .mapToInt(Integer::intValue)
                                      .sum())
                                      .collect(toSet());

        Set<Integer> tipos = IntStream.range(0, container.size())
                                      .mapToObj(t -> container.stream()
                                      .mapToInt(b -> b.get(t))
                                      .sum())
                                      .collect(toSet());
                                      
        return bolas.containsAll(tipos) ? "Possivel" : "Impossivel";
    }

    // public static String organizingContainers(List<List<Integer>> container) {

    //     int[] bolas = new int[container.size()];
    //     int[] caixas = new int[container.size()];

    //     for (int indice = 0; indice < container.size(); indice++) {
            
    //         for (int compare = 0; compare < container.get(indice).size(); compare++) {
                
    //             bolas[indice] += container.get(indice).get(compare);
    //             caixas[compare] += container.get(indice).get(compare);
    //         }
    //     }

    //     Arrays.sort(bolas);
    //     Arrays.sort(caixas);

    //     for(int indice = 0; indice < bolas.length; indice += 1) {

    //         if (bolas[indice] != caixas[indice]) {
                
    //             return "Impossivel";
    //         }
    //     }
    //     return "Possivel";
    // }

    // public static String organizingContainers(List<List<Integer>> container) {


    //     int soma1 = 0;
    //     int soma2 = 0;

    //     for(int indice = 0; indice < container.size(); indice += 1) {

    //         for (int compare = 0; compare < container.get(indice).size(); compare++) {
                
    //             soma1 += container.get(indice).get(compare);
    //             soma2 += container.get(compare).get(indice);
    //         }

    //         if(soma1 != soma2) 

    //             return "Impossivel";
    //     }
    //     return "Possivel";
    // }
}