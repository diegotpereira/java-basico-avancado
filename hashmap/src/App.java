import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<String, String> capitais = new HashMap<String, String>();

        capitais.put("Inglaterra", "Londres");
        capitais.put("Alemanhã", "Berlin");
        capitais.put("Noruega", "Oslo");
        capitais.put("EUA", "Washington DC");

        // Imprime chaves
        for(String index : capitais.keySet()) {
            System.out.println(index);
        }

        // Imprime valores
        for(String index : capitais.values()) {
            System.out.println(index);
        }
        // outros tipos
        // Cria um objeto HashMap chamado pessoas
        HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
        pessoa.put("Bob", 36);
        pessoa.put("Peter", 40);
        pessoa.put("Bonny", 60);

        for(String index : pessoa.keySet()) {

            System.out.println("chave: "  + index + " valor: " + pessoa.get(index)); 
        }
    }
}
