import java.util.*;

// A tarefa do problema "Luck Balance" em HackerRank é determinar a quantidade 
// máxima de sorte que uma pessoa pode ter em uma competição. O problema é descrito da seguinte maneira:

// Lena está se preparando para uma competição importante que ocorrerá em breve. 
// Ela é uma pessoa muito supersticiosa e acredita que sua sorte durante a competição afetará 
// diretamente seus resultados. Lena acredita que sua sorte é uma variável positiva que pode ser aumentada 
// ou diminuída dependendo de suas ações.

// Existem n competições disponíveis durante o período em que Lena se prepara para a competição importante. 
// Cada competição tem um valor de sorte li e um valor de importância ti. Lena pode perder no máximo k competições. 
// Se ela perder mais do que k competições, sua sorte diminuirá. Se ela perder menos do que k competições, sua sorte aumentará.

// O objetivo do problema é determinar o número máximo de sorte que Lena pode ter durante as competições, sabendo que 
// ela pode perder no máximo k competições e que as competições podem ser realizadas em qualquer ordem.

// Em resumo, a tarefa é encontrar a soma máxima dos valores de sorte das competições que Lena pode perder e ainda assim 
// obter o maior resultado possível em sua competição importante.

public class Resultado {

    public static int luckBalance(int k, List<List<Integer>> concursos) {

        // variável que armazena o saldo de sorte total
        int sorteTotal = 0;

        // variável que conta o número de competições importantes
        int contar = 0;

        // conjunto ordenado que armazena os saldos das competições importantes
        Set<Integer> importantes = new TreeSet<>();

        // iterar sobre todas as competições
        for (List<Integer> lista : concursos) {

            // obter o saldo de sorte da competição atual
            int sorte = lista.get(0);

            // obter o nível de importância da competição atual
            int importancia = lista.get(1);

            // se a competição não for importante
            if (importancia == 0)

                // adicionar o saldo de sorte ao saldo total
                sorteTotal += sorte;

            // se a competição for importante
            else {

                // incrementar o contador de competições importantes
                contar++;

                // adicionar o saldo de sorte da competição atual ao conjunto ordenado
                importantes.add(sorte);

                // se ainda não ultrapassou o limite de competições importantes
                // que podem ser perdidas
                if (contar <= k)

                    // adicionar o saldo de sorte da competição atual ao saldo total
                    sorteTotal += sorte;

                // se já ultrapassou o limite de competições importantes que podem ser perdidas
                else {

                    // adicionar o saldo de sorte da competição atual ao saldo total
                    sorteTotal += sorte;

                    // iterar sobre os saldos das competições importantes
                    for (int primeiro : importantes) {

                        // subtrair duas vezes o saldo da competição mais importante que ainda não foi
                        // perdida do saldo total
                        sorteTotal = sorteTotal - primeiro - primeiro;

                        // remover o saldo da competição mais importante que ainda não foi perdida do
                        // conjunto ordenado
                        importantes.remove(primeiro);

                        // parar a iteração
                        break;
                    }
                }
            }
        }

        // retornar o saldo de sorte total
        return sorteTotal;
    }

    // public static int luckBalance(int numeroCompeticoesImportantesQuePodePerder,
    // List<List<Integer>> concursos) {

    // // Cria uma lista para armazenar os pontos das competições importantes
    // List<Integer> importante = new ArrayList<>();

    // // Inicia a variável sorte como zero
    // int sorte = 0;

    // // Percorre todas as competições
    // for (int i = 0; i < concursos.size(); i++) {

    // // Obtém a pontuação e a importância da competição atual
    // List<Integer> par = concursos.get(i);
    // int pontos = par.get(0);
    // int importancia = par.get(1);

    // // Se a competição é importante, adiciona a pontuação à lista importante
    // if (importancia == 1)

    // // Caso contrário, adiciona a pontuação à variável sorte
    // importante.add(pontos);

    // else

    // sorte += pontos;

    // }

    // // Ordena a lista importante em ordem decrescente
    // Collections.sort(importante, Comparator.reverseOrder());

    // // Percorre as competições importantes
    // for (int i = 0; i < importante.size(); i++)

    // // Adiciona ou subtrai a pontuação, dependendo do número de competições
    // // importantes que podem ser perdidas
    // sorte += (i < numeroCompeticoesImportantesQuePodePerder ? 1 : -1) *
    // importante.get(i);

    // // Retorna o saldo final
    // return sorte;
    // }

    // public static int luckBalance(int k, List<List<Integer>> concursos) {

    // // Ordena a lista de concursos em ordem decrescente de
    // // importância e em ordem crescente de valor
    // concursos.sort((sort1, sort2) -> {

    // if (sort1.get(1).equals(sort2.get(1))) {

    // return sort1.get(0) - sort2.get(0);
    // }

    // return sort2.get(1) - sort1.get(1);
    // });

    // // Calcula o saldo máximo inicial
    // int balanco = concursos.stream().map(e -> e.get(0)).reduce(0, Integer::sum);

    // // Calcula quantos concursos são importantes
    // long importante = concursos.stream().filter(e -> e.get(1) == 1).count();

    // // Desconta o valor dos k concursos mais importantes, já que esses
    // // não podem ser perdidos
    // for (int i = 0; i < (importante - k); i++) {

    // balanco -= 2 * concursos.get(i).get(0);
    // }

    // return balanco;
    // }

    // O número de competições que podem ser perdidas é k ou
    // "numeroCompeticoesImportantesQuePodePerder".
    // A lista de competições, onde cada competição tem dois valores: o primeiro
    // valor é o valor de "sorte"
    // da competição e o segundo valor é um indicador que indica se a competição é
    // importante ou não
    // (1 indica que é importante, 0 indica que não é importante).

    // public static int luckBalance(int numeroCompeticoesImportantesQuePodePerder,
    // List<List<Integer>> concursos) {

    // // Inicializa a variável que irá armazenar o saldo máximo possível com sorte
    // int saldoMaximoSeSorte = 0;

    // // Cria uma lista para armazenar os valores de "sorte" das
    // // competições importantes
    // List<Integer> importantes = new ArrayList<Integer>();

    // // Percorre todas as competições para separar as importantes das não
    // importantes
    // for (List<Integer> lista : concursos) {

    // if (lista.get(1) == 1) {

    // // Se a competição for importante, adiciona o valor de "sorte" à
    // // lista de importantes
    // importantes.add(lista.get(0));

    // } else {

    // // Se a competição não for importante, soma o valor de "sorte" ao
    // // saldo máximo possível
    // saldoMaximoSeSorte += lista.get(0);
    // }
    // }

    // // Ordena a lista de importantes em ordem decrescente
    // // (pois as mais importantes devem ser ganhas)
    // Collections.sort(importantes, Collections.reverseOrder());

    // // Percorre a lista de importantes, subtraindo o valor de "sorte" das
    // // competições que não podem ser ganhas
    // // e somando o valor de "sorte" das competições que podem ser ganhas
    // for (int i = 0; i < importantes.size(); i++) {

    // saldoMaximoSeSorte += (i < numeroCompeticoesImportantesQuePodePerder ? 1 :
    // -1) * (importantes.get(i));
    // }

    // // Retorna o saldo máximo possível com sorte
    // return saldoMaximoSeSorte;
    // }

    // public static int luckBalance(int k, List<List<Integer>> concursos) {

    // // Ordena as competições em ordem decrescente de valor de sorte
    // Collections.sort(concursos, (a, b) -> b.get(0).compareTo(a.get(0)));

    // // Contador de sorte
    // int contar = 0;

    // // Contador de competições importantes ganhas
    // int saldoMaximoSeSorte = 0;

    // // Contador de competições importantes ganhas
    // for (int i = 0; i < concursos.size(); i++) {

    // // Obtém o valor de sorte e a importância da competição atual
    // int quantidadeSorte = concursos.get(i).get(0);
    // int importanciaCompeticao = concursos.get(i).get(1);

    // // Verifica se a competição pode ser perdida ou se ainda é
    // // possível ganhar uma competição importante
    // if (importanciaCompeticao == 0 || saldoMaximoSeSorte < k) {

    // // Incrementa o contador de sorte
    // contar += quantidadeSorte;

    // // Se a competição atual é importante, incrementa o contador de
    // // competições importantes ganhas
    // if (importanciaCompeticao == 1)
    // saldoMaximoSeSorte++;

    // } else

    // // Subtrai o valor de sorte da competição atual do contador de sorte
    // contar -= quantidadeSorte;
    // }

    // // Retorna o valor final da sorte
    // return contar;
    // }

}
