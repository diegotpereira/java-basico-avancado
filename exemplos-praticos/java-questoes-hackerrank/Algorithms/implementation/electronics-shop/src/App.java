import java.io.*;
import java.util.*;

public class App {

    private static final Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] bnm = entrada.nextLine().split(" ");

        entrada.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);
        int n = Integer.parseInt(bnm[1]);
        int m = Integer.parseInt(bnm[2]);
        int[] teclados = new int[n];
        String[] tecladosItens = entrada.nextLine().split(" ");

        entrada.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int index = 0; index < n; index += 1) {
            
            int tecladoItem = Integer.parseInt(tecladosItens[index]);
            teclados[index] = tecladoItem;
        }

        int[] dispositivos = new int[m];

        String[] dispositivoItens = entrada.nextLine().split(" ");
        entrada.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for(int index1 = 0; index1 < m; index1 += 1) {

            int dispositivoItem = Integer.parseInt(dispositivoItens[index1]);
            dispositivos[index1] = dispositivoItem;
        }

        int dinheiroGasto = getMoneySpent(teclados, dispositivos, b);

        bufferedWriter.write(String.valueOf(dinheiroGasto));
        bufferedWriter.newLine();

        bufferedWriter.close();

        entrada.close();
    }
    private static int getMoneySpent(int[] teclados, int[] dispositivos, int b) {

        int precoMax = - 1;
         
         for(Integer teclado : teclados) {
             
             for(Integer usb : dispositivos) {
                 
                 if(teclado + usb <= b) {
                     
                     precoMax = Math.max(precoMax, teclado + usb);
                 }
             }
         }
         
         return precoMax;
    }
    
    // private static int getMoneySpent(int[] teclados, int[] dispositivos, int b) {

    //     List<Integer> max = new ArrayList<>();

    //     for (int index = 0; index < teclados.length; index += 1) {
            
    //         for (int compare = 0; compare < dispositivos.length; compare += 1) {
                
    //             max.add(teclados[index] + dispositivos[compare]);
    //         }
    //     }

    //     Collections.sort(max);

    //     for (int i = max.size() - 1; i >= 0; i--) {
            
    //         if (max.get(i) <= b) {
                
    //             return max.get(i);
    //         }
    //     }
    //     return -1;
    // }

    // static int getMoneySpent(int[] teclados, int[] dispositivos, int b) {

    //     int custo = - 1;

    //     for (int index = 0; index < teclados.length; index += 1) {
            
    //         for (int compare = 0; compare < dispositivos.length; compare += 1) {
                
    //             int soma = teclados[index] + dispositivos[compare];

    //             if (soma > custo && soma <= b) {
                    
    //                 custo = soma;
    //             }
    //         }
    //     }

    //     return custo;
    // }
}
