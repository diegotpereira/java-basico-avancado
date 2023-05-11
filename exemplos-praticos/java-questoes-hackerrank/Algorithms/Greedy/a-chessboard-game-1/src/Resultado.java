// O problema "A Chessboard Game" em HackerRank é sobre um jogo 
// em um tabuleiro de xadrez. O tabuleiro é preenchido com moedas 
// em algumas das casas, e dois jogadores alternam jogadas. Em cada 
// jogada, um jogador deve remover uma das moedas do tabuleiro. Se 
// não houver nenhuma moeda na casa indicada pelo jogador, a jogada 
// é invalida. O jogador que não consegue fazer uma jogada perde. A 
// tarefa é determinar quem ganha se ambos os jogadores jogarem de forma ideal.

public class Resultado {

    // O problema "A Chessboard Game" envolve determinar o vencedor de um jogo em
    // que dois jogadores, Alice e Bob, fazem movimentos alternados em um tabuleiro
    // de xadrez. O tabuleiro é um tabuleiro de 15x15, e cada posição pode ser
    // identificada por um par de coordenadas inteiras (i, j), com 1 <= i, j <= 15.
    // O jogador que começa é Alice, e ela pode fazer um movimento para qualquer
    // posição (i, j) onde i e j são ambos ímpares. Em seguida, Bob pode fazer um
    // movimento para qualquer posição (i, j) onde i e j são ambos pares. O jogo
    // continua alternando movimentos até que um jogador não possa mais fazer um
    // movimento válido. O jogador que não pode mais fazer um movimento válido perde
    // o jogo.

    // A lógica para resolver o problema é simular o jogo. Podemos criar uma matriz
    // booleana de 15x15 para representar o tabuleiro. Inicialmente, todas as
    // posições da matriz são falsas, o que significa que não foram visitadas ainda.
    // Podemos então simular o jogo em um loop while, onde cada iteração do loop
    // corresponde a um movimento de um jogador. No início de cada iteração,
    // verificamos se um dos jogadores não pode mais fazer um movimento válido. Se
    // for esse o caso, o outro jogador venceu o jogo. Caso contrário, o jogador
    // atual escolhe uma posição válida para se mover (conforme descrito acima) e
    // atualiza a matriz para indicar que a posição foi visitada. Em seguida,
    // passamos a vez para o outro jogador.

    // Podemos implementar a lógica descrita acima em um método, que recebe as
    // coordenadas (i, j) da posição inicial escolhida por Alice e retorna uma
    // String indicando qual jogador venceu o jogo.

    public static String chessboardGame(int x, int y) {

        x--;
        y--;

        if ((x / 2) % 2 == 0 && (y / 2) % 2 == 0)
            return "Second";

        return "First";
    }

    // public static String chessboardGame(int x, int y) {

    // if ((y % 4 == 0) || (y % 4 == 3) || (x % 4 == 0) || x % 4 == 3) {

    // return "First";
    // }

    // return "Second";
    // }

    // public static String chessboardGame(int x, int y) {

    // // verifica a posição da coordenada (x, y) em relação às coordenadas das
    // casas
    // // brancas
    // if ((x % 4 == 1 || x % 4 == 2) && (y % 4 == 1 || y % 4 == 2)) {

    // return "Second";

    // } else {

    // return "First";
    // }
    // }

}
