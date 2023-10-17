import java.util.*;

// Classe que representa um nó na árvore usada 
// na resolução do problema "Cut the Tree"
public class NoArvore {

    // Variável para armazenar o valor associado ao nó
    int valor;

    // Índice do nó na árvore
    int indice;

    // Soma dos valores de todos os nós na subárvore enraizada neste nó
    int soma;

    // Lista de filhos deste nó na árvore
    List<NoArvore> filha;

    // Construtor para criar um novo nó com o índice e valor fornecidos
    public NoArvore(int indice, int valor) {

        // Inicializar os atributos do nó
        this.indice = indice;
        this.valor = valor;

        // Criar uma nova lista para armazenar os filhos do nó
        this.filha = new ArrayList();

        // Inicializar a soma do nó com o seu próprio valor
        this.soma = valor;
    }
    
}
