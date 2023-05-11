import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TestePairs {

    @Test
    public void testeCaso1() {

        int k = 1;
        List<Integer> arr = Arrays.asList(363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635,
                491595254, 879792181, 1069262793);
        int esperado = 0;
        int resultado = Resultado.pairs(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int k = 2;
        List<Integer> arr = Arrays.asList(1, 5, 3, 4, 2);
        int esperado = 3;
        int resultado = Resultado.pairs(k, arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int k = 2;
        List<Integer> arr = Arrays.asList(1, 3, 5, 8, 6, 4, 2);
        int esperado = 5;
        int resultado = Resultado.pairs(k, arr);

        assertEquals(esperado, resultado);
    }

}
