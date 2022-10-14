public class Teste48 {
    
    // Qual é a saída do seguinte programa java?

    private int dado = 10;

    class Interna {

        private int dado = 20;

        public int buscarDado() {

            return dado;
        }

        public void main(String[] args) {
            
            Interna interna = new Interna();

            System.out.println(interna.buscarDado());
        }
    }

    private int buscarDado() {

        return dado;
    }

    public static void main(String[] args) {
        
        Teste48 outra = new Teste48();

        Teste48.Interna interna = outra.new Interna();

        System.out.printf("%d", outra.buscarDado());

        interna.main(args);
    }

    // a) 2010
    // b) 1020
    // c) Erro de compilação
    // d) Nenhum destes

    // Resposta B. 1020
}
