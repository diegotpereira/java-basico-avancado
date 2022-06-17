import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> animais = new LinkedList<>();

        // adicionado elementos na lista
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Cavalo");

        // Criando objeto de Iterator
        Iterator<String> iterar = animais.iterator();

        System.out.println("LinkedList: ");

        while (iterar.hasNext()) {
            System.out.print(iterar.next());
            System.out.print(", ");
        }
    }
}
