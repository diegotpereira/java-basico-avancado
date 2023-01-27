import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader
                                  .readLine()
                                  .replaceAll("\\s+$", "").split(" "))
                                  .map(Integer::parseInt)
                                  .collect(toList());

        List<Integer> resultado = Resultado.cutTheSticks(arr);
        
        bufferedWriter.write(resultado
                      .stream()
                      .map(Object::toString)
                      .collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer> resultado = new ArrayList<>();
        
        while(!arr.isEmpty()) {
            
            resultado.add(arr.size());
            int min = Collections.min(arr);
            
            for(int indice = 0; indice < arr.size(); indice += 1) {
                
                if (arr.get(indice) - min == 0) {
                    
                    arr.remove(indice);
                    indice--;
                       
                } else {
                    
                    arr.set(indice, arr.get(indice) - min);
                }
            }
        }
        
        return resultado;
    }

    // public static List<Integer> cutTheSticks(List<Integer> arr) {

    //     List<Integer> resultado = new ArrayList<>();

    //     while (arr.size() != 0) {
            
    //         resultado.add(arr.size());
    //         int min = Collections.min(arr);

    //         arr.removeAll(Collections.singleton(min));
    //     }
    //     return resultado;
    // }

    // public static List<Integer> cutTheSticks(List<Integer> arr) {

    //     List<Integer> lista = new ArrayList<>();

    //     Collections.sort(arr);

    //     for (int indice = 0; indice < arr.size(); indice += 1) {
            
    //         lista.add(arr.size() - indice);

    //         while (indice < arr.size() - 1 && arr.get(indice).equals(arr.get(indice + 1))) 

    //             indice++;
    //     }

    //     return lista;
    // }

    // public static List<Integer> cutTheSticks(List<Integer> arr) {

    //     ArrayList<Integer> resposta = new ArrayList<Integer>();

    //     resposta.add(arr.size());

    //     while (arr.size() > 0) {
            
    //         int min = Collections.min(arr);
            
    //         for (int indice = arr.size() - 1; indice >= 0; indice -= 1) {
                
    //             if (arr.get(indice) == min) 

    //                 arr.remove(indice);
    //         }

    //         if(arr.size() != 0)

    //             resposta.add(arr.size());
    //     }
    //     return resposta;
    // }
}