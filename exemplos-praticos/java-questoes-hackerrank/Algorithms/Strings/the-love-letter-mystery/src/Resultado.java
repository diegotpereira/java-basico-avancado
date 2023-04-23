// A lógica para solucionar a questão é encontrar o número mínimo de operações
// necessárias para transformar uma determinada string em um palíndromo,
// seguindo as regras definidas pelo problema. Para isso, podemos seguir os
// seguintes passos:

// Inicialmente, verificamos se a string já é um palíndromo. Se sim, o número
// mínimo de operações necessárias é zero e podemos passar para o próximo caso
// de teste.

// Se a string não é um palíndromo, podemos percorrer a metade esquerda da
// string (ou a metade direita, já que o palíndromo é simétrico) e comparar cada
// caractere com seu correspondente do lado oposto. Se eles forem diferentes,
// precisamos reduzir o valor da letra em um número mínimo de operações.

// Para reduzir o valor da letra, seguimos as regras definidas pelo problema. Se
// a letra do lado esquerdo for maior que a letra do lado direito, reduzimos a
// letra do lado esquerdo até que ela seja igual à letra do lado direito (ou até
// que ela se torne 'a'). Se a letra do lado direito for maior, fazemos o mesmo
// com a letra do lado direito.

// Ao reduzir o valor da letra, contamos o número de operações realizadas e
// adicionamos ao número total de operações necessárias.

// Após percorrer a metade da string, verificamos se ela se tornou um
// palíndromo. Se sim, o número mínimo de operações necessárias é o número total
// de operações realizadas. Caso contrário, a string não pode ser transformada
// em um palíndromo seguindo as regras definidas pelo problema.

// Repetimos esses passos para cada caso de teste e retornamos o número mínimo
// de operações necessárias para transformar a string em um palíndromo para cada
// caso de teste.

public class Resultado {

    public static int theLoveLetterMystery(String s) {

        // Cria dois arrays de caracteres "esquerdo" e "direito" para armazenar metade
        // dos caracteres da string "s" em cada um
        char[] esquerdo = new char[(s.length() / 2) + 1];
        char[] direito = new char[(s.length() / 2) + 1];

        // Variável para armazenar a contagem de operações necessárias para tornar a
        // string um palíndromo
        int contar = 0;

        // Variável para armazenar a posição da metade da string "s"
        int n = 0;

        // Laço de repetição que percorre metade da string "s" e armazena os caracteres
        // à esquerda em "esquerdo"
        for (int i = 0; i < s.length() / 2; i++) {

            esquerdo[i] = s.charAt(i);
        }

        // Define a posição da metade da string "s"
        n = s.length() / 2;

        // Se a string "s" tiver um número par de caracteres, diminui a posição da
        // metade em 1
        if (s.length() % 2 == 0) {

            n = n - 1;
        }

        // Laço de repetição que percorre a segunda metade da string "s" e armazena os
        // caracteres à direita em "direito"
        for (int i = s.length() - 1; i > n; i--) {

            direito[s.length() - 1 - i] = s.charAt(i);
        }

        // Laço de repetição que compara cada caractere à esquerda em "esquerdo" com seu
        // correspondente à direita em "direito" e incrementa a contagem de operações
        // necessárias para tornar a string um palíndromo
        for (int i = 0; i < esquerdo.length; i++) {

            contar = contar + Math.abs(esquerdo[i] - direito[i]);
        }

        // Retorna a contagem final
        return contar;
    }

    // public static int theLoveLetterMystery(String s) {

    // // Obtém o tamanho da string de entrada
    // int n = s.length();

    // // Variável para armazenar a contagem de operações necessárias para tornar a
    // // string um palíndromo
    // int contar = 0;

    // // Laço de repetição que percorre a string até a metade do seu tamanho
    // for (int i = 0; i < (n / 2); i++) {

    // // Obtém o caractere à esquerda e à direita da string
    // char esquerdo = s.charAt(i);
    // char direito = s.charAt(n - i - 1);

    // // Se o caractere à esquerda não for igual ao caractere à direita,
    // incrementa a contagem com a diferença de seus valores na tabela ASCII
    // if (esquerdo != direito) {

    // contar += Math.abs(esquerdo - direito);
    // }
    // }

    // // Retorna a contagem final
    // return contar;
    // }
}
