import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteBiggerIsGreater {

    @Test
    public void testeCaso1() {

        String w = "ab";
        String esperado = "ba";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        String w = "bb";
        String esperado = "no answer";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        String w = "hefg";
        String esperado = "hegf";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        String w = "dhck";
        String esperado = "dhkc";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        String w = "dkhc";
        String esperado = "hcdk";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso6() {

        String w = "lmno";
        String esperado = "lmon";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso7() {

        String w = "dcba";
        String esperado = "no answer";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso8() {

        String w = "dcbb";
        String esperado = "no answer";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso9() {

        String w = "abdc";
        String esperado = "acbd";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso10() {

        String w = "abcd";
        String esperado = "abdc";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso11() {

        String w = "fedcbabcd";
        String esperado = "fedcbabdc";
        String resultado = Resultado.biggerIsGreater(w);

        assertEquals(esperado, resultado);
    }
}
