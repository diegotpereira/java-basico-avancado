import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader BufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(BufferedReader.readLine().trim());

        List<Integer> a = Stream.of(BufferedReader.readLine()
                                                  .replaceAll("\\s+$", "")
                                                  .split(" "))
                                                  .map(Integer::parseInt)
                                                  .collect(toList());


        int result = Resultado.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        BufferedReader.close();
        bufferedWriter.close();
    
    }
}

class Resultado {

    public static int pickingNumbers(List<Integer> a) {

        int indice = 0;
        int compare = 1;
        int comprimentoMaisLongo = 0;
        Collections.sort(a);

        while (compare < a.size()) {
            
            int esquerdo = a.get(indice);
            int direito = a.get(compare);

            if(Math.abs(esquerdo - direito) <= 1) {

                comprimentoMaisLongo = Math.max(comprimentoMaisLongo, (compare - indice) + 1);

                ++compare;
                continue;
            }

            ++indice;
        }
        return comprimentoMaisLongo;
    }

    // public static int pickingNumbers(List<Integer> a) {

    //     List<Integer> contar = new ArrayList<>();

    //     for(Integer elemento : a) {

    //         contar.add(Collections.frequency(a, elemento) + Collections.frequency(a, elemento + 1));    
    //         contar.add(Collections.frequency(a, elemento) + Collections.frequency(a, elemento - 1));
    //     }

    //     return Collections.max(contar);
    // }

    // public static int pickingNumbers(List<Integer> a) {

    //     int contar = 0;
    //     int maximo = 0;

    //     Collections.sort(a);

    //     for(int indice = 0; indice < a.size(); indice += 1) {

    //         for(int compare = indice + 1; compare < a.size(); compare += 1) {

    //             if (Math.abs(a.get(indice) - a.get(compare)) <= 1) {
                    
    //                 contar++;
    //             }
    //         }

    //         if (contar > maximo) {
                
    //             maximo = contar;
    //         }

    //         contar = 0;
    //     }

        
    //     return maximo + 1;
    // }
}