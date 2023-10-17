public class Resultado {
    
    public static long andProduct(long a, long b) {

        long resposta = a;

        for (int i = 0; a + (1 << i) < b; i++) {
            
            resposta &= a + (1 << i);
        }

        return resposta & b;
    }
}
