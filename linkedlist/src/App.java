import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> carros = new LinkedList<String>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Fiat");

        for(String index : carros) {
            
            System.out.println(index);
        }
    }
}
