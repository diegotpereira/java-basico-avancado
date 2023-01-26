import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s=$", "").split(" ");

        int d1 = Integer.parseInt(primeiraMultiplaEntrada[0]);
        int m1 = Integer.parseInt(primeiraMultiplaEntrada[1]);
        int y1 = Integer.parseInt(primeiraMultiplaEntrada[2]);

        String[] segundaMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(segundaMultiplaEntrada[0]);
        int m2 = Integer.parseInt(segundaMultiplaEntrada[1]);
        int y2 = Integer.parseInt(segundaMultiplaEntrada[2]);

        int resultado = Resultado.libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();

    }
}

class Resultado {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

        if (y1 == y2) {
            
            if(m1 == m2)

                return (d1 - d2) > 0 ? (d1 - d2) * 15 : 0;

            else 

                return (m1 - m2) > 0 ? (m1 - m2) * 500 : 0;
        }
        return (y1 - y2) > 0 ? 10000 : 0;
    }

    // public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {

    //     if(y1 > y2)

    //         return 10000;

    //     if(y1 == y2 && m1 > m2)

    //         return 500 * (m1 - m2);

    //     if(y1 == y2 && m1 == m2 && d1 > d2)

    //         return 15 * (d1 - d2);

    //     return 0;
    // }
}