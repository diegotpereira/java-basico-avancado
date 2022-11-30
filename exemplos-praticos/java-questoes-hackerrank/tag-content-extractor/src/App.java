import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        int testeCasos = Integer.parseInt(teclado.nextLine());

        while (testeCasos --> 0) {
            
            String linha = teclado.nextLine();

            Matcher m = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(linha);

            if(!m.find()) {

                System.out.println("Nenhum");
                continue;
            }

            m.reset();

            while (m.find()) {
                
                System.out.println(m.group(2));
            }
        }
    }
}
