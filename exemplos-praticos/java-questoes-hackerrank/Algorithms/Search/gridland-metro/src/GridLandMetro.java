import java.util.*;

public class GridLandMetro {

    
    // public static long gridlandMetro(int n, int m, int k, List<List<Integer>> track) {

    //     // Cria um HashMap chamado 'Metro' para armazenar informações sobre as faixas de trilhos por linha.
    //     HashMap<Long, List<Tracks>> metro = new HashMap<>();

    //     // Loop para processar cada faixa de trilhos na lista 'track'.
    //     // Itera sobre cada faixa de trilhos na lista track:
    //     // a. Obtém o número da linha da faixa de trilhos.
    //     // b. Cria um objeto Tracks que representa a faixa de trilhos com início e fim.
    //     // c. Verifica se o metro já contém a linha; se não, cria uma nova entrada no mapa. Em seguida, adiciona a faixa de trilhos à lista correspondente à linha no metro.
    //     for (List<Integer> t : track) {
            
    //         // Obtém o número da linha da faixa de trilhos.
    //         Long linha = (long) t.get(0);

    //         // Cria um objeto 'Tracks' que representa a faixa de trilhos com início e fim.
    //         Tracks tk = new Tracks(t.get(1), t.get(2));

    //         // Verifica se o 'Metro' já contém a linha; se não, cria uma nova entrada no mapa.
    //         if (!metro.containsKey(linha)) {
                
    //             // Adiciona a faixa de trilhos à lista correspondente à linha no 'Metro'.
    //             metro.put(linha, new ArrayList<Tracks>());
    //         }
            
    //         // Adiciona a faixa de trilhos à lista correspondente à linha no 'Metro'.
    //         metro.get(linha).add(tk);
    //     }
        
    //     // Calcula a área total da cidade de Gridland (número de células).
    //     // Calcula a área total da cidade de Gridland, que é o produto do número de linhas (n) pelo número de colunas (m).
    //     long area = (long)n * (long)m;

    //     // Loop para processar as faixas de trilhos por linha.
    //     // Itera sobre as faixas de trilhos por linha no metro:
    //     // a. Cria um TreeMap chamado classificarMetro para armazenar as faixas de trilhos ordenadas por início.
    //     // b. Itera sobre as faixas de trilhos na linha e adiciona as faixas ao classificarMetro. Se houver faixas que se sobrepõem, elas são combinadas.
    //     // c. Converte o classificarMetro em uma lista de pares chave-valor para facilitar o processamento subsequente.
    //     // d. Inicializa variáveis para rastrear o ponto final da faixa anterior (ultimoPonto), o ponto inicial da primeira faixa (pontoInicial) e a área sobreposta (sobreposicao).
    //     // e. Itera sobre as faixas de trilhos ordenadas:
    //     // i. Calcula a área sobreposta entre as faixas de trilhos, se houver espaço entre elas.
    //     // ii. Atualiza o ultimoPonto para o ponto final da faixa atual.
    //     // f. Calcula o número de faixas de trilhos ocupadas e subtrai essa área da área total da cidade. A área ocupada é a diferença entre o ponto final da última faixa e o ponto inicial da primeira faixa, menos a área sobreposta.
    //     for (List<Tracks> tkLista : metro.values()) {
            
    //         // Cria um TreeMap chamado 'SortedMetro' para armazenar as faixas de trilhos ordenadas por início.
    //         TreeMap<Long, Long> classificarMetro = new TreeMap<>();

    //         // Loop para adicionar as faixas de trilhos ao 'SortedMetro' e combinar faixas que se sobrepõem.
    //         for (Tracks tk : tkLista) {
                
    //             if (classificarMetro.containsKey(tk.left)) {
                    
    //                 if (classificarMetro.get(tk.left) < tk.right) {
                        
    //                     classificarMetro.put(tk.left, tk.right);

    //                 }

    //             } else {

    //                 classificarMetro.put(tk.left, tk.right);
    //             }
    //         }

    //         // Converte o 'SortedMetro' em uma lista de pares chave-valor.
    //         List<Map.Entry<Long, Long>> gradeMetro = new ArrayList<>(classificarMetro.entrySet());

    //         // Inicializa variáveis para rastrear o ponto final da faixa anterior e a área sobreposta.
    //         long ultimoPonto = gradeMetro.get(0).getValue();
    //         long pontoInicial = classificarMetro.firstEntry().getKey();
    //         long sobreposicao = 0;

    //         // Loop para calcular a área ocupada pelas faixas de trilhos na linha.
    //         for (int i = 1; i < gradeMetro.size(); i++) {
                
    //             if (gradeMetro.get(i).getKey() - 1 > ultimoPonto) {
                    
    //                 // Calcula a área sobreposta entre as faixas de trilhos.
    //                 // sobreposicao += gradeMetro.get(i).getValue();
    //                 sobreposicao += gradeMetro.get(i).getKey() - ultimoPonto - 1;
    //             }

    //             if (ultimoPonto < gradeMetro.get(i).getValue()) {
                    
    //                 // Atualiza o ponto final da faixa para a faixa atual.
    //                 ultimoPonto = gradeMetro.get(i).getValue();
    //             }
    //         }

    //         // Calcula o número de faixas de trilhos ocupadas e subtrai essa área da área total da cidade.
    //         long areaOcupada = (ultimoPonto - pontoInicial + 1) - sobreposicao;

    //         area -= areaOcupada;
    //     }

    //     // Retorna a área restante não ocupada por trilhos.
    //     return area;
    // }


    public static long gridlandMetro(int n, int m, int k, List<List<Integer>> track) {

        // Cria uma matriz de booleanos 'visitado' para acompanhar se as células da grade foram visitadas.
        boolean visitado[][] = new boolean[n][m];

        // Inicializa o resultado como 0.
        int resultado = 0;

        // Itera sobre cada faixa de trilhos.
        for (int i = 0; i < track.size(); i++) {
            
            // Obtém informações da faixa de trilhos, incluindo linha, coluna1 e coluna2.
            int linha = track.get(i).get(0);

            // -1 para ajustar o índice base 0
            int coluna1 = track.get(i).get(1) - 1;

            // -1 para ajustar o índice base 0
            int coluna2 = track.get(i).get(2) - 1;

            // Marca as células da faixa de trilhos como visitadas na matriz 'visitado'.
            for (int j = coluna1; j <= coluna2; j++) {
                
                // -1 para ajustar o índice base 0
                visitado[linha - 1][j] = true;
            }
        }

        // Itera sobre todas as células da grade.
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < m; j++) {
                
                // Se a célula não foi visitada, incrementa o resultado.
                if (visitado[i][j] == false) {
                    
                    resultado += 1;
                }
            }
        }

        // Retorna o resultado, que representa a área não ocupada pelas faixas de trilhos.
        return resultado;
    }
}
