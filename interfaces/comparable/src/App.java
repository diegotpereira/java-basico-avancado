import java.util.*;

public class App {
    public static void main(String[] args) {

        int[] arr = {11, 55, 22, 0, 89};
        Arrays.sort(arr);
        
        System.out.println("Matriz Int Ordenada: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Matriz String Ordenada: ");
        String[] nomes = {"Bob", "Peter", "Bunny"};
        System.out.println(Arrays.toString(nomes));

        System.out.println("Sort Lista: ");
        List<String> frutas = new ArrayList<String>();
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Goiaba");
        frutas.add("Uvas");

        Collections.sort(frutas);

        for(String s : frutas) 
        System.out.println(s + ", ");
    }
}
