import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int contagemClassificada = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> classificacao = Stream.of(bufferedReader.readLine()
                                           .replaceAll("\\s+$", "").split(" "))
                                           .map(Integer::parseInt)
                                           .collect(toList());

        int contagemJogador = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> jogador = Stream.of(bufferedReader
                                           .readLine()
                                           .replaceAll("\\s+$", "").split(" "))
                                           .map(Integer::parseInt)
                                           .collect(toList());
    
        List<Integer> resultado = Resultado.climbingLeaderboard(classificacao, jogador);

        bufferedWriter.write(resultado
                      .stream()
                      .map(Object::toString)
                      .collect(joining("\n"))
                      + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static List<Integer> climbingLeaderboard(List<Integer> classificacao, List<Integer> jogador) {

        List<Integer> resultado = new ArrayList();
        
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(classificacao);
        
        classificacao.clear();
        classificacao.addAll(set);
        
        for(int elemento : jogador) {
            
            while (classificacao.size() > 0 && elemento >= classificacao.get(classificacao.size() - 1)) {
                
                classificacao.remove(classificacao.size() - 1);
            }
            
            resultado.add(classificacao.size() + 1);
        }
        
        return resultado;
    }

    // public static List<Integer> climbingLeaderboard(List<Integer> classificacao, List<Integer> jogador) {

    //     TreeSet<Integer> classificacaoGeral = new TreeSet<>(classificacao);


    //     return jogador.stream().map(p -> classificacaoGeral.tailSet(p, false).size() + 1).collect(Collectors.toList());
    // }

    // public static List<Integer> climbingLeaderboard(List<Integer> classificacao, List<Integer> jogador) {
    //     // cria uma lista para armazenar os resultados do ranking
    //     // retornaremos isso no final
    //     List<Integer> resultados = new ArrayList<Integer>();

    //     // crie um TreeSet para remover valores duplicados da lista
    //     TreeSet<Integer> classTree = new TreeSet<Integer>(classificacao);

        
    //     //cria um array para armazenar os valores do TreeSet
    //     Integer[] classificadoArray = new Integer[classTree.size()];

    //     int indice = 0;

    //     for(int x : classTree) {

    //         classificadoArray[indice] = x;

    //         indice++;
    //     }

    //     //isso lembra a última entrada verificada da lista
    //     //para não começarmos do início da lista
    //     // toda vez
    //     int ultimaPosicaoVerificada = 0;

    //     //cria um loop para verificar cada entrada na lista de jogadores
    //     for(int x :jogador) {

    //         // retorna 1 se o número que estamos verificando for
    //         //na verdade, a pontuação nº 1 do ranking
    //         if(x >= classificadoArray[classificadoArray.length - 1]) {

    //             resultados.add(1);

    //         } else {

    //             // agora compara a pontuação do jogador com as pontuações no
    //             // lista ranqueada (a partir da última pontuação que verificamos)
    //             // Estamos procurando uma pontuação que supere nossa pontuação, ou empata.
    //             for(int index = ultimaPosicaoVerificada; index < classificadoArray.length; index += 1) {

                    
    //                 // se uma pontuação na lista supera a nossa pontuação,
    //                 // então nossa classificação é um abaixo da classificação dessa pontuação.
    //                 // Lembre-se da posição dessa pontuação e pare de verificar pontuação
    //                 if(x < classificadoArray[index]) {

    //                     resultados.add(classificadoArray.length + 1 - index);
    //                     ultimaPosicaoVerificada = index;
    //                     break;
    //                 }

    //                 // se uma pontuação na lista estiver empatada com a nossa pontuação,
    //                 // então nossa classificação é a mesma que a classificação dessa pontuação.
    //                 // Lembre-se da posição dessa pontuação e pare de verificar as pontuações.

    //                 if (x == classificadoArray[index]) {
                        
    //                     resultados.add(classificadoArray.length - index);
    //                     ultimaPosicaoVerificada = index == 0 ? 0 : index - 1;
    //                     break;
    //                 }
    //             }
    //         }
    //     }

    //     return resultados;
    // }
}