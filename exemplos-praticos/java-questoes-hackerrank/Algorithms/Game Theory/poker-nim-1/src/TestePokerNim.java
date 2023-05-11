import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TestePokerNim {

    @Test
    public void testeCaso1() {

        int k = 5;
        List<Integer> c = Arrays.asList(1, 2);
        String esperado = "First";
        String resultado = Resultado.pokerNim(k, c);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        int k = 5;
        List<Integer> c = Arrays.asList(2, 1, 3);
        String esperado = "Second";
        String resultado = Resultado.pokerNim(k, c);

        assertEquals(esperado, resultado);

    }
}
