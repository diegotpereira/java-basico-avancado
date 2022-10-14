class EssaPalavraChave {
    
    private int a = 4;
    private int b = 1;

    void buscarSoma(int a, int b) {

        this.a = a;
        this.b = b;

        System.out.println(this.a + this.b);
    }
}

public class Principal {
    
    public static void main(String[] args) {
        
        // System.out.println("oi");
        EssaPalavraChave palavraChave = new EssaPalavraChave();

        palavraChave.buscarSoma(3, 5); // saída: 8
    }
}

