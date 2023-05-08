import java.util.stream.*;

public class Resultado {

    public static int redJohn(int n) {

        // Calcula a soma dos coeficientes binomiais utilizando a função nCr
        // Os coeficientes binomiais são usados para calcular a quantidade de
        // maneiras de distribuir
        // os blocos de tamanho 4 em um espaço de tamanho n
        long soma = 0;

        for (int j = 0; j <= n / 4; j++) {

            soma += ncr(n - (3 * j), j);
        }

        // Verifica se a soma obtida é um número primo
        int resposta = primo(soma);

        return resposta;

    }

    public static int primo(long a) {

        int soma = 1;

        // Verifica se o número é 0 ou 1, que não são primos
        if (a == 0 || a == 1)
            return 0;

        // Conta quantos números primos existem até o número a
        for (long i = 3; i <= a; i++) {

            if (ehPrimo(i))
                soma++;
        }

        return soma;
    }

    public static boolean ehPrimo(long n) {

        // Verifica se o número é 0, 1 ou número par
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        // Verifica se o número é divisível por algum número ímpar
        // até a sua raiz quadrada
        for (long i = 3; i <= Math.sqrt(n); i += 2) {

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static long ncr(int n, int r) {

        if (n <= 0)
            return 0;

        // Calcula o coeficiente binomial nCr utilizando recursão
        if (r == 0)
            return 1;
        if (r == 1)
            return n;
        if (n == r)
            return 1;
        if (r >= n / 2) {
            r = n - r;
        }

        return (n * ncr(n - 1, r - 1)) / r;

    }

    // public static int redJohn(int n) {

    // // Calcula o número de maneiras de organizar
    // // os blocos na parede de tamanho n
    // int maneiras = numDeManeiras(n);

    // // Determina quantos números primos existem no
    // // intervalo de 1 a maneiras
    // int totalPrimos = ehPrimo(maneiras);

    // return totalPrimos;
    // }

    // public static int numDeManeiras(int n) {

    // // Casos base: se n for menor ou igual a 3,
    // // há apenas uma maneira de organizar os blocos
    // if (n <= 3)
    // return 1;

    // // Caso especial: para n = 4, há duas maneiras de organizar os blocos
    // if (n == 4)
    // return 2;

    // // Recursivamente calcula o número de maneiras somando as maneiras de
    // // organizar
    // // os blocos em posições anteriores
    // return numDeManeiras(n - 1) + numDeManeiras(n - 4);
    // }

    // public static int ehPrimo(int n) {

    // int contar = 0;
    // boolean primo[] = new boolean[n + 1];

    // // Inicializa o array de primos com true
    // for (int i = 0; i <= n; i++)

    // primo[i] = true;

    // // Marca os múltiplos de cada número primo como não primos
    // for (int p = 2; p * p <= n; p++)

    // if (primo[p] == true)

    // for (int i = p * 2; i <= n; i += p)

    // primo[i] = false;

    // // Conta quantos números primos existem no intervalo de 2 a n
    // for (int j = 2; j <= n; j++)

    // if (primo[j] == true)

    // contar++;

    // return contar;

    // }

}
