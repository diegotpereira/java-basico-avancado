import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MaiorNumero {
    
    // Dada uma lista de inteiros não classificados, 
    //encontre o par de elementos que têm a menor diferença absoluta entre eles. 
    // Se houver vários pares, encontre todos eles

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        
        List<Integer> entrada = new ArrayList<>(N);

        for(int i = 0; i < N; i++) {

            entrada.add(teclado.nextInt());
        }

        List<String> saida = numerosMaisProximos(entrada);

        System.out.print(saida.stream().collect(Collectors.joining(" ")));

        // System.out.println(entrada);

        teclado.close();
    }

    public static List<String> numerosMaisProximos(List<Integer> entrada) {

        List<String> saida = new ArrayList<>();

        Collections.sort(entrada);

        int distancia;
        int minimaDistancia = Integer.MAX_VALUE;

        for(int i = 0; i < entrada.size() - 1; i++) {

            System.out.println((entrada.get(i)));

            distancia = Math.abs(Math.abs(entrada.get(i)) - Math.abs(entrada.get(i + 1)));

            if(distancia < minimaDistancia) {

                minimaDistancia = distancia;

                saida = new ArrayList<>();
                saida.add(formatar(entrada.get(i), entrada.get(i + 1)));
                 
            } else if( distancia == minimaDistancia) {
                saida.add(formatar(entrada.get(i), entrada.get(i + 1)));
            }
        }
        return saida;
    }

    private static String formatar(int x, int y) {

        return x + " " + y;
    }
}
