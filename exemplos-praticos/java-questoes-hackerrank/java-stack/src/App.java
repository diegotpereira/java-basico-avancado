import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        while(teclado.hasNext()) {

            String entrada = teclado.next();

            // usado para Substituir todas as ocorrências de um valor especificado em uma lista por outro
            while (entrada.length() != (entrada = entrada.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());

            System.out.println(entrada.isEmpty()); // true
                                                   // true
                                                   // false
                                                   // true
        }

        teclado.close();
    }
}
