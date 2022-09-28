public class Teste27 {
    
    int i = 34;

    public static void main(String[] args) {
        
        Teste27 t1 = new Teste27();
        Teste27 t2 = new Teste27();

        t1.i = 65;

        System.out.println(t1.i); // saída B. 65

        System.out.println(t2.i); // saída B. 34
    }

    // A) 34 34
    // B) 65 34 
    // C) 65 65
    // D) 34 65
}
