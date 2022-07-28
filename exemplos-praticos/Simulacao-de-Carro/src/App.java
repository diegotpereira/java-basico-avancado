public class App {
    public static void main(String[] args) throws Exception {
        
        int tamanhoTanque = 10;

        Carro carro = new Carro(tamanhoTanque, 1);
        int restante = carro.reabastecer(3);

        restante = carro.reabastecer(restante);

        if (restante != 0) {
            
            System.out.println("ERRO: o método de reabastecimento está errado.");
            System.out.printf("| - Expectativa: %d, Obtido: %d\n", 0 , restante);

            return;
        }
        carro.dirigir(4);
        carro.dirigir(2);

        if (restante != 4) {
            
            System.out.println("ERRO: o método drive org obterCombustivelRestante está errado.");
            System.out.printf("| - Expectativa: %d, Obtido: %d\n", 4, carro.obterCombustivelRestante());

            return;

        }

        restante = carro.reabastecer(100);

        if (restante != -94) {
            
            System.out.println("ERRO: o método reaabastecer está errado.");
            System.out.printf("| - Expectativa: %d, Obtido: %d\n", -94, restante);

            return;

        }

        restante = carro.obterCombustivelRestante();

        if (restante != tamanhoTanque) {
            
            System.out.println("ERRO: o método reaabastecer ou obeterCombustivelRestante está errado.");
            System.out.printf("| - Expectativa: %d, Obtido: %d\n", tamanhoTanque, restante);

            return;
        }

        carro.dirigir(100);
        restante = carro.obterCombustivelRestante();

        if (restante != 0) {
            
            System.out.println("ERRO: o método reaabastecer ou obeterCombustivelRestante está errado.");
            System.out.printf("| - Expectativa: %d, Obtido: %d\n", 0, restante);

            return;
        }

        System.out.println("Hello, World!");
    }
}
