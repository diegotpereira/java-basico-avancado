import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> alturaPalavra = Stream.of(bufferedReader.readLine()
                                                  .replaceAll("\\s+$", "")
                                                  .split(" "))
                                                  .map(Integer::parseInt)
                                                  .collect(toList());
        
        String palavra = bufferedReader.readLine();

        int resultado = Resultado.designerPdfViewer(alturaPalavra, palavra);

        bufferedWriter.write(String.valueOf(resultado));

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int designerPdfViewer(List<Integer> alturaPalavra, String palavra) {

        int aux = Integer.MIN_VALUE;

        for (int i = 0; i < palavra.length(); i += 1) {
            
            aux = (alturaPalavra.get(palavra.charAt(i) - 'a') >= aux) ? alturaPalavra.get(palavra.charAt(i) - 'a') : aux;
        }
        return aux * palavra.length();
    }

    // public static String designerPdfViewer(List<Integer> alturaPalavra, String palavra) {

    //     String a = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

    //     List<String> alfabeto = Arrays.asList((a.split(" ")));

    //     char d = palavra.charAt(0);

    //     int maisAlto = alturaPalavra.get(alfabeto.indexOf(String.valueOf(d)));

    //     for(int i = 0; i < palavra.length(); i += 1) {

    //         char c = palavra.charAt(i);

    //         if (alturaPalavra.get(alfabeto.indexOf(String.valueOf(c))) > maisAlto)  {
                
    //             maisAlto = alturaPalavra.get(alfabeto.indexOf(String.valueOf(c)));
    //         }
    //     }

    //     return palavra.length() * maisAlto);
        
    // }

    // public static int designerPdfViewer(List<Integer> alturaPalavra, String palavra) {

    //     int len = palavra.length();
    //     char[] ch = palavra.toCharArray();
    //     int big = alturaPalavra.get((ch[0] - 97));

    //     for (int i = 0; i < ch.length; i += 1) {
            
    //         if(alturaPalavra.get((ch[i] - 97)) > big)

    //             big = alturaPalavra.get((ch[i] - 97));
                
    //     }

    //     return big * len;

        
    // }
}
