import java.util.Scanner;

public class App {

    public static String getMenorEMaior(String s, int k) {

        String menor = "";
        String maior = "";

        menor = s.substring(0, k);
        maior = s.substring(0, k);

        for(int i = 0; i <= s.length() - k; i++) {

            String str = s.substring(i, k + i);

            if (menor.compareTo(str) > 0) {
                
                menor = str;
            }

            if (maior.compareTo(str) < 0) {
                
                maior = str;
            }
        }

        return menor + "\n" + maior;

    }
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        String s = teclado.next();
        int k = teclado.nextInt();

        teclado.close();

        System.out.println(getMenorEMaior(s, k));
        
    }
}
