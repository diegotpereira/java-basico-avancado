import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$",    "").split(" ");
        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int contagemRotacao = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int resposta = Integer.parseInt(primeiraMultiplaEntrada[2]);

        List<Integer> a = Stream.of(bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "")
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList());

        List<Integer> consultas = IntStream.range(0, resposta).mapToObj(i -> {

            try {
                
                return bufferedReader.readLine().replaceAll("\\s+$", "");

            } catch (Exception e) {
                
                throw new RuntimeException(e);
            }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());

        List<Integer> resultado = Resultado.circularArrayRotation(a, contagemRotacao, consultas);

        bufferedWriter.write(resultado
                      .stream()
                      .map(Object::toString)
                      .collect(joining("\n")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        
        for(int index = 0; index < k; index += 1) {
            
            a.add(0, a.get(a.size() - 1));
            a.remove(a.size() - 1);
            
        }
        
        List<Integer> q = new ArrayList<>();
        
        for(int i : queries) {
            
            q.add(a.get(i));
        }
        
        return q;
    }

    // public static List<Integer> circularArrayRotation(List<Integer> a, int contagemRotacao, List<Integer> consultas) {

    //     int l = a.size();

    //     List<Integer> resultado = new ArrayList<>();

    //     consultas.forEach(x -> {

    //         resultado.add(a.get((l + (x - contagemRotacao   ) % l) % l));
    //     });
    //     return resultado;
    // }

    // public static List<Integer> circularArrayRotation(List<Integer> a, int contagemRotacao, List<Integer> consultas) {

    //     List<Integer> resposta = new ArrayList<>();
    //     int deslocamento = a.size() - contagemRotacao % a.size();


    //     for(int indicador : consultas) {

    //         resposta.add(a.get((deslocamento + indicador) % a.size()));

    //     }
    //     return resposta;
    // }

    // public static List<Integer> circularArrayRotation(List<Integer> a, int contagemRotacao, List<Integer> consultas) {

    //     int n = a.size(); // n = 3

    //     Integer[] x = new Integer[n]; // x = Integer[3]
    //     Arrays.fill(x, 0);
    //     List<Integer> c = Arrays.asList(x);
    //     int finalK = contagemRotacao; // fianlK = 2

    //     IntStream.range(0, n).forEach(i -> {

    //         int t = a.get(i);

    //         if(i + finalK < n) {

    //             c.set(i + finalK,t);

    //         } else {

    //             c.set((i + finalK) % n, t);
    //         }
    //     });

    //     List<Integer> resposta = new ArrayList<>();

    //     for(Integer j : consultas) {

    //         resposta.add(c.get(j));
    //     }

    //     return resposta;
    // }
}