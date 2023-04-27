import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteLargestPermutation {

    @Test
    public void testeCaso1() {

        int k = 1;
        List<Integer> arr = Arrays.asList(4, 2, 3, 5, 1);
        List<Integer> experado = Arrays.asList(5, 2, 3, 4, 1);
        List<Integer> resultado = Resultado.largestPermutation(k, arr);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso2() {

        int k = 1;
        List<Integer> arr = Arrays.asList(2, 1, 3);
        List<Integer> experado = Arrays.asList(3, 1, 2);
        List<Integer> resultado = Resultado.largestPermutation(k, arr);

        assertEquals(experado, resultado);
    }
    
    @Test
    public void testeCaso3() {

        int k = 1;
        List<Integer> arr = Arrays.asList(2, 1);
        List<Integer> experado = Arrays.asList(2, 1);
        List<Integer> resultado = Resultado.largestPermutation(k, arr);

        assertEquals(experado, resultado);
    }
}
