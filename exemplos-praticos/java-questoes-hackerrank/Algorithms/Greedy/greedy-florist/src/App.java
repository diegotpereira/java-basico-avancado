import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] c = new int[n];

            String[] cItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int cItem = Integer.parseInt(cItems[i]);
                c[i] = cItem;
            }

            int minimumCost = Resultado.getMinimumCost(k, c);

            bufferedWriter.write(String.valueOf(minimumCost));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }

    }
}
