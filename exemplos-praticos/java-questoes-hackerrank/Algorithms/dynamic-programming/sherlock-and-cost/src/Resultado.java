// A tarefa do problema "Sherlock and Cost" no HackerRank é a seguinte:

// Dado um array de inteiros positivos, você precisa determinar o valor máximo 
// que pode ser obtido ao ajustar os elementos do array. O ajuste envolve definir 
// cada elemento do array como 1 ou seu valor máximo, que é o valor do elemento na 
// posição correspondente no array original.
// A restrição é que a diferença absoluta entre dois elementos adjacentes no array 
// ajustado deve ser maximizada.

// Você deve implementar a função cost(arr) que recebe o array arr como parâmetro 
// e retorna o valor máximo que pode ser obtido após o ajuste.


import java.util.*;

public class Resultado {

    // public static int cost(List<Integer> b) {

    //     // Variáveis para rastrear os valores máximos
    //     int max_valor_atual = 0;
    //     int max_valor_ajustado = 0;

    //     // Percorre o array a partir da segunda posição
    //     for (int i = 1; i < b.size(); i++) {
            
    //         // Armazena os valores anteriores
    //         int anterior1 = max_valor_atual;
    //         int anterior2 = max_valor_ajustado;

    //         // Calcula os novos valores máximos para a posição atual
    //         max_valor_ajustado = 
    //             Math.max(anterior2 + Math.abs(b.get(i) - b.get(i - 1)), anterior1 + Math.abs(1 - b.get(i)));

    //         max_valor_atual =  anterior2 + Math.abs(1 - b.get(i - 1));
    //     }

    //     // Retorna o valor máximo entre max_valor_atual e max_valor_ajustado
    //     return max_valor_atual > max_valor_ajustado ? max_valor_atual : max_valor_ajustado;
    // }

    // public static int cost(List<Integer> b) {

        // // Variável para armazenar o valor máximo com base na primeira posição
        // int maxVarPrimeiroPosicao = Math.abs(b.get(0) - 1);

        // // Variável para armazenar o valor máximo com base na segunda posição
        // int maxVarSegundaPosicao = Math.abs(b.get(1) - 1);

        // // Loop a partir da terceira posição do array
        // for (int varArrTerceiraPos = 2; varArrTerceiraPos < b.size(); varArrTerceiraPos++) {
            
        //     // Cálculo do novo valor máximo considerando o valor atual do array 
        //     // e o valor máximo da primeira posição
        //     int novoMaxArr = Math.max(Math.abs(b.get(varArrTerceiraPos) - 1) + 
        //         maxVarPrimeiroPosicao, Math.abs(b.get(varArrTerceiraPos) - b.get(varArrTerceiraPos - 1)) + 
        //         maxVarSegundaPosicao);

        //     // Cálculo do novo valor máximo considerando o valor anterior do array 
        //     // e o valor máximo da posição anterior
        //     int novomaxPrimeiro = Math.abs(b.get(varArrTerceiraPos - 1) - 1) + maxVarSegundaPosicao;

        //     // Atualização dos valores máximos
        //     maxVarSegundaPosicao = novoMaxArr;
        //     maxVarPrimeiroPosicao = novomaxPrimeiro;
        // }

        // // Retorna o valor máximo entre maxVar e maxPrimeiro
        // return Math.max(maxVarSegundaPosicao, maxVarPrimeiroPosicao);
    // }

    public static int cost(List<Integer> b) {

        // Variável para armazenar o valor máximo considerando o valor alto
        int alto = 0;

        // Variável para armazenar o valor máximo considerando o valor baixo
        int baixo = 0;

        // Loop a partir da segunda posição do array
        for (int i = 1; i < b.size(); i++) {
            
            // Cálculo da diferença entre o valor anterior e 1
            int difValorAtualMenosUm = b.get(i - 1) - 1;

            // Cálculo da diferença entre o valor atual e 1
            int difValorAtualEhUm = b.get(i) - 1;

            // Cálculo da diferença entre o valor atual e o valor anterior
            int difValorAtualEhAnterior = b.get(i) - b.get(i - 1);


            // Cálculo do próximo valor máximo considerando o valor baixo
            int baixoProx = Math.max(baixo, alto + difValorAtualMenosUm);

            // Cálculo do próximo valor máximo considerando o valor alto
            int altoProx = Math.max(alto + difValorAtualEhAnterior, baixo + difValorAtualEhUm);

            // Atualização dos valores máximos
            baixo = baixoProx;
            alto = altoProx;
        }

        // Retorna o valor máximo entre alto e baixo
        return Math.max(alto, baixo);
    }
    
}
