import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteNimGame {

    @Test
    public void testeCaso1() {

        List<Integer> pile = Arrays.asList(1, 1);
        String esperado = "Second";
        String resultado = Resultado.nimGame(pile);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> pile = Arrays.asList(2, 1, 4);
        String esperado = "First";
        String resultado = Resultado.nimGame(pile);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        List<Integer> pile = Arrays.asList(3, 5);
        String esperado = "First";
        String resultado = Resultado.nimGame(pile);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        List<Integer> pile = Arrays.asList(1, 3, 5, 7);
        String esperado = "Second";
        String resultado = Resultado.nimGame(pile);

        assertEquals(esperado, resultado);
    }

}
