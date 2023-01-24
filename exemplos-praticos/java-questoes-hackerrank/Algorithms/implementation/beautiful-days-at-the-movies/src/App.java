import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int diaInicial = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int diaFinal = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int divisor = Integer.parseInt(primeiraMultiplaEntrada[2]);

        int resultado = Resultado.beautifulDays(diaInicial, diaFinal, divisor);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int beautifulDays(int diaInicial, int diaFinal, int divisor) {

        int contar = 0;

        for (int indice = diaInicial; indice <= diaFinal; indice += 1) {
            
            String str = String.valueOf(indice);
            String nStr = "";

            for(int compare = 0; compare < str.length(); compare += 1) {

                nStr = str.charAt(compare) + nStr;
            }

            int nInt = Integer.parseInt(nStr);

            if (Math.abs(indice - nInt) % divisor == 0) {
                
                contar++;
            }
        }
        return contar;
    }

    // public static int beautifulDays(int diaInicial, int diaFinal, int divisor) {

    //     int resultado = 0;

    //     for(int dia = diaInicial; dia <= diaFinal; dia += 1) {

    //         int reverso = 0;
    //         int n = dia;

    //         while (n > 0) {
                
    //             reverso = (reverso * 10) + (n % 10);
    //             n /= 10;
    //         }

    //         if (Math.abs(dia - reverso) % divisor == 0) {
                
    //             resultado++;
    //         }
    //     }
    //     return resultado;
    // }

    // public static int beautifulDays(int diaInicial, int diaFinal, int divisor) {
    //     int dias = 0;

    //     while (diaInicial <= diaFinal) {
            
    //         if(Math.abs(diaInicial - reverterNumero(diaInicial)) % divisor == 0) 

    //             dias++;

    //         diaInicial++;
    //     }
    //     return dias;
    // }

    // private static int reverterNumero(int diaInicial) {
    //     int reverter = 0;

    //     while (diaInicial != 0) {
            
    //         reverter = reverter * 10 + diaInicial % 10;
    //         diaInicial /= 10;
    //     }
    //     return reverter;
    // }

}