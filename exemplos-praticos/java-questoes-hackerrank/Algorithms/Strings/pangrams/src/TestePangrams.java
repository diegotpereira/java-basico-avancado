import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestePangrams {

    @Test
    public void testPangrams() {

        String s = "We promptly judged antique ivory buckles for the next prize";
        String experado = "pangram";
        String resultado = Resultado.pangrams(s);

        assertEquals(experado, resultado);
    }

    @Test
    public void testNotPangram() {

        String s = "We promptly judged antique ivory buckles for the prize";
        String experado = "not pangram";
        String resultado = Resultado.pangrams(s);

        assertEquals(experado, resultado);
    }

    @Test
    public void testStringVazia() {

        String s = "";
        String experado = "not pangram";
        String resultado = Resultado.pangrams(s);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeTodasCaixaBaixa() {

        String s = "the quick brown fox jumps over the lazy dog";
        String experado = "pangram";
        String resultado = Resultado.pangrams(s);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeTodasCaixaAlta() {

        String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String experado = "pangram";
        String resultado = Resultado.pangrams(s);

        assertEquals(experado, resultado);

    }

    @Test
    public void testApenasUmaLetra() {

        String s = "a";
        String experado = "not pangram";
        String resultado = Resultado.pangrams(s);

        assertEquals(experado, resultado);
    }
}
