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
                
    //             resultado.add(num);
    //         }
    //     }

    //     if (resultado.isEmpty()) {
            
    //         System.out.println("Range Invalido");

    //     } else {

    //         for(Long num : resultado) {

    //             System.out.println(num + " ");
    //         }

    //         System.out.println();
    //     }
        
    // }    
}
