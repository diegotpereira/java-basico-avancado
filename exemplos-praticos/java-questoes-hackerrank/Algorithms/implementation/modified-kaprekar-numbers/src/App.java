<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());
        int q = Integer.parseInt(bufferedReader.readLine().trim());
        
        Resultado.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}

class Resultado {

    public static void kaprekarNumbers(int p, int q) {

        int contar = 0;

        for (int i = p; i <= q; i++) {
            
            long sqr = (long) i * i;
            int somar = 0;

            if (i == 1) {
                
                System.out.println(1 + " ");
                contar++;
            }

            String str = String.valueOf(sqr);

            if (str.length() > 1) {
                
                String s1 = str.substring(0, str.length() / 2);
                String s2 = str.substring(str.length() / 2, str.length());

                if (Integer.parseInt(s1) + Integer.parseInt(s2) == i) {
                    
                    System.out.println(i + " ");
                    contar++;
                }
            }
        }

        if (contar == 0) {
            
            System.out.println("Range Invalido");
        }
    }

    // public static void kaprekarNumbers(int p, int q) {

    //     boolean flag = false;

    //     for(long i = p; i <= q; i ++) {

    //         long sqr = i * i;
    //         String sq = Long.toString(sqr);
    //         int contar = sq.length();

    //         long esquerdo = 0;
    //         long direito = 0;

    //         contar = contar % 2 == 0 ? contar / 2 : (contar + 1) / 2;

    //         esquerdo = sqr / (long)Math.pow(10, contar);
    //         direito = sqr % (long)Math.pow(10, contar);

    //         if (i == (esquerdo + direito)) {
                
    //             flag = true;

    //             System.out.print(i + " ");
    //         }
    //     }

    //     if (!flag) {
            
    //         System.out.println("Range Inválido");
    //     }
    // }

    // public static void kaprekarNumbers(int p, int q) {

    //     List<Long> resultado = new ArrayList<>();

    //     for(long num = p; num <= q; num++) {

    //         long quadrado = num * num;

    //         String strReo = String.valueOf(quadrado);
    //         String l = strReo.substring(0, strReo.length() / 2);
    //         String r = strReo.substring(strReo.length() / 2, strReo.length());

    //         if (l.isEmpty()) {
                
    //             l = "0";
    //         }

    //         if (r.isEmpty()) {
                
    //             r = "0";
    //         }

    //         if (Long.valueOf(r) + Long.valueOf(l) == num) {
=======
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
>>>>>>> 2f03c98d362fafa3d74f5253b4fa7e130e2ed111
                
    //             resultado.add(num);
    //         }
    //     }

    //     if (resultado.isEmpty()) {
            
<<<<<<< HEAD
    //         System.out.println("Range Invalido");
=======
    //         System.out.println("Range Inválido");
>>>>>>> 2f03c98d362fafa3d74f5253b4fa7e130e2ed111

    //     } else {

    //         for(Long num : resultado) {

<<<<<<< HEAD
    //             System.out.println(num + " ");
=======
    //             System.err.print(num + " ");
>>>>>>> 2f03c98d362fafa3d74f5253b4fa7e130e2ed111
    //         }

    //         System.out.println();
    //     }
<<<<<<< HEAD
        
    // }    
}
=======
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
>>>>>>> 2f03c98d362fafa3d74f5253b4fa7e130e2ed111
