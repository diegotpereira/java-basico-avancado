// A tarefa do problema "Game of Stones" em HackerRank é escrever 
// um programa que determine o vencedor de um jogo de pedras. 
// O jogo começa com um número fixo de pedras e dois jogadores, 
// que jogam alternadamente. Em cada jogada, um jogador pode remover 
// 2, 3 ou 5 pedras do monte de pedras. O jogador que não puder fazer 
// uma jogada perde o jogo. O programa deve imprimir "Primeiro" se o 
// primeiro jogador ganhar o jogo e "Segundo" se o segundo jogador ganhar o jogo.

public class Resultado {

    // Verifique o número de pedras iniciais.
    // Se o número de pedras iniciais for divisível por 7, imprima "Segundo" (o
    // segundo jogador ganha).
    // Caso contrário, imprima "Primeiro" (o primeiro jogador ganha).
    // // A lógica por trás dessa solução é que se o número de pedras iniciais for
    // divisível por 7, então não importa a escolha do primeiro jogador, o segundo
    // jogador sempre terá uma resposta para ganhar o jogo. Caso contrário, o
    // primeiro jogador sempre pode ganhar, escolhendo uma quantidade de pedras que
    // deixe um número de pedras que seja divisível por 7 para o segundo jogador.
    // Dessa forma, o segundo jogador ficará sempre em desvantagem e perderá o jogo.

    public static String gameOfStones(int n) {

        return (n % 7 < 2) ? "Second" : "First";
    }

    // public static String gameOfStones(int n) {

    // // Se o número de pedras iniciais for divisível por 7 ou 7 for igual a 1, o
    // // segundo jogador ganha.
    // for (int i = 0; i < n; i++) {

    // if (n % 7 == 0 || n % 7 == 1) {

    // return "Second";
    // }
    // }

    // return "First";
    // }

}
