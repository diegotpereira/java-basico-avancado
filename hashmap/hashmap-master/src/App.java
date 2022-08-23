import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        Map<String, String> objMapa = new HashMap<String, String>();
        objMapa.put("Nome", "Susuki");
        objMapa.put("Força", "220");
        objMapa.put("Tipo", "2-wheeler");
        objMapa.put("Preço", "85000");
        
        System.out.println("Elementos do Mapa:");
        System.out.println(objMapa);

        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "Java");
        mapa.put(2, "Python");
        mapa.put(3, "PHP");
        mapa.put(4, "SQL");
        mapa.put(5, "C++");
        
        System.out.println("Tutorial de HashMap: " + mapa);

        // Remova o valor da chave 5
        mapa.remove(5);

        System.out.println("Tutorial de HashMap removeu: " + mapa);
    }
}
