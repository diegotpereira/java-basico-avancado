import java.util.*;

// A tarefa do problema "Board Cutting" do Hackerrank é 
// encontrar o custo mínimo para cortar um tabuleiro retangular em peças menores, 
// seguindo as seguintes regras:

// Cada corte deve ser feito ao longo de uma linha reta paralela a um dos lados do tabuleiro.
// Cada corte tem um custo, que é igual ao comprimento da linha ao longo da qual o corte é feito.
// Depois de cada corte, apenas uma das partes resultantes pode ser cortada novamente.
// O objetivo é obter o menor custo possível para cortar o tabuleiro em peças menores.
// A entrada para o problema inclui as dimensões do tabuleiro e os custos de cada corte. A saída 
// esperada é o custo mínimo para cortar o tabuleiro.

public class Resultado {

    public static int boardCutting(List<Integer> cost_y, List<Integer> cost_x) {

        // Classificar os cortes em ordem decrescente de custo.
        // Inicializar o número de cortes feitos em cada direção como zero.
        // Inicializar o custo total como zero.
        // Percorrer os cortes em ordem decrescente de custo e, para cada corte:
        // Se o corte for vertical (ou seja, paralelo ao lado vertical do tabuleiro),
        // incrementar o número de cortes verticais feitos e adicionar o custo do corte
        // multiplicado pelo número de cortes horizontais já feitos +1 ao custo total.
        // Se o corte for horizontal (ou seja, paralelo ao lado horizontal do
        // tabuleiro), incrementar o número de cortes horizontais feitos e adicionar o
        // custo do corte multiplicado pelo número de cortes verticais já feitos + 1 ao
        // custo total.
        // Retornar o custo total.

        // Ordenar as listas em ordem decrescente
        Collections.sort(cost_y, Collections.reverseOrder());
        Collections.sort(cost_x, Collections.reverseOrder());

        // Definir valor da constante M
        final int M = 1000000007;

        // Calcular e retornar o custo mínimo
        return (int) (boardCutting2(cost_y, cost_x) % M);

    }

    static long boardCutting2(List<Integer> cost_y, List<Integer> cost_x) {

        // Inicializar as variáveis do custo, as posições y e x, e as listas de custos
        // y_custo e x_custo
        long custo = 0;
        int y = 0;
        int x = 0;

        long[] x_custo = new long[cost_x.size()];
        long[] y_custo = new long[cost_y.size()];

        // Inicializar as listas de custos x_custo e y_custo
        iniciarCusto(cost_x, x_custo);
        iniciarCusto(cost_y, y_custo);

        // Calcular o custo mínimo percorrendo as listas de custos y e x
        while (y < cost_y.size() && x < cost_x.size()) {

            if (cost_y.get(y) > cost_x.get(x)) {

                // Adicionar o custo da linha y ao custo total e ao custo da coluna x
                custo += cost_y.get(y) + x_custo[x];
                y++;

            } else {

                // Adicionar o custo da coluna x ao custo total e ao custo da linha y
                custo += cost_x.get(x) + y_custo[y];
                x++;
            }
        }

        // Adicionar o restante dos custos das colunas ou linhas que não foram
        // percorridas completamente
        if (x < x_custo.length)
            custo += x_custo[x];

        if (y < y_custo.length)

            custo += y_custo[y];

        // Retornar o custo mínimo
        return custo;
    }

    static void iniciarCusto(List<Integer> lista, long[] valorArmazenado) {

        // Inicializar o último valor da lista de custos como o custo da última linha ou
        // coluna
        valorArmazenado[lista.size() - 1] = lista.get(lista.size() - 1);

        if (lista.size() > 1) {

            // Calcular os custos acumulados das linhas ou colunas restantes
            for (int i = lista.size() - 2; i >= 0; i--) {

                valorArmazenado[i] = valorArmazenado[i + 1] + lista.get(i);
            }
        }
    }

}
