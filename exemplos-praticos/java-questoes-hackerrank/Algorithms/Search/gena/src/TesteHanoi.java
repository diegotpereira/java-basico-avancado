import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteHanoi {

    @Test
    public void testeCaso1() {

        List<Integer> postagens = Arrays.asList(1, 4, 1);
        int esperado = 3;

        int resultado = Resultado.hanoi(postagens);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> postagens = Arrays.asList(1, 3, 3);
        int esperado = 5;

        int resultado = Resultado.hanoi(postagens);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> postagens = Arrays.asList(2, 1, 3, 2);
        int esperado = 7;

        int resultado = Resultado.hanoi(postagens);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testeCaso4() {

        List<Integer> postagens = Arrays.asList(2, 4, 4, 4);
        int esperado = 8;

        int resultado = Resultado.hanoi(postagens);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        List<Integer> postagens = Arrays.asList(2, 4, 2, 4);
        int esperado = 6;

        int resultado = Resultado.hanoi(postagens);

        assertEquals(esperado, resultado);
    }
}
