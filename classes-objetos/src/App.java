public class App {

    int x = 5;
    public static void main(String[] args) throws Exception {

        App meuObj = new App();

        // Multiplos objetos
        App meuObj1 = new App();
        App meuObj2 = new App();

        System.out.println(meuObj.x);

        System.out.println(meuObj1.x);
        System.out.println(meuObj2.x);
    }
}
