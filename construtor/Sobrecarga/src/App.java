public class App {
    
    int id;
    String nome;
    int idade;

    App(int i, String n) {

        id = i;
        nome = n;
    }

    // criando outro construtor
    App(int i, String n, int a) {

        id = i;
        nome = n;
        idade = a;
    }

    void mostrar() {

        System.out.println(id + " " + nome + " " + idade);
    }
    public static void main(String[] args) throws Exception {
        
        App s1 = new App(11, "Peter");
        App s2 = new App(22, "Bob", 25);

        s1.mostrar();
        s2.mostrar();
    }
}
