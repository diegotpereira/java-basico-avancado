public class App {
    public static void main(String[] args) throws Exception {

        App obj = new App();

        // invocando o método de instância
        System.out.println("A soma é: " + obj.add(12, 13));
    }
    int s;

    // método definido pelo usuário porque não usamos a palavra-chave estática
    public int add(int a, int b) {

        s = a + b;

        // retornando a soma
        return s;
    }
}
