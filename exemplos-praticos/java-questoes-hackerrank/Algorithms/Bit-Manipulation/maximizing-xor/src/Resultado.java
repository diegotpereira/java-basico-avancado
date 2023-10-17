// O problema "Maximizing XOR" no HackerRank consiste em encontrar o valor máximo da operação XOR (^) entre dois números inteiros em um intervalo específico. A tarefa específica é a seguinte:

// Você recebe dois inteiros, L e R, que definem um intervalo fechado [L, R]. Sua tarefa é encontrar dois números inteiros, A e B, onde L <= A <= B <= R, de forma que o valor de A XOR B seja o máximo possível.

// A operação XOR (^) entre dois números binários compara bit a bit e produz um resultado 1 onde os bits forem diferentes e 0 onde os bits forem iguais. Portanto, o objetivo é encontrar dois números no intervalo [L, R] de modo que haja o máximo número possível de bits diferentes entre eles ao fazer a operação XOR.

// Para resolver esse problema, você precisa encontrar os valores de A e B que maximizam a operação XOR. Há várias abordagens para resolver esse problema, incluindo força bruta e técnicas mais eficientes. O desafio é encontrar a solução mais eficiente para esse problema específico.

public class Resultado {


    // public static int maximizingXor(int primeiro, int segundo) {

    //     // Calcula o resultado da operação XOR entre os números 'primeiro' e 'segundo'.
    //     int resposta = primeiro ^ segundo;

    //     // Inicializa um contador como zero.
    //     int contador = 0;

    //     // Passo 1: Calcula o número de bits definidos como 1 em 'resposta'.
    //     while (resposta > 0) {
            
    //         contador += 1;

    //         // Desloca os bits de 'resposta' uma posição para a direita.
    //         resposta = resposta >> 1;

    //     }

    //     // Passo 2: Calcula o valor máximo possível com a mesma quantidade de bits que 'resposta'.
    //     resposta = (int) (Math.pow(2, contador) - 1);


    //     // Retorna o valor máximo possível obtido.
    //     return resposta;
    // }

    public static int maximizingXor(int primeiro, int segundo) {

        // Inicializa uma variável 'max' com o valor mínimo possível de um inteiro.
        int max = Integer.MIN_VALUE;

        // Loop externo: itera de 'primeiro' até 'segundo'.
        for (int i = primeiro; i <= segundo; i++) {
            
            // Loop interno: itera de 'primeiro' até 'segundo'.
            for (int j = primeiro; j <= segundo; j++) {
                
                // Calcula a operação XOR entre 'i' e 'j' e compara com o valor atual de 'max'.
                if ((i ^ j ) > max) {
                    
                    // Se o resultado da operação XOR for maior que 'max', atualiza 'max'.
                    max = i ^ j;
                }
            }
        }

        // Retorna o valor máximo da operação XOR encontrado no intervalo.
        return max;
    }
    
}
