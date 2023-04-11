import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int formatoTabuleiro = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int numeroObstaculos = Integer.parseInt(primeiraMultiplaEntrada[1]);

        String[] segundaMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int linha_rainha = Integer.parseInt(segundaMultiplaEntrada[0]);
        int coluna_rainha = Integer.parseInt(segundaMultiplaEntrada[1]);

        List<List<Integer>> obstaculos = new ArrayList<>();

        IntStream.range(0, numeroObstaculos).forEach(i -> {

            try {
                
                obstaculos.add(Stream
                          .of(bufferedReader
                          .readLine()
                          .replaceAll("\\s+$", "").split(""))
                          .map(Integer::parseInt)
                          .collect(toList()));

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        int resultado = Resultado.queensAttack(formatoTabuleiro, numeroObstaculos, linha_rainha, coluna_rainha, obstaculos);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
        // Write your code here
        int top = n - r_q;
        int right = n - c_q;
        int bottom = r_q - 1;
        int left = c_q - 1;
        
        int topLeft = Math.min(top, left);
        int topRight = Math.min(top, right);
        int bottomRight = Math.min(bottom, right);
        int bottomLeft = Math.min(bottom, left);
        
        for (int indice = 0; indice < obstacles.size(); indice += 1) {
            
            // for(int compare = 0; compare < obstacles.size(); compare += 1) {
                
                
            // }
            int compare = 0;
            
            // top
                if (obstacles.get(indice).get(compare + 1) == c_q && (obstacles.get(indice).get(compare) > r_q)) {
                    
                    top = Math.min(top, (obstacles.get(indice).get(compare) - r_q) - 1);
                }
                
                // bottom
                if(obstacles.get(indice).get(compare + 1) == c_q && (obstacles.get(indice).get(compare) < r_q)) {
                    
                    bottom = Math.min(bottom, (r_q - obstacles.get(indice).get(compare)) - 1);
                    
                }
                
                // left
                if(obstacles.get(indice).get(compare) == r_q && obstacles.get(indice).get(compare + 1) < c_q) {
                    
                    left = Math.min(left, (c_q - obstacles.get(indice).get(compare + 1)) - 1);
                }
                
                // right
                if(obstacles.get(indice).get(compare) == r_q && obstacles.get(indice).get(compare + 1) > c_q) {
                    
                    right = Math.min(right, (obstacles.get(indice).get(compare + 1) - c_q) - 1);
                }
                
                // topleft
                if(c_q > obstacles.get(indice).get(compare + 1) && r_q < obstacles.get(indice).get(compare)) {
                    
                    if(c_q - obstacles.get(indice).get(compare + 1) == obstacles.get(indice).get(compare) - r_q) {
                        
                        topLeft = Math.min(topLeft, (c_q - obstacles.get(indice).get(compare + 1) - 1));
                    }
                }
                
                // top right
                if(c_q < obstacles.get(indice).get(compare + 1) && r_q < obstacles.get(indice).get(compare)) {
                    
                    if(obstacles.get(indice).get(compare + 1) - c_q == obstacles.get(indice).get(compare) - r_q) {
                        
                        topRight = Math.min(topRight, (obstacles.get(indice).get(compare + 1) - c_q) - 1);
                    }
                }
                
                // bottom Left
                if(c_q > obstacles.get(indice).get(compare + 1) && r_q > obstacles.get(indice).get(compare)) {
                    
                    if(c_q - obstacles.get(indice).get(compare + 1) == r_q - obstacles.get(indice).get(compare)) {
                        
                        bottomLeft = Math.min(bottomLeft, (c_q - obstacles.get(indice).get(compare + 1) - 1));
                    }
                }
                
                // bottom Right
                if(c_q < obstacles.get(indice).get(compare + 1) && r_q > obstacles.get(indice).get(compare)) {
                    
                    if(obstacles.get(indice).get(compare + 1) - c_q == r_q - obstacles.get(indice).get(compare)) {
                        
                        bottomRight = Math.min(bottomRight, (r_q - obstacles.get(indice).get(compare) - 1));
                    }
                }
            
            
        }
        return top + left + right + bottom + topLeft + topRight + bottomLeft + bottomRight;
        
    }

    // public static int queensAttack(int formatoTabuleiro, int numeroObstaculos, int linha_rainha, int coluna_rainha,
    //         List<List<Integer>> obstaculos) {

    //         int esquerda = coluna_rainha - 1;
    //         int direita = formatoTabuleiro - coluna_rainha;
    //         int superior = formatoTabuleiro - linha_rainha;
    //         int inferior = linha_rainha - 1;
    //         int superiorEsquerdo = Math.min(esquerda, superior);
    //         int inferiorEsquerdo = Math.min(esquerda, inferior);
    //         int superiorDireito = Math.min(direita, superior);
    //         int inferiorDireito = Math.min(direita, inferior);

    //         for(int indice = 0; indice < numeroObstaculos; indice += 1) {

    //             int linha = obstaculos.get(indice).get(0);
    //             int coluna = obstaculos.get(indice).get(1);

    //             if (linha == linha_rainha) {
                    
    //                 if(coluna < coluna_rainha)

    //                     esquerda = Math.min(esquerda, coluna_rainha - coluna - 1);

    //                 else {

    //                     direita = Math.min(direita, coluna - coluna_rainha - 1);
    //                 }
    //             }

    //             if (coluna == coluna_rainha) {
                    
    //                 if(linha > linha_rainha)

    //                     superior = Math.min(superior, linha - linha_rainha - 1);

    //                 else {

    //                     inferior = Math.min(inferior, linha_rainha - linha - 1);
    //                 }
    //             }

    //             if(Math.abs(coluna - coluna_rainha) == Math.abs(linha - linha_rainha)) {

    //                 int diferenca = Math.abs(coluna_rainha - coluna) - 1;

    //                 if(coluna < coluna_rainha) {

    //                     if(linha > linha_rainha) {

    //                         superiorEsquerdo = Math.min(superiorEsquerdo, diferenca);

    //                     } else {

    //                         inferiorEsquerdo = Math.min(inferiorEsquerdo, diferenca);
    //                     }
    //                 }

    //                 if (coluna > coluna_rainha) {
                        
    //                     if (linha > linha_rainha) {
                            
    //                         superiorDireito = Math.min(superiorDireito, diferenca);

    //                     } else {

    //                         inferiorDireito = Math.min(inferiorDireito, diferenca);
    //                     }
    //                 }
    //             }
    //         }

    //         int resposta = esquerda+direita+superior+inferior+superiorDireito+superiorEsquerdo+inferiorDireito+inferiorEsquerdo;

    //     return resposta;
    // }
}