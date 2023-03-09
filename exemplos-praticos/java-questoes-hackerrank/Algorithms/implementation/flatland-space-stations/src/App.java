import java.io.*;
import java.util.*;

public class App {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = teclado.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] c = new int[m];

        String[] citens = teclado.nextLine().split(" ");

        teclado.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int index = 0; index < m; index += 1) {

            int cItem = Integer.parseInt(citens[index]);
            c[index] = cItem;
        }

        int resultado = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedWriter.close();

        teclado.close();
    }
    // private static int flatlandSpaceStations(int n, int[] c) {
    private static int flatlandSpaceStations(int n, int[] c) {
        
        LinkedList<Integer> lista = new LinkedList<>();

        if(n==c.length)
            return 0;
        else {

            for (int i = 0; i < n; i++) {
                
                int min = Math.abs(c[0] - i);

                for (int j = 0; j < c.length; j++) {

                    int res = Math.abs(c[j] - i);

                    if(res < min)

                        min = res;
                    
                }

                lista.add(min);
            }

            return Collections.max(lista);
        }
    }

    //     List<Integer> c_lista = new ArrayList<Integer>();

    //     for(int num : c) {

    //         c_lista.add(num);
            
    //     }

    //     Collections.sort(c_lista);

    //     int maxima_distancia = 0;

    //     for (int i = 0; i < c_lista.size() - 1; i++) {
            
    //         if (c_lista.get(i + 1) - c_lista.get(i) > maxima_distancia) {

    //             maxima_distancia = (int) (c_lista.get(i + 1) - c_lista.get(i));
                
    //         }
    //     }

    //     System.out.println(maxima_distancia);

    //     return Math.max(Math.max(c_lista.get(0), maxima_distancia / 2), n - 1 - c_lista.get(c_lista.size() - 1));

    // }
}
