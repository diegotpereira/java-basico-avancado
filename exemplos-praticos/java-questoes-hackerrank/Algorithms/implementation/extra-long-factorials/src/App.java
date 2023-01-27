import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        BigInteger resultado = Resultado.extraLongFactorials(n);

        System.out.println(resultado);

        bufferedReader.close();
    }
}


class Resultado {

    public static BigInteger extraLongFactorials(int n) {

        BigInteger x = BigInteger.valueOf(n);

        n = n - 1;

        while(n > 0) {

            x = x.multiply(BigInteger.valueOf(n));
            n = n - 1;
        }
        return (new BigInteger(x.toString()));
    }

    // public static BigInteger extraLongFactorials(int n) {

    //     BigInteger numero = new BigInteger(Integer.toString(n));
    //     BigInteger resultado = fatorRecursivo(numero);

    //     return resultado;
        
    // }

    // private static BigInteger fatorRecursivo(BigInteger numero) {

    //     if (numero.equals(BigInteger.valueOf(1)) || numero.equals(BigInteger.valueOf(0))) 
            
    //         return BigInteger.valueOf(1);

    //     return numero.multiply(fatorRecursivo(numero.subtract(new BigInteger("1"))));
        
    // }

    // public static BigInteger extraLongFactorials(int n) {

    //     String novoValor = "1";

    //     for (int k = n; k >= 1; k -= 1) {
            
    //         BigInteger soma = BigInteger.valueOf(k).multiply(new BigInteger(novoValor));
    //         novoValor = soma.toString();
    //     }
    
    //     return new BigInteger(novoValor);
    // }

    // public static BigInteger extraLongFactorials(int n) { // n = 25

    //     return (obterFator(n, new HashMap<>()));
    // }
    
    // private static BigInteger obterFator(int n, Map<Integer, BigInteger> mapa) {

    //     if (n == 1 || n == 0) {
            
    //         return BigInteger.ONE;
    //     }

    //     if (mapa.containsKey(n)) {
            
    //         return mapa.get(n);

    //     } else {

    //         BigInteger resposta = BigInteger.valueOf(n).multiply(obterFator(n - 1, mapa));
    //         mapa.put(n, resposta);

    //         return resposta;
    //     }
    // }

    // public static BigInteger extraLongFactorials(int n) {

    //     BigInteger numero = new BigInteger(Integer.toString(n));
    //     BigInteger resultado = fatorRecursivo(numero);

    //     return resultado;
    // }

    // private static BigInteger fatorRecursivo(BigInteger numero) {

    //     if (numero.equals(BigInteger.valueOf(1)) || numero.equals(BigInteger.valueOf(0))) 
            
    //         return BigInteger.valueOf(1);

    //     return numero.multiply(fatorRecursivo(numero.subtract(new BigInteger("1"))));
        
    // }
}