import java.math.BigDecimal;
import java.util.*;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        String[] s = new String[n + 2];

        for(int i = 0; i < n; i++) {

            s[i] = teclado.next();
        }

        teclado.close();

        Arrays.sort(s, 0, n, new Comparator() {
           
            public int compare(Object a1, Object a2) {

                BigDecimal bigDecimal1 = new BigDecimal((String) a1);
                BigDecimal bigDecimal2 = new BigDecimal((String) a2);

                return bigDecimal2.compareTo(bigDecimal1);
            }
        });

        for(int i = 0; i < n; i++) {

            System.out.println(s[i]);
        }
    }
}
