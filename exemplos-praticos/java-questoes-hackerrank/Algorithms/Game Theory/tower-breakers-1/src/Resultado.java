public class Resultado {

    public static int towerBreakers(int n, int m) {

        // Se o número de torres ou a altura das torres for par,
        // o segundo jogador vence em 2 jogadas
        if (n % 2 == 0 || m == 1) {

            return 2;
        }

        // Se o número de torres for ímpar e a altura das torres for
        // ímpar, o primeiro jogador vence em 1 jogada
        return 1;
    }

    // public static int towerBreakers(int n, int m) {

    // // Se a torre tem altura 1, o segundo jogador vence em 2 jogadas
    // if (m == 1)
    // return 2;

    // // Se o número de torres for ímpar, o primeiro jogador vence; caso
    // // contrário, o segundo jogador vence
    // return n % 2 == 1 ? 1 : 2;
    // }

}
