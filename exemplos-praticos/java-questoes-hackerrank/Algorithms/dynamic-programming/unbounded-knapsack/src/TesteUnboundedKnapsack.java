import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteUnboundedKnapsack {

    @Test
    public void testeCaso1() {

        int k = 12;
        List<Integer> arr = Arrays.asList(1, 6, 9);
        int esperado = 12;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int k = 9;
        List<Integer> arr = Arrays.asList(3, 4, 4, 4, 8);
        int esperado = 9;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int k = 13;
        List<Integer> arr = Arrays.asList(3, 7, 9, 11);
        int esperado = 13;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        int k = 11;
        List<Integer> arr = Arrays.asList(3, 7, 9);
        int esperado = 10;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        int k = 9;
        List<Integer> arr = Arrays.asList(3, 9);
        int esperado = 9;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso6() {

        int k = 12;
        List<Integer> arr = Arrays.asList(3, 10, 4);
        int esperado = 12;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso7() {

        int k = 13;
        List<Integer> arr = Arrays.asList(3, 10, 4);
        int esperado = 13;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso8() {

        int k = 2000;
        List<Integer> arr = Arrays.asList(2000, 2000, 2000);
        int esperado = 2000;
        int resultado = Resultado.unboundedKnapsack(k, arr);

        assertEquals(esperado, resultado);
    }

}
