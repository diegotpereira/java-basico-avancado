import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, num).forEach(numItr -> {

            try {
                
                int numPedrasDifZero = Integer.parseInt(bufferedReader.readLine().trim());
                int difPossivel = Integer.parseInt(bufferedReader.readLine().trim());
                int difOutraPossivel = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> resultado = Resultado.stones(numPedrasDifZero, difPossivel, difOutraPossivel);

                bufferedWriter.write(resultado.stream().map(Object::toString).collect(joining(" ")) + "\n");

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });
        
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static List<Integer> stones(int numPedrasDifZero, int difPossivel, int difOutraPossivel) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int indice = 0; indice < numPedrasDifZero; indice += 1) 
            
            set.add(difPossivel * (numPedrasDifZero - 1 - indice) + difOutraPossivel * indice);

        
        return new ArrayList<>(set);
    }

    // public static List<Integer> stones(int numPedrasDifZero, int difPossivel, int difOutraPossivel) {

    //     List<Integer> resultado = new ArrayList<>();

    //     int maiorNum = 0;
    //     int menorNum = 0;
    //     int diferenca = Math.abs(difOutraPossivel - difPossivel);

    //     for (int indice = 0; indice < (numPedrasDifZero - 1); indice += 1) {
            
    //         if (difPossivel < difOutraPossivel) {
                
    //             menorNum += difPossivel;
    //             maiorNum += difOutraPossivel;

                 
    //         } else {

    //             menorNum += difOutraPossivel;
    //             maiorNum += difPossivel;
    //         }
    //     }

    //     while (menorNum <= maiorNum && difPossivel != difOutraPossivel) {
            
    //         resultado.add(menorNum);

    //         menorNum += diferenca;
    //     }

    //     if (difPossivel == difOutraPossivel) {
            
    //         resultado.add((numPedrasDifZero - 1) * difPossivel);
    //     }
    //     return resultado;
    // }

    // public static List<Integer> stones(int numPedrasDifZero, int difPossivel, int difOutraPossivel) {

    //     Set<Integer> set = new HashSet<>();

    //     for (int indice = 0; indice < numPedrasDifZero; indice += 1) 
            
    //         set.add(difPossivel * indice + difOutraPossivel * (numPedrasDifZero - indice - 1));

    //         List<Integer> res = new ArrayList<>(set);

    //         Collections.sort(res);

            
        
    //     return res;
    // }
    
}