import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> nome_fone = new HashMap<>();

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        teclado.nextLine();

        for(int i = 0; i < n; i++) {

            String nome = teclado.nextLine();
            int telefone = teclado.nextInt();

            nome_fone.put(nome, telefone);

            teclado.nextLine();
        }
        
        while (teclado.hasNext()) {
            
            String s = teclado.nextLine();

            System.out.println(nome_fone.containsKey(s) ? s + "=" + nome_fone.get(s) : "Não encontrado");
        }
    }
}
