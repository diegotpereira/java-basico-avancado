import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int g = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, g).forEach(gItr -> {

            try {
                
                int n = Integer.parseInt(bufferedReader.readLine().trim());
                String b = bufferedReader.readLine();

                String resultado = Resultado.happyLadybugs(b);

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

class Resultado{

    public static String happyLadybugs(String b) {

        int contar = 0;

        Map<Character, Integer> mapa = new HashMap<>();

        for (int i = 0; i < b.length(); i++) {

            if (mapa.containsKey(b.charAt(i)))

                mapa.put(b.charAt(i), mapa.get(b.charAt(i)) + 1);
            
            else 

                mapa.put(b.charAt(i), 1);
            
        }

        if(!mapa.containsKey('_')) {

            if(mapa.containsValue(1))

                return "NO";

                for (int i = 1; i < b.length() - 1; i++) {
                    
                    if(b.charAt(i) == b.charAt(i + 1) || b.charAt(i) == b.charAt(i - 1))

                        contar++;
                }

                if(contar < b.length() - 2)

                    return "NO";
        }

        mapa.remove('_');

        for (Integer i : mapa.values()) {
            
            if(i == 1)

                 return "NO";
        }
        return "YES";
    }

    // public static String happyLadybugs(String b) {

    //     int contar = 0;
    //     int[] a = new int[26];

    //     for(char c : b.toCharArray()) 

    //         if(c == '_') contar++;
    //         else a[c - 'A'] ++;

    //     for(int i : a)

    //         if(i == 1)

    //         return "NO";

    //     boolean bandeira = true;

    //     for(int indice = 0; indice < b.length() - 1; indice += 1) 

    //         if(indice == 0 && b.charAt(indice) != b.charAt(indice + 1))

    //             bandeira = false;

    //         else if(b.charAt(indice) != b.charAt(indice + 1) && b.charAt(indice) != b.charAt(indice - 1))

    //             bandeira = false;

    //     if(bandeira)

    //         return "YES";

    //     return (contar == 0) ? "NO" : "YES";
    // }
}
