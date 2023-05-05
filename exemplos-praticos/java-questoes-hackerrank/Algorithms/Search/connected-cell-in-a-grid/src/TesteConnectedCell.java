import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteConnectedCell {

    @Test
    public void testeCaso1() {

        List<List<Integer>> matrix = Arrays.asList(

                Arrays.asList(1, 1, 0, 0, 0),
                Arrays.asList(0, 1, 1, 0, 0),
                Arrays.asList(0, 0, 1, 0, 1),
                Arrays.asList(1, 0, 0, 0, 1),
                Arrays.asList(0, 1, 0, 1, 1));

        int esperado = 5;
        int resultado = Resultado.connectedCell(matrix);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<List<Integer>> matrix = Arrays.asList(

                Arrays.asList(1, 1, 0, 0),
                Arrays.asList(0, 1, 1, 0),
                Arrays.asList(0, 0, 1, 0),
                Arrays.asList(1, 0, 0, 0));

        int esperado = 5;
        int resultado = Resultado.connectedCell(matrix);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        List<List<Integer>> matrix = Arrays.asList(

                Arrays.asList(0, 1, 1, 1, 1),
                Arrays.asList(1, 0, 0, 0, 1),
                Arrays.asList(1, 1, 0, 1, 0),
                Arrays.asList(0, 1, 0, 1, 1),
                Arrays.asList(0, 1, 1, 1, 0));

        int esperado = 15;
        int resultado = Resultado.connectedCell(matrix);

        assertEquals(esperado, resultado);

    }
}
