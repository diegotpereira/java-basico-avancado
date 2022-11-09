// // public class Principal {
    
// //     public static void main(String[] args) {
        
// //         Amostra amostra = new Amostra(10, 20);
// //         amostra.exibir();
// //     }
// // }

// // class Amostra {
    
// //     private int val1;
// //     private int val2;

// //     public Amostra(int val1, int val2) {
// //         this.val1 = val1;
// //         this.val2 = val2;
// //     }

// //     public void exibir() {
// //         System.out.println("Valor1: " + val1);
// //         System.out.println("Valor2: " + val2);
// //     }
// // }
// class Amostra {

//     static int valor1;
//     static int valor2;

//     public Amostra(int valor1, int valor2) {
//         this.valor1 = valor1;
//         this.valor2 = valor2;
//     }

//     public void exibir() {
//         System.out.println("Valor1: " + valor1); // saída: 50
//         System.out.println("Valor2: " + valor2); // saída: 80
//     }
// }

// public class Principal {
    
//     public static void main(String[] args) {
        
//         Amostra amostra = new Amostra(50, 80);
//         amostra.exibir();
//     }
// }
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

