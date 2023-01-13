import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String resultado = Resultado.timeConversion(s);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();


    }
}


class Resultado {

    public static String timeConversion(String s) {

        String[] hora = s.split(":");
        String ampm = hora[2].substring(2);

        if (ampm.equals("PM") && !hora[0].equals("12")) {
            
            return (Integer.valueOf(hora[0]) + 12) + ":" + hora[1] + ":" + hora[2].substring(0, 2);

        } else if (ampm.equals("AM") && hora[0].equals("12")) {
            
            return hora[0] + ":" + hora[1] + ":" + hora[2].substring(0, 2);

        } else {

            return hora[0]+":"+hora[1]+":"+hora[2].substring(0,2);
        }
        
    }

    // public static String timeConversion(String s) {

    //     String[] se = s.split("[PA]"); // se[0] = "07:05:45" se[1] = 1: "M"
    //     String[] sp = se[0].split(":"); // sp = 07 05 45

    //     char ampm = s.charAt(s.toCharArray().length - 2);

    //     if (ampm == 'P') {
            
    //         if(!sp[0].equals("12")) 

    //             // somando + 12 transformando em 24
    //             sp[0] = String.valueOf(Integer.parseInt(sp[0]) + 12);

    //     } else if (ampm == 'A') {
            
    //         if(sp[0].equals("12"))

    //             sp[0] = "00";
    //     }
    //     return sp[0] + ":"+sp[1]+":"+sp[2];
    // }

    // public static String timeConversion(String s) {

    //     String ampm = s.substring(8);
    //     String hora = s.substring(0, 2);

    //     int horaNumero = Integer.parseInt(hora);

    //     if (ampm.equals("AM")) {
            
    //         if (horaNumero == 12) {
                
    //             hora = "00";
    //         }

    //     } else {

    //         if (horaNumero < 12) { // horaNumero = 7
                
    //             // incrementando 12 para formato 24h
    //             horaNumero += 12; // horaNumero = 19

    //             hora = Integer.toString(horaNumero);
    //         }
    //     }
    //     String horaConvertida = hora + s.substring(2, 8);

    //     return horaConvertida;
    // }

    
}