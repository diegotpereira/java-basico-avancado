import java.util.*;

public class Resultado {

    public static void almostSorted(List<Integer> arr) {

        // Cria uma lista "classificado" que é uma cópia da lista
        // original "arr" e a ordena.
        List<Integer> classificado = new ArrayList<>(arr);
        Collections.sort(classificado);

        // Inicializa as variáveis "st" e "en" como -1.
        int st = -1, en = -1;

        // Percorre a lista "arr" procurando pelo primeiro índice em que o elemento é
        // maior que o próximo.
        // Esse índice é armazenado na variável "st".
        for (int i = 0; i < arr.size() - 1; i++) {

            if (arr.get(i) > arr.get(i + 1)) {

                st = i;
                break;
            }
        }

        // Se "st" continuar igual a -1, isso significa que a lista "arr" já está
        // ordenada e pode ser impressa "no".
        if (st == -1) {

            System.out.println("no");
            System.exit(0);
        }

        // Percorre a lista "arr" em ordem reversa procurando pelo último índice em que
        // o elemento é menor que o anterior.
        // Esse índice é armazenado na variável "en".
        for (int i = arr.size() - 1; i > 0; i--) {

            if (arr.get(i) < arr.get(i - 1)) {

                en = i;
                break;
            }
        }

        // Realiza a operação de "swap" nos elementos das posições "st" e "en".
        // Se a lista resultante for igual a "classificado", isso significa que apenas a
        // operação de "swap" é necessária
        // para ordenar a lista original. A resposta "yes" e a operação de "swap" são
        // impressas e o programa é encerrado.
        int tmp = arr.get(st);
        arr.set(st, arr.get(en));
        arr.set(en, tmp);

        if (arr.equals(classificado)) {

            System.out.println("yes\n" + String.format("swap %d %d", st + 1, en + 1));
            System.exit(0);

        } else {

            // Caso contrário, desfaz a operação de "swap" realizada acima.
            tmp = arr.get(st);
            arr.set(st, arr.get(en));
            arr.set(en, tmp);
        }

        // Inicializa as variáveis "x" e "y" como as posições "st" e "en",
        // respectivamente.
        int x = st, y = en;

        // Realiza a operação de "reverse" nos elementos das posições entre "st" e "en",
        // inclusive.
        // Se a lista resultante for igual a "classificado", isso significa que apenas a
        // operação de "reverse" é necessária
        // para ordenar a lista original. A resposta "yes" e a operação de "reverse" são
        // impressas e o programa é encerrado.
        while (en - st >= 1) {

            tmp = arr.get(st);
            arr.set(st, arr.get(en));
            arr.set(en, tmp);
            st++;
            en--;
        }

        if (arr.equals(classificado)) {

            System.out.println("yes\n" + String.format("reverse %d %d", x + 1, y + 1));
            System.exit(0);
        }

        System.out.println("no");
    }

}
