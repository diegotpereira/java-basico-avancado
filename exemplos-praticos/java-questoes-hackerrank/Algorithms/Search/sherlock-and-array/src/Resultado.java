import java.util.List;

// O problema de "balanced sums" tem como objetivo encontrar um índice em uma lista de números 
// tal que a soma de todos os elementos à esquerda desse índice seja igual à soma de todos os 
// elementos à direita desse índice.

// A lógica para resolução desse problema é percorrer a lista duas vezes. Na primeira vez, 
// somamos todos os elementos da lista. Na segunda vez, percorremos a lista novamente, subtraindo 
// cada elemento da soma total e comparando se a soma à esquerda é igual à soma à direita. Se 
// encontrarmos um índice onde isso seja verdadeiro, retornamos "YES", indicando que encontramos 
// um ponto de equilíbrio. Se percorrermos toda a lista e não encontrarmos nenhum ponto de equilíbrio, retornamos "NO".
public class Resultado {

    public static String balancedSums(List<Integer> arr) {

        // Calcula a soma total dos elementos da lista usando Stream API
        int total = arr.stream().mapToInt(Integer::intValue).sum();

        // Inicializa a soma à esquerda como zero
        int somaEsquerda = 0;

        // Loop para percorrer a lista e encontrar o ponto de equilíbrio
        for (int i = 0; i < arr.size(); i++) {

            // Calcula a soma à direita subtraindo a soma à esquerda e o elemento
            // atual do total
            int somaDireita = total - somaEsquerda - arr.get(i);

            // Verifica se a soma à esquerda é igual à soma à direita
            if (somaEsquerda == somaDireita) {

                return "YES";
            }

            // Atualiza a soma à esquerda com o elemento atual
            somaEsquerda += arr.get(i);
        }

        // Se não houver ponto de equilíbrio, retorna "NO"
        return "NO";
    }

    // public static String balancedSums(List<Integer> arr) {

    // // A lógica do método começa com o cálculo do valor total da lista,
    // adicionando
    // // cada elemento da lista à variável total. Em seguida, o método itera sobre
    // a
    // // lista novamente, calculando a soma dos elementos à esquerda de cada
    // índice. O
    // // método usa a variável esquerdaSoma para armazenar a soma dos elementos à
    // // esquerda de um índice em particular. O valor dessa variável é atualizado a
    // // cada iteração do loop.

    // // Dentro do loop, o método também calcula um valor temporário chamado tmp,
    // que
    // // é a metade do valor total da lista menos o elemento na posição atual. O
    // // método então verifica se a esquerdaSoma é igual a tmp. Se for, isso
    // significa
    // // que um ponto de equilíbrio foi encontrado e o método retorna "YES". Caso
    // // contrário, o loop continua iterando.

    // // Se o método percorrer toda a lista e não encontrar nenhum ponto de
    // // equilíbrio, ele retorna "NO". A lógica do método é simples e eficiente,
    // pois
    // // itera sobre a lista apenas duas vezes.

    // // Inicializa a variável 'total' com o valor zero
    // int total = 0;

    // // Inicializa a variável 'esquerdaSoma' com o valor zero
    // int esquerdaSoma = 0;

    // // Itera sobre a lista 'arr' e adiciona cada valor a variável 'total'
    // for (Integer n : arr) {

    // total += n;
    // }

    // // Itera sobre a lista 'arr' novamente
    // for (int i = 0; i < arr.size(); i++) {

    // // Se o índice 'i' não for igual a zero
    // if (i != 0) {

    // // Adiciona o valor do elemento anterior ao índice 'i' na variável
    // // 'esquerdaSoma'
    // esquerdaSoma += arr.get(i - 1);
    // }

    // // Calcula o valor de 'tmp' como a metade do total menos o valor do elemento
    // na
    // // posição 'i'
    // int tmp = (total - arr.get(i)) / 2;

    // // Se 'esquerdaSoma' for igual a 'tmp'
    // if (esquerdaSoma == tmp) {

    // return "YES";
    // }
    // }

    // // Se não encontrou nenhum ponto de equilíbrio, retorna "NO"
    // return "NO";
    // }

    // public static String balancedSums(List<Integer> arr) {

    // // Inicializa variáveis para armazenar as somas à direita e à esquerda
    // int somaDireita = 0;
    // int somaEsquerda = 0;

    // // Soma todos os elementos da lista para obter a soma total à direita
    // for (int i = 0; i < arr.size(); i++) {

    // somaDireita += arr.get(i);
    // }

    // // percorre a lista subtraindo o valor de cada elemento da somaDireita,
    // // enquanto soma o valor de cada elemento na somaEsquerda, verificando se
    // // as duas somas são iguais em algum momento
    // for (int i = 0; i < arr.size(); i++) {

    // // Subtrai o elemento atual da soma total à direita
    // somaDireita -= arr.get(i);

    // // Verifica se as somas à direita e à esquerda são iguais
    // if (somaDireita == somaEsquerda) {

    // // Há um índice de balanceamento na lista, retorna "YES"
    // return "YES";
    // }

    // // Adiciona o elemento atual à soma total à esquerda
    // somaEsquerda += arr.get(i);
    // }

    // // Não há um índice de balanceamento na lista, retorna "NO"
    // return "NO";
    // }

}
