import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteBeautifulPairs {
    
    @Test
    public void testecaso1() {

        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(1, 2, 3, 3);
        int experado = 4;
        
        int resultado = Resultado.beautifulPairs(a, b);

        assertEquals(experado, resultado);
    }

    @Test
    public void testecaso2() {

        List<Integer> a = Arrays.asList(3, 5, 7, 11, 5, 8);
        List<Integer> b = Arrays.asList(5, 7, 11, 10, 5, 8);
        int experado = 6;
        
        int resultado = Resultado.beautifulPairs(a, b);

        assertEquals(experado, resultado);
    }

    @Test
    public void testecaso3() {

        List<Integer> a = Arrays.asList(3, 5, 2, 8, 10);
        List<Integer> b = Arrays.asList(2, 5, 3, 9, 10);
        int experado = 4;
        
        int resultado = Resultado.beautifulPairs(a, b);

        assertEquals(experado, resultado);
    }
}
