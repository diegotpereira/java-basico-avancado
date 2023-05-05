import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        int n = 5; // número de vértices
        List<List<Integer>> adj = new ArrayList<>(); // lista de adjacência
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        // adiciona as arestas do grafo
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 3);
        // executa a busca em profundidade a partir do vértice 2
        System.out.println("Busca em profundidade a partir do vértice 2:");
        boolean[] visitado = new boolean[n];
        dfs(adj, 2, visitado);
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void dfs(List<List<Integer>> adj, int atual, boolean[] visitado) {
        visitado[atual] = true;
        System.out.print(atual + " ");
        for (int i = 0; i < adj.get(atual).size(); i++) {
            int vizinho = adj.get(atual).get(i);
            if (!visitado[vizinho]) {
                dfs(adj, vizinho, visitado);
            }
        }
    }
}
