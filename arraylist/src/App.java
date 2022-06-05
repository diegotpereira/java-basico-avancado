import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> carros = new ArrayList<>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        carros.add("Mazda");
        carros.add("Chevrolet");
        
        for(int index = 0; index < carros.size(); index++ ) {
            System.out.println(carros.get(index));
        }

        carros.set(0, "Alpha Romeo");

        for(String index : carros) {
            System.out.println(index);
        }

        // outros tipos 
        ArrayList<Integer> meusNumeros = new ArrayList<Integer>();
        meusNumeros.add(10);
        meusNumeros.add(15);
        meusNumeros.add(20);
        meusNumeros.add(25);

        for(int index : meusNumeros) {
            System.out.println(index);
        }

        // Collections.sort() É usado para classificar os elementos presentes 
        // na lista especificada da Coleção em ordem crescente.
        ArrayList<String> meusCarros = new ArrayList<String>();
        meusCarros.add("Fiat");
        meusCarros.add("Hyundai");
        meusCarros.add("Renault");
        meusCarros.add("Honda");

        Collections.sort(meusCarros);

        for(String index : meusCarros) {
            System.out.println(index);
        }

        // Sort() em ArrayList de Inteiros
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);

        for(int index : numeros) {
            System.out.println(index);
        }

    }
}
