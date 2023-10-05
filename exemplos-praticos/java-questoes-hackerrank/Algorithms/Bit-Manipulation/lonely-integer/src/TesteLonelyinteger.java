import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Test;

public class TesteLonelyinteger {

    @Test
    public void testeCaso1() {

        List<Integer> arr = Arrays.asList(1);
        int esperado = 1;

        int resultado = Resultado.lonelyinteger(arr);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testeCaso2() {

        List<Integer> arr = Arrays.asList(1, 1, 2);
        int esperado = 2;

        int resultado = Resultado.lonelyinteger(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> arr = Arrays.asList(0, 0, 1, 2, 1);
        int esperado = 2;

        int resultado = Resultado.lonelyinteger(arr);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        List<Integer> arr = Arrays.asList(4, 9, 95, 93, 57, 4, 57, 93, 9);
        int esperado = 95;

        int resultado = Resultado.lonelyinteger(arr);

        assertEquals(esperado, resultado);
    }
}
