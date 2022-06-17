public class App {
    public static void main(String[] args) throws Exception {

        // criar um objeto da classe Grafico
        int semVertices = 5;
        int semArestas = 8;
        
        Grafico g = new Grafico(semVertices, semArestas);

        // criar grafico
        g.aresta[0].src = 1;
        g.aresta[0].dest = 2;

        g.aresta[1].src = 1;
        g.aresta[1].dest = 3;

        g.aresta[2].src = 1;
        g.aresta[2].dest = 4;

        g.aresta[3].src = 2;
        g.aresta[3].dest = 4;

        g.aresta[4].src = 2;
        g.aresta[4].dest = 5;

        g.aresta[5].src = 3;
        g.aresta[5].dest = 4;

        g.aresta[6].src = 3;
        g.aresta[6].dest = 5;

        g.aresta[7].src = 4;
        g.aresta[7].dest = 5;

        // imprimir grafico
        for(int index = 0; index < semArestas; index++) {
            System.out.println(g.aresta[index].src + " - " + g.aresta[index].dest);
        }
    }
}
