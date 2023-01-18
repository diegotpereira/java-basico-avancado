import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine()
                                                    .replaceAll("\\s+$", "")
                                                    .split(" "))
                                                    .map(Integer::parseInt)
                                                    .collect(toList());

        int resultado = Resultado.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int migratoryBirds(List<Integer> arr) {
        int f[] = new int[5];

        for(int b : arr) {

            f[b - 1]++;
        }

        int max = f[0];
        int indice = 0;

        for(int index = 1; index < f.length; index += 1) {

            if (f[index] > max) {
                
                max = f[index];
                indice = index;
            }
        }
        return indice + 1;
    }

    // public static int migratoryBirds(List<Integer> arr) {

    //     Map<Integer, Integer> tipoFreq = new HashMap<>();

    //     for (int index = 0; index < arr.size(); index += 1) {
            
    //         if (tipoFreq.containsKey(arr.get(index))) {
                
    //             tipoFreq.put(arr.get(index), tipoFreq.get(arr.get(index)) + 1);

    //         } else {

    //             tipoFreq.put(arr.get(index), 1);
    //         }
    //     }

    //     List<Integer> chaveLista = new ArrayList(tipoFreq.keySet());
    //     List<Integer> valorLista = new ArrayList(tipoFreq.values());

    //     return chaveLista.get(valorLista.indexOf(Collections.max(valorLista)));
    // }

    // public static int migratoryBirds(List<Integer> arr) {
    //     int resposta = 0;
    //     int contar = 0;
    //     int[] arr1 = new int[10000];
    //     Arrays.fill(arr1, 0);
    //     Collections.sort(arr);

    //     for (int index = 0; index < arr.size(); index += 1) {
            
    //         arr1[arr.get(index) - 1]++;

    //     }

    //     for (int index = 0; index < 10000; index += 1) {
            
    //         if (arr1[index] > resposta) {
                
    //             resposta = Math.max(resposta, arr1[index]);
    //             contar = index;

    //         } 

    //         if (arr1[index] == resposta) {
                
    //             contar = Math.min(contar, index);
    //         }
    //     }
    //     return contar + 1;
    // }

    // public static int migratoryBirds(List<Integer> arr) {

    //     int tamanhoArray = arr.size()   ;
    //     int max = 0;
    //     int maxIndice = 0;

    //     Collections.sort(arr);

    //     for (int index = 0; index < tamanhoArray; index += 1) {
            
    //         int contar = 0;

    //         for (int compare = index; compare < tamanhoArray; compare += 1) {
                
    //             if (arr.get(index) != arr.get(compare)) {
                    
    //                 break;

    //             } else if (arr.get(index) == arr.get(compare)) {
                    
    //                 contar++;
    //             }
    //         }

    //         if (max < contar) {
                
    //             max = contar;
    //             maxIndice = arr.get(index);
    //         }
    //     }
    //     return maxIndice;
    // }

    // public static int migratoryBirds(List<Integer> arr) {

    //     List<Integer> repeticoes = new ArrayList<Integer>(Collections.nCopies(arr.size(), 0));

    //     for (int index = 0; index < arr.size(); index++) {
            
    //         Integer posicao = arr.get(index);
    //         Integer soma = repeticoes.get(posicao) + 1;
    //         repeticoes.set(posicao, soma);

    //     }

    //     Integer maxIndice = 0;

    //     for (Integer index = 1; index < repeticoes.size(); index += 1) {
            
    //         if (repeticoes.get(maxIndice) < repeticoes.get(index)) {
                
    //             maxIndice = index;
    //         }
    //     }
    //     return maxIndice;
    // }

    // public static int migratoryBirds(List<Integer> arr) {

    //     int maxFreq = 0;
    //     int numero = -1;

    //     HashMap<Integer, Integer> mapa = new HashMap<>();

    //     for(int index : arr) {

    //         if (mapa.containsKey(index)) {
                
    //             mapa.put(index, mapa.get(index) + 1);

    //         } else {

    //             mapa.put(index, 1);
    //         }
    //     }

    //     Set<Integer> chaveSet = mapa.keySet();

    //     for(Integer index : chaveSet) {

    //         if(mapa.get(index) > maxFreq) {

    //             numero = index;
    //             maxFreq = mapa.get(index);
    //         }
    //     }

    //     return numero;
    // }
}