import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int k = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> s = Stream.of(bufferedReader.readLine()
                                                  .replaceAll("\\s+$", "")
                                                  .split(" "))
                                                  .map(Integer::parseInt)
                                                  .collect(toList());

        int resultado = Resultado.nonDivisibleSubset(k, s);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {


    public static int nonDivisibleSubset(int k, List<Integer> s) {
        // Write your code here
        int[] frequencia = new int[k];
        
        for(int indice = 0; indice < s.size(); indice += 1) {
            
            frequencia[s.get(indice) % k] += 1;
        }
        
        int contar = 0;
        
        if(frequencia[0] > 0) 
        
            contar = 1;
            
            if(k % 2 == 0 && frequencia[k / 2] > 0)
            
                contar += 1;
                
            for(int indice = 1, compare = k - 1; indice < compare; indice += 1, compare -= 1) {
                
                if(frequencia[indice] > frequencia[compare])
                
                    contar += frequencia[indice];
                    
                else 
                
                    contar += frequencia[compare];
            } 
            
            return contar;
    }

    // public static int nonDivisibleSubset(int k, List<Integer> s) {

    //     int[] contagemRestante = new int[k];

    //     for(int num : s) 

    //         contagemRestante[num % k] += 1;

    //     int tamanhoSubSet = 0;

    //     for(int indice = 1; indice <= k >> 1; indice += 1)

    //         if(k != indice << 1)

    //         tamanhoSubSet += Math.max(contagemRestante[indice], contagemRestante[k - indice]);

    //         if((k & 1) == 0)

    //             tamanhoSubSet += Math.min(contagemRestante[k >> 1], 1);

    //     return tamanhoSubSet + Math.min(contagemRestante[0], 1);
    // }

    // public static int nonDivisibleSubset(int k, List<Integer> s) {

    //     List<Integer> lista = new ArrayList<>();
    //     int contar = 0;

    //     for (int indice = 0; indice < s.size(); indice += 1) {
            
    //         lista.add(s.get(indice) % k);
    //     }

    //     int i = 1;
    //     int j = k - 1;

    //     while (j > i) {
            
    //         int iFreq = Collections.frequency(lista, i); // iFreq = 3
    //         int kFreq = Collections.frequency(lista, j); // kFreq = 1
    //         int contaMax = iFreq > kFreq ? iFreq : kFreq; // contaMax = 3

    //         contar = contar + contaMax; // contar = 3
    //         i++;
    //         j--;
    //     }

    //     if(k % 2 == 0)

    //         contar++;

    //     if(lista.contains(0))

    //         contar++;

    //     return contar;
    // }

    // public static int nonDivisibleSubset(int k, List<Integer> s) {

    //     int[] lembrar = new int[k + 1];
    //     int contar = 0;

    //     // criar tabela de frequências de lembretes
    //     // para saber quantas vezes um lembrete aparece em nossa lista

    //     for(int i : s) {

    //         lembrar[i % k]++;
    //     }

        
    //     /* lembretes 0 são nossos elementos divisíveis na lista
    //         então escolhemos apenas um elemento dele */

    //     if (lembrar[0] > 1 ) 

    //         lembrar[0] = 1;

        
    //     /* se tivermos mais de um "lembrar" val cujo índice é k/2
    //         apenas mantenha um elemento porque se tivermos mais de 1 elemento
    //         significa que temos um divisível */

    //     if(k % 2 == 0 && lembrar[k / 2] > 1)

    //         lembrar[k / 2] = 1;

    //     for (int indice = 0; indice < lembrar.length; indice++) {
            
    //         /* se tivermos dois elementos que é a soma deles
    //         é o nosso valor divisível, escolha o valor com
    //         o valor de maior frequência */
    //         if (lembrar[k - indice] > lembrar[indice]) {
                
    //             contar += lembrar[k - indice];

    //         } else {

    //             contar += lembrar[indice];
    //         }

            
    //         /* remove ambos os valores para que não os contemos
    //                 na próxima iteração */
    //         lembrar[indice] = 0;
    //         lembrar[k - indice] = 0;
    //     }

    //     return contar;
    // }

    // public static int nonDivisibleSubset(int k, List<Integer> s) {

    //     int[] loja = new int[k];
    //     int len = 0;

    //     len += (k % 2 == 0) ? 1 : 0;

    //     for(int indice = 0; indice < s.size(); indice += 1)

    //         loja[s.get(indice) % k]++;

    //     for(int indice = 1; indice < (int)Math.ceil((double) k / 2); indice += 1)

    //         len += (loja[indice] > loja[k - indice]) ? loja[indice] : loja[k - indice]; 

    //     return (loja[0] > 0) ? len + 1 : len;
    // }

    // public static int nonDivisibleSubset(int k, List<Integer> s) {

    //     int[] maxSubSet = {1};

    //     List<Integer> subSet = new ArrayList<>();

    //     s.forEach(num -> {

    //         subSet.add(num);

    //         if (subSet.size() > 1) {
                
    //             for (int indice = 0; indice < subSet.size(); indice += 1) {
                    
    //                 int numNoSubSet = indice;

    //                 IntStream.range(numNoSubSet + 1, subSet.size()).forEach(t -> {

    //                     if (t < subSet.size() && (subSet.get(numNoSubSet) + subSet.get(t)) % k == 0) {
                            
    //                         List<Integer> copiaSubSet = new ArrayList<>(subSet);

    //                         Collections.copy(copiaSubSet, subSet);
    //                         subSet.clear();
    //                         subSet.addAll(copiaSubSet.subList(numNoSubSet + 1, copiaSubSet.size()));
    //                     }
    //                 });
    //             }
    //         }

    //         maxSubSet[0] = Math.max(maxSubSet[0], subSet.size());
    //     });

    //     return maxSubSet[0];
    // }
}
