import java.util.*;

// A tarefa do problema "Stone Division 2" é determinar se 
// é possível dividir uma pilha de pedras em subpilhas menores 
// de acordo com certas regras. A pilha inicial contém um número 
// inicial de pedras e existem várias operações permitidas para 
// dividir a pilha. O objetivo é determinar se é possível atingir 
// uma configuração específica de subpilhas de acordo com as regras fornecidas.

// O problema envolve a implementação de uma função que recebe como entrada 
// o número inicial de pedras e uma lista de números que representam as subpilhas 
// desejadas. A função deve retornar verdadeiro se for possível dividir a pilha 
// inicial nas subpilhas desejadas de acordo com as regras estabelecidas, 
// e falso caso contrário.

// Você pode encontrar mais detalhes sobre o problema e exemplos de entrada/saída 
// na página do desafio no HackerRank.

public class Resultado {

    public static long stoneDivision(long n, List<Long> s) {

        // Mapa para armazenar os valores calculados de mover
        Map<Long, Long> mover = new HashMap<>();

        // Quantidade de elementos em s
        int m = s.size();

        // Se s estiver vazio, retorna 0
        if (m == 0) {

            return 0;
        }

        // Valor máximo de mover
        long max = 0;

        // Percorre os elementos em s
        for (long consulta : s) {

            // Verifica se n é divisível por consulta e se são diferentes
            if (n % consulta != 0 || n == consulta) {

                // Não é uma divisão válida, passa para o próximo elemento
                continue;
            }

            // Verifica se o valor de consulta já foi calculado anterior
            if (!mover.containsKey(consulta)) {

                // Calcula o valor de mover para o elemento consulta
                mover.put(consulta, stoneDivision(consulta, s));
            }

            // Calcula o número de pilhas
            long numDePilhas = n / consulta;

            // Atualiza o valor máximo de mover
            max = Math.max(max, numDePilhas * mover.get(consulta) + 1);

        }

        // Retorna o valor máximo de mover
        return max;
    }

}
