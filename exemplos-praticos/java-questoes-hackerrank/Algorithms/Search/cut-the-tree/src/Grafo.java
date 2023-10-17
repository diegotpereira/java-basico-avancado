import java.util.*;

// Classe que representa a estrutura de grafo para a árvore e calcula subtotais
public class Grafo {
    
    // Representação do grafo usando lista de adjacência
    List<Integer> [] grafo;

    // Array para armazenar os subtotais dos vértices
    int[] subTotal;

    // Array para marcar os vértices visitados
    boolean[] marcado;

    // Lista de valores associados aos vértices da árvore
    List<Integer> data;

    // Soma total de todos os valores da árvore
    int total;

    // Variável para armazenar o valor mínimo de diferença encontrado
    int min = Integer.MAX_VALUE;

    // Construtor para inicializar o grafo e outras estruturas
    public Grafo(List<Integer> data, int total) {

        int n = data.size();

        // Inicializar as estruturas de dados
        this.data = data; 

        grafo = new List[n + 1];
        subTotal = new int[n + 1];
        marcado = new boolean[n + 1];

        this.total = total;

        // Inicializar as listas da representação de lista de adjacência
        for (int i = 0; i < grafo.length; i++) {
            
            grafo[i] = new ArrayList<>();
        }
    }

    // Método para adicionar arestas ao grafo
    public void add(int p, int q) {

        grafo[p].add(q);
        grafo[q].add(p);
    }

    // Método para calcular os subtotais dos vértices 
    // da árvore e encontrar a menor diferença
    public void calcularSubTotal() {

        // Utilizando uma pilha para realizar busca em profundidade no grafo
        Deque<Integer> pilha = new ArrayDeque<>();

        // Começar a busca a partir do vértice 1 (raiz da árvore)
        marcado[1] = true;
        pilha.push(1);

        while (!pilha.isEmpty()) {
            
            int s = pilha.peek();

            boolean cauda = true;
            int soma = 0;

            // Percorrer os vizinhos do vértice s
            for (int i = 0; i < grafo[s].size(); i++) {
                
                Integer v = grafo[s].get(i);

                // Somar o subtotal dos vértices vizinhos
                soma += subTotal[v];

                // Se o vértice ainda não foi visitado, 
                // continuar a busca por ele
                if (!marcado[v]) {
                    
                    cauda = false;
                    marcado[v] = true;
                    pilha.push(v);
                    break;
                }
            }

            // Se o vértice é uma folha (cauda) da árvore
            if (cauda) {
                
                // Remover o vértice da pilha
                pilha.pop();

                // Calcular o subtotal do vértice e atualizar o valor mínimo de diferença
                subTotal[s] = data.get(s - 1) + soma;
                int abs = Math.abs(total - 2 * subTotal[s]);

                if (abs < min) {
                    
                    min = abs;
                }
            }
        }
    }
}
