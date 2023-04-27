public class Resultado {

    // O método decentNumber tem como objetivo encontrar o maior número "decente"
    // que pode ser formado a partir de um determinado número n. Um número é
    // considerado "decente" se ele é composto somente pelos dígitos '3' e/ou '5' e
    // a quantidade de '3' e '5' em sua composição atende a duas condições: o número
    // de dígitos '3' é divisível por 5 e o número de dígitos '5' é divisível por 3.

    public static String decentNumber(int n) {

        // Cria um StringBuilder vazio
        StringBuilder sb = new StringBuilder();

        // Loop para adicionar '5' n vezes no StringBuilder
        for (int i = 0; i < n; i++) {

            sb.append(5);
        }

        // Converte o StringBuilder em um array de caracteres
        char[] saida = sb.toString().toCharArray();
        int numDeCinco = n;
        int numDeTres = 0;

        // Loop para encontrar a maior sequência possível de '5' e '3'
        for (int i = saida.length - 1; i >= 0; i--) {

            // Verifica se a quantidade de '5' e '3' é válida
            if (numDeCinco % 3 == 0 && numDeTres % 5 == 0) {

                break;

            } else {

                saida[i] = '3';

                numDeCinco--;
                numDeTres++;
            }
        }

        // Verifica se a quantidade de '5' e '3' é válida
        if (numDeCinco % 3 == 0 && numDeTres % 5 == 0) {

            // Cria uma String a partir do array de caracteres
            String str = new String(saida);

            // Retorna a String
            return str;

        } else {

            // Retorna "-1" se não for possível formar um número decente
            return "-1";
        }
    }

    // public static String decentNumber(int n) {

    // // variável que armazena a quantidade de cincos necessários
    // int numDeCincos = n;

    // // laço para encontrar a quantidade exata de cincos necessários
    // while (numDeCincos % 3 != 0) {

    // numDeCincos = numDeCincos - 5;
    // }

    // // se não for possível formar o número decente, retorna "-1"
    // if (numDeCincos < 0) {

    // return "-1";

    // } else {

    // // retorna a concatenação de "5" repetido numDeCincos vezes e "3" repetido (n

    // // numDeCincos) vezes
    // return ("5".repeat(numDeCincos) + "3".repeat(n - numDeCincos));
    // }

    // }

    // public static String decentNumber(int n) {

    // int numDeCinco = n;

    // if (n < 3 || n % 3 != 0) {

    // return "-1";

    // } else {

    // return ("5".repeat(numDeCinco) + "3".repeat(n - numDeCinco));
    // }

    // StringBuilder sb = new StringBuilder();
    // int numCinco = n;

    // while (numCinco % 3 != 0) {

    // numCinco -= 5;
    // }

    // for (int i = 0; i < numCinco; i++) {

    // sb.append("5");
    // }

    // for (int i = 0; i < n - numCinco; i++) {

    // sb.append("3");
    // }

    // // System.out.println(sb.toString());

    // return sb.toString();
    // }

}
