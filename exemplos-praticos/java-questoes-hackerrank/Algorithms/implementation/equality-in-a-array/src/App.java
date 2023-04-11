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
                                  .replaceAll("\\s+$", "")
                                  .split(" "))
                                  .map(Integer::parseInt)
                                  .collect(toList());

        int resultado = Resultado.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}

class Resultado {

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        
        int deletar = 0;
        int contar = 0;
        int maxOcorrencia = 0;
        int maximo = Integer.MIN_VALUE;
        
        for(int indice = 1; indice < arr.size() - 1; indice += 1) {
            
            if(arr.get(indice) == arr.get(indice + 1)) {
                
                contar++;
                
            } else
            
                contar = 0;
                
                if (contar > maximo) {
                    
                    maximo = contar;
                    maxOcorrencia = arr.get(indice - 1);
                }
        }
        
        for(int n : arr) {
            
            if(n !=  maxOcorrencia) {
                
                deletar++;
            }
        }
        return deletar;
    }

    // public static int equalizeArray(List<Integer> arr) {
    //     int max = 0;
    //     int atual = 0;
    //     int listaLen = arr.size();

    //     Set<Integer> distancia = new HashSet<>(arr);

    //     for(int i : distancia){

    //         atual = Collections.frequency(arr, i);

    //         if (max < atual) {
                
    //             max = atual;
    //         }
    //     }
    //     return (listaLen - max);
    // }

    // public static int equalizeArray(List<Integer> arr) {
    //     HashMap<Integer, Integer> mapa = new HashMap<>();

    //     for(Integer i : arr) {

    //         if(!mapa.containsKey(i))

    //             mapa.put(i, 1);

    //         else 

    //             mapa.put(i, mapa.get(i) + 1);
    //     }
    //     return arr.size() - Collections.max(mapa.values());
    // }

    // public static int equalizeArray(List<Integer> arr) {
    //     int[] frequencias = new int[101];

    //     Arrays.fill(frequencias, 0);

    //     for(int i : arr) {

    //         frequencias[i] = frequencias[i] + 1;
    //     }

    //     int maxFreq = Integer.MIN_VALUE;

    //     for(int i : frequencias) {

    //         maxFreq = Math.max(maxFreq, i);
    //     }
    //     return arr.size() - maxFreq;
    // }

    // public static int equalizeArray(List<Integer> arr) {

    //     int contar = 0;
    //     int maxConta = 0;

    //     //Passa por cada valor na lista de array
    //     //Verifica-o contra cada valor depois dele
    //     //Se forem iguais, incrementa a contagem
    //     for (int indice = 0; indice < arr.size(); indice += 1) {
            
    //         for (int compare = indice + 1; compare < arr.size(); compare += 1) {
                
    //             if (arr.get(indice) == arr.get(compare)) {
                    
    //                 contar++;
    //             }

    //             //se a contagem for maior que o maxConta atual,
    //             //faz disso o novo maxConta
    //             if (contar > maxConta) {
                    
    //                 maxConta = contar;
    //             }
    //         }

    //         contar = 0;
    //     }
    //     //Como o maxCount não inclui o valor em si,
    //     //A contagem real de valores correspondentes é 1 a mais que maxCount
    //     //Então subtraia 1 da declaração de retorno para compensar isso
    //     return arr.size() - maxConta - 1;
    // }

    // public static int equalizeArray(List<Integer> arr) {

    //     int maxContar = 0;
    //     TreeSet<Integer> contar = new TreeSet<Integer>(arr);

    //     for(Integer x : contar) {

    //         int tempContar = 0;

    //         for(Integer y : arr) {

    //             if(x == y) {

    //                 tempContar++;
    //             }

    //             if(tempContar > maxContar) 

    //                 maxContar = tempContar;
    //         }
    //     }
    //     return arr.size() - maxContar;
    // }
}