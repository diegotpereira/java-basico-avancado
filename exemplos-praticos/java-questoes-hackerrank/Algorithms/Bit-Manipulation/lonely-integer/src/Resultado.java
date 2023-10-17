import java.util.*;
import java.util.Map.Entry;

// O problema "Lonely Integer" no HackerRank trata-se de encontrar 
// o único número em um array que ocorre apenas uma vez, enquanto 
// todos os outros números ocorrem duas vezes.

// A tarefa específica é dada da seguinte forma:

// Dado um array de inteiros, onde cada número ocorre exatamente 
// duas vezes, exceto por um único número que ocorre uma única vez, 
// você deve encontrar e retornar esse número único.

// Por exemplo, se o array for [1, 2, 3, 4, 3, 2, 1], o número 
// único é 4, pois é o único número que ocorre uma vez.

// Sua função deve receber o array como entrada e retornar o 
// número único encontrado.

// Para resolver este problema, você pode utilizar uma 
// estratégia baseada em operações bit a bit, como o 
// operador XOR (^), para encontrar o número único de forma 
// eficiente, sem a necessidade de ordenação ou loops complexos.

public class Resultado {

    // public static int lonelyinteger(List<Integer> arr) {

    //     // Inicializa a variável para armazenar o valor único como o primeiro elemento da lista.
    //     int unicoValor = arr.get(0);

    //     // Utiliza a operação XOR (^) para encontrar o valor único iterando sobre os elementos da lista.
    //     for (int i = 1; i < arr.size(); i++) {
            
    //         unicoValor = unicoValor ^ (arr.get(i));
    //     }

    //     // Retorna o valor único encontrado após percorrer toda a lista.
    //     return unicoValor;
    // }

    // public static int lonelyinteger(List<Integer> arr) {

    //     // Inicializa um contador com zero para encontrar o número único.
    //     int contador = 0;

    //     // Percorre a lista de entrada.
    //     for (int elemento : arr) {

    //         // Usa a operação XOR (^) para encontrar o número único.
    //         contador ^= elemento;
    //     }
            
    //     // Retorna o número único encontrado.
    //     return contador;
    // }

    public static int lonelyinteger(List<Integer> arr) {

        // Cria um HashMap para mapear números e suas contagens.
        HashMap<Integer, Integer> mapaNumeros = new HashMap<>();

        // Inicializa a variável 'unico' para armazenar o número único.
        int unico = 0;

        // Passo 1: Conta as ocorrências de cada número na lista.
        for(int num : arr) {

            // Verifica se o número já existe no mapa, se sim, incrementa a contagem; senão, inicializa com 1.
            mapaNumeros.put(num, mapaNumeros.containsKey(num) ? mapaNumeros.get(num) + 1 : 1);
        }

        // Passo 2: Encontra o número único percorrendo o mapa.
        for (Entry<Integer, Integer> entrada : mapaNumeros.entrySet()) {

            if (entrada.getValue() == 1) {
                
                // Se a contagem for igual a 1, significa que é o número único.
                unico = entrada.getKey();
            }
            
        }

        // Retorna o número único encontrado.
        return unico;
    }
    
}
