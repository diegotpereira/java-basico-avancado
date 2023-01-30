import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;


public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "")
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList());

        int resultado = Resultado.jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int jumpingOnClouds(List<Integer> c) {

        int saltos = - 1;

        for (int i = 0; i < c.size(); i++) {
            
            saltos++;

            if(i + 2 < c.size() && c.get(i + 2) !=  1)

                i++;
        }
        return saltos;
    }

    // public static int jumpingOnClouds(List<Integer> c) {
    //     int saltos = 0;
    //     int consecutivos = 0;

    //     for(Integer nuvem : c) {

    //         if (nuvem == 1) {
                
    //             saltos++;
    //             consecutivos = 0;
                 
    //         } else {

    //             consecutivos++;
    //         }

    //         if (consecutivos != 0 && consecutivos % 2 == 0) {
                
    //             saltos++;
    //         }
    //     }
    //     return saltos;
    // }

    // public static int jumpingOnClouds(List<Integer> c) {

    //     int contar =-1;
    //     int n = c.size();
    //     int i = 0;

    //     while (i < c.size()) {
            
    //         if (i < n - 2 && c.get(i + 2) == 0) {
                
    //             i = i + 2;

    //         } else {

    //             i += 1;
    //         }

    //         contar += 1;
    //     }
    //     return contar;
    // }

    // public static int jumpingOnClouds(List<Integer> c) {
    //     int contar = 0;

    //     for (int i = 0; i < c.size() - 1;) {
            
    //         if(i < c.size() - 2 && c.get(i + 2) == 0)

    //             i = i + 2;

    //         else 

    //             i++;
    //             contar++;
    //     }
    //     return contar;
    // }

    // public static int jumpingOnClouds(List<Integer> c) {

    //     int contar = 0;

    //     for (int i = 0; i < c.size(); i += 2) {
            
    //         if(c.get(i) == 1) 
            
    //             i--;
    //         if(i == c.size() - 2 && c.get(c.size() - 1) == 0) 

    //             contar++;

    //         contar++;
    //     }
    //     return contar - 1;
    // }
}