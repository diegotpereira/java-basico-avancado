import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Resultado {

    // O método recebe uma lista de números inteiros como parâmetro e retorna um inteiro.
    public static int toys(List<Integer> w) {

        // Cria-se um AtomicInteger inicializado com -5.
        AtomicInteger primeira = new AtomicInteger(-5);

        // Utiliza-se a stream() para transformar a lista em uma sequência de elementos.
        // Ordena-se essa sequência utilizando o método sorted().
        // Depois, utiliza-se o método reduce() para realizar a operação de redução.
        // O segundo parâmetro do reduce() é uma função lambda que recebe dois argumentos a e b.
        // Essa função verifica se b é maior que o valor atual do AtomicInteger primeira mais 4.
        // Se for, atualiza-se o valor do primeiro com b e retorna-se a soma atualizada de a + 1.
        // Caso contrário, retorna-se apenas o valor atual de a.
        return w.stream().sorted().reduce(0, (a, b) -> {

            if (b > primeira.get() + 4) {
                
                primeira.set(b);

                return a + 1;
            }

            return a;
        });
    }

    // public static int toys(List<Integer> w) {

    //     // Ordena a lista de pesos em ordem crescente
    //     Collections.sort(w);

    //     // Inicia o primeiro e o último índice do intervalo de pesos de um contêiner
    //     int inicio = 0;
    //     int fim = 0;

    //     // Contador inicializado em 1 para contar o primeiro contêiner
    //     int contar = 1;

    //     // Loop enquanto o último índice do intervalo de pesos de um contêiner for 
    //     // menor que o tamanho da lista de pesos - 1
    //     while (fim < w.size() - 1) {

    //         // Verifica se o próximo peso na lista pode ser adicionado ao contêiner
    //         if (w.get(fim + 1) <= w.get(inicio) + 4) {
                
    //             // Se puder, atualiza o último índice do intervalo de pesos do contêiner
    //             fim++;

    //         } else {

    //             // Se não puder, incrementa o contador e atualiza o intervalo para o próximo contêiner
    //             contar++;
    //             inicio = fim + 1;
    //             fim = inicio;
    //         }
    //     }

    //     // Retorna o número total de contêineres necessários
    //     return contar;
    // }

    

    // public static int toys(List<Integer> w) {

    //     // Ordena a lista de pesos em ordem crescente
    //     Collections.sort(w);

    //     // Define o peso mínimo da lista como a posição inicial para verificação do próximo brinquedo
    //     int pos = w.get(0);

    //     // Define o número inicial de contêineres como 1
    //     int contarContainers = 1;

    //     // Percorre a lista de pesos de brinquedos
    //     for (Integer peso : w) {
            
    //         // Se o peso do brinquedo atual não exceder o peso máximo permitido em um contêiner
    //         if (peso <= pos + 4) {
                
    //             // Pula para o próximo brinquedo
    //             continue;
    //         }

    //         // Se o peso do brinquedo atual exceder o peso máximo permitido em um contêiner
    //         // Adiciona um novo contêiner
    //         contarContainers++;

    //         // Define o peso mínimo do novo contêiner como o peso do brinquedo atual
    //         pos = peso;
    //     }

    //     // Retorna o número total de contêineres necessários
    //     return contarContainers;
    // }

    // public static int toys(List<Integer> w) {

    //     // Ordena a lista de pesos em ordem crescente
    //     Collections.sort(w);

    //     // Define o peso máximo permitido em um contêiner como o peso mínimo da lista mais 4 unidades
    //     int pesoMaximo = w.get(0) + 4;

    //     // Define o número inicial de contêineres como 1
    //     int contar = 1;

    //     // Percorre a lista de pesos de brinquedos
    //     for (int i = 0; i < w.size(); i++) {
            
    //         // Se o peso do brinquedo atual exceder o peso máximo permitido em um contêiner
    //         if (w.get(i) > pesoMaximo) {
                
    //             // Adiciona um novo contêiner
    //             contar++;

    //             // Define o peso máximo permitido no novo contêiner como 4 unidades adicionadas ao peso do brinquedo atual
    //             pesoMaximo = w.get(i) + 4;
    //         }
    //     }

    //     // Retorna o número total de contêineres necessários
    //     return contar;
    // }
    
}
