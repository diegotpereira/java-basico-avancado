import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        // um inteiro N
        int N = teclado.nextInt();

        // inteiros separados por N espaço descrevendo L
        List L = new ArrayList<>();

        // Percorrendo N
        for(int i = 0; i < N; i++) 
           L.add(i, teclado.nextInt());

        // um inteiro Q para consultas;
        int Q = teclado.nextInt();

        teclado.nextLine();

        // Percorrendo Q
        for(int i = 0; i < Q; i++) {

            
            String s1 = teclado.nextLine();
            String s2 = teclado.nextLine();

            // Se a primeira linha de uma consulta contiver String Insert,
            // a segunda linha conterá dois inteiros separados por espaços,
            if(s1.equalsIgnoreCase("Insert")) {

                String arr[] = s2.split(" ");

                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[1]);

                L.add(x, y);
            }

            // Se a primeira linha de uma consulta contiver String Delete
            // a segunda linha conterá o índice x, cujo elemento deve ser deletado 
            // de L.
            if(s1.equalsIgnoreCase("Delete")) {

                int x = Integer.parseInt(s2);

                L.remove(x);
            }
        }

        teclado.close();
    }
}
