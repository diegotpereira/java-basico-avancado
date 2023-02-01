import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {

            try {
                
                return bufferedReader.readLine();
            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        }).collect(toList());

        List<String> resultado = Resultado.bigSorting(unsorted);

        bufferedWriter.write(resultado.stream().collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static List<String> bigSorting(List<String> unsorted) {


        return unsorted.stream().sorted((a, b) -> {

            if (a.length() == b.length()) {
                
                return new BigInteger(a).compareTo(new BigInteger(b));
            }

            return a.length() - b.length();
        }).collect(Collectors.toList());
    }

    // public static List<String> bigSorting(List<String> unsorted) {

    //     return unsorted.stream().map(BigInteger::new).sorted().map(String::valueOf).collect(Collectors.toList());
    // }

    // public static List<String> bigSorting(List<String> unsorted) {

    //     Collections.sort(unsorted, new Comparator<String>() {

    //         @Override
    //         public int compare(String a, String b) {
                
    //             if (a.length() > b.length()) {
                    
    //                 return 1;
                     
    //             } else if (a.length() < b.length()) {
                    
    //                 return - 1;

    //             } else {

    //                 BigInteger a1 = new BigInteger(a);
    //                 BigInteger b1 = new BigInteger(b);

    //                 return a1.compareTo(b1);

    //             }
    //         }
            
    //     });

    //     return unsorted;
    // }
}
