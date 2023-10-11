import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteShortPalindrome {

    @Test
    public void testeCaso1() {

        String s = "kkkkkkz";
        int esperado = 15;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        String s = "abbaab";
        int esperado = 4;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        String s = "akakak";
        int esperado = 2;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        String s = "abba";
        int esperado = 1;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testeCaso5() {

        String s = "aaaaz";
        int esperado = 1;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso6() {

        String s = "baabababaaaababbbbbbabbbbabbbaaabaaabbbbaabbbbbbab";
        int esperado = 59222;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso7() {

        String s = "cbbdcacccdaddbaabbaacbacacaaddaaacdbccccccbbadbbcdddddddaccbdbddcbacaaadbbdcbcbcdabdddbbcdccaacdccab";
        int esperado = 242745;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso8() {

        String s = "ony";
        int esperado = 0;

        int resultado = Resultado.shortPalindrome(s);

        assertEquals(esperado, resultado);
    }
}
