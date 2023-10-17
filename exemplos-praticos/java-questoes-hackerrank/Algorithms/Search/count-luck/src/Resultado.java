import java.util.*;

public class Resultado {

    public static String countLuck(List<String> matriz, int palpites) {

        // Função principal para contar a intuição.
        List<Integer> inicial = obterIndiceInicial(matriz);

        // Obtém a posição inicial do personagem 'M'
        Map<String, Integer> mapa = new HashMap<>();

        // Inicializa um mapa para rastrear o número de palpites.
        mapa.put("contador", 0);

        // Chama a função para encontrar a solução e contar palpites.
        ehSolucao(inicial.get(0), inicial.get(1), matriz, new HashSet<>(), mapa);

        // Compara o número de palpites com 'k' e retorna a resposta apropriada.
        return mapa.get("contador")  == palpites ? "Impressed" : "Oops!";
    }

    // Obtém a posição inicial do personagem 'M' no labirinto.
    private static List<Integer> obterIndiceInicial(List<String> matriz) {

        // Retorna uma lista com as coordenadas do personagem 'M'.
        for (int i = 0; i < matriz.size(); i++) 
            
            if(matriz.get(i).contains("M"))

               return Arrays.asList(i, matriz.get(i).indexOf("M"));
        

        // Retorna nulo se 'M' não for encontrado (não deve ocorrer no problema).
        return null;
    }

    // Função recursiva para encontrar a solução e contar palpites.
    private static boolean ehSolucao(int i, int j, List<String> matriz, Set<String> visitado, Map<String, Integer> mapa) {

        // Verifica se a célula já foi visitada.
        if (visitado.contains(i + "," + j)) return false;

        // Marca a célula como visitada.
        visitado.add(i + "," + j);

        // Verifica se as coordenadas estão dentro dos limites da matriz.
        if (!ehIndiceValido(i, j, matriz)) return false;

        // Verifica se a célula é uma parede.
        if (matriz.get(i).charAt(j) == 'X') return false;

        // Verifica se a célula é a posição da amiga.
        if (matriz.get(i).charAt(j) == '*') return true;

        int contador = 0;

        // Verifica se as células vizinhas são válidas e conta as opções.
        if (ehCelulaValida(i - 1, j, matriz, visitado)) contador ++;
        if (ehCelulaValida(i, j - 1, matriz, visitado)) contador ++;
        if (ehCelulaValida(i + 1, j, matriz, visitado)) contador ++;
        if (ehCelulaValida(i, j + 1, matriz, visitado)) contador ++;

        // Se houver mais de uma opção, conta um palpite.
        if (contador > 1) {
            
            mapa.put("contador", mapa.get("contador") + 1);
        }

        // Cria um novo mapa chamado localMap para rastrear o contador local
        Map<String, Integer> localMapa = new HashMap<>();

        // Inicializa o contador local com zero
        localMapa.put("contador", 0);

        // Verifica se a solução é válida indo para cima (linha anterior)
        if (ehSolucao(i - 1, j, matriz, visitado, localMapa)) {
            
            // Se a solução for válida, adiciona o contador local ao contador global
            mapa.put("contador", mapa.get("contador") + localMapa.get("contador"));

            return true;

        } else {

            // Se a solução não for válida indo para cima, recria o mapa local e reinicia o contador local
            localMapa = new HashMap<>();
            localMapa.put("contador", 0);

            // Verifica se a solução é válida indo para a esquerda (coluna anterior)
            if (ehSolucao(i, j - 1, matriz, visitado, localMapa)) {

                // Se a solução for válida, adiciona o contador local ao contador global
                mapa.put("contador", mapa.get("contador") + localMapa.get("contador"));

                return true;
                
            } else {

                // Se a solução não for válida indo para a esquerda, recria o mapa local e reinicia o contador local
                localMapa = new HashMap<>();
                localMapa.put("contador", 0);

                // Verifica se a solução é válida indo para baixo (próxima linha)
                if (ehSolucao(i + 1, j, matriz, visitado, localMapa)) {

                    // Se a solução for válida, adiciona o contador local ao contador global
                    mapa.put("contador", mapa.get("contador") + localMapa.get("contador"));

                    return true;
                    
                } else {

                    // Se a solução não for válida indo para baixo, recria o mapa local e reinicia o contador local
                    localMapa = new HashMap<>();
                    localMapa.put("contador", 0);

                    // Verifica se a solução é válida indo para a direita (próxima coluna)
                    if (ehSolucao(i, j + 1, matriz, visitado, localMapa)) {
                        
                        // Se a solução for válida, adiciona o contador local ao contador global
                        mapa.put("contador", mapa.get("contador") + localMapa.get("contador"));

                        return true;
                    }
                }
                
            }
        }

        // Retorna falso se a solução não foi encontrada nesta direção.
        return false;
    }

    // Verifica se uma célula é válida para visitação.
    private static boolean ehCelulaValida(int i, int j, List<String> matriz, Set<String> visitado) {

        // Verifica se a célula já foi visitada.
        if (visitado.contains(i + "," + j)) return false;

        // Verifica se as coordenadas estão dentro dos limites da matriz.
        if (!ehIndiceValido(i, j, matriz)) return false;

        // Verifica se a célula é uma célula vazia ou a posição da amiga.
        return matriz.get(i).charAt(j) == '.' || matriz.get(i).charAt(j) == '*';
    }

    // Verifica se as coordenadas estão dentro dos limites da matriz.
    private static boolean ehIndiceValido(int i, int j, List<String> matriz) {

        return i >= 0 && j >= 0 && i < matriz.size() && j < matriz.get(0).length();
    }
    
}
