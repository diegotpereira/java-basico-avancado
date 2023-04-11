import java.io.*;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(q, q).forEach(qItr -> {

            try {
                String s = bufferedReader.readLine();
                String resultado = Resultado.hackerrankInString(s);

                bufferedWriter.write(resultado);
                bufferedWriter.newLine();

            } catch (IOException e) {
                
                throw new RuntimeException(e);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static String hackerrankInString(String s) {

        // expressão regular para verificar se a string contém "hackerrank"
        String regex = ".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*";

        // compila a expressão regular em um padrão e verifica se a string 
        // de entrada contém "hackerrank" na ordem correta. Retorna "YES" 
        // se a string contiver "hackerrank" ou "NO" se não contiver.
        return Pattern.compile(regex).matcher(s).matches() ? "YES" : "NO";
        
    }

    // public static String hackerrankInString(String s) {

    //     String palavra = "hackerrank";
    //     int atualIndice = 0;

    //     for (int i = 0; i < s.length(); i++) {
            
    //         if (s.charAt(i) == palavra.charAt(i)) {
                
    //             atualIndice++;

    //             if(atualIndice == palavra.length()) return "YES";
    //         }
    //     }
    //     return "NO";
    // }
}