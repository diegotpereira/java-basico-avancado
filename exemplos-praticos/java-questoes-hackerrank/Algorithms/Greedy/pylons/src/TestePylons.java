import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TestePylons {

    @Test
    public void testeCaso1() {

        int k = 2;
        List<Integer> arr = Arrays.asList(0, 1, 1, 1, 1, 0);
        int esperado = 2;
        int resultado = Resultado.pylons(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int k = 2;
        List<Integer> arr = Arrays.asList(0, 1, 0, 0, 0, 1, 0);
        int esperado = -1;
        int resultado = Resultado.pylons(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int k = 3;
        List<Integer> arr = Arrays.asList(0, 1, 0, 0, 0, 1, 1, 1, 1, 1);
        int esperado = 3;
        int resultado = Resultado.pylons(k, arr);

        assertEquals(esperado, resultado);
    }
    
}
