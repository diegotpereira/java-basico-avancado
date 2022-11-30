import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int num = Integer.parseInt(n);

        if(num % 2 == 0) {

            System.out.println("Não é par");

        } else {

            System.out.println("É Primo");
        }
    }
}
