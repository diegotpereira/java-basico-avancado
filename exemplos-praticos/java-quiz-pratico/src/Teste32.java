public class Teste32 {
    

    Teste32() {

        System.out.println("JAVAQUIZ");
    }

    static Teste32 a  = new Teste32();
    
    public static void main(String[] args) {
        
        Teste32 b;

        b = new Teste32();
    }
}

// Resposta: JAVAQUIZ JAVAQUIZ - Sabemos que as variáveis ​​estáticas são chamadas quando uma classe é carregada e as variáveis ​​estáticas são chamadas apenas uma vez
             // Agora a linha 13 resulta na criação do objeto que por sua vez chama o construtor e "JAVAQUIZ" é impresso pela segunda vez.
             // Se na linha 8 a variável estática não tivesse sido usada, o objeto teria sido chamado recursivamente infinitamente levando ao erro StackOverFlow. 
