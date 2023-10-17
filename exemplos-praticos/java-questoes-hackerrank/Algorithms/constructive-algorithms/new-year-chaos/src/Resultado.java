import java.util.*;

// O problema "New Year Chaos" no HackerRank trata de simular 
// uma situação onde pessoas estão formando uma fila para entrar 
// em um evento no Ano Novo. Cada pessoa possui um número associado, 
// representando sua posição original na fila. No entanto, as 
// pessoas podem tentar subornar as que estão na frente delas para trocar de posição na fila.

// A tarefa é determinar quantos subornos foram realizados e se o 
// número total de subornos em qualquer posição da fila exceder um 
// valor máximo permitido. O objetivo é determinar se é possível 
// chegar à configuração atual da fila respeitando o limite de 
// subornos por pessoa. Se for possível, a saída deve ser o número 
// total de subornos realizados; caso contrário, a saída deve indicar 
// que a situação é caótica demais para ser resolvida.

// Em resumo, a tarefa é implementar um algoritmo para contar o número 
// mínimo de subornos necessários para organizar a fila inicial e 
// determinar se essa quantidade de subornos é aceitável, considerando 
// um limite máximo. O link fornecido leva à página do problema no HackerRank, 
// onde mais detalhes, exemplos e informações específicas sobre o problema estão disponíveis.

public class Resultado {

    // public static void minimumBribes(List<Integer> q) {

        // int n = q.size();
        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
            
        //     arr[i] = q.get(i);
        // }

        // int[] carro = arr.clone();
        // int contador = 0;

        // boolean trocado;

        // for (int indice = 0; indice < n - 1; indice++) {
            
        //     trocado = false;

        //     for (int compare = 0; compare < n - indice - 1; compare++) {
                
        //         if (arr[compare] > arr[compare + 1]) {
                    
        //             int tmp = arr[compare];
        //             arr[compare] = arr[compare + 1];
        //             arr[compare + 1] = tmp;
        //             trocado = true;
        //             contador ++;
        //         }
        //     }

        //     if(trocado == false) break;
        // }

        // Arrays.sort(arr);
        // int maxD = 0;

        // for (int index = 0; index < n; index++) {
            
        //     int loc = carro[index]  -1;

        //     maxD = Math.max(maxD, loc - index);
        // }

        // if(maxD <= 2) System.out.println(contador);
        // else System.out.println("Too chaotic");
    // }

    // public static int minimumBribes(List<Integer> q) {

    //     // Tamanho da fila
    //     int n = q.size();

    //     // Array auxiliar para manipular a fila
    //     int[] arr = new int[n];
    
    //     // Copiando elementos da lista para o array
    //     for (int i = 0; i < n; i++) {
    //         arr[i] = q.get(i);
    //     }
    
    //     // Criando cópia do array original
    //     int[] carro = arr.clone();

    //     // Contador de subornos realizados
    //     int contador = 0;
    
    //     // Variável para rastrear se houve trocas
    //     boolean trocado;
    
    //     // Loop para ordenar a fila usando o algoritmo Bubble Sort modificado
    //     for (int indice = 0; indice < n - 1; indice++) {

    //         // Inicialmente, nenhuma troca foi feita nesta iteração
    //         trocado = false;
    
    //         // Loop para comparar elementos adjacentes e realizar trocas se necessário
    //         for (int compare = 0; compare < n - indice - 1; compare++) {

    //             // Verificar se o elemento atual é maior que o próximo elemento
    //             if (arr[compare] > arr[compare + 1]) {

    //                 // Armazenar temporariamente o valor do elemento atual
    //                 int tmp = arr[compare];

    //                 // Substituir o valor do elemento atual pelo próximo elemento
    //                 arr[compare] = arr[compare + 1];

    //                 // Atribuir o valor temporário ao próximo elemento, 
    //                 // efetivamente realizando a troca

    //                 arr[compare + 1] = tmp;

    //                 // Indicar que uma troca ocorreu nesta iteração
    //                 trocado = true;

    //                 // Incrementar o contador de subornos
    //                 contador++;
    //             }
    //         }
    
    //         // Se nenhuma troca ocorreu nesta iteração, 
    //         // a fila está ordenada e podemos sair do loop
    //         if (trocado == false) {
    //             break;
    //         }
    //     }
    
    //     // Ordenar o array original para comparação
    //     Arrays.sort(arr);

    //     // Variável para calcular a máxima inversão
    //     int maxD = 0;
    
    //     // Loop para calcular a máxima inversão para cada elemento
    //     for (int index = 0; index < n; index++) {

    //         // Localização esperada do elemento
    //         int loc = carro[index] - 1;

    //         // Calcular a máxima inversão
    //         maxD = Math.max(maxD, loc - index);
    //     }
    
    //     // Verificar se o número máximo de 
    //     // inversões é aceitável (2 ou menos)
    //     if (maxD <= 2) {

    //         // Retornar o número total de subornos
    //         return contador;

    //     } else {

    //         // Caso contrário, a situação é considerada caótica demais
    //         return -1; // Valor de retorno para indicar "Too chaotic"
    //     }
    // }

    // public static int minimumBribes(List<Integer> q) {

    //     // Inicialização de variáveis
        
    //     // Total de subornos
    //     int toatlBrindes = 0;

    //     // Índice para rastrear posição atual
    //     int subIndice = 0;

    //     // Número de movimentos necessários para corrigir a posição
    //     int turnosNecessarios = 0;

    //     // Indica se a situação é muito caótica
    //     boolean isTooChaotic = false;

    //     // Iteração reversa através da fila
    //     for (int i = q.size() - 1; i >= 0; i--) {
            
    //         // Verificar se a pessoa está fora da posição correta
    //         if (q.get(i) != i + 1) {
                
    //             // Define o índice para a pessoa fora de posição
    //             subIndice = i;

    //             // Enquanto a pessoa não estiver na posição correta
    //             while (q.get(subIndice) != (i + 1)) {
                    
    //                 // Incrementar os movimentos necessários
    //                 turnosNecessarios++;

    //                 // Retroceder no índice
    //                 subIndice--;
    //             }

    //             // Verificar se há muitos movimentos necessários
    //             if (turnosNecessarios > 2) {

    //                 // A situação é muito caótica
    //                 isTooChaotic = true;

    //                 // Sair do loop
    //                 break;
                    
    //             }

    //             // Incrementar o total de subornos
    //             toatlBrindes += turnosNecessarios;

    //             // Realizar os movimentos necessários para corrigir a posição
    //             while(turnosNecessarios-- > 0) {

    //                 // Armazenar temporariamente o valor
    //                 int tmp = q.get(subIndice + 1);

    //                 // Substituir o valor da próxima posição
    //                 q.set(subIndice + 1, q.get(subIndice));

    //                 // Atribuir o valor temporário à posição atual
    //                 q.set(subIndice, tmp);

    //                 // Avançar no índice
    //                 subIndice++;
    //             }

    //             // Redefinir os movimentos necessários
    //             turnosNecessarios = 0;
    //         }
    //     }

    //     // Retornar o número total de subornos ou indicar que é muito caótico
    //     return(isTooChaotic ? -1 : toatlBrindes);
    //     // System.out.println(isTooChaotic ? "Too chaotic" : totalBribes);
    // }

    // public static int minimumBribes(List<Integer> q) {

    //     // Número de subornos
    //     int brindes = 0;

    //     // Iteração reversa através da lista de pessoas na fila
    //     for (int i = q.size(); i > 0; i--) {
            
    //         // Verificar se a pessoa está na posição correta
    //         if (i == q.get(i - 1)) {
                
    //             // Pessoa está na posição correta, 
    //             // continuar para o próximo
    //             continue; 
    //         }

    //         // Verificar se a pessoa está a uma posição de distância da posição correta
    //         if (i == q.get(i - 2)) {
                
    //             // Trocar posições das pessoas
    //             Collections.swap(q, i - 1, i - 2);

    //             // Incrementar subornos realizados
    //             brindes += 1;

    //             // Ir para a próxima iteração
    //             continue;
    //         }

    //         // Verificar se a pessoa está a duas posições de distância da posição correta
    //         if (i == q.get(i - 3)) {
                
    //             // Trocar posições das pessoas
    //             Collections.swap(q, i - 3, i - 2);

    //             // Trocar posições das pessoas
    //             Collections.swap(q, i - 2, i - 1);

    //             // Incrementar subornos realizados
    //             brindes += 2;

    //             // Ir para a próxima iteração
    //             continue;
    //         }

    //         // Se nenhuma das condições acima for atendida, 
    //         // a situação é caótica demais
    //         return -1;
            
    //     }

    //     // Retornar o total de subornos realizados
    //     return brindes;
    // }

    public static int minimumBribes(List<Integer> q) {

        // Número de subornos realizados
        int brinde = 0;

        // Iteração através da lista de pessoas na fila
        for (int i = 0; i < q.size(); i++) {
            
            // Verificar se a pessoa se afastou demais da posição original
            if (q.get(i) - i - 1 > 2) {
                
                // Indicar que a situação é caótica
                brinde = 1;

                // Sair do loop
                break;
            }
        }

        // Verificar se a situação é caótica
        if (brinde == 1) {

            // Retornar -1 para indicar uma situação caótica
            return -1;

        } else {

            // Contador para rastrear o número de movimentos feitos para organizar a fila
            int mover = 0;

            // Iteração reversa para organizar a fila
            for (int i = q.size() - 1; i >= 0; i--) {
                
                // Verificar se a pessoa não está na posição correta
                if (q.get(i) != i + 1) {
                    
                    // Iteração para mover a pessoa para a posição correta
                    for (int j = i - 1; j >= q.get(i) - 1; j--) {
                        
                        // Trocar as posições das pessoas na fila
                        int a = q.get(j);

                        q.set(j, q.get(i));
                        q.set(i, a);

                        // Incrementar o contador de movimentos
                        mover ++;
                    }

                    // Atualizar o índice para a próxima iteração
                    i++;
                }
            }

            // Retornar o número total de movimentos realizados para organizar a fila
            return mover;
        }
    }
    
}
