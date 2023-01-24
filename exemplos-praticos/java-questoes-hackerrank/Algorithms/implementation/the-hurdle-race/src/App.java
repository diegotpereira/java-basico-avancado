import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                         .replaceAll("\\s+$", "")
                                                         .split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int alturaSalto = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> alturaBarreira = Stream.of(bufferedReader
                                             .readLine()
                                             .replaceAll("\\s+$", "")
                                             .split(" "))
                                             .map(Integer::parseInt)
                                             .collect(toList());

        int resultado = Resultado.hurdleRace(alturaSalto, alturaBarreira);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int hurdleRace(int alturaSalto, List<Integer> alturaBarreira) {

        int maximo = alturaBarreira.get(0);

        for (int indice = 0; indice < alturaBarreira.size(); indice++) {
            
            if (maximo < alturaBarreira.get(indice)) {
                
                maximo = alturaBarreira.get(indice);
            }
        }

        int n = maximo - alturaSalto;

        if (n > 0) {
            
            return n;

        } else {

            return 0;
        }

    }

    // public static int hurdleRace(int alturaSalto, List<Integer> alturaBarreira) {
    //     int necessidade = 0;
    //     int maximo = alturaBarreira.get(0);

    //     for(int indice : alturaBarreira) {

    //         if(indice >maximo) 

    //             maximo = indice;
    //     }

    //     if(maximo > alturaSalto)

    //         necessidade = maximo - alturaSalto;


    //     return necessidade;
    // }

    // public static int hurdleRace(int alturaSalto, List<Integer> alturaBarreira) {

    //     return Math.max((Collections.max(alturaBarreira) - alturaSalto), 0);
    // }
}