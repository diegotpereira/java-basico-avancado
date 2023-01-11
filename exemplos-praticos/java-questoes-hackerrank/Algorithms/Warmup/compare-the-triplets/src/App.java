import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        ); // saída: 1 1

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int alice_pontuacao = 0;
        int bob_pontuacao = 0;
        List<Integer> pontuacao= new ArrayList<>();


        for (int i = 0; i < 3; i += 1) {
            
            if (a.get(i) > b.get(i)) {

                alice_pontuacao++;

            } else if(a.get(i) < b.get(i)) {

                bob_pontuacao++;
            }
        }

        pontuacao.add(alice_pontuacao);
        pontuacao.add(bob_pontuacao);

        return pontuacao;
    }
}
