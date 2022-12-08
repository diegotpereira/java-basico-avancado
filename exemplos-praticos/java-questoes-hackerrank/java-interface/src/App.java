import java.util.Scanner;

//  assinatura de método int divisor_sum(int n)
interface AritmeticaAvancada {
    int divisor_soma(int n);
}

// classe MinhaCalculadora que implementa a interface.
class MinhaCalculadora implements AritmeticaAvancada {

    // recebe um número inteiro como entrada
    @Override
    public int divisor_soma(int n) {

        if(n <= 1) {

            return n;
        }

        int resposta = n + 1;

        for(int i = 2; i < n; i++) {

            if(n % i == 0) {

                resposta += i;
            }
        }
        return resposta;
    }

}

public class App {

    

    public static void main(String[] args) throws Exception {
        MinhaCalculadora minhaCalculadora = new MinhaCalculadora();
        
        System.out.print("eu implementei: ");

        ImplementedInterfaceNames(minhaCalculadora);

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        System.out.print(minhaCalculadora.divisor_soma(n) + "\n");

        teclado.close();
    }

    static void ImplementedInterfaceNames(Object o) {

        Class[] theInterfaces = o.getClass().getInterfaces();

        for(int i = 0; i < theInterfaces.length; i++) {

            String interfaceName = theInterfaces[i].getName();

            System.out.println(interfaceName);
        }
    }
}
