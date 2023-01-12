import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Resultado.staircase(n);

    }
}

class Resultado {

    // public static void staircase(int n) {

    //     int nivel = n - 1;
        
    //     for (int index = 0; index < n; index += 1) {
            
    //         StringBuilder s = new StringBuilder();

    //         for (int compare = 0; compare < nivel; compare += 1) {

    //             s.append(" ");
                
    //         }

    //         for (int compare = 0; compare < n - nivel; compare += 1) {
                
    //             s.append("#");
                
    //         }

    //         nivel -= 1;

    //         System.out.println(s.toString());
    //     }
    // }

    // public static void staircase(int n) {

    //     for (int index = 0; index <= n; index += 1) {
            
    //         String escada = "#";
    //         String espaco = " ";

    //         System.out.println(espaco.repeat(n - index) + escada.repeat(index));
    //     }
    // }

    // public static void staircase(int n) {

    //     for (int index = 0; index <= n; index += 1) {
            
    //         System.out.printf("%" + n + "s\n", "#".repeat(index));
    //     }
    // }

    // public static void staircase(int n) {

    //     // range() usado para retornar um IntStream sequencial ordenado startInclusive to endExclusivepor uma etapa incremental de 1.
    //     IntStream.range(0, n)
    //               // boxed() retorna um Stream que consiste nos elementos deste stream, cada um encaixado em um Integer.
    //              .boxed()
    //              .sorted(Collections.reverseOrder())
    //              .map(i -> " ".repeat(i) + "#".repeat(n - i))
    //              .forEach(System.out::println);
    // }

    // public static void staircase(int n) {

    //     for (int linha = 0; linha < n; linha += 1) {
            
    //         for (int coluna = 0; coluna < n - 1 - linha; coluna += 1) {
                
    //             System.out.print(" ");
    //         }

    //         for (int coluna = 0; coluna <= linha; coluna += 1) {
                
    //             System.out.print("#");
    //         }

    //         System.out.println();
    //     }
    // }

    public static void staircase(int n) {

        int espacos = n - 1;
        int caracter = 1;

        for (int index = 0; index < n; index += 1) {
            
            for (int compare = 0; compare < espacos; compare += 1) {
                
                System.out.print(" ");
            }

            for (int compare = 0; compare < caracter; compare += 1) {
                
                System.out.print("#");
            }

            --espacos;
            ++caracter;

            System.out.print("\n");
        }
    }
}