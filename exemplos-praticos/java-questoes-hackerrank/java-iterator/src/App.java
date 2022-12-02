import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {

    static Iterator func(ArrayList minhaLista) {

        Iterator it = minhaLista.iterator();

        while (it.hasNext()) {
            
            Object elemento = it.next();

            // O instanceof é um operador que permite testar 
            // se um objeto é uma instância de um tipo específico de uma class, 
            // subclass ou interface. 
            if(elemento instanceof String) 

                break;
        }

        return it;
    }
    public static void main(String[] args) throws Exception {

        ArrayList minhaLista = new ArrayList();

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int m = teclado.nextInt();

        for(int i = 0; i < m; i++) {

            minhaLista.add(teclado.next());
        }

        Iterator it = func(minhaLista);

        while (it.hasNext()) {
            
            Object elemento = it.next();

            System.out.println((String) elemento);

        }
    }
}
