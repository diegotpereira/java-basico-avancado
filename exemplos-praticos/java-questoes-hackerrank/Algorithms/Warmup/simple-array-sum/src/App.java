import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int arCount = Integer.parseInt(teclado.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = teclado.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }


        int resultado = Resultado.somaMatrizSimples(ar);

        System.out.println(resultado);

        teclado.close();
    }
}

class Resultado {

    static int somaMatrizSimples(int[] ar) {

        int soma = 0;

        for (int i = 0; i < ar.length; i++)
            soma += ar[i];


        return soma;

    }

}