public class App {
    public static void main(String[] args) throws Exception {

        // declaração de atributo contador
        Contador umContador;

        // alocação
        umContador = new Contador();

        umContador.comeca(0);

        System.out.println(umContador.num);

        umContador.incrementa();

        System.out.println(umContador.num);
    }
}
