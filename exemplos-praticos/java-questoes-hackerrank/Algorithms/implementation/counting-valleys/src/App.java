import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int passos = Integer.parseInt(bufferedReader.readLine().trim());
        String caminho = bufferedReader.readLine();

        int resultado = Resultado.countingValleys(passos, caminho);


        bufferedWriter.write(String.valueOf(resultado));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
        
    }
}

class Resultado {

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int nivel = 0;
        int vale = 0;
        int passos = steps;
        String caminho = path;
        
        for(int indice = 0; indice < passos; indice += 1) {
            
            if(caminho.charAt(indice) == 'U') {
                
                nivel++;
                
                if(nivel == 0) {
                    
                    vale++;
                }
            } else {
                
                nivel--;
            }
        }
        
        return vale;
    }

    // public static int countingValleys(int passos, String caminho) {

    //     int nivel = 0;
    //     int nivelAnterior = 0;
    //     int totalVales = 0;

    //     boolean nivelInterno = false;
    //     boolean nivelExterno = false;

    //     String[] arrCaminho = caminho.split("");

    //     for (int indice = 0; indice < arrCaminho.length; indice += 1) {
            
    //         if(indice != 0) {

    //             nivelAnterior = nivel;
    //         }

    //         if (arrCaminho[indice].equals("D")) {
                
    //             nivel--;
    //         }

    //         if (arrCaminho[indice].equals("U")) {
                
    //             nivel++;
    //         }

    //         if(nivel < 0 && nivelAnterior <= 0) {

    //             nivelInterno = true;
    //         }

    //         if(nivel >= 0 && nivelAnterior < 0) {

    //             nivelExterno = true;
    //         }

    //         if (nivelInterno && nivelExterno) {
                
    //             totalVales++;
    //             nivelInterno = false;
    //             nivelExterno = false;
    //         }
    //     }
        
    //     return totalVales;
    // }

    // public static int countingValleys(int passos, String caminho) {
    //     int nivel = 0;
    //     int vale = 0;

    //     for(char caracter : caminho.toCharArray()) {

    //         if(caracter == 'D') {

    //             nivel--;

    //             if(nivel == - 1) {

    //                 vale++;
    //             }
    //         } else  {

    //             nivel++;
    //         }
    //     }
    //     return vale;
    // }
}
