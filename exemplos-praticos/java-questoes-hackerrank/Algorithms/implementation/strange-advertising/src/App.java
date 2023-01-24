import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter =  new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int resultado = Resultado.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Resultado {

    public static int viralAdvertising(int n) {
        // Write your code here
        int recebido = 5;
        int soma = 0;
        
        while (n --> 0) {
            
            int restante = recebido / 2;
            
            soma += restante;
            recebido = restante * 3;
            
        } 
        
        return soma;
    }

    // public static int viralAdvertising(int n) {
        
    //     return rec(5, n);
    // }

    // private static int rec(int s, int n) {

    //     int l = Math.floorDiv(s, 2);// l = 2, l = 3

    //     if(n == 1) return l;
    //     s = l * 3;// s = 6, s = 9

    //     return rec(s, n - 1) + l; // s = 6, n = 3, l = 2
    // }

    // public static int viralAdvertising(int n) {

    //     int compartilhamento = 5;
    //     int curtida = (int) Math.floor(compartilhamento / 2); // curtida = 2
    //     int soma = curtida;

    //     for (int index = 1; index < n; index += 1) {

    //         compartilhamento = curtida * 3; // compartilhamento = 6 || compartilhamento = 9
    //         curtida = (int) Math.floor(compartilhamento / 2); // curtida = 2 || curtida = 4
    //         soma += curtida; // soma = 2 || soma = 9
    //     }
    //     return soma;
    // }

    // public static int viralAdvertising(int n) {
    //     int i = 1;
    //     int curtida = 2;
    //     int compartilhamento = 5;
    //     int totalCurtidas = 2;

    //     while (n != i) {
            
    //         i++; // i = 2 | i = 3
    //         compartilhamento = curtida * 3; // compartilhamento = 6 || compartilhamento = 9
    //         curtida = compartilhamento / 2; // curtida = 3 \\ curtida = 4
    //         totalCurtidas += curtida; // totalCurtidas = 2 || totalCurtidas = 5
    //     }
    //     return totalCurtidas;
    // } 
}