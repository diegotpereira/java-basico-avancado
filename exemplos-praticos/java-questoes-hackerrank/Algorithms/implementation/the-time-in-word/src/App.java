import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int hora = Integer.parseInt(bufferedReader.readLine().trim());
        int minuto = Integer.parseInt(bufferedReader.readLine().trim());

        String resultado = Resultado.timeInWords(hora, minuto);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static String timeInWords(int hora, int minuto) {

        // Mapeamento de números para palavras
        HashMap mapa = new HashMap<>();

        mapa.put(0, "zero");
        mapa.put(1, "one");
        mapa.put(2, "two");
        mapa.put(3, "three");
        mapa.put(4 , "four");
        mapa.put(5, "five");
        mapa.put(6, "six");
        mapa.put(7, "seven");
        mapa.put(8, "eight");
        mapa.put(9, "nine");
        mapa.put(10, "ten");
        mapa.put(11, "eleven");
        mapa.put(12, "twelve");
        mapa.put(13, "thirteen");
        mapa.put(14, "fourteen");

        mapa.put(16, "sixteen"); 
        mapa.put(17, "seventeen"); 
        mapa.put(18, "eighteen");
        mapa.put(19,"nineteen"); 
        mapa.put(20,"twenty"); 
        mapa.put(21,"twenty one"); 
        mapa.put(22,"twenty two"); 
        mapa.put(23,"twenty three"); 
        mapa.put(24,"twenty four"); 
        mapa.put(25,"twenty five"); 
        mapa.put(26,"twenty six"); 
        mapa.put(27,"twenty seven"); 
        mapa.put(28,"twenty eight"); 
        mapa.put(29,"twenty nine");


        String s = "";

        // Verifica diferentes casos de minutos e constrói a string resultante
        if (minuto == 0) {
                
                s = mapa.get(hora) + " o' clock";
            } else if (minuto == 15) {
            
                s = "quarter past " + mapa.get(hora);

            } else if (minuto == 30) {
                
                s = "half past " + mapa.get(hora);

            } else if (minuto == 45) {
                
                s = "quarter to " + mapa.get(hora + 1);

            } else if (minuto > 1 && minuto < 30) {
                
                s = mapa.get(minuto) + " minutes past " + mapa.get(hora);

            } else if (minuto > 30 && minuto < 60) {

                s = mapa.get(60 - minuto) + " minutes to " + mapa.get(hora + 1);
                
            } else if (minuto == 1 && minuto < 30) {
                
                s = mapa.get(minuto) + " minute past " + mapa.get(hora);

            } else if (60 - minuto == 1 && minuto > 30) {
                
                s = mapa.get(60 - minuto) + " minute to " + mapa.get(hora +);
            }

        // Retorna a string final
        return s;
    }

    // public static String timeInWords(int hora, int minuto) {

    //     String[] num = { "half", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty" };

    //     String tempo = null;

    //     if (minuto == 0) {
            
    //         tempo = num[hora] + " o' clock ";
            
    //     } else if (minuto == 15) {
            
    //         tempo = num[minuto] + " past " + num[hora];

    //     } else if (minuto == 30) {
            
    //         tempo = num[0] + " past " + num[hora];

    //     } else if (minuto == 45) {
            
    //         tempo = num[15] + " to " + num[hora + 1];

    //     } else if (minuto == 1) {
            
    //         tempo = num[1] + " minute past " + num[hora];

    //     } else if (minuto <= 20) {
            
    //         tempo = num[minuto] + " minute past " + num[hora];

    //     } else if (minuto < 30) {
            
    //         tempo = num[20] + " " + num[minuto - 20] + " minutes past " + num[hora];

    //     } else if (minuto < 40) {
            
    //         tempo = num[20] + " " + num[40 - minuto] + " minutes to " + num[hora + 1];

    //     } else {

    //         tempo = num[60 - minuto] + " minutes to " + num[hora + 1];
    //     }

    //     return tempo;
    // }
}
