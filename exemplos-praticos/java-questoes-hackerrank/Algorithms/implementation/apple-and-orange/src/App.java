import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                         .replaceAll("\\s+$", "")
                                                         .split(" ");

        int pontoInicialCasaSam = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int pontoFinalCasaSam = Integer.parseInt(primeiraMultiplaEntrada[1]);
        
        String[] segundaMultiplaEntrada = bufferedReader.readLine()
                                                        .replaceAll("\\s+$", "")
                                                        .split(" ");

        int localizacaoMacieira = Integer.parseInt(segundaMultiplaEntrada[0]);
        int localizacaoLaranjeira = Integer.parseInt(segundaMultiplaEntrada[1]);

        String[] terceiraMultiplaEntrada = bufferedReader.readLine()
                                                         .replaceAll("\\s+$", "")
                                                         .split(" ");

        int maca = Integer.parseInt(terceiraMultiplaEntrada[0]);
        int laranja = Integer.parseInt(terceiraMultiplaEntrada[1]);

        List<Integer> macas = Stream.of(bufferedReader.readLine()
                                                      .replaceAll("\\s+$", "")
                                                      .split(" "))
                                                      .map(Integer::parseInt)
                                                      .collect(toList());

        List<Integer> laranjas = Stream.of(bufferedReader.readLine()
                                                         .replaceAll("\\s+$", "")
                                                         .split(" "))
                                                         .map(Integer::parseInt)
                                                         .collect(toList());


        Resultado.countApplesAndOranges(pontoInicialCasaSam, pontoFinalCasaSam, localizacaoMacieira, localizacaoLaranjeira, macas, laranjas);

        bufferedReader.close();
    
    }
}


class Resultado {

    public static void countApplesAndOranges(int pontoInicialCasaSam, int pontoFinalCasaSam, int localizacaoMacieira,
            int localizacaoLaranjeira, List<Integer> macas, List<Integer> laranjas) {

        List<Integer> somarLaranjas = new ArrayList<Integer>();
        List<Integer> somarMacas = new ArrayList<Integer>();
        int contar = 0;


        for(Integer maca : macas) {

            somarMacas.add(localizacaoMacieira + maca);
        }

        for(Integer laranja : laranjas) {

            somarLaranjas.add(localizacaoLaranjeira + laranja);
        }

        for(Integer maca : somarMacas) {

            if(maca >= pontoInicialCasaSam && maca <= pontoFinalCasaSam) {

                contar += 1;
            }
        }

        System.out.println(contar);

        contar = 0;

        for(Integer laranja : somarLaranjas) {

            if (laranja >= pontoInicialCasaSam && laranja <= pontoFinalCasaSam) {
                
                contar += 1;
            }
        }

        System.out.println(contar);
    }

    // public static void countApplesAndOranges(int pontoInicialCasaSam, int pontoFinalCasaSam, int localizacaoMacieira,
    //         int localizacaoLaranjeira, List<Integer> macas, List<Integer> laranjas) {

    //     int contarMacas = 0;
    //     int contarLaranjas = 0;

    //     for(Integer maca : macas) 
        
    //         if((localizacaoMacieira + maca >= pontoInicialCasaSam) && (localizacaoMacieira + maca <= pontoFinalCasaSam)) 

    //             contarMacas += 1;

    //     for(Integer laranja : laranjas)

    //         if((localizacaoLaranjeira + laranja >= pontoInicialCasaSam) && (localizacaoLaranjeira + laranja <= pontoFinalCasaSam))

    //             contarLaranjas += 1;


    //     System.out.println(contarMacas);
    //     System.out.println(contarLaranjas);
    // }

    // public static void countApplesAndOranges(int s, int t, int a,
    //         int b, List<Integer> apples, List<Integer> oranges) {                

    //     int pontoInicialCasaSam = s;
    //     int pontoFinalCasaSam = t;
    //     int localizacaoMacieira = a;
    //     int localizacaoLaranjeira = b;
    //     List<Integer> macas = apples;
    //     List<Integer> laranjas = oranges;

    //     int contarMacas = 0;
    //     int contarLaranjas = 0;

    //     for (int index = 0; index < macas.size(); index += 1) {
            
    //         int macaRange = localizacaoMacieira + macas.get(index);

    //         if (macaRange >= pontoInicialCasaSam && macaRange <= pontoFinalCasaSam) {
                
    //             contarMacas++;
    //         }
    //     }

    //     for (int index = 0; index < laranjas.size(); index += 1) {
            
    //         int laranjaRange = localizacaoLaranjeira + laranjas.get(index);

    //         if (laranjaRange >= pontoInicialCasaSam && laranjaRange <= pontoFinalCasaSam) {
                
    //             contarLaranjas++;
    //         }
    //     }
        
    //     System.out.println(contarMacas);
    //     System.out.println(contarLaranjas);
    // }
}