import static org.junit.Assert.assertEquals;

import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Test;

public class TesteNimbleGame {

    @Test
    public void testeCaso1() {

        List<Integer> s = Arrays.asList(0, 2, 3, 0, 6);
        String esperado = "First";
        String resultado = Resultado.nimbleGame(s);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<Integer> s = Arrays.asList(0, 0, 0, 0);
        String esperado = "Second";
        String resultado = Resultado.nimbleGame(s);

        assertEquals(esperado, resultado);

    }
}
