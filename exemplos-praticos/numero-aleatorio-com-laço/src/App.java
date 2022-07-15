import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random aleatorio = new Random();

        for(int index = 1; index <=10; index++) {
            int valor = aleatorio.nextInt((10 - 1) + 1) + 1;
            System.out.println(valor);
        }
    }
}
