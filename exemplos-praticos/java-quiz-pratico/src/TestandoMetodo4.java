public class TestandoMetodo4 {
    
    // Qual é a saída do programa Java abaixo com um operador "this"?

    int bolos = 5;

    void Pedido(int bolos) {

        this.bolos = bolos;
    }

    public static void main(String[] args) {
        
        TestandoMetodo4 testandoMetodo4 = new TestandoMetodo4();
        testandoMetodo4.Pedido(10);

        System.out.println("BOLOS = " + testandoMetodo4.bolos);
    }

    // A) BOLOS = 5
    // B) BOLOS = 0
    // C) BOLOS = 10
    // D) Compiler error

    // Resposta: C. BOLOS = 10 - No programa, this.bolos refere-se à variável de instância bolos.
}
