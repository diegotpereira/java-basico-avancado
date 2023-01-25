import java.io.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                int resultado = Resultado.findDigits(n);

                bufferedWriter.write(String.valueOf(resultado));
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

    public static int findDigits(int n) {
        // Write your code here
        
        int num = n;
        int c = 0;
        
        while (num != 0) {
            
            int rem = num % 10;
            
            if(rem != 0 && n % rem == 0)
            
                c++;
                
            num = num / 10;
        }
        
        return c;
    }

    // public static int findDigits(int n) {

    //     int contar = 0;

    //     for(char c : (n + "").toCharArray()) {

    //         if(c != '0' && n % Integer.parseInt(c + "") == 0) ++ contar;
    //     }
    //     return contar;
    // }

    // public static int findDigits(int n) {
    //     int resposta = 0;
    //     String s = String.valueOf(n);

    //     for (int i = 0; i < s.length(); i++) {
            
    //         int d = Integer.valueOf(String.valueOf(s.charAt(i)));

    //         if(d == 0) continue;
    //         if(n % d == 0) resposta++;

    //     }

    //     return resposta;
    // }

    // public static int findDigits(int n) {

    //     int[] nArr = Integer.toString(n)
    //                         .chars()
    //                         .map(d -> d - '0')
    //                         .toArray();
    //     int contar = 0;

    //     for(int num : nArr) {

    //         if(num == 0) continue;
    //         if(n % num == 0) contar++;
    //     }
    //     return contar;
    // }

    // public static int findDigits(int n) {

    //     Integer numero = n;
    //     int[] numeroNoArray = Stream.of(numero
    //                                 .toString()
    //                                 .split(""))
    //                                 .mapToInt(Integer::parseInt)
    //                                 .filter(p -> p > 0)
    //                                 .filter(divisor -> numero % divisor == 0)
    //                                 .toArray();
    //     return numeroNoArray.length;
    // }    
}