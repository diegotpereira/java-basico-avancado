import java.util.*;

public class Resultado {

    public static int kingdomDivision(int n, List<List<Integer>> estradas) {

        // Módulo usado para evitar estouro de valores
        int mod = 1000000007;

        // Mapa para armazenar a lista de adjacências dos vértices
        Map<Integer, List<Integer>> adj = new HashMap<>();

        // Construção do mapa de adjacências
        for(List<Integer> item : estradas) {

            // Vértice pai
            int pai = item.get(0);
            
            // Vértice filho
            int filho = item.get(1);

            // Adiciona o pai ao mapa se ainda não estiver presente
            adj.putIfAbsent(pai, new ArrayList<>());

            // Adiciona o filho ao mapa se ainda não estiver presente
            adj.putIfAbsent(filho, new ArrayList<>());

            // Adiciona o filho à lista de adjacências do pai
            adj.get(pai).add(filho);

            // Adiciona o pai à lista de adjacências do filho
            adj.get(filho).add(pai);

        }

        // Mapa para armazenar iteradores sobre as listas de adjacências
        Map<Integer, Iterator<Integer>> itrLista = new HashMap<>();

        // Inicializa os iteradores para cada vértice no mapa de adjacências
        for(int chave : adj.keySet()) {

            // Obtém o iterador da lista de adjacências correspondente ao vértice
            itrLista.put(chave, adj.get(chave).iterator());

        }

        // Pilha para realizar a busca em profundidade (DFS)
        Stack<Integer> pilha = new Stack<>();

        // Insere o vértice inicial na pilha (começando com o vértice 1)
        pilha.push(1);

        // Mapa para armazenar a configuração boa de cada vértice
        Map<Integer, Integer> boaConf = new HashMap<>();

        // Mapa para armazenar a configuração ruim de cada vértice
        Map<Integer, Integer> ruimConf = new HashMap<>();

        // Conjunto para controlar os vértices visitados durante a busca
        Set<Integer> visitado = new HashSet<>();

        // Marca o vértice inicial como visitado
        visitado.add(1);

        // Mapa para armazenar as listas de filhos de cada vértice
        Map<Integer, List<Integer>> filha = new HashMap<>();

        // Executa a busca em profundidade (DFS)
        while (!pilha.isEmpty()) {
            
            // Obtém o topo da pilha (vértice atual)
            int recurso = pilha.peek();

            // Obtém o iterador correspondente ao vértice atual
            Iterator<Integer> iterator = itrLista.get(recurso);

            try {

                // Obtém o próximo vértice adjacente
                int para = iterator.next();

                if (!visitado.contains(para)) {
                    
                    // Insere o vértice adjacente na pilha
                    pilha.push(para);

                    // Marca o vértice adjacente como visitado  
                    visitado.add(para);

                    // Adiciona a lista de filhos para o vértice atual, se ainda não existir
                    filha.putIfAbsent(recurso, new ArrayList<>());

                    // Adiciona o vértice adjacente à lista de filhos do vértice atual
                    filha.get(recurso).add(para);
                }

            } catch (NoSuchElementException e) {
                
                // Remove o vértice atual da pilha
                int chave = pilha.pop();

                // Inicializa as configurações boas e ruins do vértice atual como 1
                boaConf.put(chave, 1);
                ruimConf.put(chave, 1);

                // Verifica se o vértice atual possui filhos
                if (!filha.containsKey(chave)) {
                    
                    // Se não tiver filhos, as configurações boas são 0 e as ruins são 1
                    boaConf.put(chave, 0);
                    ruimConf.put(chave, 1);

                    // Pula para a próxima iteração do loop
                    continue;
                }

                // Calcula as configurações boas e ruins para cada filho do nó atual
                for(int filho : filha.get(chave)) {

                    // Calcula as configurações boas e ruins para cada filho do nó atual
                    boaConf.put(chave, (int) ((boaConf.get(chave) * (2L * boaConf.get(filho) + ruimConf.get(filho))) % mod));
                    ruimConf.put(chave, (int) ((ruimConf.get(chave) * boaConf.get(filho)) % mod));
                }

                // Subtrai as configurações ruins das configurações boas do vértice atual
                boaConf.put(chave, boaConf.get(chave) - ruimConf.get(chave));

                while (boaConf.get(chave) < 0) {
                    // Garante que a configuração boa seja não negativa
                    boaConf.put(chave, boaConf.get(chave) + mod);
                }
            }
        }

        // Retorna o resultado final da configuração boa do vértice 1, 
        // multiplicado por 2 e aplicando o módulo
        return (boaConf.get(1) * 2) % mod;
    }
    
}
