import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteSherlockAndAnagrams {

    @Test
    public void testeCaso1() {

        String s = "abba";
        int esperado = 4;
        int resultado = Resultado.sherlockAndAnagrams(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        String s = "abcd";
        int esperado = 0;
        int resultado = Resultado.sherlockAndAnagrams(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        String s = "ifailuhkqq";
        int esperado = 3;
        int resultado = Resultado.sherlockAndAnagrams(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        String s = "kkkk";
        int esperado = 10;
        int resultado = Resultado.sherlockAndAnagrams(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        String s = "cdcd";
        int esperado = 5;
        int resultado = Resultado.sherlockAndAnagrams(s);

        assertEquals(esperado, resultado);
    }

}
