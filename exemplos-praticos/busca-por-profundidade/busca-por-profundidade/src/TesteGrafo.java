import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesteGrafo {

    @Test
    public void testDFS() {

        // Criação de um grafo com 4 vértices
        Grafo grafo = new Grafo(4);

        // Adicionando arestas ao grafo
        grafo.addEdge(0, 1);
        grafo.addEdge(0, 2);
        grafo.addEdge(1, 2);
        grafo.addEdge(2, 0);
        grafo.addEdge(2, 3);
        grafo.addEdge(3, 3);

        // Criação de um array de booleanos para marcar os vértices visitados
        boolean visitado[] = new boolean[4];

        // Execução do método DFSUtil a partir do vértice 2
        grafo.DFSUtil(2, visitado);

        // Verificação se todos os vértices foram visitados
        assertTrue(visitado[0]);
        assertTrue(visitado[1]);
        assertTrue(visitado[2]);
        assertTrue(visitado[3]);
    }
}
