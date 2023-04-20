import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int resposta = Resultado.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(resposta));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int minimumNumber(int n, String password) {

        String s = "!@#$%^&*()-+";

        // Cria uma string s que contém os caracteres especiais permitidos na senha.
        int resposta = 0;

        // Inicializa uma variável inteira resposta com zero, que será usada para contabilizar o número mínimo de caracteres que devem ser adicionados à senha.

        // Conta o número de caracteres maiúsculos (ucc) na senha password.
        long ucc = password.chars().filter(c -> Character.isUpperCase(c)).count();
        
        // Conta o número de caracteres minúsculos (lcc) na senha password.
        long lcc = password.chars().filter(c -> Character.isLowerCase(c)).count();

        // Conta o número de dígitos (dc) na senha password.
        long dc = password.chars().filter(c -> Character.isDigit(c)).count();

        // Conta o número de caracteres especiais (scc) permitidos na senha password.
        long scc = password.chars().filter(c -> s.contains(Character.toString((char) c))).count();

        if (ucc == 0) {
            
            resposta++;
        }

        if (lcc == 0) {
            
            resposta++;
        }

        if (dc == 0) {
            
            resposta++;
        }

        if (scc == 0) {
            
            resposta++;
        }

        // Se a senha password não contém nenhum caractere especial permitido, adiciona 1 ao valor da variável resposta.
        while (password.length() + resposta < 6) {
            
            resposta++;
        }
        return resposta;
    }

    // public static int minimumNumber(int n, String password) {


    //     // Define uma string contendo os caracteres especiais permitidos
    //     final String caracteresEspecial = "!@#$%^&*()-+";

    //     // Inicializa uma variável que será usada para contar o número mínimo 
    //     //  de caracteres adicionais necessários para aumentar a segurança da senha
    //     int resultado = 0;

    //     // Inicializa uma série de booleanos que serão usados para determinar 
    //     //  se a senha possui letras maiúsculas, minúsculas, caracteres especiais e dígitos
    //     boolean maisculas = false;
    //     boolean minusculas = false;
    //     boolean caracterEspecial = false;
    //     boolean digito = false;

    //     // Percorre cada caractere da senha e verifica se ele é uma letra maiúscula, minúscula, 
    //     //  caractere especial ou dígito
    //     for(char c : password.toCharArray()) {

    //         if (Character.isUpperCase(c)) {
                
    //             // Se o caractere é uma letra maiúscula, define a variável maisculas como true
    //             maisculas = true;
    //         }

    //         if (Character.isLowerCase(c)) {
                
    //             // Se o caractere é uma letra minúscula, define a variável minusculas como true
    //             minusculas = true;
    //         }

    //         if (Character.isDigit(c)) {
                
    //             // Se o caractere é um dígito, define a variável digito como true
    //             digito = true;
    //         }

    //         if (caracteresEspecial.contains(String.valueOf(c))) {
                
    //             // Se o caractere é um caractere especial, define a variável caracterEspecial como true
    //             caracterEspecial = true;
    //         }
    //     }

    //     // Se a senha não contém letras maiúsculas, adiciona um ao resultado
    //     if(!maisculas) resultado++;

    //     // Se a senha não contém letras minúsculas, adiciona um ao resultado
    //     if(!minusculas) resultado++;

    //     // Se a senha não contém dígitos, adiciona um ao resultado
    //     if(!digito) resultado++;

    //     // Se a senha não contém caracteres especiais, adiciona um ao resultado
    //     if(!caracterEspecial) resultado++;

    //     // Se a senha tem menos de 6 caracteres, retorna o máximo entre o resultado e 6 menos o comprimento da senha
    //     if (n < 6) {
            
    //         return Math.max(resultado, 6 - n);
    //     }

    //     // Caso contrário, retorna o resultado
    //     return resultado;
    // }
}