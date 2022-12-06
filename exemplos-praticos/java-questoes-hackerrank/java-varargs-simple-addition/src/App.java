import java.lang.reflect.Method;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            
            // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner teclado = new Scanner(System.in);

            int n1 = Integer.parseInt(teclado.nextLine());
            int n2 = Integer.parseInt(teclado.nextLine());
            int n3 = Integer.parseInt(teclado.nextLine());
            int n4 = Integer.parseInt(teclado.nextLine());
            int n5 = Integer.parseInt(teclado.nextLine());
            int n6 = Integer.parseInt(teclado.nextLine());

            Add adiciona = new Add();

            adiciona.add(n1, n2);
            adiciona.add(n1, n2, n3);
            adiciona.add(n1, n2, n3, n4);
            adiciona.add(n1, n2, n3, n4, n5);
            adiciona.add(n1, n2, n3, n4, n5, n6);

            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean sobrecarga = false;

            for(int i = 0; i < methods.length; i++) {

                if(set.contains(methods[i].getName())) {

                    sobrecarga = true;
                    break;
                }

                set.add(methods[i].getName());
            }

            if (sobrecarga) {
                
                throw new Exception("Sobrecarga não permitida");
            }

        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}

class Add {

    public void add(int ...intArgs) {

        int soma = 0;
        String separador = "";

        for(int i : intArgs) {

            soma += i;

            System.out.println(separador + i);
            separador = "+";
        }

        System.out.println("=" + soma); // saída: 21
    }
}