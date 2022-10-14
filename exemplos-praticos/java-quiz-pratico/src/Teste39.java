public class Teste39 {


    // Verifique se uma vogal está presente na string:

    public static void main(String[] args) {
        
        System.out.println(stringContemVogais("Olá")); // saída: true
        System.out.println(stringContemVogais("TV")); // saída: false
    }

    public static boolean stringContemVogais(String entrada) {

        return entrada.toLowerCase().matches(".*[aeiou].*");
    }
    
}
