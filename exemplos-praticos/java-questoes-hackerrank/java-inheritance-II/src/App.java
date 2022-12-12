public class App {
    public static void main(String[] args) throws Exception {

        Adiciona adiciona = new Adiciona();

        System.out.println("Minha superclasse éh: " + adiciona.getClass().getSuperclass().getName());// saída: Minha superclasse éh: Aritmética

        System.out.println(adiciona.add(10, 32) + " " + adiciona.add(10, 3) + " " + adiciona.add(10, 10) + "\n"); // saída: 42 13 20
    }
}


class Aritmética {

    int add(int a, int b) {

        return a + b;
    }
}

class Adiciona extends Aritmética {

    void add() {}
}