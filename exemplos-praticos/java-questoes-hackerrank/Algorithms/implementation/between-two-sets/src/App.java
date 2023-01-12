import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+#", "").split(" ");

        int num1 = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int num2 = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> arr1 = Stream.of(bufferedReader
                                   .readLine()
                                   .replaceAll("\\s+$", "")
                                   .split(" "))
                                   .map(Integer::parseInt)
                                   .collect(toList());


        List<Integer> arr2 = Stream.of(bufferedReader
                                   .readLine()
                                   .replaceAll("\\s+$", "")
                                   .split(" "))
                                   .map(Integer::parseInt)
                                   .collect(toList());

        int total = Resultado.getTotalX(arr1, arr2);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static int getTotalX(List<Integer> arr1, List<Integer> arr2) {

        Collections.sort(arr1);
        Collections.sort(arr2);

        HashSet<Integer> set = new HashSet<>();

        for (int index = arr1.get(arr1.size() - 1); index <= arr2.get(0); index += 1) {
            
            set.add(index);

            for (int compare = 0; compare < arr1.size(); compare += 1) {
                
                if (index % arr1.get(compare) != 0) {
                    
                    set.remove(index);
                }
            }

            for (int compare = 0; compare < arr2.size(); compare += 1) {
                
                if (arr2.get(compare) % index != 0 && set.contains(index)) {
                    
                    set.remove(index);
                }
            }
        }
        return set.size();
    }

    // public static int getTotalX(List<Integer> arr1, List<Integer> arr2) {

    //     Set<Integer> resultado = new HashSet<>();
    //     int contar = 0;

    //     for(Integer a : arr1) {

    //         Set<Integer> tempResultado = new HashSet<>();

    //         for (int index = 1; index <= 100; index += 1) {
                
    //             tempResultado.add(a * index);
    //         }

    //         if (contar == 0) {
                
    //             resultado = tempResultado;

    //         } else {

    //             resultado.retainAll(tempResultado);
    //         }
    //         contar = 1;
    //     }

    //     for(Integer b : arr2) {

    //         Set<Integer> tempResultado = new HashSet<>();

    //         for (int index = 1; index <= 100; index += 1) {
                
    //             if (b % index == 0) {
                    
    //                 tempResultado.add(b / index);
    //             }
    //         }

    //         resultado.retainAll(tempResultado);
    //     }
        
    //     return resultado.size();
    // }
}
