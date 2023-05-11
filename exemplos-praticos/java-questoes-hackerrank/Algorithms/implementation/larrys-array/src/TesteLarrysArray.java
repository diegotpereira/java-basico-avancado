import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteLarrysArray {

    @Test
    public void testeCaso1() {

        List<Integer> A = Arrays.asList(3, 1, 2);
        String esperado = "YES";
        String resultado = Resultado.larrysArray(A);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> A = Arrays.asList(1, 3, 4, 2);
        String esperado = "YES";
        String resultado = Resultado.larrysArray(A);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> A = Arrays.asList(1, 2, 3, 5, 4);
        String esperado = "NO";
        String resultado = Resultado.larrysArray(A);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        List<Integer> A = Arrays.asList(1, 6, 5, 2, 3, 4);
        String esperado = "NO";
        String resultado = Resultado.larrysArray(A);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        List<Integer> A = Arrays.asList(3, 1, 2, 4);
        String esperado = "YES";
        String resultado = Resultado.larrysArray(A);

        assertEquals(esperado, resultado);
    }
}
