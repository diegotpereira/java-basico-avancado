public class Teste29 {

    // Qual será a saída do seguinte programa Java?
    
    public static void main(String[] args) {
        
        TesteA obj = new TesteA();

        System.out.println(obj.dado); // saída: B. 10
    }

    // A) 5
    // B) 10
    // C) Erro de compilação 
    // D) Erro em tempo de execução
}

class TesteA {

    int dado = 5;

    TesteA() {

        dado = 10;
    }
}
