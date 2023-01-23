import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine()
                                                                 .replaceAll("\\s+$", "")
                                                                 .split(" ");

                int numeroPrisioneiros = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int numeroDoces = Integer.parseInt(primeiraMultiplaEntrada[1]);
                int primeiraCadeiraReceber = Integer.parseInt(primeiraMultiplaEntrada[2]);

                int resultado = Resultado.saveThePrisoner(numeroPrisioneiros, numeroDoces, primeiraCadeiraReceber);

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

    public static int saveThePrisoner(int numeroPrisioneiros, int numeroDoces, int primeiraCadeiraReceber) {

        int avisar = (numeroDoces % numeroPrisioneiros) + primeiraCadeiraReceber - 1;

        if(avisar % numeroPrisioneiros == 0)

            return numeroPrisioneiros;

        else 


        return avisar % numeroPrisioneiros;
    }

    
}