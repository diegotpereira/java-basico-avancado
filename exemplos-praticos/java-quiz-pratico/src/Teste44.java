import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Teste44 {
    
    // Escreva um programa para remover duplicatas em um ArrayList.

    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<Integer>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);

        System.out.println("Sua lista de elementos no ArrayList: " + num); // saída: Sua lista de elementos no ArrayList: [1, 2, 3, 4, 5, 6, 3, 4, 5, 6]

        LinkedHashSet<Integer> primosDuplicados =  new LinkedHashSet<>(num);

        num.clear();

        num.addAll(primosDuplicados);


        System.out.println("lista de números originais sem duplicação: " + num); // saída: lista de números originais sem duplicação: [1, 2, 3, 4, 5, 6]
    }
}
