import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> linguagens = new LinkedList<>();

        // adiconado elementos na LinkedList
        linguagens.add("Python");
        linguagens.add("Java");
        linguagens.add("Javascript");

        System.out.println("Minha LinkedLista contém: " + linguagens);

        // pesquisar um elemento da LinkedList
        String str = linguagens.get(1);

        System.out.println("O elemento do indice 1: " + str);
    }
}
