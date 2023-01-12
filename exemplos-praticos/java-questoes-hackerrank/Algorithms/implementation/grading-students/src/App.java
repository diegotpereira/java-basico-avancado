import java.io.*;
import java.util.stream.IntStream;
import java.util.*;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int contagemNotas = Integer.parseInt(bufferedReader.readLine().trim());
        
        List<Integer> notas = IntStream.range(0, contagemNotas).mapToObj(i -> {

            try {
                
                return bufferedReader.readLine().replaceAll("\\s+$", "");

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        })
        .map(String::trim)
        .map(Integer::parseInt)
        .collect(toList());
        
        List<Integer> resultado = Resultado.gradingStudents(notas);

        bufferedWriter.write(resultado.stream()
                                      .map(Object::toString)
                                      .collect(joining("\n"))
                                      + "\n"); // 75 67 40 33

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    // public static List<Integer> gradingStudents(List<Integer> notas) {

    //     List<Integer> novaGrades = new ArrayList<Integer>();

    //     for (int index = 0; index < notas.size(); index += 1) {
            
    //         int proximoMultiploCinco = (notas.get(index) / 5 + 1) * 5;
            
    //         if (proximoMultiploCinco - notas.get(index) < 3 && notas.get(index) >= 38) {
                
    //             novaGrades.add(proximoMultiploCinco);

    //         } else {

    //             novaGrades.add(notas.get(index));
    //         }
    //     }
    //     return novaGrades;
    // }

    public static List<Integer> gradingStudents(List<Integer> notas) {

        List<Integer> novaGrade = new ArrayList<>();

        for(Integer nota : notas) {

            if(nota >= 38 && (((((nota / 5) + 1) * 5) - nota) < 3))

                novaGrade.add((((nota / 5) + 1) * 5));

            else 

                novaGrade.add(nota);

        }

        return novaGrade;
    }
    
}