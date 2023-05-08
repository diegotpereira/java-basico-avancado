import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Resultado {    

    // // Este método recebe como parâmetros o tamanho da 
    // // cobertura de cada torre k e uma lista de inteiros 
    // // que indica a cobertura de cada casa da vila
    public static int pylons(int k, List<Integer> arr) {

        // Variável que armazena o número mínimo de torres necessárias
        int min_torres = 0;

        // Variável que armazena a posição atual da vila
        int vila = 0;

        // Variável que armazena a posição do fornecedor 
        // mais distante que pode ser atendido pela torre mais próxima
        int fornecedor = vila + k - 1;

        // Enquanto não percorrer toda a vila
        while (vila < arr.size()) {

            // Se a casa atendida pelo fornecedor mais distante tiver cobertura
            if (arr.get(fornecedor) == 1) {
                
                // A nova posição da vila será a casa logo após a casa atendida pela torre
                vila = fornecedor + k;

                // O novo fornecedor mais distante que pode ser atendido pela torre mais próxima 
                // será a casa k casas após a nova posição da vila
                fornecedor = vila + k - 1;

                // Se o fornecedor ultrapassar o limite da vila, ele será ajustado para a última 
                // casa da vila
                if (fornecedor >= arr.size()) {
                    
                    fornecedor = arr.size() - 1;
                }

                // Incrementa o número mínimo de torres necessárias
                min_torres++;

            } else {

                // Se a casa atendida pelo fornecedor mais distante não tiver cobertura, 
                // move o fornecedor para a casa anterior
                fornecedor--;

                // Se o fornecedor ultrapassar o limite de cobertura da torre mais próxima 
                // ou for menor que zero, significa que não há cobertura para a vila
                if(fornecedor < vila - k + 1 || fornecedor < 0) {

                    // Retorna -1, indicando que não é possível fornecer cobertura para toda a vila
                    return -1;
                }
            }
        }

        // Retorna o número mínimo de torres necessárias para fornecer cobertura para toda a vila
        return min_torres;
    }

    // public static int pylons(int k, List<Integer> arr) {

    //     // Inicialização das variáveis
    //     int contar = 0;
    //     int prevLoc = -k;

    //     // Rótulo utilizado para sair do loop externo
    //     Outro:

    //     // Loop para percorrer a lista de entrada
    //     for (int i = 0; i < arr.size(); i++) {
            
    //         // Cálculo da posição máxima de cobertura da torre anterior
    //         int maxCobertura = prevLoc + k;

    //         // Se a posição atual estiver dentro da cobertura da torre anterior, continua para o próximo
    //         if(i < maxCobertura)

    //             continue;

    //         // Cálculo dos índices máximo e mínimo para percorrer a lista
    //         int max = Math.min(arr.size() - 1, i + k - 1);
    //         int min = Math.max(0, i - (k - 1));

    //         // Loop para percorrer as posições cobertas pela torre atual
    //         for (int j = max; j >= min; j--) {
                
    //             // Se a posição contém uma torre, incrementa o contador e define a posição da torre atual
    //             if (arr.get(j) == 1) {
                    
    //                 contar++;
    //                 prevLoc = j;

    //                 // Retorna ao loop externo para procurar a próxima posição sem cobertura
    //                 continue Outro;
    //             }
    //         }

    //         // Retorna -1 se não for possível construir uma torre em uma posição sem cobertura
    //         return - 1;
    //     }

    //     // Retorna o número de torres construídas
    //     return contar;
    // }
    
    
}
