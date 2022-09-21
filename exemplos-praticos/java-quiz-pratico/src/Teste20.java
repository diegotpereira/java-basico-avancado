public class Teste20 {

    // Qual é a saída do programa?
    
    int t = 20;

    Teste20() {

        t = 40;
    }

    class Principal {

        public static void main(String[] args) {
            
            Teste20 teste20 = new Teste20();
    
            System.out.println(teste20.t); // 
        }
    
        // A. 20
        // B. 40 
        // C. Erro de compilação 
    }
}

