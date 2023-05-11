import java.util.List;

// O problema Poker Nim 1, do HackerRank, 
// tem como tarefa simular um jogo de Poker Nim. 
// O Poker Nim é um jogo em que dois jogadores 
// têm que remover fichas de uma pilha. Cada 
// jogador pode remover qualquer número de fichas 
// de uma a três fichas por rodada. O objetivo do 
// jogo é fazer com que o outro jogador seja forçado 
// a remover a última ficha. O problema consiste em 
// determinar qual jogador tem uma estratégia vencedora 
// ou se ambos têm uma estratégia vencedora.

public class Resultado {

    public static String pokerNim(int k, List<Integer> c) {

        // Realiza a operação XOR em todos os elementos da lista c
        int xor = c.stream().reduce(0, (a, b) -> a ^ b);

        // Verifica se o resultado da operação XOR é diferente de zero
        // Se sim, o jogador "First" ganha, caso contrário, o jogador "Second" ganha
        return (xor != 0 ? "First" : "Second");
    }

    // public static String pokerNim(int k, List<Integer> c) {

    // // Inicializa a variável a como zero
    // int a = 0;

    // // Faz um loop para iterar sobre a lista de inteiros c
    // for (int i = 0; i < c.size(); i++)

    // // Faz a operação XOR entre a variável a e o elemento da lista na posição i
    // a ^= c.get(i);

    // // Se a variável a for diferente de zero, retorna "First"
    // if (a != 0)

    // return "First";

    // // Senão, retorna "Second"
    // return "Second";
    // }

}
