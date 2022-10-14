public class Teste23 {

    // Qual é a saída do programa?

    static int a;

    static {

        a = 4;

        System.out.println("dentro do bloco estático");
        System.out.println("a = " + a);
    }

    Teste23() {
        System.out.println("dentro do construtor");
        a= 10;
    }
    
    public static void func() {

        a = a + 1;
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        
        Teste23 obj = new Teste23();
        obj.func();
    }

    // A. dentro do bloco estático
    //     a = 4
    //     dentro do construtor
    //     a = 11
    // B. Compiler Error
    // C. Run Time Error 
    // D. dentro do bloco estático
    //     a = 4
    //     dentro do construtor
    //     a = 5
    // E. dentro do bloco estático
    //     a = 10
    //     dentro do construtor
    //     a = 11

    // Resposta: A dentro do bloco estático a = 4, dentro do construtor a = 11
}
