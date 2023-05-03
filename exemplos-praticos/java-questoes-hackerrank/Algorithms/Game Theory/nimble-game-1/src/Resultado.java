import java.util.List;
import java.util.stream.IntStream;

// O problema"Nimble Game"do Hackerrank tem como objetivo 
// determinar se é possível ganhar um jogo de Nimble.O jogo 
// consiste em uma única pilha de moedas,onde em cada jogada 
// é possível remover qualquer número de moedas da pilha,
// contanto que não ultrapasse o limite da quantidade de moedas 
// na pilha e que pelo menos uma moeda seja removida.O jogador 
// que não puder fazer uma jogada perde.O problema pede que você 
// determine se é possível ganhar o jogo,dado o estado atual da 
// pilha de moedas e a estratégia ideal para o jogador.

public class Resultado {

    /**
     * Solução usando stream para o problema Nimble Game
     * 
     * @param s a lista de inteiros que representam os números de peças em cada
     *          pilha
     * @return a string "First" ou "Second", dependendo do jogador que vai ganhar o
     *         jogo
     */

    public static String nimbleGame(List<Integer> s) {

        // Calcula o XOR de todos os índices da lista que contém números ímpares
        int xor = IntStream.range(0, s.size())
                .filter(i -> s.get(i) % 2 != 0).reduce(0, (a, b) -> a ^ b);

        // Se o XOR calculado for diferente de zero, o primeiro jogador ganha.
        // Caso contrário, o segundo jogador ganha.
        return (xor != 0 ? "First" : "Second");
    }

    // public static String nimbleGame(List<Integer> s) {

    // // Inicializa a variável de operação XOR
    // int xor = 0;

    // // Inicializa o índice de iteração
    // int itr = 0;

    // // Itera sobre a lista de pilhas
    // for (int num : s) {

    // // Verifica se a pilha tem número ímpar de moedas
    // if (num % 2 == 1) {

    // // Aplica operação XOR com o índice de iteração atual
    // xor ^= itr;
    // }

    // // Incrementa o índice de iteração
    // itr++;
    // }

    // // Verifica se a operação XOR resultou em um valor diferente de zero
    // if (xor != 0)

    // // Retorna "First" se o resultado da operação XOR for diferente de zero
    // return "First";

    // // Retorna "Second" se o resultado da operação XOR for igual a zero
    // return "Second";
    // }

}
