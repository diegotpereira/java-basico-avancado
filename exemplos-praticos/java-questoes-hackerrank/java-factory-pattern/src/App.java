import java.util.Scanner;

interface Comida {

    public String obterTipo();
}

class Pizza implements Comida {

    @Override
    public String obterTipo() {
        
        return "Alguém pediu um Fast Food!";
    }
}

class Bolo implements Comida {

    @Override
    public String obterTipo() {
        
        return "Alguém pediu uma Sobremesa!";
    }
}

class ComidaFactory {

    public Comida obterComida(String pedido) {

        if(pedido.equals("pizza")) {

            Comida sobremesa = new Pizza();

            return sobremesa;

        } else {

            Comida torta = new Bolo();

            return torta;
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {

        try {
            Scanner teclado = new Scanner(System.in);

            ComidaFactory comidaFactory = new ComidaFactory();

            Comida comida = comidaFactory.obterComida(teclado.nextLine());

            System.out.println("A factory voltou " + comida.getClass());
            System.out.println(comida.obterTipo());

            teclado.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
