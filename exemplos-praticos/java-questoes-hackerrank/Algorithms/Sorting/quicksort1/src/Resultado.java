import java.util.ArrayList;
import java.util.List;


// Neste desafio específico, você receberá um array não ordenado 
// e precisará realizar uma única passagem do algoritmo de ordenação 
// rápida, dividindo o array em três partições.

// As três partições são definidas da seguinte forma:

// Todos os elementos menores ou iguais ao elemento de pivô (o primeiro elemento do array).
// O elemento de pivô.
// Todos os elementos maiores que o elemento de pivô.
// O objetivo é reorganizar o array de forma que os elementos 
// dentro das partições estejam agrupados de acordo com as condições acima.

// A entrada consistirá em um array de inteiros não ordenados. 
// Sua tarefa é realizar uma única passagem do algoritmo de ordenação 
// rápida nesse array e imprimir o array resultante após a partição.
public class Resultado {

    // public static List<Integer> quickSort(List<Integer> arr) {

    //     // Seleciona o elemento de pivô como o primeiro elemento do array
    //     int pivo = arr.get(0);

    //     // Cria duas listas para armazenar os 
    //     // elementos menores (esquerdo) 
    //     // e maiores (direito) que o pivô
    //     List<Integer> esquerdo = new ArrayList<>();
    //     List<Integer> direito = new ArrayList<>();

    //     // Itera pelo array original a partir do segundo elemento
    //     for (int i = 1; i < arr.size(); i++) {
            
    //         // Obtém o valor atual
    //         int valor = arr.get(i);

    //         // Compara o valor com o pivô e adiciona-o à lista apropriada (esquerdo ou direito)
    //         if(valor > pivo) 

    //            direito.add(valor);

    //         else 

    //            esquerdo.add(valor);
    //     }

    //     // Adiciona o elemento de pivô à lista esquerda
    //     esquerdo.add(pivo);

    //     // Concatena a lista direita à lista esquerda para formar o array particionado
    //     esquerdo.addAll(direito);

    //     // Retorna o array particionado
    //     return esquerdo;
    // }

    public static List<Integer> quickSort(List<Integer> arr) {

        // Seleciona o primeiro elemento como o elemento de pivô
        int posInicial = arr.get(0);

        // Cria uma lista para armazenar o resultado
        List<Integer> resultado = new ArrayList<>();

        // Adiciona o elemento de pivô à lista resultado
        resultado.add(posInicial);

        // Itera pelo array a partir do segundo elemento
        for (int i = 1; i < arr.size(); i++) {
            
            // Verifica se o elemento atual é maior que o elemento de pivô
            if(arr.get(i) > posInicial)

               // Se for maior, adiciona-o ao final da lista resultado
               resultado.add(arr.get(i));

            else

               // Se for menor ou igual, encontra a posição correta para inseri-lo na lista resultado
               resultado.add(resultado.indexOf(posInicial), arr.get(i));
        }

        // Retorna a lista resultado após a partição
        return resultado;
    }
    
}
