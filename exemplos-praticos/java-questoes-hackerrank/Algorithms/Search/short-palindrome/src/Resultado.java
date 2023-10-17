// A tarefa do problema "Short Palindrome" no HackerRank 
// é encontrar o número de palíndromos de quatro caracteres 
// que podem ser formados a partir de uma string dada. Um 
// palíndromo é uma sequência que permanece a mesma quando lida de trás para frente.

// Para resolver esse problema, você precisa determinar 
// quantas palavras de quatro caracteres podem ser formadas 
// usando os caracteres da string original. O desafio envolve 
// encontrar todas as combinações possíveis de quatro 
// caracteres e verificar se cada combinação é um palíndromo.

// O objetivo é contar o número de palíndromos de quatro 
// caracteres possíveis que podem ser formados a partir da 
// string e retornar esse valor como resultado. O problema 
// pode envolver manipulação de strings e algoritmos 
// para encontrar todas as combinações de caracteres.

public class Resultado {

    // public static int shortPalindrome(String s) {

    //     // Inicializa a variável que armazenará o resultado.
    //     int total = 0;

    //     // Contagem de caracteres vistos
    //     int[] vistoContador = new int[26];

    //     // Contagem de pares de caracteres
    //     int[] contador = new int[26];

    //     // Contagem de pares de caracteres invertidos
    //     int[] xyContador = new int[26 * 26];
        
    //     // Valor módulo para evitar estouro de int.
    //     int mod = 1000000007;

    //     // Loop para percorrer a string caractere por caractere.
    //     for (char k : s.toCharArray()) {
            
    //         // Converte o caractere para um índice de 0 a 25.
    //         int X = k - 'a';

    //         // Inicializa o índice XY.
    //         int XY = X;

    //         // Atualiza o total com a contagem de pares 'XY'.
    //         total = (total + contador[X]) % mod;

    //         // Loop para calcular as contagens de pares 'XY' com diferentes caracteres 'Y'.
    //         for (int Y = 0; Y < 26; Y++) {
                
    //             contador[Y] = (contador[Y] + xyContador[XY]) % mod;
    //             xyContador[XY] = (xyContador[XY] + vistoContador[Y]) % mod;

    //             // Incrementa para o próximo caractere 'Y'.
    //             XY += 26;
    //         }

    //         // Atualiza a contagem do caractere 'X' visto.
    //         vistoContador[X] += 1;
    //     }

    //     // Retorna o total de palíndromos de quatro caracteres.
    //     return total;
    // }


    // Definindo a constante mod como 1000000007 para realizar a operação módulo.
    private static int mod = 1000000007;

    // Declarando um array de caracteres 'arr' para armazenar a entrada.
    private static char[] arr;

    public static int shortPalindrome(String s) {

        // Convertendo a string 's' em um array de caracteres 'arr'.
        arr = s.toCharArray();

        // Inicializando a variável de contagem.
        int contador = 0;

        // Loop que itera de 'a' a 'z' (valores ASCII de 97 a 122).
        for (int i = 97; i <= 122; i++) {

            // Atualizando a contagem usando a função makeArray.
            contador = (contador + fazerMatriz((char) i)) % mod;
        }

        // Retornando o resultado da contagem.
        return contador;
    }
    
    private static int fazerMatriz(char yo) {

        // Declaração de um array 'arrayAtual' com 4 elementos para rastrear o estado atual.
        int[] arrayAtual = new int[4];

        // Declaração de um array 'ab' com 26 elementos (uma para cada letra do alfabeto).
        int[] ab = new int[26];

        // Iterando pela string de trás para frente.
        for (int i = 0; i < arr.length; i++) {

            // Obtendo o caractere atual da string 'a'.
            char caractereAtual = arr[arr.length-i-1];

            // Salvando o valor anterior de 'caractereAtual[0]'.
            int valorAnteriorCaracter = arrayAtual[0];

            if (yo == caractereAtual) {

                // Se 'yo' for igual a 'caractereAtual', atualize 'arrayAtual[3]'.
                arrayAtual[3] = (arrayAtual[3] + arrayAtual[2]) % mod;

                // Atualize 'arrayAtual[0]'.
                arrayAtual[0] = (1 + arrayAtual[0]) % mod;
            }

            // Atualize 'arrayAtual[2]' usando 'ab'.
            arrayAtual[2] = (arrayAtual[2] + ab[(int) caractereAtual - 97]) % mod;

            // Atualize 'ab'.
            ab[(int) caractereAtual - 97] = (ab[(int) caractereAtual - 97] + valorAnteriorCaracter) % mod;

            // Atualize 'arrayAtual[1]'.
            arrayAtual[1] = (arrayAtual[1] + valorAnteriorCaracter) % mod;
        }

        // Retorne 'arrayAtual[3]' como resultado final.
        return arrayAtual[3];
    }
    
}
