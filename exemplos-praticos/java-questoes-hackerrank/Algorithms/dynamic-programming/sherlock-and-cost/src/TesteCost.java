import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteCost {
    
    @Test
    public void testeCaso1() {

        List<Integer> arr1 = Arrays.asList(100, 2, 100, 2, 100);
        int esperado = 396;
        int resultado = Resultado.cost(arr1);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> arr1 = Arrays.asList(3, 15, 4, 12, 10);
        int esperado = 50;
        int resultado = Resultado.cost(arr1);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> arr1 = Arrays.asList(4, 7, 9);
        int esperado = 12;
        int resultado = Resultado.cost(arr1);

        assertEquals(esperado, resultado);
    }
}
