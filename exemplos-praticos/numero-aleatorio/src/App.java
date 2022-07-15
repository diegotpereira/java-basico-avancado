import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random gerador = new Random();

        for(int index = 0; index < 3; index++) {
            System.out.println(gerador.nextInt(3));
        }
    }
}
