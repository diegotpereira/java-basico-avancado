import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int posicaoInicialCanguru1 = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int distanciaPuloCanguru1 = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int posicaoInicialCanguru2 = Integer.parseInt(primeiraMultiplaEntrada[2]);
        int distanciaPuloCanguru2 = Integer.parseInt(primeiraMultiplaEntrada[3]);

        String resultado = Resultado.kangaroo(posicaoInicialCanguru1, distanciaPuloCanguru1, posicaoInicialCanguru2, distanciaPuloCanguru2); // saida: YES

        bufferedWriter.write(resultado);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static String kangaroo(int posicaoInicialCanguru1, int distanciaPuloCanguru1, int posicaoInicialCanguru2,
            int distanciaPuloCanguru2) {

        if(distanciaPuloCanguru1 > distanciaPuloCanguru2 && (posicaoInicialCanguru2 - posicaoInicialCanguru1) % (distanciaPuloCanguru1 - distanciaPuloCanguru2) == 0)

            return "SIM";
        return "NAO";
    }

    // public static String kangaroo(int posicaoInicialCanguru1, int distanciaPuloCanguru1, int posicaoInicialCanguru2,
    //         int distanciaPuloCanguru2) {

    //     int conguru1 = distanciaPuloCanguru1 - distanciaPuloCanguru2;
    //     int conguru2 = posicaoInicialCanguru1 - posicaoInicialCanguru2;

    //     if(conguru1 <= 0) {

    //         return("NAO");
    //     }
    //     return (conguru2 % conguru1 == 0 ? "SIM" : "NAO");
    // }
}