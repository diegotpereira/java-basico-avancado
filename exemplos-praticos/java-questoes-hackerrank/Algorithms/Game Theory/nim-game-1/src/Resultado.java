import java.util.List;

// O problema do Nim Game é um problema clássico de teoria dos jogos, 
// onde duas pessoas jogam um jogo com um conjunto de pilhas de moedas. 
// Em cada turno, o jogador pode escolher uma pilha e remover qualquer 
// número de moedas (pelo menos uma). O jogador que remove a última moeda ganha o jogo.

// Para resolver esse problema, podemos utilizar a propriedade conhecida como "XOR-Sum". 
// A ideia é obter o XOR (ou exclusivo) de todos os valores das pilhas. Se o XOR-Sum for 
// igual a zero, então o primeiro jogador perde, caso contrário, o primeiro jogador ganha. 
// Essa propriedade é baseada na observação de que o XOR de dois números é igual a zero se 
// e somente se esses números forem iguais. Além disso, o XOR é comutativo e associativo.

// Portanto, a lógica para resolver o problema do Nim Game é calcular o XOR-Sum das pilhas e 
// verificar se ele é igual a zero. Se sim, o primeiro jogador perde, caso contrário, o primeiro jogador ganha.

public class Resultado {

    public static String nimGame(List<Integer> pile) {

        int res = 0;

        // percorre a lista de pilhas realizando a operação XOR entre cada elemento
        // para obter o valor do restante da partida
        for (int i = 0; i < pile.size(); i++) {

            res ^= pile.get(i);
        }

        // se o restante é diferente de zero, o primeiro jogador tem uma jogada
        // vencedora
        if (res != 0)

            return "First";

        else

            // se o restante é zero, o segundo jogador tem uma jogada vencedora
            return "Second";
    }

    // public static String nimGame(List<Integer> pile) {

    // // Calcula o valor do XOR entre todos os valores da pilha
    // int restante = pile.stream().reduce(0, (pile1, pile2) -> pile1 ^ pile2);

    // // Se o resultado do XOR for zero, o segundo jogador ganhou. Caso contrário,
    // o
    // // primeiro jogador ganhou.
    // return (restante == 0 ? "Second" : "First");
    // }

}
