import java.util.*;

// O problema Connected Cell in a Grid do HackerRank 
// tem como tarefa encontrar a região de células contíguas 
// com valores iguais em uma grade (matriz) e determinar o 
// tamanho da maior região. Cada célula na grade pode ter 
// um valor binário de 0 ou 1 e a região é definida como 
// um conjunto de células adjacentes horizontalmente, 
// verticalmente ou diagonalmente com o mesmo valor.

public class Resultado {

    public static int connectedCell(List<List<Integer>> matrix) {

        // conjunto para armazenar as células já visitadas
        Set<String> visitado = new HashSet<>();

        // tamanho do conjunto visitado
        int tamanho = 0;

        // valor máximo de células na região conectada
        int max = 0;

        // percorre as linhas da matriz
        for (int i = 0; i < matrix.size(); i++) {

            // percorre as colunas da matriz
            for (int j = 0; j < matrix.get(0).size(); j++) {

                // se a célula atual é 1 e não foi visitada
                if (matrix.get(i).get(j) == 1 && !visitado.contains(i + ":" + j)) {

                    // realiza uma busca em profundidade a partir da célula atual
                    dfs(matrix, i, j, visitado);

                    // atualiza o valor máximo de células na região conectada
                    max = Math.max(visitado.size() - tamanho, max);

                    // atualiza o tamanho do conjunto visitado
                    tamanho = visitado.size();
                }
            }
        }

        // retorna o valor máximo de células na região conectada
        return max;
    }

    private static void dfs(List<List<Integer>> matrix, int i, int j, Set<String> visitado) {

        // matriz com as direções para percorrer a matriz
        int[][] dir = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 }, { 1, 1 }, { -1, -1 }, { 1, -1 },
                { -1, 1 } };

        // se a célula atual estiver fora da matriz, já foi visitada ou é 0
        if (i < 0 || j < 0 || i == matrix.size() || j == matrix.get(0).size() || visitado.contains(i + ":" + j)
                || matrix.get(i).get(j) == 0) {

            // retorna
            return;

        }

        // adiciona a célula atual ao conjunto visitado
        visitado.add(i + ":" + j);

        // para cada direção d
        for (int[] d : dir) {

            // calcula a próxima posição x
            int x = i + d[0];

            // calcula a próxima posição y
            int y = j + d[1];

            // realiza uma busca em profundidade a partir da próxima posição
            dfs(matrix, x, y, visitado);
        }
    }

    // public static int connectedCell(List<List<Integer>> matrix) {

    // // Armazena o tamanho da maior região encontrada
    // int max = 0;

    // // Armazena o número de colunas da matriz
    // int n = matrix.size();

    // // Armazena o número de colunas da matriz
    // int m = matrix.get(0).size();

    // // Itera sobre cada célula da matriz
    // for (int i = 0; i < n; i++) {

    // for (int j = 0; j < m; j++) {

    // // Se a célula atual contém um 1 (início de uma região)
    // if (matrix.get(i).get(j) == 1) {

    // // Array temporário para armazenar o tamanho da região
    // int tmp[] = { 0 };

    // // Encontra a região coberta pelo 1 atual (célula atual)
    // regiaoCobertura(matrix, i, j, n, m, tmp);

    // // Armazena o tamanho da maior região encontrada
    // max = Integer.max(max, tmp[0]);
    // }
    // }
    // }
    // return max;
    // }

    // static void regiaoCobertura(List<List<Integer>> mt, int i, int j, int n, int
    // m, int c[]) {

    // // Condições para verificar se a célula atual está dentro dos limites da
    // matriz
    // if (i >= n || i < 0 || j >= m || j < 0)

    // return;

    // // Se a célula atual é um 0, então não faz parte da região
    // if (mt.get(i).get(j) == 0)

    // return;

    // // Marca a célula atual como visitada (0)
    // mt.get(i).set(j, 0);

    // // Incrementa o tamanho da região atual
    // c[0]++;

    // // Verifica as células vizinhas para ver se elas fazem parte da mesma região
    // // direita
    // regiaoCobertura(mt, i, j + 1, n, m, c);
    // // esquerda
    // regiaoCobertura(mt, i, j - 1, n, m, c);
    // // abaixo
    // regiaoCobertura(mt, i + 1, j, n, m, c);
    // // acima direita
    // regiaoCobertura(mt, i - 1, j + 1, n, m, c);
    // // abaixo direita
    // regiaoCobertura(mt, i + 1, j + 1, n, m, c);
    // // abaixo esquerda
    // regiaoCobertura(mt, i + 1, j - 1, n, m, c);
    // // acima esquerda
    // regiaoCobertura(mt, i - 1, j - 1, n, m, c);
    // }

}
