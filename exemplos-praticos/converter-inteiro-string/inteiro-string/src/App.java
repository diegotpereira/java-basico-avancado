import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            
            Scanner teclado = new Scanner(System.in);

            int n = teclado.nextInt();
            String s = Integer.toString(n);

            if (n == Integer.parseInt(s)) {
                
                System.out.println("Bom trabalho");

            } else {

                System.out.println("Resposta errada.");
            }

            teclado.close();
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Rescisão sem sucesso!!!");
        }
    }
}
