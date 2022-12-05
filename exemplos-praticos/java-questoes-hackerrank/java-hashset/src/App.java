import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        int t = teclado.nextInt();

        String[] pares_esquerdo = new String[t];
        String[] pares_direito = new String[t];

        for(int i = 0; i < t; i++) {

            pares_esquerdo[i] = teclado.next();
            pares_direito[i] = teclado.next();
        }

        HashSet<String> pares = new HashSet<String>(t);

        for(int i = 0; i < t; i++) {

            pares.add("(" + pares_esquerdo[i] + ", " + pares_direito[i] +")");

            System.out.println(pares.size()); // 1
                                              // 2
                                              // 2
                                              // 3
                                              // 3
        }

        teclado.close();
    }
}
