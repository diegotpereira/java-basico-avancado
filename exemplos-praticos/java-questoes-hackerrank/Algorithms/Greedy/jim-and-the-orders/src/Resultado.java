import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// O problema "Jim and the Orders" do HackerRank consiste 
// em determinar a ordem em que vários clientes de um restaurante 
// devem ser atendidos. Cada cliente faz um pedido que leva 
// um certo tempo para ser preparado. O objetivo é determinar a 
// ordem em que os pedidos devem ser atendidos, levando em conta 
// o tempo que cada pedido leva para ser preparado e o momento em que o cliente fez o pedido.

public class Resultado {

    public static List<Integer> jimOrders(List<List<Integer>> pedidos) {

        // A primeira linha cria um stream de inteiros com o tamanho da lista de pedidos
        // usando o método "range" da classe "IntStream".
        return IntStream.range(0, pedidos.size())
                // O método "boxed" é usado para converter o stream de inteiros em um stream de
                // Integer.
                .boxed()
                // Em seguida, usamos o método "sorted" para ordenar os pedidos de acordo com a
                // soma dos tempos de preparação, que é calculada pela expressão
                // "pedidos.get(i).get(0) + pedidos.get(i).get(1)".
                .sorted(Comparator.comparingInt(i -> pedidos.get(i).get(0) + pedidos.get(i).get(1)))

                // Depois disso, usamos o método "map" para adicionar 1 à ordem do pedido (para
                // que a ordem comece em 1 ao invés de 0).
                .map(i -> i + 1)

                // método "collect" para coletar os resultados em uma lista de Integer.
                .collect(Collectors.toList());
    }

    // public static List<Integer> jimOrders(List<List<Integer>> pedidos) {

    // // Criação de uma lista para armazenar a soma dos tempos de
    // // preparação dos pedidos.
    // List<Integer> tempoDePreparacaoPedido = new ArrayList<>();

    // // Criação de uma lista para armazenar a ordem de atendimento dos pedidos.
    // List<Integer> ordemDosPedidos = new ArrayList<>();

    // // Loop para percorrer a lista de pedidos e calcular a soma dos tempos de
    // // preparação dos pedidos.
    // for (int i = 0; i < pedidos.size(); i++) {

    // int somaDosTempos = 0;

    // // Loop para percorrer a lista de cada pedido e somar os tempos de
    // preparação.
    // for (int j = 0; j < 2; j++) {

    // somaDosTempos += pedidos.get(i).get(j);
    // }

    // // Adiciona a soma dos tempos de preparação do pedido atual na lista de
    // // resultados.
    // tempoDePreparacaoPedido.add(i, somaDosTempos);
    // }

    // // Encontra o maior valor na lista de resultados.
    // int ultimoPedidoSerProcessado = Collections.max(tempoDePreparacaoPedido);
    // int i = 0;

    // // Loop para percorrer a lista de resultados e adicionar a ordem de
    // atendimento
    // // na lista final.
    // while (i < tempoDePreparacaoPedido.size()) {

    // // Encontra o menor valor na lista de resultados.
    // int a = Collections.min(tempoDePreparacaoPedido);

    // // Obtém o índice do pedido com o menor tempo de preparação.
    // int j = tempoDePreparacaoPedido.indexOf(a);

    // // Adiciona a ordem de atendimento do pedido na lista final.
    // ordemDosPedidos.add(j + 1);

    // // Define o valor do pedido atual como o maior valor da lista de resultados +
    // 1.
    // tempoDePreparacaoPedido.set(j, ultimoPedidoSerProcessado + 1);
    // i++;
    // }

    // // Retorna a lista final de ordem de atendimento dos pedidos.
    // return ordemDosPedidos;
    // }

    // public static List<Integer> jimOrders(List<List<Integer>> pedidos) {

    // // Criando um mapa para armazenar a soma de cada pedido de cada cliente, onde
    // a
    // // chave é o número do cliente e o valor é a soma
    // Map<Integer, Integer> clientePedidos = new HashMap<>();

    // // Inicializando o número do cliente como 1
    // int cliente = 1;

    // // Percorrendo a lista de pedidos
    // for (List<Integer> pedido : pedidos) {

    // // Calculando a soma do pedido e armazenando no mapa com o número do cliente
    // // como chave
    // clientePedidos.put(cliente, pedido.get(0) + pedido.get(1));

    // // Incrementando o número do cliente
    // cliente++;
    // }

    // // Ordenando o mapa pela soma dos pedidos em ordem crescente e convertendo as
    // // chaves em uma lista de inteiros
    // return clientePedidos.entrySet()
    // .stream()
    // .sorted(Map.Entry.comparingByValue())
    // .map(Map.Entry::getKey).collect(Collectors.toList());

    // }

    // public static List<Integer> jimOrders(List<List<Integer>> pedidos) {

    // // Criação das listas de resposta
    // List<Integer> resultado = new ArrayList<>();
    // List<List<Integer>> resposta = new ArrayList<>();

    // // Iteração pelos pedidos para calcular os tempos de entrega
    // for (int i = 0; i < pedidos.size(); i++) {

    // // Obtém o tempo de pedido e preparação
    // int pedido = pedidos.get(i).get(0);
    // int prep = pedidos.get(i).get(1);

    // // Calcula o tempo de entrega
    // int t = pedido + prep;

    // // Cria uma lista com o número do pedido e o tempo de entrega
    // List<Integer> sub = new ArrayList<>();
    // sub.add(i + 1);
    // sub.add(t);

    // // Adiciona a lista à lista de resposta
    // resposta.add(sub);
    // }

    // // Ordena a lista de resposta com base no tempo de entrega
    // Collections.sort(resposta, (a, b) -> (a.get(1) - b.get(1)));

    // // Iteração pela lista de resposta para obter os números dos pedidos
    // // na ordem correta
    // for (int i = 0; i < resposta.size(); i++) {

    // // Adiciona o número do pedido à lista de resultados
    // resultado.add(resposta.get(i).get(0));
    // }

    // // Retorna a lista de resultados
    // return resultado;
    // }

}
