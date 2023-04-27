import java.util.*;
import java.util.stream.Collectors;

public class Resultado {

    public static int maximumToys(List<Integer> prices, int k) {

        // Cria uma lista com os preços dos brinquedos que são menores ou iguais ao
        // valor disponível
        List<Integer> classificarPrecos = prices.stream().filter(preco -> preco <= k).sorted()
                .collect(Collectors.toList());

        // Inicia a variável soma com 0 e numBrinquedos com 0
        int soma = 0;
        int numBrinquedos = 0;

        // Para cada preço na lista de preços classificados
        for (Integer preco : classificarPrecos) {

            // Soma o preço à variável soma
            soma += preco;

            // Se a soma ainda é menor ou igual ao valor disponível,
            // incrementa a variável numBrinquedos Senão, sai do loop
            if (soma <= k) {

                numBrinquedos++;

            } else {

                break;
            }

        }

        // Retorna o número de brinquedos que é possível comprar
        return numBrinquedos;
    }

    // public static int maximumToys(List<Integer> prices, int k) {

    // // transforma a lista de Integer em um array primitivo de long
    // long[] arr = prices.stream().mapToLong(r -> r).sorted().toArray();

    // // realiza a soma acumulada dos elementos do array
    // Arrays.parallelPrefix(arr, Long::sum);

    // // retorna a quantidade de elementos do array que são menores ou iguais a k
    // return (int) Arrays.stream(arr).filter(r -> r <= (long) k).count();
    // }

    // public static int maximumToys(List<Integer> prices, int k) {

    // // Ordena a lista de preços em ordem crescente
    // Collections.sort(prices);

    // // Inicializa a variável "contar" que será usada para contar quantos
    // brinquedos
    // // é possível comprar
    // int contar = 0;

    // // Enquanto ainda houver dinheiro disponível para comprar mais brinquedos
    // // (ou seja, enquanto o custo do próximo brinquedo for menor ou igual ao
    // // dinheiro disponível)
    // while ((k - prices.get(contar)) >= 0)

    // // Reduz o dinheiro disponível de acordo com o preço do brinquedo comprado
    // k -= prices.get(contar++);

    // // Retorna o número total de brinquedos que foi possível comprar
    // return contar;
    // }

    /**
     * Retorna o número máximo de brinquedos que Mark pode comprar com o dinheiro
     * disponível.
     * 
     * @param prices lista de preços de brinquedos disponíveis
     * @param k      valor máximo que Mark pode gastar em brinquedos
     * @return o número máximo de brinquedos que Mark pode comprar com o dinheiro
     *         disponível
     */

    // public static int maximumToys(List<Integer> prices, int k) {

    // // Variável para armazenar a soma dos custos dos brinquedos
    // long somaCusto = 0;

    // // Ordena os preços em ordem crescente
    // Collections.sort(prices);

    // // Lista para armazenar o índice dos brinquedos que podem ser comprados
    // List<Integer> numeroBrinquedos = new ArrayList<>();

    // // Percorre a lista de preços dos brinquedos
    // for (int i = 0; i < prices.size() - 1; i++) {

    // // Adiciona o custo do brinquedo atual à soma de custos
    // somaCusto += prices.get(i);

    // // Se o custo total for menor ou igual ao valor máximo que Mark pode gastar
    // if (somaCusto <= k) {

    // // Adiciona o índice do brinquedo atual à lista de brinquedos que
    // // podem ser comprados
    // numeroBrinquedos.add(i);
    // }
    // }

    // // Retorna o número de brinquedos que podem ser comprados
    // return numeroBrinquedos.size();
    // }

    // public static int maximumToys(List<Integer> prices, int k) {

    // // Ordena a lista de preços em ordem crescente
    // Collections.sort(prices);

    // // Inicializa o contador de brinquedos comprados e o dinheiro disponível
    // int numBrinquedos = 0;
    // int dinheiroDisponivel = k;

    // // Percorre a lista de preços
    // for (int i = 0; i < prices.size(); i++) {

    // // Se o preço do brinquedo for menor ou igual ao dinheiro disponível,
    // // compre o brinquedo e subtraia seu preço do dinheiro disponível
    // if (prices.get(i) <= dinheiroDisponivel) {

    // numBrinquedos++;

    // dinheiroDisponivel -= prices.get(i);

    // // Se o dinheiro disponível acabar, saia do loop
    // if (dinheiroDisponivel == 0) {

    // continue;
    // }
    // }
    // }

    // // Retorna o número de brinquedos comprados
    // return numBrinquedos;
    // }

}
