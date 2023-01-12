import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                                 .replaceAll("\\s+$", "")
                                                                 .split(" ");

                int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int k = Integer.parseInt(primeiraMultiplaEntrada[1]);

                List<Integer> resultado = Resultado.absolutePermutation(n, k); // 2 1
                                                                               // 1 2 3
                                                                               // - 1
         

                bufferedWriter.write(resultado
                              .stream()
                              .map(Object::toString)
                              .collect(joining(" "))
                                + "\n"
                            );
                

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    // public static List<Integer> absolutePermutation(int n, int k) {
    //     Integer[] perm = new Integer[n];
    //     Set<Integer> usado = new HashSet<>();

    //     for (int index = 0; index < n; ++index) {
            
    //         if (index + 1 - k > 0 && !usado.contains(index + 1 - k)) {
                
    //             perm[index] = index + 1 - k;
    //             usado.add(index + 1 - k);

    //         } else if (index + 1 + k <= n && !usado.contains(index + 1 + k)) {
                
    //             perm[index] = index + 1 + k;
    //             usado.add(index + 1 + k);

    //         } else {

    //             return Arrays.asList(-1);
    //         }
    //     }

    //     return Arrays.asList(perm);
    // }
    
    public static List<Integer> absolutePermutation(int n, int k) {
        // Write your code here
        Integer[] resultado = new Integer[n];
        int idx;
        
        for (int valor = 1; valor <= n; valor += 1) {
            
            idx = valor - k;
            
            if(idx <= n && idx > 0 && resultado[idx - 1] == null) {
                
                resultado[idx - 1] = valor;
                
            } else {
                
                idx = valor + k;
                
                if(idx <= n && idx > 0 && resultado[idx - 1] == null) {
                    
                    resultado[idx - 1] = valor;
                    
                } else {
                    
                    resultado = new Integer[1];
                    resultado[0] = -1;
                    
                    return Arrays.asList(resultado);
                }
            }
        }
        
        return Arrays.asList(resultado);
    }
}
