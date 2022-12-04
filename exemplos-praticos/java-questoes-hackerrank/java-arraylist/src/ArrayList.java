import java.util.*;

public class ArrayList {

    public static void main(String[] args) {
        
        java.util.ArrayList<Integer> listas = new java.util.ArrayList<Integer>();

        Scanner teclado = new Scanner(System.in);

        // A primeira linha tem um número inteiro
        int n = teclado.nextInt();

        // Em cada um dos próximoslinhas
        for(int i = 0; i < n; i++) {

            List<Integer> lista = new java.util.ArrayList<Integer>();

            // Um número inteiro representado por d
            int d = teclado.nextInt();

            // Percorrendo a variavel d
            for(int j = 0; j < d; j++) {

                // Adicionando na lista a entrada do teclado
                lista.add(teclado.nextInt());
            }

            // Adicionado lista em listas
            listas.add((java.util.ArrayList<Integer>) lista);
        }

        // Um número inteiro q
        int q = teclado.nextInt();

        for(int i = 0; i < q; i++) {

            // um número inteiro x 
            int x = teclado.nextInt();
            // um número inteiro y
            int y = teclado.nextInt();

            if(y > listas.get(x - 1).size()) {

                // Se não houver tal posição, apenas imprima "ERRO!"
                System.out.println("ERRO!");

            } else {

                // número localizado em x posição de y
                System.out.println(listas.get(x - 1).get(y - 1));;
            }
        }

        System.out.println("oi");

        teclado.close();
    }
    
}
