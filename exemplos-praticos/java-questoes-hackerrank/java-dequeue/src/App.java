import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = teclado.nextInt();
        int m = teclado.nextInt();
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {

            int num = teclado.nextInt();

            deque.add(num);
            set.add(num);

            if(deque.size() == m) {

                // número máximo de inteiros únicos entre todos os possíveis subarrays
                if(set.size() > max)
                    max = set.size();

                int primeiro = (int) deque.remove();

                if(!deque.contains(primeiro))
                    set.remove(primeiro);
            }
        }
        System.out.println(max); // saída: 3

        teclado.close();
    }
}
