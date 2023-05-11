import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteMisereNim {

    @Test
    public void testeCaso1() {

        List<Integer> s = Arrays.asList(1, 1);
        String esperado = "First";
        String resultado = Resultado.misereNim(s);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<Integer> s = Arrays.asList(2, 1, 3);
        String esperado = "Second";
        String resultado = Resultado.misereNim(s);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        List<Integer> s = Arrays.asList(9, 8, 4, 4, 4, 7);
        String esperado = "First";
        String resultado = Resultado.misereNim(s);

        assertEquals(esperado, resultado);

    }

}
