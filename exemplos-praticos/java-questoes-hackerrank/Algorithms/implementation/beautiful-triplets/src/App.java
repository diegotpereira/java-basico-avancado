import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int d = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> arr = Stream.of(bufferedReader
                                  .readLine()
                                  .replaceAll("\\s+$", "")
                                  .split(" "))
                                  .map(Integer::parseInt)
                                  .collect(toList());

        int resultado = Resultado.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here
        int contar = 0;
        
        for (int indice = 0; indice < arr.size(); indice += 1) {
            
            for (int compare = indice + 1; compare < arr.size(); compare += 1) {
                
                if (arr.get(compare) - arr.get(indice) == d) {
                    
                    for(int k = compare + 1; k < arr.size(); k += 1) {
                        
                        if (arr.get(k) - arr.get(compare) == d) 
                            
                            contar++;
                    }
                }
            }
        }
        
        return contar;

    }

    // public static int beautifulTriplets(int d, List<Integer> arr) {

    //     int i = 0;
    //     int j = i + 1;
    //     int k = j + 1;
    //     int contar = 0;

    //     while (k < arr.size()) {
            
    //         while ((arr.get(j) - arr.get(i)) == d) {
                
    //             if ((arr.get(k) - arr.get(j)) == d) {
                    
    //                 contar++;
    //             }

    //             k++;

    //             if (k == arr.size()) {
                    
    //                 j = j + 1;
    //                 k = j + 1;
    //             }
    //         }

    //         j++;

    //         if (j == arr.size() - 1) {
                
    //             i += 1;
    //             j = i + 1;
    //             k = j + 1;
    //         }
    //     }
    //     return contar;
    // }

    // public static int beautifulTriplets(int d, List<Integer> arr) {

    //     int resultado = 0;

    //     for (int indice = 0; indice < arr.size(); indice += 1) {
            
    //         int x = arr.get(indice);

    //         if (arr.contains(x + d) && arr.contains(x + 2 * d)) {
                
    //             resultado++;
    //         }
    //     }
    //     return resultado;
    // }
}