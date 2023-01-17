import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine()
                                                   .replaceAll("\\s+$", "")
                                                   .split(" "))
                                                   .map(Integer::parseInt)
                                                   .collect(toList());
        int resultado = Resultado.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    // public static int sockMerchant(int n, List<Integer> ar) {
    //     int contar = 0;

    //     TreeSet<Integer> set = new TreeSet<>(ar);

    //     for(int index : set) {

    //         contar += Collections.frequency(ar, index)  / 2;
    //     }
    //     return contar;
    // }

    // public static int sockMerchant(int n, List<Integer> ar) {

    //     int contar =0;

    //     HashMap<Integer, Integer> hMapa = new HashMap<>();

    //     for(Integer elemento : ar) {

    //         if (hMapa.containsKey(elemento)) {
                
    //             int freq = hMapa.get(elemento);
    //             freq++;
    //             hMapa.put(elemento, freq);

    //             if(freq % 2 == 0)

    //                 contar++;

    //         } else {

    //             hMapa.put(elemento, 1);
    //         }
    //     }
    //     return contar;
    // }

    // public static int sockMerchant(int n, List<Integer> ar) {

    //     int big = ar.get(0);

    //     for (int i = 0; i < ar.size(); i++) {
            
    //         if (ar.get(i) > big)

    //             big = ar.get(i);
    //     }

    //     int[] arr = new int[big + 1];
    //     int par = 0;

    //     for (int i = 0; i < ar.size(); i++) 
            
    //         arr[(ar.get(i))]++;

    //     for (int i = 0; i < arr.length; i++) 

    //         par = par + (arr[i] / 2);
        
    //     return par;
    // }
}