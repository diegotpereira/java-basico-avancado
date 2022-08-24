import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "Macaco");
        mapa.put(2, "Cachorro");
        mapa.put(3, "Gato");
        mapa.put(4, "Leão");
        mapa.put(5, "Tigre");
        mapa.put(6, "Urso");

        // forEach para iterar e exibir cada par de chave e valor
        mapa.forEach((chave, valor) -> System.out.println(chave + " - " + valor));

        mapa.forEach((chave, valor) -> {

            if (chave == 4) {
                
                System.out.println("O valor associado à chave 4 é: " + valor);
            }
        });

        mapa.forEach((chave, valor) -> {

            if ("Gato".equals(valor)) {
                
                System.out.println("A chave associada ao Valor Gato é: " + chave);
            }
        });

        // forEach para iterar uma list
        List<String> frutas = new ArrayList<String>();
        frutas.add("Maça");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Manga");

        frutas.forEach(str -> System.out.println(str));

        // forEach método para iterar um Stream
        List<String> nomes = new ArrayList<String>();
        nomes.add("Peter");
        nomes.add("Bonny");
        nomes.add("Bob");
        nomes.add("Gregory");

        
        
        nomes.stream()
        .filter(f->f.startsWith("B"))
        .forEach(System.out::println);
    }
}
