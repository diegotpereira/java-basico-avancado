import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Resultado.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}


class Resultado {

    public static String twoStrings(String s1, String s2) {

        HashSet<Character> setResultado = set(s1);

        setResultado.retainAll(set(s2));

        return (setResultado.size() > 0 ? "YES" : "NO");
    }

    public static HashSet<Character> set(String str) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            set.add(str.charAt(i));
            
        }

        return set;
    }

    // public static String twoStrings(String s1, String s2) {

    //     // Cria uma nova string s1Resultado que remove todos os caracteres de s1 que também aparecem em s2
    //     String s1Resultado = s1.replaceAll("[" + s2 + "]", "");

    //     // Verifica se a string resultante s1Resultado é menor do que a string original s1
    //     if (s1Resultado.length() < s1.length()) {
                    
    //         // Se for menor, significa que s1 contém uma substring em comum com s2
    //         return "YES";
    //     }

    //     // Se não contiver, retorna "NO"
    //     return "NO";
    // }

}