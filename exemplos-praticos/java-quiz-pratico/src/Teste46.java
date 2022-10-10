public class Teste46 {
    
    // Qual é a saída do seguinte programa?
    private static int dado = 10;

    private static int LocalClass() {

        class Interna {

            public int dado = 20;

            private int buscarDado() {

                return dado;
            }
        }

        Interna interna = new Interna();

        return interna.buscarDado();
    }

    public static void main(String[] args) {
        
        System.out.println(dado * LocalClass()); // saída: C. 200
    }

    // a) Erro de compilação
    // b) Erro de tempo de execução
    // c) 200
    // d) Nenhuma das opções acima


}
