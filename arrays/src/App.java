public class App {
    public static void main(String[] args) throws Exception {
        String[] carros = { "Fiat", "Ford", "Volvo", "BMW"};

        carros[0] = "Chevrolet";

        // Para alterar o valor de um elemento específico, consulte o número do índice:
        System.out.println(carros[0]);

        // Para descobrir quantos elementos um array possui, use a propriedade length:
        System.out.println(carros.length);

        for(int index = 0; index < carros.length; index++) {
            System.out.println(carros[index]);
        }

        // Matrizes multidimensionais
        int[][] meusNumeros = { { 1, 2, 3, 4}, {5, 6, 7}};
        int x = meusNumeros[1][2];

        System.out.println(x);

        for(int i = 0; i < meusNumeros.length; ++i) {
            for(int j = 0; j < meusNumeros[i].length; ++j) {
                System.out.println(meusNumeros[i][j]);
            }
        }
    }
}
