import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = bufferedReader.readLine();

        int resultado = Resultado.camelcase(s);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int camelcase(String s) {

        // Converte a String em um array de caracteres
        char [] str = s.toCharArray();

        // Inicializa a variável contar como 1, pois toda string tem pelo menos uma palavra
        int contar = 1;

        // Percorre o array de caracteres
        for (int i = 0; i < str.length; i++) {
            
            // Verifica se o caractere atual é uma letra maiúscula
            if (str[i] >= 'A' && str[i] <=  'Z') {
                
                // Se for, incrementa a variável contar
                contar++;
            }
        }
        
        // Retorna o número de palavras encontradas na string
        return contar;
    }

    // public static int camelcase(String s) {

    //     String[] str = s.split("[A-Z]");

    //     return str.length;
        
    // }
}
