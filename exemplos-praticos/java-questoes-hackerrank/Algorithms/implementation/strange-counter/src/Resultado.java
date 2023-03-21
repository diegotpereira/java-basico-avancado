
public class Resultado {

    public static long strangeCounter(long t) {

        long tamanhoMaximo = 3;
        long contar = 0;
        
        while(contar < t) {
            
            contar += tamanhoMaximo;
            tamanhoMaximo *= 2;
        }
        
        return (tamanhoMaximo / 2) - ((tamanhoMaximo / 2) - ((contar - t) + 1));
    
    }

    // public static long strangeCounter(long t) {

    //     long x = 0L;
    //     long i = 0L;
    //     long s = 0L;
    //     long k = 1L;

    //     while(x < t) {

    //         // System.out.println(Math.pow(2, i));

    //         x = (long) (3 * Math.pow(2, i));
    //         k += x;

    //         if (k > t) {
                
    //             s = k - t;
    //             break;
    //         }

    //         i++;
    //     }

    //     return s;
    // }

}
