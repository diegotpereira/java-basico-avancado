import java.util.Scanner;

class validarNomeUsuario {

    public static final String expressaoRegular = "^[a-zA-Z][\\w]{7,29}$";
}
public class App {

    private static final Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int n = Integer.parseInt(teclado.nextLine());

        while(n -- != 0) {

            String usuarioNome = teclado.nextLine();

            if(usuarioNome.matches(validarNomeUsuario.expressaoRegular)) {

                System.out.println("Valida");

            } else {

                System.out.println("Invalida");
            }
        }
    }
}
