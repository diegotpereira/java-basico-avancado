import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {

        HashSet<String> carros = new HashSet<String>();

        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");

        System.out.println(carros);

        System.out.println(carros.contains("Mazda"));

        carros.remove("Volvo");

        System.out.println(carros);
    }
}
