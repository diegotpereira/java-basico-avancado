import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteKingdomDivision {

    @Test
    public void testeCaso1() {

        int n = 5;
        List<List<Integer>> estradas = new ArrayList<>();

        estradas.add(Arrays.asList(1, 2));
        estradas.add(Arrays.asList(1, 3));
        estradas.add(Arrays.asList(3, 4));
        estradas.add(Arrays.asList(3, 5));

        int esperado = 4;

        int resultado =  Resultado.kingdomDivision(n, estradas);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int n = 7;
        List<List<Integer>> estradas = new ArrayList<>();

        estradas.add(Arrays.asList(1, 2));
        estradas.add(Arrays.asList(1, 5));
        estradas.add(Arrays.asList(2, 3));
        estradas.add(Arrays.asList(2, 4));
        estradas.add(Arrays.asList(5, 6));
        estradas.add(Arrays.asList(7, 5));

        int esperado = 6;

        int resultado =  Resultado.kingdomDivision(n, estradas);

        assertEquals(esperado, resultado);
    }
    
}
