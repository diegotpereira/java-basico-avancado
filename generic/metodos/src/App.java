public class App {

    // metodo generico printArray
    public static <E> void printArray(E[] inputArray) {
        // exibir elementos do array
        for(E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {

        // criar array de inteiros, double e caracteres
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contém:");
        printArray(intArray);

        System.out.println("Array Double contém:");
        printArray(doubleArray);

        System.out.println("Array charArray contém:");
        printArray(charArray); 
    }
}
