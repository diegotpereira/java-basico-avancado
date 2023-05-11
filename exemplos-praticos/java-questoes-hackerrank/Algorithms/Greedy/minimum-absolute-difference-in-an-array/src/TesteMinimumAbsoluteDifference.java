import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteMinimumAbsoluteDifference {

    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(3, -7, 0);
        int esperado = 3;
        int resultado = Resultado.minimumAbsoluteDifference(arr);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<Integer> arr = Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75);
        int esperado = 1;
        int resultado = Resultado.minimumAbsoluteDifference(arr);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        List<Integer> arr = Arrays.asList(1, -3, 71, 68, 17);
        int esperado = 3;
        int resultado = Resultado.minimumAbsoluteDifference(arr);

        assertEquals(esperado, resultado);

    }

}
