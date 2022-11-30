import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        // Criar localidade personalizada para a Índia
        Locale localIndia = new Locale("en", "IN");

        // Criar NumberFormats usando localidades
        NumberFormat eua = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(localIndia);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franca = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        
        System.out.println("US: " + eua.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + franca.format(payment));
    }
}
