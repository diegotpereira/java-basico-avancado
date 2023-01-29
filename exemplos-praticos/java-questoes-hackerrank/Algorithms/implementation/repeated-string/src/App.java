import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());
        long resultado = Resultado.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static long repeatedString(String s, long n) {

        long restante = n % s.length();
        long multiplos = n / s.length();
        int numeroDeAsNaString = 0;

        char[] arr = s.toCharArray();
        int indice = 0;
        int adicionadoComo = 0;

        for(char caracter : arr) {

            if(caracter == 'a') {

                numeroDeAsNaString++;
            }

            if (indice < restante && caracter == 'a') {
                
                adicionadoComo++;
            }

            indice++;
        }
        return (numeroDeAsNaString * multiplos) + adicionadoComo;
    }

    // public static long repeatedString(String s, long n) {

    //     long tempos = n / s.length(); // tempos = 3
    //     long contar = s.chars().filter(c -> c == 'a').count(); // contar = 2
    //     long mod = n % s.length(); // mod = 1
        
    //     long soma = s.substring(0, (int)mod).chars().filter(ch -> ch == 'a').count();

    //     return tempos * contar + soma;
    // }

    // public static long repeatedString(String str, long numeroCaracteres) {

    //     long restante = numeroCaracteres % str.length();
    //     long recontagem = 0;
    //     long  tempos = numeroCaracteres / str.length();
    //     long a = 0;

    //     for (int indice = 0; indice < str.length(); indice += 1) {
            
    //         if (str.charAt(indice) == 'a') {
                
    //             a++;
    //         }

    //         if (indice < restante && str.charAt(indice) == 'a') {
                
    //             recontagem++;
    //         }
    //     }
    //     return a * tempos + recontagem;
    // }

    // public static long repeatedString(String s, long n) {

    //     // Contando numero de 'a' em determinada String
    //     long contar = s.chars().filter(i -> i == 'a').count();

    //     // Contando numero de 'a' de comprimento n/s.len
    //     long somar = (n / s.length()) * contar;
        
    //     long r = n % s.length();

    //     String novoS = "";

    //     // Se houver algum lembrete, adicione esse (r) numero de caracteres em new String(novo S)
    //     for (int j = 0; j < r; j++) {
            
    //         novoS = novoS + s.charAt(j);

    //     }

    //     // Contando e adicionando numero de 'a' em new String(novoS) para somar
    //     somar = somar + novoS.chars().filter(i -> i == 'a').count();

    //     return somar;
    // }
}