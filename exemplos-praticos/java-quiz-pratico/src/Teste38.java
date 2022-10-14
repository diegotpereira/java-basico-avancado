public class Teste38 {

    public static void trocarNumeros(int a, int b) {

        // Qual é a saída do código a seguir?

        // a = 10
        // b = 20
        b = b + a; // 20 + 10 = 30
        a = b - a; // 30 - 10 = 20
        b = b - a; // 30 - 20 = 10
    }
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        trocarNumeros(a, b);
        System.out.printf("a é %d, b é %d", a , b); // saída: a é 10, b é 20
    }
}
