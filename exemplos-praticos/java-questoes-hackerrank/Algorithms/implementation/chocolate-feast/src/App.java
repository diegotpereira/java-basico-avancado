import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(iTr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int orcamento = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int custo = Integer.parseInt(primeiraMultiplaEntrada[1]);
                int embalagem = Integer.parseInt(primeiraMultiplaEntrada[2]);

                int resultado = Resultado.chocolateFeast(orcamento, custo, embalagem);

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

    public static int chocolateFeast(int orcamento, int custo, int embalagem) {
        
        int comprar = (orcamento / custo);
        int contar = comprar;
        
        while(contar >= embalagem) {
            
            comprar = comprar + (contar / embalagem);
            contar = contar % embalagem + (contar / embalagem);
        }
        
        return comprar;
        
    }

    // public static int chocolateFeast(int orcamento, int custo, int embalagem) {

    //     int chocolatecomido = orcamento / custo;

    //     chocolatecomido += calcChoco(0, chocolatecomido, embalagem);

    //     return chocolatecomido;
    // }

    // public static int calcChoco(int custo, int quantia, int embalagem) {

    //     return quantia < embalagem ? custo : calcChoco(custo + (quantia / embalagem), (quantia % embalagem) + (quantia / embalagem), embalagem);
    // }

    // public static int chocolateFeast(int orcamento, int custo, int embalagem) {

    //     int bares = orcamento / custo;
    //     int embalagens = bares;

    //     if (embalagens < embalagem) {
            
    //         return bares;

    //     } else {

    //         while (embalagens >= embalagem) {
                
    //             bares++;
    //             embalagens = embalagens - embalagem + 1;
    //         }
    //     }
    //     return bares;
    // }

    // public static int chocolateFeast(int orcamento, int custo, int embalagem) {

    //     int total = orcamento / custo;
    //     int embalagens = total;

    //     while (embalagens > embalagem || embalagens == embalagem) {
            
    //         total += embalagens / embalagem;
    //         embalagens = (embalagens / embalagem) + (embalagens % embalagem);
    //     }
    //     return total;
    // }

    // public static int chocolateFeast(int orcamento, int custo, int embalagem) {

    //     int dinheiro = orcamento / custo;
    //     int contar = 0;
    //     int total = 0;

    //     do {
            
    //         total += dinheiro;
    //         contar += dinheiro;
    //         dinheiro = contar / embalagem;
    //         contar = contar % embalagem;

    //     } while (dinheiro > 0);
        
    //     return total;
    // }    
}