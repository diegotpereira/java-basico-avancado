import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grade = IntStream.range(0, n).mapToObj(i -> {

            try {
                return bufferedReader.readLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        }).collect(toList());
        
        List<String> resultado = Resultado.cavityMap(grade);

        bufferedWriter.write(resultado.stream().collect(joining("\n")));

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static List<String> cavityMap(List<String> grade) {

        int n = grade.size();

        if(n <= 2) return grade;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n - 1; i++) {
            
            String anterior = grade.get(i - 1);
            String atual = grade.get(i);
            String proximo = grade.get(i + 1);

            sb.append(atual.substring(0, 1));
            int j = 1;

            for (j = 1; j < atual.length() - 1; j += 1) {
                
                if (atual.charAt(j) - '0' > Math.max(anterior.charAt(j) - '0', proximo.charAt(j) - '0')
                    && atual.charAt(j) - '0' > Math.max(atual.charAt(j - 1) - '0', atual.charAt(j + 1) - '0')) {
                    
                        sb.append('X');

                } else {

                    sb.append(atual.charAt(j));
                }
            }


            sb.append(atual.substring(j));
            grade.set(i, sb.toString());

            sb.delete(0, sb.capacity() - 1);
        }
        return grade;
    }

    // public static List<String> cavityMap(List<String> grade) {

    //     for (int i = 1; i < grade.size() - 1; i += 1) {
            
    //         for (int j = 1; j < grade.get(i).length() - 1; j++) {
                
    //             if (grade.get(i).charAt(j) > grade.get(i).charAt(j - 1)
    //                     && grade.get(i).charAt(j) > grade.get(i).charAt(j + 1)
    //                     && grade.get(i).charAt(j) > grade.get(i + 1).charAt(j)
    //                     && grade.get(i).charAt(j) > grade.get(i + 1).charAt(j)) {

    //                         grade.set(i, grade.get(i).substring(0, j) + "X" + grade.get(i).substring(j + 1));
                    
    //             }
    //         }
    //     }
    //     return grade;
    // }
}
