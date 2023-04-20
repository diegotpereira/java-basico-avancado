import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String resultado = Resultado.caesarCipher(s, k);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static String caesarCipher(String s, int k) {

        // cria uma string vazia para armazenar a resposta
        String resposta = "";

        // percorre cada caractere da string s
        for (int i = 0; i < s.length(); i++) {

            // verifica se o caractere atual é uma letra minúscula
            if ('a' <= s.charAt(i) & s.charAt(i) <= 'z') 
                
                // adiciona à resposta a letra minúscula deslocada k posições no alfabeto
                resposta += (char) ((s.charAt(i) + k - 'a') % ('z' - 'a' + 1) + 'a');

            // verifica se o caractere atual é uma letra maiúscula
            else if('A' <= s.charAt(i) && s.charAt(i) <= 'Z')

                // adiciona à resposta a letra maiúscula deslocada k posições no alfabeto
                resposta += (char) ((s.charAt(i) + k - 'A') % ('Z' - 'A' + 1) + 'A');

            else 

                // adiciona à resposta o caractere atual (não é uma letra)
                resposta += s.charAt(i);
            
            
        }
        
        // retorna a string com a resposta
        return resposta;
    }

    // public static String caesarCipher(String s, int k) {

    //     String resultado = "";

    //     // Itera sobre cada caractere da string
    //     for (char ch : s.toCharArray()) {

    //         // Verifica se o caractere é uma letra do alfabeto
    //         if (Character.isAlphabetic(ch)) {

    //             // Aplica a criptografia de César no caractere
    //             char novo = (char) (ch + (k % 26));

    //             // Se o caractere é uma letra maiúscula e o valor criptografado ultrapassou o limite do alfabeto (90 na tabela ASCII), ajusta o valor
    //             if (novo > 90 && Character.isUpperCase(ch)) {

    //                 novo = (char) (novo - 26);
    //             }

    //             // Se o caractere é uma letra minúscula e o valor criptografado ultrapassou o limite do alfabeto (122 na tabela ASCII), ajusta o valor
    //             if (novo > 122 && Character.isLowerCase(ch)) {

    //                 novo = (char) (novo - 26);

    //             }

    //             // Adiciona o caractere criptografado à string resultado
    //             resultado = resultado + novo;

    //         } else {

    //             // Se o caractere não é uma letra do alfabeto, adiciona o caractere original à string resultado
    //             resultado = resultado + ch;
    //         }
    //     }

    //     // Retorna a string resultado contendo a mensagem criptografada
    //     return resultado;
    // }

}