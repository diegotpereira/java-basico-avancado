import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        // criar uma lista de array
        ArrayList al = new ArrayList();
        System.out.println("Tamanho inicial de al: " + al.size());

        // adicionado elementos na lista de array
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Tamanho de al após adições: " + al.size());

        // exibir lista de array
        System.out.println("Conteudo da al: " + al);

        // removendo elementos da lista de array
        al.remove("F");
        al.remove(2);

        System.out.println("Tamanho de al após exclusões: " + al.size());
        System.out.println("Conteudo da al: " + al);
    }
}
