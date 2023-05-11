import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteStoneDivision {

    @Test
    public void testeCaso1() {

        long n = 12;
        List<Long> s = Arrays.asList(2L, 3L, 4L);
        long esperado = 4;
        long resultado = Resultado.stoneDivision(n, s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        long n = 64;
        List<Long> s = Arrays.asList(2L, 4L, 8L, 16L, 64L);
        long esperado = 29;
        long resultado = Resultado.stoneDivision(n, s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        long n = 1;
        List<Long> s = Arrays.asList(1L, 2L);
        long esperado = 0;
        long resultado = Resultado.stoneDivision(n, s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        long n = 6;
        List<Long> s = Arrays.asList(3L);
        long esperado = 1;
        long resultado = Resultado.stoneDivision(n, s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        long n = 64;
        List<Long> s = Arrays.asList(2L, 4L, 8L, 16L, 32L, 64L);
        long esperado = 31;
        long resultado = Resultado.stoneDivision(n, s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso6() {

        long n = 377083280820L;
        List<Long> s = Arrays.asList(1L, 377083280820L, 2L, 188541640410L, 3L, 125694426940L, 4L, 94270820205L, 5L,
                75416656164L);
        long esperado = 282812460621L;
        long resultado = Resultado.stoneDivision(n, s);

        assertEquals(esperado, resultado);
    }
}
