import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Autor> al = new ArrayList<Autor>();
        al.add(new Autor("Orwell", "Revolução dos bichos", 47));
        al.add(new Autor("Aldous", "Admirável Mundo Novo", 69));
        al.add(new Autor("Frank", "300", 65));
        al.add(new Autor("Debora", "Sky Boys: How They Built the Empire State Building", 51));
        al.add(new Autor("George ", "As Crônicas de Gelo e Fogo", 62));

        // listar por nome
        System.out.println("Classificando por nome do autor:");
        Collections.sort(al);

        for(Autor au : al) {
            System.out.println(au.getNome() + ", " + au.getLivroNome() + ", " + au.getAuIdade());
        }

        // listar por idade
        System.out.println("Classificando por idade do autor:");
        Collections.sort(al, new AutorIdadeComparador());

        for(Autor au : al) {
            System.out.println(au.getNome() + ", " + au.getLivroNome() + ", " + au.getAuIdade());
        }

        // lista por nome do livro
        System.out.println("Classificando por n ome do livro:");
        Collections.sort(al, new LivroNomeComparador());

        for(Autor au : al) {
            System.out.println(au.getNome() + ", " + au.getLivroNome() + ", " + au.getAuIdade());
        }
    }
}
