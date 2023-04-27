import java.util.*;

public class Resultado {

    public static int getMinimumCost(int k, int[] c) {

        // cria uma lista para armazenar os elementos do array 'c'
        List<Integer> arr = new ArrayList<>();

        // copia os elementos do array 'c' para a lista 'arr'
        for (Integer i : c)
            arr.add(i);

        // ordena a lista em ordem decrescente
        Collections.sort(arr, Collections.reverseOrder());

        // inicializa a variável 'soma' como zero
        int soma = 0;

        // obtém o tamanho do array 'c'
        int n = c.length;

        // inicializa a variável 'prev' como zero
        int prev = 0;

        // inicializa a variável 'j' com o índice do último elemento
        // do primeiro grupo de 'k' elementos
        int j = k - 1;

        // itera sobre todos os elementos do array 'c'
        for (int i = 0; i < n; i++) {

            // multiplica o elemento atual da lista pelo fator
            // (1 + prev) e adiciona à soma total
            soma += arr.get(i) * (1 + prev);

            // se o índice atual é igual ao índice do último elemento do grupo atual
            if (i == j) {

                // incrementa a variável 'prev' para o próximo grupo
                prev++;

                // atualiza o índice do último elemento do próximo grupo
                j += k;
            }
        }

        // retorna o valor total da soma
        return soma;
    }

    // public static int getMinimumCost(int k, int[] c) {

    // // Declaração de um array de inteiros contar com tamanho k e uma variável
    // soma
    // int contar[] = new int[k];
    // int soma = 0;

    // // Preenche o array contar com zeros
    // Arrays.fill(contar, 0);

    // // Ordena o array c em ordem crescente
    // Arrays.sort(c);

    // // Laço de repetição que percorre o array c a partir do último elemento
    // for (int i = c.length - 1; i >= 0; i--) {

    // // Incrementa a soma com a multiplicação do elemento atual de c com
    // // o valor de contar[i % k] + 1
    // soma += (contar[i % k] + 1) * c[i];

    // // Incrementa o valor do índice i % k do array contar
    // contar[i % k]++;
    // }

    // // Retorna o valor final da soma
    // return soma;
    // }

    // public static int getMinimumCost(int numeroAmigos, int[] precoFlor) {

    // // Variável para armazenar o custo total da compra.
    // int custo = 0;

    // // Variável para armazenar quantos amigos ainda não compraram flores.
    // int semFlores = 0;

    // // Ordenar o array de preços das flores em ordem crescente.
    // Arrays.sort(precoFlor);

    // // Índice para percorrer o array de preços das flores a partir do final.
    // int indice = precoFlor.length - 1;

    // // Loop para a compra de todas as flores.
    // while (indice >= 0) {

    // // Loop pelos amigos, comprando a flor mais cara para cada amigo.
    // for (int i = 0; i < numeroAmigos && indice >= 0; i++) {

    // // Adicionar o custo da flor à compra atual.
    // custo += (1 + semFlores) * precoFlor[indice--];
    // }

    // // Incrementar o contador de amigos sem flores.
    // semFlores++;
    // }

    // // Retornar o custo total da compra.
    // return custo;
    // }

    // public static int getMinimumCost(int k, int[] c) {

    // // Variável para armazenar quantas vezes já comprou um buquê completo.
    // int redondo = 0;

    // // Variável para armazenar o custo total.
    // int custo_total = 0;

    // // Converter o array de int para Integer para que possa ser ordenado.
    // Integer[] cCaixa = Arrays.stream(c).boxed().toArray(Integer[]::new);

    // // Ordenar o array em ordem decrescente.
    // Arrays.sort(cCaixa, Collections.reverseOrder());

    // // Loop pelos preços das flores.
    // for (int i = 0; i < cCaixa.length; i++) {

    // // Adicionar o custo da flor à compra atual.
    // custo_total += (redondo + 1) * cCaixa[i];

    // // Se comprou um buquê completo, aumentar o contador.
    // if ((i + 1) % k == 0)
    // redondo++;
    // }

    // // Retornar o custo total.
    // return custo_total;
    // }

}
