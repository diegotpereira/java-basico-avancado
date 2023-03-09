import java.io.*;
import java.util.*;


// Um número de Kaprekar numa determinada base é um inteiro não-negativo, 
// tal que a representação do seu quadrado nessa base pode ser dividida 
// em duas partes que somadas permitem obter o número original (ao dividir 
// o número cujas partes você vai adicionar, deixe a parte mais longa à direita)

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int limiteInferior = Integer.parseInt(bufferedReader.readLine().trim());
        int limiteSuperior = Integer.parseInt(bufferedReader.readLine().trim());

        Resultado.kaprekarNumbers(limiteInferior, limiteSuperior);
    }
}


class Resultado {

    public static void kaprekarNumbers(int limiteInferior, int limiteSuperior) {

        boolean bandeira = false;

        for(long index = limiteInferior; index <= limiteSuperior; index += 1) {

            long num = index * index;

            String  sq = Long.toString(num) ;
            int contar = sq.length();
            long esquerdo = 0;
            long direito = 0;

            contar = contar % 2 == 0 ? contar / 2 : (contar + 1) / 2;

            esquerdo = num / (long) Math.pow(10, contar);
            direito = num % (long) Math.pow(10, contar);

            if (index == esquerdo + direito) {
                
                bandeira = true;
                System.out.print(index + " ");
            }
        }

        if (!bandeira) {
            
            System.out.println("Range inválido!");
        }
    }

    // public static void kaprekarNumbers(int limiteInferior, int limiteSuperior) {

    //     List<Long> resultado = new ArrayList<>();

    //     for(long num = limiteInferior; num <= limiteSuperior; num += 1) {

    //         long quadrado = num * num;

    //         String strRep = String.valueOf(quadrado);
    //         String esquerdo = strRep.substring(0, strRep.length() / 2);
    //         String direita = strRep.substring(strRep.length() / 2, strRep.length());

    //         if (esquerdo.isEmpty()) {
                
    //             esquerdo = "0";
    //         }

    //         if (direita.isEmpty()) {
                
    //             direita = "0";
    //         }

    //         if (Long.valueOf(direita) + Long.valueOf(esquerdo) == num) {
                
    //             resultado.add(num);
    //         }
    //     }

    //     if (resultado.isEmpty()) {
            
    //         System.out.println("Range Inválido");

    //     } else {

    //         for(Long num : resultado) {

    //             System.err.print(num + " ");
    //         }

    //         System.out.println();
    //     }
    // }

    // public static void kaprekarNumbers(int limiteInferior, int limiteSuperior) {

    //     int contar = 0;

    //     for(int index = limiteInferior; index <= limiteSuperior; index += 1) {

    //         Long n = (long) index * index;
    //         int n1 = 0;

    //         String s = Long.toString(n);
    //         String s1 = s.substring(0, s.length() / 2);
    //         String s2 = s.substring(s.length() / 2, s.length());

    //         if (s.length() > 1) {
                
    //             n1 = Integer.parseInt(s1);
    //         }

    //         int n2 = Integer.parseInt(s2);

    //         if(index == n1 + n2) {

    //             System.out.print(index + " ");
    //             contar++;
    //         }
    //     }
    // }
}