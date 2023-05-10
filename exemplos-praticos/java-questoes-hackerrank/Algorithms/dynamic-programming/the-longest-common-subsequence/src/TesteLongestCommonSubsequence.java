import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.Test;

public class TesteLongestCommonSubsequence {

    @Test
    public void testeCaso1() {

        List<Integer> a = Arrays.asList(1, 2, 3, 4, 1);
        List<Integer> b = Arrays.asList(3, 4, 1, 2, 1, 3);

        List<Integer> esperado = Arrays.asList(3, 4, 1);

        List<Integer> resultado = Resultado.longestCommonSubsequence(a, b);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        List<Integer> a = Arrays.asList(3, 9, 8, 3, 9, 7, 9, 7, 0);
        List<Integer> b = Arrays.asList(3, 3, 9, 9, 9, 1, 7, 2, 0, 6);

        List<Integer> esperado = Arrays.asList(3, 3, 9, 9, 7, 0);

        List<Integer> resultado = Resultado.longestCommonSubsequence(a, b);

        assertEquals(esperado, resultado);

    }

}
