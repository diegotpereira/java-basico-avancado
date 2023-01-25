import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> p = Stream.of(bufferedReader
                                .readLine()
                                .replaceAll("\\s+$", "")
                                .split(" "))
                                .map(Integer::parseInt)
                                .collect(toList());
        List<Integer> resultado = Resultado.permutationEquation(p);

        bufferedWriter.write(resultado.stream().map(Object::toString).collect(joining("\n")));

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}

class Resultado {

    public static List<Integer> permutationEquation(List<Integer> p) {

        Integer a[] = new Integer[p.size()];

        for (int indice = 1; indice <= p.size(); indice++) {
            
            for (int compare = 0; compare < p.size(); compare++) {
                
                if (p.get(compare) == indice) {
                    
                    a[p.get(indice - 1) - 1] = compare + 1;
                    break;
                }
            }
        }
        return Arrays.asList(a);
    }

    // public static List<Integer> permutationEquation(List<Integer> p) {

    //     List<Integer> resposta = new ArrayList<>();

    //     for (int indice = 1; indice <= p.size(); indice += 1) {
            
    //         int x = p.indexOf(indice) + 1;
    //         int y = p.indexOf(x) + 1;

    //         resposta.add(y);
    //     }
    //     return resposta;
    // }

    // public static List<Integer> permutationEquation(List<Integer> p) {

    //     ArrayList<Integer> resultado = new ArrayList<>();

    //     for (int i = 1; i <= p.size(); i++) {
            
    //         resultado.add(p.indexOf(p.indexOf(i) + 1) + 1);
    //     }
    //     return resultado;
    // }

    // public static List<Integer> permutationEquation(List<Integer> p) {

    //     List<Integer> arr = new ArrayList<>();
    //     List<Integer> arr1 = new ArrayList<>();
    //     int j = 1;

    //     for (int indice = 0; indice < p.size(); indice++) {
            
    //         int index = p.indexOf(j); // index = 2
    //         arr.add(index + 1);
    //         arr1.add(p.indexOf(arr.get(indice)) + 1);
    //         j++; // j = 2
    //     }
    //     return arr1;
    // }
}
