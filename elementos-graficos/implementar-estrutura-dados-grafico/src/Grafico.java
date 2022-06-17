public class Grafico {

    // classe interna
    // para acompanhar as arestas
    /**
     * Aresta
     */
    public class Aresta {
        int src;
        int dest;
    }
    // número de vértices e arestas
    int vertices;
    int arestas;

    // array para armazenar todas as arestas
    Aresta[] aresta;

    Grafico(int vertices, int arestas) {
        this.vertices = vertices;
        this.arestas = arestas;

        
    }
}