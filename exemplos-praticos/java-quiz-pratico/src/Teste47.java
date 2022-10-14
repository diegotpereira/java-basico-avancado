interface Anonimos {

    public int buscarValor();
}

public class Teste47 {
    
    private int dado = 15;

    public static void main(String[] args) {
        
        Anonimos interna = new Anonimos() {

            int dado = 5;

            public int buscarValor() {

                return dado;
            }

            public int buscarDado() {

                return dado;
            }
        };

        Teste47 teste47 = new Teste47();

        System.out.println(interna.buscarValor() + interna.buscarDado() + teste47.dado);
    }

    // a) 25
    // b) Erro de compilação
    // c) 20
    // d) Erro de tempo de execução

    // Resposta B. Erro de compilação - o método getData() é indefinido na classe Anonymous o que causa o erro de compilação.
}
