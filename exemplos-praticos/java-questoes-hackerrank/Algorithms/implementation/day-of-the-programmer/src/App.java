import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int ano = Integer.parseInt(bufferedReader.readLine().trim());

        String resultado = Resultado.dayOfProgrammer(ano);

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();;
    }
}

class Resultado {

    public static String dayOfProgrammer(int ano) {

        int data = 0;
        
        //1918
        if(ano == 1918){
            
            data = 26;
            
        } else {
            
            if(ano >= 1700 && ano <= 1917){
                
                if(ano % 4 == 0){
                    
                    data = 12;
                    
                } else {
                    
                    data = 13;
                }
                
            } else {
                
                //calendario gregoriano
                if((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
                    
                    data = 12;
                    
                } else {
                    
                    data = 13;
                    
                }
            }
        }
        
        return (data + ".09." + ano);
    }

    // public static String dayOfProgrammer(int ano) {

    //      if(ano == 1918) {

    //         return "26.09.1918";

    //     } else if (ano < 1918) {
            
    //         return (ano % 4 == 0) ? ("12.09."+ ano) : ("13.09."+ano);

    //     } else {

    //         return ((ano % 4 == 0 && ano % 100 != 0) || (ano  % 400 == 0)) ? ("12.09."+ano) : ("13.09."+ano);
            
    //     }
    // }

    // public static String dayOfProgrammer(int ano) {

    //     String b;
    //     String c = Integer.toString(ano);

    //     if (ano >= 1919 && ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            
    //         b = "12.09."+c;

    //     } else if (ano % 4 == 0 && ano < 1918) {
            
    //         b = "12."+"09."+c;

    //     } else {

    //         b = "13."+"09."+c;
    //     }

    //     if (ano == 1918) {
            
    //         b = "26."+"09."+c;
    //     }
    //     return b;
    // }

    // public static String dayOfProgrammer(int ano) {

    //     if (ano >= 1700 && ano <= 1917) {

    //         if (ano % 4 == 0) {
                
    //             return "12.09"+ano;

    //         } else {

    //             return "13.09"+ano;
    //         }
            
    //     } else if (ano == 1918) {
            
    //         return "26.09.1918";
    //     }

    //     LocalDate data = LocalDate.ofYearDay(ano, 256);
    //     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");

    //     return data.format(formatter);
    // }

    // public static String dayOfProgrammer(int ano) {

    //     if(ano == 1918) {

    //         return "26.09.1918";

    //     } else if (ano < 1918) {
            
    //         return (ano % 4 == 0) ? ("12.09."+ ano) : ("13.09"+ano);

    //     } else {

    //         return ((ano % 4 == 0 && ano % 100 != 0) || (ano  % 400 == 0)) ? ("12.09."+ano) : ("13.09."+ano);

    //     }
    //     // return null;
    // }
}