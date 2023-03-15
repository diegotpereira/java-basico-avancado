
public class Resultado {

    public static long strangeCounter(long t) {

        long x = 0L;
        long i = 0L;
        long s = 0L;
        long k = 1L;

        while(x < t) {

            // System.out.println(Math.pow(2, i));

            x = (long) (3 * Math.pow(2, i));
            k += x;

            if (k > t) {
                
                s = k - t;
                break;
            }

            i++;
        }

        return s;
    }

}
