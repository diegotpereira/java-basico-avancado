import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

// O problema envolve a colocação de transmissores de rádio nas casas de uma cidade unidimensional, 
// de modo que todas as casas estejam dentro do alcance de pelo menos um transmissor. O objetivo é 
// determinar o número mínimo de transmissores necessários para cobrir todas as casas.

// Uma possível solução é percorrer a cidade em ordem crescente de posição das casas, e sempre 
// escolher a casa mais à direita que não está coberta por um transmissor já instalado. Em seguida, 
// instala-se um transmissor na casa escolhida, que cobrirá todas as casas dentro do seu alcance. Esse 
// processo é repetido até que todas as casas estejam cobertas.

// Uma outra abordagem possível é utilizar algoritmos de cobertura de conjuntos, como o algoritmo greedy, 
// que busca sempre selecionar o conjunto de casas não cobertas pelo menor número possível de transmissores.

// Em ambos os casos, é importante levar em consideração o alcance dos transmissores e garantir que todas 
// as casas estejam cobertas sem que haja sobreposição desnecessária de transmissores.

public class Resultado {

    public static int hackerlandRadioTransmitters(List<Integer> casas, int alcance) {

        // Inicializa variáveis de controle
        int ultimaCasaCoberta = 0, indiceElementoAtual = 0, contador = 0;

        boolean ultimaCasaFoiCobertaPorTransmissor = false;

        // Ordena a lista de posições das casas em ordem crescente
        Collections.sort(casas);

        // Percorre a lista de posições das casas
        while (indiceElementoAtual < casas.size()) {

            // Adiciona 1 ao contador caso o transmissor não tenha sido colocado na posição anterior
            contador += ultimaCasaFoiCobertaPorTransmissor ? 0 : 1;

            // Define o ponto de partida para a próxima iteração do loop interno
            ultimaCasaCoberta = ultimaCasaFoiCobertaPorTransmissor ? indiceElementoAtual - 1 : indiceElementoAtual;

            // Percorre a lista a partir da posição indiceElementoAtual verificando se a distância entre as casas
            // é menor ou igual ao alcance do transmissor
            while (indiceElementoAtual < casas.size() && casas.get(indiceElementoAtual) - casas.get(ultimaCasaCoberta) <= alcance) {

                indiceElementoAtual++;
            }

            // Alterna o valor da variável ultimaCasaFoiCobertaPorTransmissor para indicar a posição do último transmissor colocado
            ultimaCasaFoiCobertaPorTransmissor = !ultimaCasaFoiCobertaPorTransmissor;
        }
        
        // Retorna o número de transmissores necessários
        return contador;
        
    }

    // public static int hackerlandRadioTransmitters(List<Integer> casas, int alcance) {

    //     // A lógica começa verificando se a lista de posições das casas é nula ou vazia, 
    //     // retornando 0 caso seja verdadeiro, ou seja, não há nenhuma casa a ser coberta. 

    //     // Em seguida, a lista é ordenada e seu tamanho é obtido.

    //     // Se a diferença entre a última e a primeira casa for menor ou igual ao alcance do transmissor, 
    //     // é possível cobrir todas as casas com apenas um transmissor, então retorna 1. Caso contrário, 
    //     // a primeira casa é definida como a primeira casa da lista de posições de casas e a sublista é 
    //     // inicializada como nula.

    //     // O método percorre a lista de posições das casas e verifica se a casa atual está dentro do 
    //     // alcance do transmissor em relação à primeira casa. Se sim, atualiza a variável primeira_casa 
    //     // com a casa atual. Se não, verifica se a casa atual pode ser coberta pelo mesmo transmissor que 
    //     // cobre a primeira casa. Se sim, não faz nada e continua verificando a próxima casa. Se não, 
    //     // define a sublista a partir da casa atual e retorna a recursão para a sublista.

    //     // Por fim, a recursão é chamada para a sublista e adiciona 1 ao resultado, indicando que um transmissor 
    //     // foi utilizado para cobrir as casas da sublista. O método continua a recursão para todas as sub-listas 
    //     // que não podem ser cobertas pelo mesmo transmissor que cobre a primeira casa, até que todas as casas 
    //     // sejam cobertas.

    //     // Verifica se a lista é nula ou vazia e retorna 0 caso seja verdadeiro
    //     if((casas == null) || (casas.size() == 0)) {

    //         return 0;
    //     }

    //     // Ordena a lista de posições das casas
    //     Collections.sort(casas);

    //     // Obtém o tamanho da lista de posições das casas
    //     int tamanho = casas.size();

    //     // Se a diferença entre a última e a primeira casa for menor ou igual ao alcance do transmissor,
    //     // é possível cobrir todas as casas com apenas um transmissor, então retorna 1
    //     if (casas.get(tamanho - 1) - casas.get(0) <= alcance) {
            
    //         return 1;

    //     } else {
            
    //         // Define a primeira casa como a primeira casa da lista de posições de casas
    //         int primeira_casa = casas.get(0);

    //         // Inicializa a sublista como nula
    //         List<Integer> subLista = null;

    //         // Percorre a lista de posições das casas
    //         for (int i = 0; i < tamanho; i++) {
                
    //             int atual = casas.get(i);

    //             // Se a casa atual estiver dentro do alcance do transmissor em relação à primeira casa,
    //             // atualiza a variável primeira_casa com a casa atual
    //             if (atual <=  casas.get(0) + alcance) {
                    
    //                 primeira_casa = atual;

    //             } else {

    //                 // Se a casa atual estiver fora do alcance do transmissor em relação à primeira casa,
    //                 // verifica se ela pode ser coberta pelo mesmo transmissor que cobre a primeira casa.
    //                 if (atual <= primeira_casa + alcance) {

    //                     // Se sim, não faz nada e continua verificando a próxima casa
    //                     continue;
                        
    //                 } else {

    //                     // Se não, define a sublista a partir da casa atual e retorna a recursão para a sublista
    //                     subLista = casas.subList(i, tamanho);
    //                     break;
    //                 }
    //             }
    //         }

    //         // Chama a recursão para a sublista e adiciona 1 ao resultado
    //         return hackerlandRadioTransmitters(subLista, alcance) + 1;
            
    //     }
    // }

    // public static int hackerlandRadioTransmitters(List<Integer> trilhaCasa, int alcance) {

    //     // Verifica se os argumentos de entrada são válidos
    //     if(alcance < 1 || trilhaCasa.size() < 1)

    //         return -1;

    //     // Ordena as casas em ordem crescente
    //     Collections.sort(trilhaCasa);

    //     // Inicializa variáveis para acompanhar o número de transmissores, 
    //     // a casa mais coberta e a posição do último transmissor instalado
    //     int numTransmissores = 1;
    //     int casaMaisCoberta = 0;
    //     int posicaoCasaTransistor = 0;

    //     // Percorre as casas da trilha
    //     for (int i = 1; i < trilhaCasa.size(); i++) {
        
    //         // Calcula a distância entre a casa atual e o último transmissor instalado, 
    //         // e entre a casa atual e a casa mais coberta pelo último transmissor
    //         int distancia = trilhaCasa.get(i) - trilhaCasa.get(posicaoCasaTransistor);
    //         int maxDistancia = trilhaCasa.get(i) - trilhaCasa.get(casaMaisCoberta);

    //         // Se a casa atual estiver dentro do alcance do último transmissor instalado, 
    //         // não é necessário instalar um novo transmissor
    //         if (maxDistancia <= alcance) {
                
    //             posicaoCasaTransistor = i;

    //         // Se a casa atual estiver fora do alcance do último transmissor instalado, 
    //         // é necessário instalar um novo transmissor
    //         } else if (distancia > alcance) {
                
    //             // Marca a casa atual como a casa mais coberta pelo novo transmissor, 
    //             // e atualiza a posição do último transmissor instalado
    //             posicaoCasaTransistor = casaMaisCoberta = i;

    //             // Incrementa o número de transmissores instalados
    //             numTransmissores++;
    //         }
    //     }

    //     // Retorna o número de transmissores instalados
    //     return numTransmissores;
    // }

    // public static int hackerlandRadioTransmitters(List<Integer> x, int k) {

    //     // Cria um objeto TreeSet a partir da lista de casas x
    //     TreeSet<Integer> treeSet = new TreeSet<>(x);

    //     // Inicializa a variável numTransmissores com zero
    //     int numTransmissores = 0;

    //     // Seleciona a primeira casa da árvore
    //     Integer casa = treeSet.first();

    //     // Enquanto houver casas na árvore
    //     while (casa != null) {
            
    //         // Seleciona a casa mais distante possível da casa atual, dentro do alcance k
    //         Integer tmp = treeSet.floor(casa + k);

    //         // Se a casa selecionada estiver além do alcance k, seleciona a próxima casa disponível
    //         if (tmp.equals(casa) == false) {
                
    //             tmp = treeSet.floor(tmp + k);
    //         }

    //         // Seleciona a próxima casa após a casa selecionada anteriormente
    //         casa = treeSet.higher(tmp);

    //         // Incrementa o número de transmissores
    //         numTransmissores++;
    //     }

    //     // Retorna o número total de transmissores necessários
    //     return numTransmissores;
    // }

    // public static int hackerlandRadioTransmitters(List<Integer> x, int k) {

    //     // ordena a lista em ordem crescente
    //     Collections.sort(x);

    //     int n = x.size();
    //     int i = 0;
    //     int numTransmissores = 0;

    //     while (i < n) {
            
    //         // Encontra a posição mais à direita que ainda não está coberta
    //         int j = i;

    //         while (j < n - 1 && x.get(j + 1) - x.get(i) <= k) {
                
    //             j++;
    //         }

    //         // Instala o transmissor na casa escolhida
    //         numTransmissores++;

    //         int localizacao = x.get(j);

    //         // Avança para a próxima posição não coberta
    //         i = j + 1;

    //         // Avança até a próxima casa que esteja fora do alcance do transmissor atual
    //         while (i < n && x.get(i) - localizacao <= k) {
                
    //             i++;
    //         }
    //     }

    //     return numTransmissores;
    // }
    
}
