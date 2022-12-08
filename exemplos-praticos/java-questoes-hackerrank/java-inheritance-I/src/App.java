public class App {
    public static void main(String[] args) throws Exception {
        Passaro passaro = new Passaro();
        passaro.andar();
        passaro.voar();
        passaro.cantar();
    }
}

class Animal {

    void andar() {

        System.out.println("Eu estou andando!");
    }
}

class Passaro extends Animal {

    void voar() {

        System.out.println("Eu estou voando!");
    }

    void cantar() {

        System.out.println("Eu estou cantando!");
    }
}