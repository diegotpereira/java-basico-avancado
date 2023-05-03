import java.util.List;

// O jogo Misère Nim é uma variação do jogo Nim,onde,ao contrário 
// do jogo Nim tradicional,o jogador que pega a última pedra perde 
// o jogo.No problema em questão,a entrada é uma lista de pilhas de 
// pedras e o objetivo é determinar se,em uma partida de Misère Nim,
// o primeiro jogador a jogar ganha ou perde.

// Para solucionar o problema,é necessário verificar se a soma dos 
// tamanhos das pilhas é diferente de zero e se todas as pilhas possuem 
// apenas uma pedra.Se a soma for diferente de zero e todas as pilhas 
// tiverem apenas uma pedra,o primeiro jogador a jogar perderá o jogo.
// Caso contrário,o jogo seguirá as regras do jogo Nim tradicional e o 
// primeiro jogador a jogar ganhará o jogo se a soma dos tamanhos das pilhas 
// for diferente de zero ou perderá o jogo se a soma for igual a zero.

public class Resultado {

    public static String misereNim(List<Integer> s) {

        // Obtém o tamanho da lista
        int n = s.size();

        // Realiza a operação XOR com todos os elementos da lista
        int xor = s.stream().reduce(0, (a, b) -> a ^ b);

        // Soma todos os elementos da lista
        int soma = s.stream().reduce(0, Integer::sum);

        // Se o tamanho da lista for par
        if (n % 2 == 0) {

            // Verifica se a soma dos elementos é diferente do tamanho da lista E se a
            // operação XOR é igual a 0
            return n != soma && xor == 0 ? "Second" : "First";

            // Se o tamanho da lista for ímpar
        } else {

            return n == soma || xor == 0 ? "Second" : "First";
        }

    }

    // public static String misereNim(List<Integer> s) {

    // // número de pilhas
    // int n = s.size();

    // // resultado da operação XOR
    // int xr = 0;

    // // soma de todas as pedras nas pilhas
    // int soma = 0;

    // for (int i = 0; i < n; i++) {

    // // realiza a operação XOR em todas as pilhas
    // xr ^= s.get(i);

    // // calcula a soma de todas as pedras nas pilhas
    // soma += s.get(i);
    // }

    // // se o número de pilhas é par
    // if (n % 2 == 0) {

    // // se o número de pedras em todas as pilhas é diferente do número de pilhas e
    // o
    // // resultado da operação XOR é zero
    // return n != soma && xr == 0 ? "Second" : "First";

    // } else {

    // // se o número de pilhas é ímpar
    // // se o número de pedras em todas as pilhas é igual ao número de pilhas ou o
    // // resultado da operação XOR é zero
    // return n == soma || xr == 0 ? "Second" : "First";
    // }
    // }

}
