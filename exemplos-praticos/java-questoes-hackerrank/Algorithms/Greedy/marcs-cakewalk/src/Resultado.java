import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// A tarefa do problema "Marc's Cakewalk" no HackerRank é 
// determinar a quantidade mínima de milhas que Marc tem 
// que caminhar para comer cupcakes suficientes para completar 
// sua cota diária de calorias. O problema fornece a quantidade 
// de calorias em cada cupcake e o número de cupcakes disponíveis. 
// A tarefa é ordenar os cupcakes em ordem decrescente de calorias 
// por milha e, em seguida, calcular a quantidade mínima de milhas 
// que Marc deve caminhar para consumir todas as calorias dos cupcakes. 
// O objetivo é minimizar a quantidade de milhas que Marc tem que caminhar.

public class Resultado {

    public static long marcsCakewalk(List<Integer> calorie) {

        // Ordena a lista de calorias em ordem decrescente
        List<Integer> classiCaloria = calorie.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        // Calcula a soma das milhas utilizando a fórmula 2^i * calorie[i]
        long soma = IntStream.range(0, classiCaloria.size())
                .mapToLong(i -> (long) Math.pow(2, i) * classiCaloria.get(i))
                .sum();

        // Retorna a soma total de milhas
        return soma;
    }

    // public static long marcsCakewalk(List<Integer> calorie) {

    // // Inicia a soma das milhas como zero
    // long soma = 0L;

    // // Ordena a lista de calorias em ordem decrescente
    // Collections.sort(calorie, Collections.reverseOrder());

    // // Loop sobre os cupcakes ordenados
    // for (int i = 0; i < calorie.size(); i++) {

    // // Calcula a quantidade de milhas que Marc deve caminhar para consumir as
    // // calorias desse cupcake
    // // A quantidade de milhas é dada por 2^i multiplicado pela quantidade de
    // // calorias do cupcake
    // // e esse valor é adicionado à soma total
    // soma += Math.pow(2, i) * (calorie.get(i));
    // }

    // // Retorna a soma total de milhas
    // return soma;
    // }

}
