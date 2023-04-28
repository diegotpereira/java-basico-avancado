import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteCandies {

    @Test
    public void testeCaso1() {

        int n = 3;
        List<Integer> arr = Arrays.asList(1, 2, 2);
        int esperado = 4;
        long resultado = Resultado.candies(n, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int n = 10;
        List<Integer> arr = Arrays.asList(2, 4, 2, 6, 1, 7, 8, 9, 2, 1);
        int esperado = 19;
        long resultado = Resultado.candies(n, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int n = 8;
        List<Integer> arr = Arrays.asList(2, 4, 3, 5, 2, 6, 4, 5);
        int esperado = 12;
        long resultado = Resultado.candies(n, arr);

        assertEquals(esperado, resultado);
    }
}
