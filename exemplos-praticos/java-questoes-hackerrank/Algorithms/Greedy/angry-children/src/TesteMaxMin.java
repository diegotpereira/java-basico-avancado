import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteMaxMin {

    @Test
    public void testeCaso1() {

        int k = 3;
        List<Integer> arr = Arrays.asList(10, 100, 300, 200, 1000, 20, 30);
        int experado = 20;
        int resultado = Resultado.maxMin(k, arr);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso2() {

        int k = 4;
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200);
        int experado = 3;
        int resultado = Resultado.maxMin(k, arr);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso3() {

        int k = 2;
        List<Integer> arr = Arrays.asList(1, 2, 1, 2, 1);
        int experado = 0;
        int resultado = Resultado.maxMin(k, arr);

        assertEquals(experado, resultado);
    }
}
