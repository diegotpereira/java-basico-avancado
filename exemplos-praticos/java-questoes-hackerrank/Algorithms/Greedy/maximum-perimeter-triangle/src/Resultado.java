import java.util.*;

// A tarefa do problema "Maximum Perimeter Triangle" do HackerRank é escrever 
// um programa que receba como entrada um array de inteiros positivos representando 
// os comprimentos dos lados de vários triângulos possíveis e retorne o perímetro do 
// triângulo com o maior perímetro possível entre todos os triângulos cujos lados são 
// dados como entrada. Se não houver nenhum triângulo possível, o programa deve retornar -1.

public class Resultado {

    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

        // Classifica a lista de palitos em ordem crescente
        Collections.sort(sticks);

        // Lista para armazenar o resultado
        List<Integer> resultado = new ArrayList<>();

        // Percorre a lista de palitos do final para o começo
        for (int i = sticks.size() - 1; i >= 2; i--) {

            // Obtém os três últimos palitos
            int ladoA = sticks.get(i);
            int ladoB = sticks.get(i - 1);
            int ladoC = sticks.get(i - 2);

            // Verifica se esses palitos podem formar um triângulo
            if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {

                // Adiciona o resultado na lista e termina a execução
                resultado.add(ladoC);
                resultado.add(ladoB);
                resultado.add(ladoA);

                break;

            }
        }

        // Se a lista de resultado não estiver vazia, retorna o resultado
        if (resultado.size() != 0) {

            return resultado;
        }

        // Caso contrário, retorna -1 como resposta
        resultado.add(-1);

        return resultado;
    }

    // public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

    // // Ordena a lista em ordem decrescente
    // Collections.sort(sticks, Collections.reverseOrder());
    // int i = 0;

    // // Percorre a lista enquanto houver elementos suficientes para formar um
    // // triângulo
    // while (i < sticks.size() - 2) {

    // // Define o primeiro lado do triângulo
    // int um = sticks.get(i);

    // // Começa a verificar o segundo e terceiro lados a partir da posição i+2
    // int j = i + 2;

    // while (j < sticks.size()) {

    // // Define o segundo e terceiro lados do triângulo
    // int dois = sticks.get(j - 1);
    // int tres = sticks.get(j);

    // // Verifica se é possível formar um triângulo com os três lados escolhidos
    // if (um + dois > tres && um + tres > dois && dois + tres > um) {

    // // Retorna a lista com os lados do triângulo em ordem decrescente
    // return Arrays.asList(tres, dois, um);

    // } else {

    // // Caso não seja possível, passa para o próximo conjunto de lados
    // j++;
    // }
    // }

    // // Passa para o próximo primeiro lado a ser testado
    // i++;
    // }

    // // Caso não seja possível formar um triângulo, retorna a lista com o valor -1
    // // indicando erro
    // return Arrays.asList(-1);
    // }

    // public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

    // // Cria uma lista vazia para guardar o resultado
    // List<Integer> resultado = new ArrayList<>();

    // // Ordena a lista de comprimentos de lados em ordem decrescente
    // Collections.sort(sticks, Comparator.reverseOrder());

    // // Percorre todos os possíveis conjuntos de três valores da lista
    // for (int i = 0; i < sticks.size(); i++) {

    // for (int j = i + 1; j < sticks.size(); j++) {

    // for (int k = j + 1; k < sticks.size(); k++) {

    // // Se o conjunto de três valores formar um triângulo válido, adiciona os
    // valores
    // // na lista de resultado
    // // em ordem decrescente e retorna a lista de resultado
    // if (ehTrianguloValido(sticks.get(i), sticks.get(j), sticks.get(k))) {

    // resultado.add(sticks.get(k));
    // resultado.add(sticks.get(j));
    // resultado.add(sticks.get(i));

    // return resultado;
    // }
    // }
    // }
    // }

    // // Se não encontrou nenhum conjunto de três valores que formem um triângulo
    // // válido, adiciona -1 na lista de resultado
    // resultado.add(-1);

    // // Retorna a lista de resultado
    // return resultado;
    // }

    // // Verifica se um conjunto de três valores forma um triângulo válido
    // private static boolean ehTrianguloValido(int a, int b, int c) {

    // return a < b + c;
    // }

    // public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {

    // // Ordena os comprimentos de lados em ordem crescente
    // Collections.sort(sticks);

    // // Inicia o índice como o terceiro valor a partir do final da lista de
    // // comprimentos de lados
    // int indice = sticks.size() - 3;

    // // Enquanto houver possibilidade de formar um triângulo válido
    // // com os valores atuais,
    // // avança para um conjunto de comprimentos de lados menor
    // while (indice >= 0 && (sticks.get(indice) + sticks.get(indice + 1) <=
    // sticks.get(indice + 2))) {

    // indice--;
    // }

    // // Se não foi possível encontrar um conjunto de comprimentos de lados que
    // formem
    // // um triângulo válido,
    // // retorna uma lista contendo o valor -1
    // if (indice < 0) {

    // return Arrays.asList(-1);

    // } else {

    // // Se encontrou um conjunto de comprimentos de lados que formam um triângulo
    // // válido,
    // // retorna uma lista contendo esses valores em ordem crescente
    // return Arrays.asList(sticks.get(indice), sticks.get(indice + 1),
    // sticks.get(indice + 2));
    // }
    // }

}
