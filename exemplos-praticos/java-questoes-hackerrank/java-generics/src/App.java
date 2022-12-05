import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws Exception {

        Impressora impressora = new Impressora();

        // array inteiro
        Integer[] intArray = { 1, 2, 3 };

        // array string
        String[] stringArray = { "Olá", "Mundo" };

        // método imprimirArray
        impressora.imprimirArray(intArray);
        impressora.imprimirArray(stringArray);

        int contar = 0;

        for(Method method : Impressora.class.getDeclaredMethods()) {

            String nome = method.getName();

            if(nome.equals("imprimirArray")) 
               contar++;
        }

        if(contar > 1)
            System.out.println("Method overloading is not allowed!");
    }
}


class Impressora {

    // método deve ser capaz de aceitar arrays de inteiros ou arrays de strings.
    public static <E> void imprimirArray(E[] entradaArray) {

        for(E elemento : entradaArray) {

            System.out.println(elemento); // 1
                                          // 2
                                          // 2
                                          // Olá
                                          // Mundo
        }
    }
}