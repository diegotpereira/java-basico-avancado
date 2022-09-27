public class TestandoMetodo7 {
    
    public static void main(String[] args) {
        
        Estrada.Mostrar();
    }
}

class Estrada {

    static void Mostrar() {

        System.out.println("Dentro do método estático..."); // saída: A. Dentro do método estático.
    }

    // A) Dentro do método estático.
    // B) mensagem vazia
    // C) Erro do compilador
    // D) Erro/exceção de tempo de execução
}