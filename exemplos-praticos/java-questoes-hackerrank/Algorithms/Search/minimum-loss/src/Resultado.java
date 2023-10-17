import java.util.*;

// A tarefa do problema "Minimum Loss" no HackerRank é 
// encontrar o menor valor de perda possível ao vender uma propriedade. 
// O problema fornece um conjunto de preços de venda de propriedades em 
// anos diferentes e pede para determinar o menor valor de perda que 
// ocorre ao vender a propriedade em dois anos diferentes, onde o preço 
// de venda no ano posterior é menor do que o preço de venda no ano anterior.

// Em resumo, o problema solicita encontrar o menor valor de perda que 
// ocorre ao vender a propriedade em dois anos diferentes, com o preço 
// de venda no ano posterior sendo menor do que o preço de venda no 
// ano anterior, considerando as datas de venda e os preços.

public class Resultado {

    // public static int minimumLoss(List<Long> preco) {

    //     // Cria um array 'precos' para armazenar os preços como números inteiros.
    //     long[] precos = new long[preco.size()];

    //     // Copia os preços da lista 'preco' para o array 'precos'.
    //     for (int i = 0; i < preco.size(); i++) {
            
    //         precos[i] = preco.get(i);
    //     }

    //     // Cria um mapa 'indiceMapa' para mapear os preços aos seus índices originais na lista.
    //     Map<Long, Integer> indiceMapa = new HashMap<>();

    //     // Preenche o mapa 'indiceMapa' com os preços e seus índices correspondentes.
    //     for (int i = 0; i < preco.size(); i++) {
            
    //         indiceMapa.put(precos[i], i);
    //     }

    //     // Ordena o array 'precos' em ordem crescente.
    //     Arrays.sort(precos);

    //     // Inicializa a variável 'perdaMinima' com um valor máximo possível.
    //     long perdaMinima = Long.MAX_VALUE;

    //     // Itera sobre os preços ordenados para encontrar a perda mínima.
    //     for (int i = 1; i < preco.size(); i++) {
            
    //         // Verifica se o preço atual está em uma data posterior à data anterior.
    //         if (indiceMapa.get(precos[i]) < indiceMapa.get(precos[i - 1])) {
                
    //             // Calcula a perda mínima entre esses preços.
    //             perdaMinima = Math.min(perdaMinima, precos[i] - precos[i - 1]);
    //         }
    //     }

    //     // Converte a perda mínima em um inteiro e a retorna.
    //     return (int) perdaMinima;
    // }

    public static int minimumLoss(List<Long> preco) {

        // Cria um mapa 'mapa' para mapear preços aos seus índices originais na lista.
        HashMap<Long, Integer> mapa = new HashMap<>();

        // Preenche o map 'mapa' com os preços e seus índices correspondentes na lista.
        for (int i = 0; i < preco.size(); i++) {
            
            mapa.put(preco.get(i), i);
        }

        // Ordena a lista de preços 'preco' em ordem crescente.
        Collections.sort(preco);

        // Inicializa a variável 'min' com o maior valor possível de um inteiro.
        long min = Integer.MAX_VALUE;

        // Itera sobre a lista de preços para encontrar a perda mínima.
        for (int i = 0; i < preco.size() - 1; i++) {
            
            // Calcula a diferença entre o preço atual e o próximo preço na lista.
            long atualMin = preco.get(i + 1) - preco.get(i);

            // Verifica se a diferença é menor do que a perda mínima e se a data do preço atual é posterior à data do próximo preço.
            if(atualMin < min && mapa.get(preco.get(i)) > mapa.get(preco.get(i + 1))) min = atualMin;
        }

        // Converte a perda mínima em um inteiro e a retorna.
        return (int) min;
    }
    
}
