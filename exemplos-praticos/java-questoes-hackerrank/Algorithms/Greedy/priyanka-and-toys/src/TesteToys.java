import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteToys {

    @Test
    public void testeCaso1() {

        List<Integer> pesoPedido = Arrays.asList(1, 2, 3, 21, 7, 12, 14, 21);
        int experado = 4;
        int resultado = Resultado.toys(pesoPedido);

        assertEquals(experado, resultado);
    }
    
    @Test
    public void testeCaso2() {

        List<Integer> pesoPedido = Arrays.asList(16, 18, 10, 13, 2, 9, 17, 17, 0, 19);
        int experado = 3;
        int resultado = Resultado.toys(pesoPedido);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> pesoPedido = Arrays.asList(82, 75, 19, 35, 67, 5, 54, 7, 31, 46);
        int experado = 8;
        int resultado = Resultado.toys(pesoPedido);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso4() {

        List<Integer> pesoPedido = Arrays.asList(88, 34, 99, 23, 30, 84, 56, 37, 5, 55);
        int experado = 7;
        int resultado = Resultado.toys(pesoPedido);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso5() {

        List<Integer> pesoPedido = Arrays.asList(88, 34, 99, 23, 30, 84, 56, 37, 5, 55);
        int experado = 7;
        int resultado = Resultado.toys(pesoPedido);

        assertEquals(experado, resultado);
    }
}
