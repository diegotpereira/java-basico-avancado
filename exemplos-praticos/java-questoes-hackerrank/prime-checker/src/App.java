import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.in;


class Melhor {

    void verificarMelhor(int... numeros) {

        for(int num : numeros) {

            if (ehPrimo(num)) {
                
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }

    boolean ehPrimo(int n) {

        if(n < 2) {

            return false;

        } else if (n == 2) {
            
            return true;

        } else if (n % 2 == 0) {
            
            return false;
        }

        int sqrt = (int) Math.sqrt(n);

        for(int i = 3; i <= sqrt; i += 2) {

            if(n % i == 0) {

                return false;
            }
        }

        return true;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());

            Melhor melhor = new Melhor();

            melhor.verificarMelhor(n1);
            melhor.verificarMelhor(n1, n2);
            melhor.verificarMelhor(n1, n2, n3);
            melhor.verificarMelhor(n1, n2, n3, n4, n5);

            Method[] methods = Melhor.class.getDeclaredMethods();
            
            Set<String> set = new HashSet<>();

            boolean sobrecarga = false;

            for(int i = 0; i < methods.length; i++) {

                if(set.contains(methods[i].getName())) {

                    sobrecarga = true;
                    break;
                }

                set.add(methods[i].getName());
            }

            if(sobrecarga) {

                throw new Exception("Sobrecarga não permitida");
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}

