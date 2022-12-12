import java.util.*;
import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        Map<Integer, Object[]> nodeAtts = new HashMap<Integer, Object[]>();

        for(int i = 0; i < n; i++) 

            nodeAtts.put(i + 1, new Object[] {

                teclado.nextInt(), null
            });
        

        for(int i = 0; i < n; i++) 

            nodeAtts.get(i + 1)[1] = teclado.nextInt() == 0 ? Color.RED : Color.GREEN;

            System.out.println(Color.RED);

        Map<Integer, ArrayList<Integer>> arestas = new HashMap<Integer, ArrayList<Integer>>();

        for(int i = 1; i < n; i++) 

            arestas.put(i, new ArrayList<Integer>());

        

        for(int i = 1; i < n; i++) {

            int u = teclado.nextInt();
            int v = teclado.nextInt();

            arestas.get(u).add(v);
            arestas.get(v).add(u);

        }



        
        teclado.close();
        System.out.println("Hello, World!");
    }
}
