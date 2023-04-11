import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        int resultado = Resultado.marsExploration(s);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static int marsExploration(String s) {

        int contarErro = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (i % 3 == 0) {
                
                if (s.charAt(i) != 'S') {
                    
                    contarErro++;
                }
            } else if(i % 3 == 1) {

                if (s.charAt(i) != 'O') {
                    
                    contarErro++;
                }
            } else if (i % 3 == 2) {
                
                if (s.charAt(i) != 'S') {
                    
                    contarErro++;
                }
            }
        }
        return contarErro;
    }

    // public static int marsExploration(String s) {

    //     // Inicializa o contador de letras diferentes com zero.
    //     int resultado = 0;

    //     // Define a string de referência como "SOS".
    //     String palavra = "SOS";

    //     // Loop que percorre cada caractere da string de entrada "s".
    //     for(int i = 0; i < s.length(); i++) 

    //         // Compara o caractere da string de entrada "s" com o caractere correspondente na string de referência "palavra".
    //         // O índice da string de referência é calculado usando a operação módulo (%), para que a sequência "SOS" seja repetida infinitamente.
    //         // Se o caractere da posição i da string "s" for diferente do caractere correspondente na sequência "SOS", incrementa o contador.
    //         if(s.charAt(i) != palavra.charAt(i % 3))

    //             resultado++;

    //     // Retorna o número de caracteres diferentes.
    //     return resultado;
    // }

    // public static int marsExploration(String s) {

    //     // Cria uma nova string "palavra" que armazena a sequência "SOS".
    //     String palavra = new String("SOS");

    //     // Inicializa a variável que vai armazenar o número de letras diferentes.
    //     int contar = 0;  

    //     // Loop que compara cada caractere da string de entrada "s" com o caractere 
    //     // correspondente na string "palavra" (que é sempre "SOS").
    //     for (int i = 0; i < s.length(); i++) 
            
    //         // Se o caractere da posição i da string "s" for diferente do caractere da 
    //         // posição i % 3 da string "palavra" (ou seja, "S", "O" ou "S"), incrementa o contador.
    //         if(s.charAt(i) != palavra.charAt(i % 3))

    //             contar++;

    //     // Retorna o número de caracteres diferentes.
    //     return contar;
    // }

    // public static int marsExploration(String s) {

    //     // Inicializa a variável que vai armazenar o número de letras diferentes.
    //     int contar  = 0;

    //     // Inicializa a string t, que será usada como uma cópia da string "SOS" para comparação.
    //     String t = "";

    //     // Loop que constrói a string "t" com cópias da string "SOS" para ser comparada com a string de entrada "s".
    //     for (int i = 0; i <= s.length() / 3; i+= 1) {
            
    //         t += "SOS";
    //     }

    //     // Loop que compara cada caractere da string de entrada "s" com a string "t" criada anteriormente.
    //     for (int i = 0; i < s.length(); i++) {
            
    //         // Se o caractere da posição i da string "s" for diferente do caractere da posição i da string "t", incrementa o contador.
    //         if (s.charAt(i) != t.charAt(i)) 

    //             contar++;
    //     }

    //     // Retorna o número de caracteres diferentes.
    //     return contar;
    // }

    
}