import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int min = 1;
        int max = 10;

        Random aleatorio = new Random();

        int valor = aleatorio.nextInt(max + min) + min;

        System.out.println(valor);
    }
}
