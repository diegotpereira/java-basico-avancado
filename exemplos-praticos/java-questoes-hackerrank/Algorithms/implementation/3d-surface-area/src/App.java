import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int W = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<List<Integer>> A = new ArrayList<>();

        IntStream.range(0, H).forEach(i -> {

            try {
                A.add(
                    Stream.of(bufferedReader
                        .readLine()
                        .replaceAll("\\s+$", "")
                        .split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        int resultado = Resultado.surfaceArea(A);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    
    }
}


class Resultado {

    public static int surfaceArea(List<List<Integer>> A) {

        // Obtém a altura da matriz
        int H = A.size();
        // Obtém a largura da matriz
        int W = A.get(0).size();
        // Cria uma nova matriz a com dimensões ligeiramente maiores do que a matriz original A
        int[][] a = new int[H + 2][W + 2];

        // Copia os valores da matriz original A para a nova matriz a
        for(int i = 1; i <= H; i += 1)
        for(int j = 1; j <= W; j += 1)

            a[i][j] = A.get(i - 1).get(j - 1);

        // Calcula a área inicial, que é a área total da matriz original (que inclui a área interna)
        int area = 2 * H * W;

        // Percorre todas as células na nova matriz a
        for(int i = 1; i <= H + 1; i += 1)
        for(int j = 1; j <= W + 1; j += 1) {

            // Adiciona à área a diferença absoluta entre o valor da célula atual e o valor da célula acima dela
            area += Math.abs(a[i][j] - a[i - 1][j]);
            // Adiciona à área a diferença absoluta entre o valor da célula atual e o valor da célula à sua esquerda
            area += Math.abs(a[i][j] - a[i][j - 1]);
        }
        // Retorna a área total do perímetro da matriz
        return area;
    }

    // public static int surfaceArea(List<List<Integer>> A) {

    //     int H = A.size();
    //     int W = A.get(0).size();
    //     int[][] grade = new int[H + 2] [W + 2];

    //     // preenche a matriz com 0s nas bordas e valores da entrada no interior
    //     for (int i = 0; i < H; i++) {
            
    //         for (int j = 0; j < W; j++) {
                
    //             grade[i + 1][j + 1] = A.get(i).get(j);
    //         }
    //     }
    //     int surfaceArea = 0;

    //     // calcula a área de superfície de cada cubo, levando em consideração a presença de outros cubos ao seu redor
    //     for (int i = 1; i <= H; i++) {
            
    //         for (int j = 1; j <= W; j++) {
                
    //             int altura = grade[i][j];
    //             surfaceArea += 2;

    //             // face frontal
    //             if (altura > grade[i - 1][j]) {
                    
    //                 surfaceArea += altura - grade[i - 1][j];
    //             }

    //             // face traseira
    //             if (altura > grade[i + 1][j]) {
                    
    //                 surfaceArea += altura - grade[i + 1][j];
    //             }

    //             // face esquerda
    //             if (altura > grade[i][j - 1]) {
                    
    //                 surfaceArea += altura - grade[i][j -1];
    //             }

    //             // face direita
    //             if (altura > grade[i][j + 1]) {
                    
    //                 surfaceArea += altura - grade[i][j + 1];
    //             }
    //         }
    //     }
    //     return surfaceArea;
    // }
}