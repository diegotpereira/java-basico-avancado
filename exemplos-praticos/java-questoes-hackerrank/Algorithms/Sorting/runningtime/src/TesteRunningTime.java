import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteRunningTime {

    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(2, 1, 3, 1, 2);
        int esperado = 4;

        int resultado = Resultado.runningTime(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3, 3, 5, 5, 7, 7, 9, 9);
        int esperado = 0;

        int resultado = Resultado.runningTime(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> arr = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        int esperado = 45;

        int resultado = Resultado.runningTime(arr);

        assertEquals(esperado, resultado);
    }
    
}
