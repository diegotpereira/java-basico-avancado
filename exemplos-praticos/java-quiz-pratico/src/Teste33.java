public class Teste33 {
    
    static int num;
    static String minhaStr;

    Teste33() {

        num = 100;
        minhaStr = "Contrutor";
    }

    // Primeiro bloco estático
    static {

        System.out.println("Bloco estático 1");
        num = 68;
        minhaStr = "Bloco1";
    }

    // Segundo bloco estático
    static {

        System.out.println("Bloco estático 2");
        num = 98;
        minhaStr = "Bloco2";
    }

    public static void main(String[] args) {
        
        Teste33 a = new Teste33();

        System.out.println("Valor de num = " + a.num);
        System.out.println("Valor de minhaStr = " + a.minhaStr);
    }
}

// Resposta:   Bloco estático 1
            // Bloco estático 2
            // Valor de num = 100
            // Valor de minhaStr = Contrutor

            // O bloco estático é executado quando a classe é carregada na memória.
            // Uma classe pode ter vários blocos estáticos, que são executados na mesma sequência em que foram escritos no programa.