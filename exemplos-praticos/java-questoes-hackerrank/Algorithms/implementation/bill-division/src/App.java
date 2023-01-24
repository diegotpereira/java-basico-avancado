import java.io.*;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                         .replaceAll("\\s+$", "")
                                                         .split(" ");

        int n = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int naoComeu = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> conta = Stream.of(bufferedReader
                                    .readLine()
                                    .replaceAll("\\s+$", "")
                                    .split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList());

        int quantiaDinheiroConta = Integer.parseInt(bufferedReader.readLine().trim());

        Resultado.bonAppetit(conta, naoComeu, quantiaDinheiroConta);

        // System.out.println(resultado);

        bufferedReader.close();

    }
}

class Resultado {

    public static void bonAppetit(List<Integer> conta, int naoComeu, int quantiaDinheiroConta) {

        int soma = 0;

        for (int indice = 0; indice < conta.size(); indice += 1) {
            
            if (indice != naoComeu) {
                
                soma += conta.get(indice);
            }
        }

        System.out.println(soma / 2 == quantiaDinheiroConta ? "Bon Appetit" : quantiaDinheiroConta - soma / 2);
    }

    // public static void bonAppetit(List<Integer> conta, int naoComeu, int quantiaDinheiroConta) {

    //     int soma = conta.stream().mapToInt(Integer::intValue).sum();

    //     soma -= conta.get(naoComeu);

    //     System.out.println(soma / 2 == quantiaDinheiroConta ? "Bon Appetit" : quantiaDinheiroConta - (soma / 2));;
    // }

    // public static void bonAppetit(List<Integer> conta, int naoComeu, int quantiaDinheiroConta) {

    //     int soma = 0;

    //     for(int indice = 0; indice < conta.size(); indice += 1) {

    //         soma = (soma + conta.get(indice));
    //     }

    //     if (((soma - conta.get(naoComeu)) / 2) == quantiaDinheiroConta) {
            
    //         System.out.println("Bon Appetit");

    //     } else {

    //         System.out.println (quantiaDinheiroConta - ((soma - conta.get(naoComeu)) / 2));
    //     }
    // }
}
