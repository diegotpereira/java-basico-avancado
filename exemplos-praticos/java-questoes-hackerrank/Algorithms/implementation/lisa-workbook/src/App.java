import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int numeroCapitulos = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int numeroProblemasPorPagina = Integer.parseInt(primeiraMultiplaEntrada[1]);

        List<Integer> arr = Stream.of(bufferedReader
                                  .readLine()
                                  .replaceAll("\\s+$", "")
                                  .split(" "))
                                  .map(Integer::parseInt)
                                  .collect(toList());

        int resultado = Resultado.workbook(numeroCapitulos, numeroProblemasPorPagina, arr);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


class Resultado {

    public static int workbook(int numeroCapitulos, int numeroProblemasPorPagina, List<Integer> arr) {

        int especial = 0;
        int atualPagina = 1;

        // percorrer cada capítulo do livro de Lisa
        for(int capitulo = 0; capitulo < arr.size(); capitulo += 1) {

            int totalProblemas = arr.get(capitulo);

            // percorrer cada problema em um capítulo
            for(int problema = 1; problema <= totalProblemas; problema += 1) {

                // o número do problema corresponde ao número da página
                if (problema == atualPagina) {
                    
                    especial++;
                }

                // decidir virar uma página
                if (problema % numeroProblemasPorPagina == 0 || problema == totalProblemas) {
                    
                    atualPagina++;
                }
            }
        }
        return especial;
    }

    // public static int workbook(int numeroCapitulos, int numeroProblemasPorPagina, List<Integer> arr) {

    //     int pagina = 0;
    //     int contar = 0;

    //     for (int i = 0; i < arr.size(); i += 1) {

    //         pagina++;
    //         int temp = numeroProblemasPorPagina;

    //         for (int j = 1; j <= arr.get(i); j++) {
                
    //             if(j <= temp) {

    //                 if(j == pagina)

    //                    contar++;

    //             } else {

    //                 pagina++;
    //                 temp += numeroProblemasPorPagina;

    //                 if(j == pagina)

    //                     contar++;
    //             }
    //         }
            
    //     }
    //     return contar;
    // }

    // public static int workbook(int numeroCapitulos, int numeroProblemasPorPagina, List<Integer> arr) {

    //     int resultado = 0;
    //     int atualPagina = 1;
        
    //     for(int a : arr) {

    //         int paginaNecessaria = a / numeroProblemasPorPagina;

    //         if(a % numeroProblemasPorPagina != 0) paginaNecessaria++;

    //         int pagina = atualPagina;

    //         for (int i = 1; i <= a; i++) {
                
    //             if(i == pagina) resultado++;
    //             if(i % numeroProblemasPorPagina == 0 && pagina < pagina + paginaNecessaria) pagina++;
    //         }

    //         atualPagina += paginaNecessaria;
    //     }

    //     return resultado;
    // }

    // public static int workbook(int numeroCapitulos, int numeroProblemasPorPagina, List<Integer> arr) {

    //     int pagina = 0; 
    //     int especial = 0;

    //     for(int v : arr) {

    //         int nPagina = 0;

    //         while(v > nPagina) {

    //             pagina++;

    //             if (pagina > nPagina && pagina <= Math.min(v, nPagina + numeroProblemasPorPagina)) {
                    

    //                 especial++;
    //             }

    //             nPagina += numeroProblemasPorPagina;
    //         }
    //     }

    //     return especial;
    // }

    // public static int workbook(int numeroCapitulos, int numeroProblemasPorPagina, List<Integer> arr) {

    //     int paginaNo = 1;
    //     int problemaEspecial = 0;

    //     for (int i = 0; i < arr.size(); i++) {
            
    //         for (int j = 1; j <= arr.get(i); j++) {
                
    //             if(paginaNo == j)

    //                 problemaEspecial++;

    //             if((j % numeroProblemasPorPagina == 0) || (j == arr.get(i)))

    //                 paginaNo++;
    //         }
    //     }
        
    //     return problemaEspecial;
    // }
}