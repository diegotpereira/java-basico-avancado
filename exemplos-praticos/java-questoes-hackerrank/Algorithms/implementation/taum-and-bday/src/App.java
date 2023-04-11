import java.io.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {

            try {
                
                String[] primeiraMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int numeroPresentesPretos = Integer.parseInt(primeiraMultiplaEntrada[0]);
                int numeroPresentesBrancos = Integer.parseInt(primeiraMultiplaEntrada[1]);

                String[] segundaMultiplaEntrada = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                
                int custoPresentePreto = Integer.parseInt(segundaMultiplaEntrada[0]);
                int custoPresenteBranco = Integer.parseInt(segundaMultiplaEntrada[1]);
                int custoConverterPresente = Integer.parseInt(segundaMultiplaEntrada[2]);

                long resultado = Resultado.taumBday(numeroPresentesPretos, numeroPresentesBrancos, custoPresentePreto, custoPresenteBranco, custoConverterPresente);

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

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        // Write your code here
        long bcl = bc;
        long wcl = wc;
        
        if(bcl * b > (wcl + z) * b) {
            
            bcl = wcl + z;
        }
        
        if(wcl * w > (bcl + z) * w) {
            
            wcl = bcl + z;
        }
        
        return (b * bcl) + (w * wcl);
    }

    // public static long taumBday(int numeroPresentesPretos, int numeroPresentesBrancos, int custoPresentePreto,
    //         int custoPresenteBranco, int custoConverterPresente) {

    //     long pretoTotal = 0;
    //     long brancoTotal = 0;

    //     pretoTotal = custoPresentePreto < (custoPresenteBranco + custoConverterPresente) ? numeroPresentesPretos * custoPresentePreto : numeroPresentesPretos * (custoPresenteBranco + custoConverterPresente);
    //     brancoTotal = custoPresenteBranco < (custoPresentePreto + custoConverterPresente) ? numeroPresentesBrancos * custoPresenteBranco : numeroPresentesBrancos * (custoPresentePreto + custoConverterPresente);
        
    //     return pretoTotal + brancoTotal;
    // }

    // public static long taumBday(int numeroPresentesPretos, int numeroPresentesBrancos, int custoPresentePreto,
    //         int custoPresenteBranco, int custoConverterPresente) {

    //     if (custoPresentePreto == custoPresenteBranco || custoConverterPresente > Math.abs(custoPresentePreto - custoPresenteBranco)) {
            
    //         return custoPresentePreto * numeroPresentesPretos + custoPresenteBranco * numeroPresentesBrancos;

    //     } else if (custoPresentePreto < custoPresenteBranco) {
            
    //         long converter = custoPresentePreto + custoConverterPresente;

    //         if(converter < custoPresenteBranco) {

    //             return custoPresentePreto * numeroPresentesPretos + converter * numeroPresentesBrancos;

    //         } 

    //         return custoPresentePreto * numeroPresentesPretos + custoPresenteBranco * numeroPresentesBrancos;

    //     } else {

    //         long converter = custoPresenteBranco + custoConverterPresente;

    //         if (converter < custoPresentePreto) {
                
    //             return converter * numeroPresentesPretos + custoPresenteBranco * numeroPresentesBrancos;

    //         }

    //         return custoPresentePreto * numeroPresentesPretos + custoPresenteBranco * numeroPresentesBrancos;
    //     }
    // }

    // public static long taumBday(int numeroPresentesPretos, int numeroPresentesBrancos, int custoPresentePreto,
    //         int custoPresenteBranco, int custoConverterPresente) {

    //     return numeroPresentesPretos * (Math.min(custoPresentePreto, custoPresenteBranco + custoConverterPresente)) + numeroPresentesBrancos * (Math.min(custoPresenteBranco, custoPresentePreto + custoConverterPresente));
    // }

    // public static long taumBday(int numeroPresentesPretos, int numeroPresentesBrancos, int custoPresentePreto,
    //         int custoPresenteBranco, int custoConverterPresente) {

    //     long preto = numeroPresentesPretos * Math.min(custoPresentePreto, custoPresenteBranco+custoConverterPresente);
    //     long branco = numeroPresentesBrancos * Math.min(custoPresenteBranco, custoPresentePreto+custoConverterPresente);

    //     return preto + branco;

    // }
}