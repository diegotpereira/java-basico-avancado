import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String titulo = teclado.nextLine();

        MeuLivro meuLivro = new MeuLivro();
        meuLivro.setTitulo(titulo);

        System.out.println("O titulo éh: " + meuLivro.getTitulo());

        teclado.close();
    }
}

abstract class Livro {

    String titulo;

    abstract void setTitulo(String s);

    String getTitulo() {

        return titulo;
    }
}

class MeuLivro {

    String titulo;

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }
}