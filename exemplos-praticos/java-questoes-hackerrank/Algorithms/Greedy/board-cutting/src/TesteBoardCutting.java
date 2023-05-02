import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteBoardCutting {

    @Test
    public void testeCaso1() {

        List<Integer> custo_y = Arrays.asList(2, 1, 3, 1, 4);
        List<Integer> custo_x = Arrays.asList(4, 1, 2);
        int esperado = 42;
        int resultado = Resultado.boardCutting(custo_y, custo_x);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        List<Integer> custo_y = Arrays.asList(2);
        List<Integer> custo_x = Arrays.asList(1);
        int esperado = 4;
        int resultado = Resultado.boardCutting(custo_y, custo_x);

        assertEquals(esperado, resultado);
    }
}
