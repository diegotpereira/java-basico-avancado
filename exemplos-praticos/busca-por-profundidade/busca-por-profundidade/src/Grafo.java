import java.util.*;

public class Grafo {

    // número de vértices no grafo
    private int V;

    // lista de adjacências
    private LinkedList<Integer> adj[];

    Grafo(int v) {

        V = v;

        // inicializa a lista de adjacências para cada vértice
        adj = new LinkedList[v];

        for (int i = 0; i < v; ++i) {

            // inicializa a lista de adjacências para cada vértice com uma lista vazia
            adj[i] = new LinkedList();
        }
        

    }

    // adiciona uma aresta no grafo
    void addEdge(int v, int w) {

        // adiciona w na lista de adjacências de v
        adj[v].add(w);
    }

    // uma função recursiva usada pelo DFS
    void DFSUtil(int v, boolean visitado[]) {

        // marca o vértice atual como visitado
        visitado[v] = true;

        // imprime o vértice atual
        System.out.print(v + " ");

        // obtém um iterador para a lista de adjacências do vértice atual
        Iterator<Integer> i = adj[v].listIterator();

        // itera sobre todos os vértices adjacentes do vértice atual
        while (i.hasNext()) {
            
            // pega o próximo vértice adjacente
            int n = i.next();

            // se o vértice ainda não foi visitado, chama a função DFSUtil recursivamente
            if(!visitado[n])

                DFSUtil(n, visitado);
        }
    }

     // a função principal que faz a travessia DFS
    void DFS(int v) {

        // inicializa todos os vértices como não visitados
        boolean visitado[] = new boolean[V];

        // chama a função DFSUtil recursivamente para visitar 
        // todos os vértices alcançáveis a partir do vértice v
        DFSUtil(v, visitado);
    }

    public static void main(String[] args) {

        // cria um grafo com 4 vértices
        Grafo grafo = new Grafo(4);

        // adiciona arestas ao grafo
        grafo.addEdge(0, 1);
        grafo.addEdge(0, 2);
        grafo.addEdge(1, 2);
        grafo.addEdge(2, 0);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 3);

        // executa a travessia DFS a partir do vértice 2
        System.out.println("A seguir está a primeira travessia de profundidade " + 
                           "(a partir do vértice 2)");


        grafo.DFS(2);
        
    }
    
}
