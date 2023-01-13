import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> pontuacoes = Stream.of(bufferedReader
                                         .readLine()
                                         .replaceAll("\\s+$", "")
                                         .split(" "))
                                         .map(Integer::parseInt)
                                         .collect(toList());
        List<Integer> resultado = Resultado.breakingRecords(pontuacoes);

        bufferedWriter.write(resultado
                      .stream()
                      .map(Object::toString)
                      .collect(joining(" ")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static List<Integer> breakingRecords(List<Integer> pontuacoes) {

        List<Integer> resposta = new ArrayList<>(1);
        int pontuacaoMaior = pontuacoes.get(0);
        int pontuacaoMenor = pontuacoes.get(0);
        int maior = 0;
        int menor = 0;

        for (int index = 1; index < pontuacoes.size(); index += 1) {
            
            if(pontuacaoMaior < pontuacoes.get(index)) {

                pontuacaoMaior = pontuacoes.get(index);
                maior += 1;

            } else if (pontuacaoMenor > pontuacoes.get(index)) {
                
                pontuacaoMenor = pontuacoes.get(index);
                menor += 1;
            }
        }
        resposta.add(0, maior);
        resposta.add(1, menor);

        return resposta;
    }

    // public static List<Integer> breakingRecords(List<Integer> pontuacoes) {
    //     int min = pontuacoes.get(0);
    //     int[] maisBaixo = new int[pontuacoes.size()];
    //     maisBaixo[0] = min;

    //     for (int index = 0; index < pontuacoes.size(); index += 1) {
            
    //         min = Math.min(min, pontuacoes.get(index));
    //         maisBaixo[index] = min;
    //     }

    //     int max = pontuacoes.get(0);
    //     int[] maisAlto = new int[pontuacoes.size()];
    //     maisAlto[0] = max;

    //     for (int index = 0; index < pontuacoes.size(); index += 1) {
            
    //         max = Math.max(max, pontuacoes.get(index));
    //         maisAlto[index] = max;
    //     }

    //     int contarMin = 0;
    //     int contarMax = 0;

    //     for (int index = 0; index < pontuacoes.size(); index += 1) {
            
    //         if (maisBaixo[index - 1] > maisBaixo[index]) {
                
    //             contarMin++;
    //         }

    //         if (maisAlto[index - 1] < maisAlto[index]) {
                
    //             contarMax++;
    //         }
    //     }
    //     List<Integer> lista = new ArrayList<>();
    //     lista.add(contarMax);
    //     lista.add(contarMin);

    //     return lista;
    // }

    // public static List<Integer> breakingRecords(List<Integer> pontuacoes) {

    //     int min = pontuacoes.remove(0);
    //     int max = min;

    //     List<Integer> recordesQuebrados = new ArrayList<>(List.of(0, 0));
    //     Integer valorAtualizado;

    //     for(Integer pontuacao : pontuacoes) {

    //         if(pontuacao < min) {

    //             min = pontuacao;
    //             valorAtualizado = recordesQuebrados.get(1) + 1;
    //             recordesQuebrados.set(1, valorAtualizado);

    //         } else if (pontuacao > max) {
                
    //             max = pontuacao;
    //             valorAtualizado = recordesQuebrados.get(0) + 1;
    //             recordesQuebrados.set(0, valorAtualizado);
    //         }
    //     }
    //     return recordesQuebrados;
    // }
    
}
