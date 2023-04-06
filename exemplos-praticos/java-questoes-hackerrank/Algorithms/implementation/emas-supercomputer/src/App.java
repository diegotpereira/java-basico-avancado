import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int m = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<String> grade = IntStream.range(0, n).mapToObj(i -> {

            try {

                return bufferedReader.readLine();
            } catch (IOException e) {

                throw new RuntimeException(e);
            }
        }).collect(toList());

        int resultado = Resultado.twoPluses(grade);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int twoPluses(List<String> grade) {

        // Obtem a quantidade de linhas da grade
        int row = grade.size();
        // Obtem a quantidade de colunas da grade
        int column = grade.get(0).length();

        // Cria uma matriz para armazenar a entrada
        char[][] arr = new char[row][column];
        for (int i = 0; i < row; i++) {

            // Converte cada linha da grade em um array de caracteres
            arr[i] = grade.get(i).toCharArray();
        }

        // Inicializa a maior área encontrada como zero
        int max = 0;

        // Percorre cada posição da grade
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int r = 0;

                // Verifica se a posição atual contém um sinal de mais ('G')
                if (arr[i][j] == 'G') {
                    try {

                        // Tenta expandir o sinal de mais na posição atual até que não seja possível
                        // mais
                        while (arr[i + r][j] == 'G' && arr[i - r][j] == 'G' && arr[i][j + r] == 'G'
                                && arr[i][j - r] == 'G') {

                            // se for válida, marca as células da área como 'g' para evitar que sejam usadas
                            // novamente
                            arr[i + r][j] = arr[i - r][j] = arr[i][j + r] = arr[i][j - r] = 'g';

                            // Percorre novamente toda a grade em busca de outro sinal de mais para calcular
                            // a área do segundo sinal de mais
                            for (int x = i; x < row; x++) {
                                for (int y = 0; y < column; y++) {
                                    int R = 0;
                                    int area2 = 0;

                                    // Verifica se a posição atual contém um sinal de mais ('G')
                                    if (arr[x][y] == 'G') {
                                        try {

                                            // Tenta expandir o sinal de mais na posição atual até que não seja possível
                                            // mais
                                            while (arr[x + R][y] == 'G' && arr[x - R][y] == 'G' && arr[x][y + R] == 'G'
                                                    && arr[x][y - R] == 'G') {
                                                R++;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException e) {

                                            // Ignora a exceção se a expansão ultrapassar os limites da grade

                                        }

                                        // Calcula a área do segundo sinal de mais
                                        area2 = (4 * (R - 1)) + 1;
                                    }

                                    // Calcula o produto da área do primeiro sinal de mais com a área do segundo
                                    // sinal de mais
                                    int product = ((4 * r) + 1) * area2;

                                    // Verifica se o produto é maior do que a maior área encontrada até agora
                                    if (product > max)
                                        max = product;
                                }
                            }
                            // Incrementa o raio do sinal de mais
                            r++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                    try {
                        r--;
                        // Marca as posições das placas '+' anteriores de volta para 'G' para permitir a
                        // busca por outras placas '+'
                        while (r >= 0) {
                            arr[i + r][j] = arr[i - r][j] = arr[i][j + r] = arr[i][j - r] = 'G';
                            r--;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {

                    }
                }
            }
        }
        return max;
    }

}
