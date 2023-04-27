import java.util.*;

public class Resultado {

    public static List<Integer> largestPermutation(int k, List<Integer> arr) {

        // Crie uma cópia da lista para ordenar em ordem decrescente
        ArrayList<Integer> copia_arr = new ArrayList<>(arr);

        // Ordene a cópia em ordem decrescente
        Collections.sort(copia_arr, Collections.reverseOrder());

        // Troque os k maiores elementos da lista pelas suas correspondentes posições
        for (int i = 0; i < k; i++) {
            
            // Recupere o i-ésimo maior elemento da lista ordenada
            Integer debug = copia_arr.get(i);

            // Encontre a posição do i-ésimo maior elemento na lista original
            int indice = arr.indexOf(debug);

            // Troque os elementos de posição usando o método swap da classe Collections
            Collections.swap(arr, i, indice);
        }

        // Retorne a lista modificada
        return arr;
    }

    // public static List<Integer> largestPermutation(int k, List<Integer> arr) {

    //     int n = arr.size();

    //     // Crie um HashMap para armazenar a posição de cada elemento na lista
    //     Map<Integer, Integer> posicoes = new HashMap<>();

        
    //     for (int i = 0; i < n; i++) {
            
    //         posicoes.put(arr.get(i), i);
    //     }

    //     // Percorra a lista e troque os elementos de posição, se necessário
    //     for (int i = 0; i < n && k > 0; i++) {
            
    //         if (arr.get(i) == n - i) {
                
    //             // Se o elemento está na posição correta, continue para o próximo elemento
    //             continue;
    //         }

    //         // Recupere a posição do maior elemento que ainda não está na posição correta
    //         int pos = posicoes.get(n - i);

    //         // Atualize o HashMap para refletir a nova posição dos elementos que foram trocados
    //         posicoes.put(arr.get(i), pos);
    //         posicoes.put(n - i, i);

    //         // Troque os elementos de posição na lista
    //         int tmp = arr.get(i);

    //         arr.set(i, n - i);
    //         arr.set(pos, tmp);

    //         // Decremento o valor de k
    //         k--;
    //     }

    //     // Retorne a lista modificada
    //     return arr;

    // }
    

}
