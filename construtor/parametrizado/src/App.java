public class App {
    
    int id;
    String nome;

    // criando construtor parametrizado
    App(int i, String n) {

        id = i;
        nome =n;
    }

    // método para exibir os valores
    void mostrar() {

        System.out.println(id + " " + nome);
    }
    public static void main(String[] args) throws Exception {

        App s1 = new App(111, "Bob");
        App s2 = new App(222, "Peter");

        // chamando metodo
        s1.mostrar();
        s2.mostrar();
    }
}
