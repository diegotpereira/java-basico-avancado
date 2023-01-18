import java.io.*;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Resultado.formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        // System.out.println("Hello, World!");
    }
}


class Resultado {

    public static int formingMagicSquare(List<List<Integer>> s) {

        int[][] quadrados = new int[][] {
            {4, 9, 2, 3, 5, 7, 8, 1, 6},
            {2, 7, 6, 9, 5, 1, 4, 3, 8},
            {6, 1, 8, 7, 5, 3, 2, 9, 4},
            {8, 3, 4, 1, 5, 9, 6, 7, 2},
            {2, 9, 4, 7, 5, 3, 6, 1, 8},
            {6, 7, 2, 1, 5, 9, 8, 3, 4},
            {8, 1, 6, 3, 5, 7, 4, 9, 2},
            {4, 3, 8, 9, 5, 1, 2, 7, 6},
        };

        int matriz[] = {

            s.get(0).get(0),
            s.get(0).get(1),
            s.get(0).get(2),
            s.get(1).get(0),
            s.get(1).get(1),
            s.get(1).get(2),
            s.get(2).get(0),
            s.get(2).get(1),
            s.get(2).get(2)

        };

        int minimoCusto = 100;

        for (int linha = 0; linha < 8; linha += 1) {
            
            int custo = 0;

            for (int coluna = 0; coluna < 9; coluna += 1)

                custo += Math.abs(matriz[coluna] - quadrados[linha][coluna]);

                if(custo < minimoCusto)  
                
                    minimoCusto = custo;
        }
        return minimoCusto;   
    }

    // public static int formingMagicSquare(List<List<Integer>> s) {

    //     int[][] quadrados = new int[][] {
    //         {4, 9, 2, 3, 5, 7, 8, 1, 6},
    //         {2, 7, 6, 9, 5, 1, 4, 3, 8},
    //         {6, 1, 8, 7, 5, 3, 2, 9, 4},
    //         {8, 3, 4, 1, 5, 9, 6, 7, 2},
    //         {2, 9, 4, 7, 5, 3, 6, 1, 8},
    //         {6, 7, 2, 1, 5, 9, 8, 3, 4},
    //         {8, 1, 6, 3, 5, 7, 4, 9, 2},
    //         {4, 3, 8, 9, 5, 1, 2, 7, 6},
    //     };
        
    //     int[] entrada = new int[9];
    //     int minimoCusto = Integer.MAX_VALUE;
    //     int entradaIndice = 0;
    //     int diferenca = 0;

    //     for (int linha = 0; linha < s.size(); linha += 1) {
                
    //         for (int coluna = 0; coluna < s.get(linha).size(); coluna += 1) {

    //             entrada[entradaIndice] = s.get(linha).get(coluna);
    //             entradaIndice++;
                
    //         }
    //     }

    //     for (int linha = 0; linha < quadrados.length; linha += 1) {
                
    //         for (int coluna = 0; coluna < quadrados[linha].length; coluna += 1) {

    //             diferenca += Math.abs((quadrados[linha][coluna] - entrada[coluna]));
                
    //         }

    //         if (diferenca < minimoCusto) {
                
    //             minimoCusto = diferenca;
    //         }

    //         diferenca = 0;
    //     }

    //     return minimoCusto;
    // }
}