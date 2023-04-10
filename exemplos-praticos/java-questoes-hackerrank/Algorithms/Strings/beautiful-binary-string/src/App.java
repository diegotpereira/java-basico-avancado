import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String b = bufferedReader.readLine();

        int resultado = Resultado.beautifulBinaryString(b);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int beautifulBinaryString(String b) {

        Pattern pattern = Pattern.compile("010"); // compila uma expressão regular para encontrar a substring "010"
        Matcher matcher = pattern.matcher(b); // cria um objeto Matcher para encontrar as ocorrências da expressão
                                              // regular na string b
        long contar = matcher.results().count(); // conta o número de ocorrências da expressão regular na string usando
                                                 // Stream

        return (int) contar; // converte o resultado para int e retorna

    }

    // public static int beautifulBinaryString(String b) {

    // // compila uma expressão regular para encontrar a substring "010"
    // Pattern pattern = Pattern.compile("010");
    // // cria um objeto Matcher para encontrar as ocorrências da expressão regular
    // na
    // // string b
    // Matcher matcher = pattern.matcher(b);

    // // contador de ocorrências de "010"
    // int min = 0;

    // // enquanto houver ocorrências da expressão regular na string
    // while (matcher.find()) {

    // // incrementa o contador
    // min++;
    // }

    // // retorna o número de ocorrências de "010"
    // return min;
    // }

    // public static int beautifulBinaryString(String b) {

    // // guarda o tamanho da string
    // int n = b.length();
    // // contador de ocorrências de "010"
    // int min = 0;
    // // a substring que queremos encontrar
    // String t = "010";

    // // percorre a string em grupos de 3 caracteres
    // for (int i = 0; i <= n - 3;) {

    // // extrai uma substring de 3 caracteres a partir da posição atual
    // String b1 = b.substring(i, i + 3);

    // // verifica se a substring contém "010"
    // if (b1.contains(t)) {

    // // incrementa o contador
    // min++;

    // // avança para o próximo grupo de 3 caracteres
    // i = i + 3;

    // } else {

    // // avança para o próximo caractere
    // i++;
    // }
    // }
    // // retorna o número de ocorrências de "010"
    // return min;
    // }

    // public static int beautifulBinaryString(String b) {

    // // Inicializa a variável "contar" com o valor zero, que será usada para
    // contar o
    // // número de ocorrências da sequência "010" na string
    // int contar = 0;

    // // Loop "for" que percorre cada posição da string "b", exceto os dois últimos
    // // caracteres
    // for (int i = 0; i < b.length() - 2; i++) {

    // // Verifica se os caracteres nas posições "i", "i+1" e "i+2" formam a
    // sequência
    // // "010"
    // if (b.charAt(i) == '0' && b.charAt(i + 1) == '1' && b.charAt(i + 2) == '0') {

    // // Incrementa a variável "count" se a sequência "010" é encontrada
    // contar++;
    // // Incrementa o valor da variável "i" em duas unidades para avançar três
    // // posições na string
    // i += 2;
    // }
    // }
    // // Retorna o valor final da variável "count", que indica o número de
    // ocorrências
    // // da sequência "010" na string "b"
    // return contar;
    // }

}