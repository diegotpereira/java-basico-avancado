import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteMaxSubarray {

    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        List<Integer> esperado = Arrays.asList(10, 10);
        List<Integer> resultado = Resultado.maxSubarray(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> arr = Arrays.asList(2, -1, 2, 3, 4, -5);
        List<Integer> esperado = Arrays.asList(10, 11);
        List<Integer> resultado = Resultado.maxSubarray(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> arr = Arrays.asList(-2, -3, -1, -4, -6);
        List<Integer> esperado = Arrays.asList(-1, -1);
        List<Integer> resultado = Resultado.maxSubarray(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        List<Integer> arr = Arrays.asList(-100, -1);
        List<Integer> esperado = Arrays.asList(-1, -1);
        List<Integer> resultado = Resultado.maxSubarray(arr);

        assertEquals(esperado, resultado);
    }

}
