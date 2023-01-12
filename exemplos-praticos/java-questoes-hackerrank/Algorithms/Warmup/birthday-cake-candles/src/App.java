import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int contarVelas = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> velas = Stream.of(bufferedReader.readLine()
                                                      .replaceAll("\\s+$", "")
                                                      .split(" "))
                                                      .map(Integer::parseInt)
                                                      .collect(toList());

        int resultado = Resultado.birthdayCakeCandles(velas);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();
        
        bufferedWriter.close();
        bufferedReader.close();
    }
}

class Resultado {

    // public static int birthdayCakeCandles(List<Integer> velas) {

    //     Collections.sort(velas);
    //     int contar = 0;
    //     int ultimoNum = velas.get(velas.size() - 1);

    //     for (int index = 0; index < velas.size(); index += 1) {
            
    //         if (velas.get(index) == ultimoNum) {
                
    //             contar += 1;
    //         }
    //     }
    //     return contar;
    // }

    // public static int birthdayCakeCandles(List<Integer> velas) {

    //     if(velas.size() == 0)

    //         return 0;

    //     int contar = 0;

    //     Collections.sort(velas);

    //     for (int index = 0; index < velas.size(); index += 1) {
            
    //         if (velas.get(index).equals(velas.get(velas.size() - 1)))
                
    //             contar++;

    //     }

    //     return contar;
    // }

    // public static int birthdayCakeCandles(List<Integer> velas) {

    //     // Retorna um Stream sequencial com esta coleção como origem.
    //     int maximo = velas.stream()
    //                       // Retorna um IntStream que consiste nos resultados da aplicação da função fornecida aos elementos desse fluxo.
    //                       .mapToInt(v -> v)
    //                       // Retorna um OptionalInt descrevendo o elemento máximo deste fluxo ou um opcional vazio se este fluxo estiver vazio. Este é um caso especial de redução e é equivalente a:
    //                       .max()
    //                       // Se um valor estiver presente, retorna o valor, caso contrário, lança NoSuchElementException.
    //                       .getAsInt();

    //     return velas.stream()
    //                 .filter(n -> Objects.equals(n, Integer.valueOf(maximo)))
    //                                     .collect(Collectors.toList()).size();
    // }

    // public static int birthdayCakeCandles(List<Integer> velas) {

    //     int resultado = 0;
    //     int tamanho = velas.size();

    //     Map<Integer, Integer> cachedVelas = new HashMap<>();

    //     for (int index = 0; index < tamanho; index += 1) {
            
    //         int atual = velas.get(index);
    //         int montante = cachedVelas.getOrDefault(atual, 0) + 1;

    //         cachedVelas.put(atual, montante);

    //         if (montante > resultado) {
                
    //             resultado = montante;
    //         }
    //     }

    //     return resultado;
    // }

    // public static int birthdayCakeCandles(List<Integer> velas) {

    //     int maiorIdade = velas.get(0);
    //     int contarMaiorIdade = 0;

    //     for (int index = 0; index < velas.size(); index += 1) {
            
    //         maiorIdade = Math.max(maiorIdade, velas.get(index));
    //     }

    //     for (int index = 0; index < velas.size(); index += 1) {

    //         if (velas.get(index) == maiorIdade) {
                
    //             contarMaiorIdade += 1;
    //         }           
    //     }

    //     return contarMaiorIdade;
    // }

    // public static int birthdayCakeCandles(List<Integer> velas) {

    //     int alto = Collections.max(velas);

    //     int quantos = 0;

    //     for(int x : velas) {

    //         if (x == alto) {
                
    //             quantos++;
    //         }
    //     }

    //     return quantos;
    // }

    public static int birthdayCakeCandles(List<Integer> velas) {
        // Write your code here
        int max = velas.get(0);
        int contar = 0;
    
        for (int index = 1;index < velas.size();index += 1) {
            
            if (max < velas.get(index)) {
                
                max = velas.get(index);
            }
        }
        
        for (int index = 0; index < velas.size(); index += 1) {
            
            if (max == velas.get(index)) {
                
                contar++;
            }
        }
        
        return contar;
        
    }
}