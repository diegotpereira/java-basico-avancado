import java.util.*;
import java.util.stream.*;

// A tarefa do problema "KnightL on a Chessboard" do site 
// HackerRank é encontrar o menor número de movimentos que 
// um cavalo de xadrez precisa fazer em um tabuleiro n x n ]
// para chegar do canto superior esquerdo para o canto inferior 
// direito. O tabuleiro é representado por uma matriz de coordenadas 
// (i, j), onde i e j variam de 0 a n-1. O cavalo só pode se mover em 
// forma de "L", isto é, movendo-se duas casas em uma direção 
// (horizontal ou vertical) e uma casa na direção perpendicular. 
// O movimento pode ser feito apenas se a casa de destino estiver 
// dentro do tabuleiro e não estiver ocupada por outra peça. A saída 
// deve ser uma matriz n-1 x n-1, onde o valor na posição (i, j) 
// representa o número mínimo de movimentos necessários para ir do 
// canto superior esquerdo para o canto inferior direito, usando um 
// cavalo de xadrez e movimentos em "L".

public class Resultado {

    // public static List<List<Integer>> knightlOnAChessboard(int n) {

    // // Utilizando IntStream.range para criar um stream de inteiros entre 1 e n
    // // (exclusive)
    // // e convertendo em uma stream de objetos Integer com o método .boxed()
    // // Em seguida, utilizando o método .map para mapear cada objeto Integer i
    // para
    // // uma stream de objetos Integer j, criando assim um stream de stream de
    // Integer
    // // representando cada posição do tabuleiro de xadrez

    // return IntStream.range(1, n)
    // .boxed()
    // .map(i -> IntStream.range(1, n)
    // .boxed()
    // .map(j -> bfs(n, new HashSet<>(),
    // new int[][] { { i, j }, { j, i }, { -i, j }, { -j, i }, { i, -j }, { j, -i },
    // { -i, -j },
    // { -j, -i } }))
    // .collect(Collectors.toList()))
    // .collect(Collectors.toList());

    // }

    // Método que utiliza BFS (Busca em Largura) para encontrar o menor número de
    // movimentos
    // necessários para o cavalo se mover do ponto inicial (0, 0) até o ponto final
    // (n-1, n-1)
    // Recebe como parâmetros:
    // - n: o tamanho do tabuleiro de xadrez n x n
    // - set: um conjunto que armazena as posições já visitadas
    // - dir: uma matriz de deslocamento que armazena os possíveis movimentos do
    // cavalo
    // Retorna o nível do grafo em que (n-1, n-1) foi encontrado, se encontrado.
    // Caso contrário, retorna -1.
    public static int bfs(int n, Set<String> set, int[][] dir) {

        // Criando uma fila para realizar a busca em largura
        Queue<int[]> q = new LinkedList<>();

        // Adicionando o ponto inicial (0, 0) na fila e no conjunto de posições
        // visitadas
        q.add(new int[] { 0, 0 });

        set.add("0:0");

        // Variável para guardar o nível atual da busca em largura (número de
        // movimentos)
        int nivel = 0;

        // Loop enquanto a fila não estiver vazia
        while (!q.isEmpty()) {

            // Armazenando o tamanho atual da fila para iterar apenas sobre
            // os pontos adicionados
            // na iteração anterior (mesmo nível)
            int tamanho = q.size();

            // Loop para iterar sobre os pontos adicionados na iteração anterior
            while (tamanho-- > 0) {

                // Removendo o primeiro elemento da fila
                int[] p = q.poll();

                // Verificando se o ponto atual é o ponto final (n-1, n-1)
                if (p[0] == n - 1 && p[1] == n - 1)

                    // Retornando o nível atual (número de movimentos)
                    return nivel;

                // Iterando sobre a matriz de movimentos possíveis do cavalo
                // Caso contrário, explore seus vizinhos
                for (int[] d : dir) {

                    // Calculando a nova posição x e y do cavalo com base no movimento
                    int x = d[0] + p[0];
                    int y = d[1] + p[1];

                    // Verifica se o vizinho está dentro do tabuleiro e ainda não foi visitado
                    if (x < 0 || y < 0 || x >= n || y >= n || set.contains(x + ":" + y))

                        continue;

                    // Marca o vizinho como visitado e adiciona à fila
                    set.add(x + ":" + y);

                    q.offer(new int[] { x, y });
                }
            }

            // Incrementa o nível
            nivel++;
        }

        // Se não for possível alcançar o destino, retorna -1
        return -1;
    }

    public static List<List<Integer>> knightlOnAChessboard(int n) {

        // cria uma lista para armazenar os resultados
        List<List<Integer>> res = new ArrayList<>();

        // itera através dos valores possíveis de i
        for (int i = 1; i < n; i++) {

            // cria uma lista para armazenar os resultados para um determinado valor de i
            List<Integer> r = new ArrayList<>();

            // itera através dos valores possíveis de j
            for (int j = 1; j < n; j++) {

                // cria uma matriz que contém as coordenadas relativas dos movimentos
                // possíveis do cavalo
                int[][] dir = new int[][] { { i, j }, { i, -1 * j }, { -1 * i, j }, { -1 * i, -1 * j }, { j, i },
                        { -1 * j, i }, { -1 * j, -1 * i }, { j, -1 * i } };

                // cria um conjunto para armazenar as posições visitadas durante a busca
                Set<String> visitado = new HashSet<>();

                // executa uma busca em largura a partir da posição (0, 0) e armazena o número
                // de movimentos necessários para alcançar (n-1, n-1)
                int ret = bfs(n, visitado, dir);

                // adiciona o número de movimentos necessários para a lista de resultados
                r.add(ret);
            }

            // adiciona a lista de resultados para o valor de i atual à lista de resultados
            res.add(r);
        }

        // retorna a lista de resultados
        return res;
    }

}
