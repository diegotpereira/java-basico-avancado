import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner teclado = new Scanner(System.in);
        int numSentencas = Integer.parseInt(teclado.nextLine());

        while(numSentencas --> 0) {

            String entrada = teclado.nextLine();

            Matcher m = p.matcher(entrada);

            while(m.find()) {

                entrada = entrada.replaceAll(m.group(0), m.group(1));
            }

            System.out.println(entrada);
        }

        teclado.close();
    }
}
