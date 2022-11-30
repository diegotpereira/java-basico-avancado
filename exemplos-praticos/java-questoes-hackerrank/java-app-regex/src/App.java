import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        while (teclado.hasNext()) {
            
            String IP = teclado.next();

            System.out.println(IP.matches(new MeuRegex().pattern));
        }
    }
}

class MeuRegex {

    String re = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = re + "." + re + "." + re + "." + re;
}