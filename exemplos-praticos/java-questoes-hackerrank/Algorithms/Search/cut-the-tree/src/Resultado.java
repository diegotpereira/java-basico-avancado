import java.util.*;


// O problema "Cut the Tree" envolve uma árvore com N vértices numerados de 1 a N. 
// Cada vértice tem um valor associado, denotado por valor[i], onde i é o índice do vértice. 
// A árvore é um grafo não direcionado com N-1 arestas que conectam os vértices.

// O objetivo é cortar uma aresta da árvore de forma que a diferença absoluta entre 
// a soma dos valores nos dois subárvores resultantes seja minimizada. Em outras palavras, 
// queremos encontrar uma aresta para cortar de modo que as duas subárvores geradas tenham 
// a menor diferença absoluta possível em suas somas de valores.

// O problema solicita que você determine a menor diferença absoluta possível e retorne esse valor.

public class Resultado {

    // Método para calcular a menor diferença absoluta entre as somas dos subárvores
    public static int cutTheTree(List<Integer> data, List<List<Integer>> arestas) {

        // Tamanho da árvore (número de vértices)
        int tamanho = data.size();

        // Array para representar o grafo usando lista de adjacência
        List<Integer>[] grafo = new LinkedList[tamanho + 1];

        // Array para marcar os vértices visitados
        int[] visitado = new int[tamanho + 1];

        // Inicializar a lista de adjacência para cada vértice
        for (int i = 1; i < grafo.length; i++) {
            
            grafo[i] = new LinkedList<Integer>();
        }

        // Preencher a lista de adjacência com as arestas da árvore
        for (List<Integer> aresta : arestas) {
            
            grafo[aresta.get(0)].add(aresta.get(1));
            grafo[aresta.get(1)].add(aresta.get(0));
        }

        // Criar a raiz da árvore e iniciar a construção da árvore
        NoArvore root = new NoArvore(1, data.get(0));
        visitado[1] = 1;
        root.soma = construirCriancas(root, grafo, data, visitado);
        
        // Calcular a menor diferença absoluta
        return corte(root, root.soma, Integer.MAX_VALUE);
    }

    // Método para construir as subárvores e calcular os subtotais dos vértices
    private static int construirCriancas(NoArvore no, List<Integer>[] grafo, List<Integer> data, int[] visitado) {

        int filhoSoma = 0;

        // Percorrer os vértices vizinhos
        for (int i = 0; i <grafo[no.indice].size(); i++) {
            
            int indice = grafo[no.indice].get(i);

            // Se o vértice já foi visitado, continue
            if(visitado[indice] == 1) continue;

            // Criar um novo nó para o filho e adicionar à lista de filhos do nó atual
            NoArvore filho = new NoArvore(indice, data.get(indice - 1));
            no.filha.add(filho);
            visitado[indice] = 1;

            // Construir a subárvore do filho e calcular a soma dos valores
            filho.soma = construirCriancas(filho, grafo, data, visitado);

            // Somar o subtotal do filho ao total dos filhos
            filhoSoma = filhoSoma + filho.soma;
        }

        // Retornar o valor total do nó atual, 
        // incluindo seus filhos
        return no.valor + filhoSoma;
    }

    // Método para calcular a menor diferença absoluta ao cortar arestas
    public static int corte(NoArvore no, int soma, int ultimaMinimaDif) {

        int minDif = ultimaMinimaDif;
        List<NoArvore> nos = no.filha;

        // Percorrer os filhos do nó
        for (int i = 0; i < nos.size(); i++) {
            
            int atualSomaNo = nos.get(i).soma;
            int dif = soma - atualSomaNo * 2;

            // Se a diferença for positiva, atualizar a menor diferença
            if (dif > 0) {
                
                minDif = Integer.min(minDif, dif);
            }
        }

        // Percorrer novamente os filhos do nó
        for (int i = 0; i < nos.size(); i++) {
            
            int atualSomaNo = nos.get(i).soma;
            int dif = soma - atualSomaNo * 2;

            // Se a diferença for zero, 
            // retornar 0
            if (dif == 0) {
                
                return 0;
            }

            // Se a diferença for positiva, 
            // atualizar a menor diferença
            if (dif > 0 ) {
                
                minDif = Integer.min(minDif, dif);

            } else {

                // Caso contrário, continuar recursivamente nos filho
                return corte(nos.get(i), soma, minDif);
            }
        }

        // Retornar a menor diferença entre as duas possibilidades
        return Integer.min(minDif, Math.abs(soma - no.soma * 2));
    }

    // // Método para calcular a menor diferença absoluta
    // public static int cutTheTree(List<Integer> data, List<List<Integer>> arestas) {

    //     // Calcular a soma total de todos os valores na árvore
    //     int total = data.stream().reduce(0, Integer::sum);

    //     // Criar um objeto da classe Grafo para representar a árvore
    //     Grafo grafo = new Grafo(data, total);

    //     // Adicionar as arestas à representação da árvore
    //     for(List<Integer> aresta : arestas) {

    //         grafo.add(aresta.get(0), aresta.get(1));
    //     }

    //     // Calcular o subtotal de cada vértice da árvore e encontrar a menor diferença
    //     grafo.calcularSubTotal();

    //     // Retornar o valor da menor diferença absoluta
    //     return grafo.min;
    // }
}
