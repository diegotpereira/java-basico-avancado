import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> animais = new LinkedList<>();

        // adicionado elementos na LinkedList
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Cavalo");

        // Criar obbjeto da ListIterator
        ListIterator<String> listaIterar = animais.listIterator();
        System.out.println("LinkedList: ");

        while (listaIterar.hasNext()) {
            System.out.print(listaIterar.next());
            System.out.println(", ");
        }

        // Iterar para atrás
        System.out.println("\nReversa LinkedList: ");

        while (listaIterar.hasPrevious()) {
            System.out.print(listaIterar.previous());
            System.out.print(", ");
        }
    }
}
