public class App {
    public static void main(String[] args) throws Exception {

        Estudante s1 = new Estudante();
        Estudante s2 = new Estudante();

        s1.setDado(1, 2);
        s2.setDado(3, 4);

        s1.exibirDado();
        s2.exibirDado();
    }
}

class Estudante {
    int a;
    int b;

    public void setDado(int c, int d) {

        a= c;
        b = d;
    }

    public void exibirDado() {

        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
    }
}