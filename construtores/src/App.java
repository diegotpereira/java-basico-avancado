public class App {

    // Criar um atributo de classe
    int x;

    // Crie um construtor de classe para a classe Main
    public App() {
        x = 5;
    }

    // construtores com parametros
    int a;

    public App(int b) {
        a = b;
    }

    // Você pode ter quantos parâmetros quiser:
    int modeloAno;
    String modeloNome;

    public App(int ano, String nome) {
        modeloAno = ano;
        modeloNome = nome;
    }

    public static void main(String[] args) throws Exception {
        App meuObj = new App();

        App meuObj1 = new App(5);

        App meuCarro = new App(1969, "Mustang");

        System.out.println(meuObj.x);

        System.out.println(meuObj1.a);

        System.out.println(meuCarro.modeloAno + " " + meuCarro.modeloNome);


    }
}
