import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteKnightlOnAChessboard {

    @Test
    public void testeCaso1() {

        int n = 5;
        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(4, 4, 2, 8),
                Arrays.asList(4, 2, 4, 4),
                Arrays.asList(2, 4, -1, -1),
                Arrays.asList(8, 4, -1, 1));

        List<List<Integer>> resultado = Resultado.knightlOnAChessboard(n);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int n = 6;
        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(5, 4, 3, 2, 5),
                Arrays.asList(4, -1, 2, -1, -1),
                Arrays.asList(3, 2, -1, -1, -1),
                Arrays.asList(2, -1, -1, -1, -1),
                Arrays.asList(5, -1, -1, -1, 1));

        List<List<Integer>> resultado = Resultado.knightlOnAChessboard(n);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int n = 7;
        List<List<Integer>> esperado = Arrays.asList(
                Arrays.asList(6, 4, 4, 8, 2, 12),
                Arrays.asList(4, 3, 4, 2, 16, 3),
                Arrays.asList(4, 4, 2, 4, 4, 4),
                Arrays.asList(8, 2, 4, -1, -1, -1),
                Arrays.asList(2, 16, 4, -1, -1, -1),
                Arrays.asList(12, 3, 4, -1, -1, 1));

        List<List<Integer>> resultado = Resultado.knightlOnAChessboard(n);

        assertEquals(esperado, resultado);
    }

}
