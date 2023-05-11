import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// A tarefa é projetar um algoritmo eficiente para determinar o número 
// mínimo de doces que uma professora deve dar a seus alunos de acordo 
// com a classificação deles. A professora tem vários alunos e deve dar 
// doces para cada um deles. Ela quer dar a cada aluno pelo menos um doce. 
// Além disso, ela quer minimizar o número total de doces que ela dá.

public class Resultado {

    public static long candies(int n, List<Integer> arr) {

        // Cria um array com n elementos
        int[] quantidadeBalasReceber = new int[n];

        // Inicializa todos os elementos do array quantidadeBalasReceber com 1
        Arrays.fill(quantidadeBalasReceber, 1);

        // Atualiza o array dp da esquerda para a direita
        IntStream.range(1, n).filter(i -> arr.get(i) > arr.get(i - 1))
                .forEach(i -> quantidadeBalasReceber[i] = quantidadeBalasReceber[i - 1] + 1);

        // Atualiza o array dp da direita para a esquerda
        IntStream.range(0, n - 1)
                .filter(i -> arr.get(n - i - 1) < arr.get(n - i - 2))
                .forEach(i -> quantidadeBalasReceber[n - i - 2] = Math.max(quantidadeBalasReceber[n - i - 2],
                        quantidadeBalasReceber[n - i - 1] + 1));

        return Arrays.stream(quantidadeBalasReceber).asLongStream().sum();
    }

    // public static long candies(int n, List<Integer> arr) {

    // // Cria um array com n elementos
    // int[] quantidadeBalasReceber = new int[n];

    // // Inicializa todos os elementos do array quantidadeBalasReceber com 1
    // Arrays.fill(quantidadeBalasReceber, 1);

    // // Atualiza o array quantidadeBalasReceber da esquerda para a direita
    // for (int i = 1; i < n; i++) {

    // // Se a nota atual é maior que a anterior, incrementa o número de balas
    // if (arr.get(i) > arr.get(i - 1)) {

    // quantidadeBalasReceber[i] = quantidadeBalasReceber[i - 1] + 1;
    // }
    // }

    // // Atualiza o array quantidadeBalasReceber da direita para a esquerda
    // for (int i = n - 2; i >= 0; i--) {

    // // Se a nota atual é maior que a próxima, atualiza o número de balas na
    // posição
    // // atual
    // // para o máximo entre seu valor atual e o valor da posição seguinte mais 1
    // if (arr.get(i) > arr.get(i + 1)) {

    // quantidadeBalasReceber[i] = Math.max(quantidadeBalasReceber[i],
    // quantidadeBalasReceber[i + 1] + 1);
    // }
    // }

    // // Soma todos os elementos do array quantidadeBalasReceber para obter o
    // número
    // // total de balas
    // // distribuídas
    // int total = 0;

    // for (int i = 0; i < n; i++) {

    // total += quantidadeBalasReceber[i];
    // }

    // return total;
    // }

}
