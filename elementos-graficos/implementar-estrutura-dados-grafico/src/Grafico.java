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

        // inicialize o array de aresta
        aresta = new Aresta[arestas];
        for(int index = 0; index < arestas; index++) {
            // cada elemento do array de arestas
            // é um objeto do tipo Edge
            aresta[index] = new Aresta();
        }
    }
}