import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {
    
    // @Test
    // public void testeHighestValuePalindrome() {

    //     String entrada = "12321";

    //     int n = entrada.length();

    //     int k = 1;

    //     String resultado = Resultado.highestValuePalindrome(entrada, n, k);

    //     assertEquals("92329", resultado)
    // }

    @Test
    public void testeHighestValuePalindrome1() {

        String s = "12345";
        int n = s.length();
        int k = 2;

        String resultado = Resultado.highestValuePalindrome(s, n, k);

        assertEquals("54345", resultado);
    }

    @Test
    public void testeHighestValuePalindrome2() {

        String s = "1111";

        int n = s.length();

        int  k = 2;

        String resultado = Resultado.highestValuePalindrome(s, n, k);

        assertEquals("9119", resultado);
    }


    @Test
    public void testeHighestValuePalindromeCaso3() {
        String s = "12321";
        int n = s.length();
        int k = 1;

        String resultado = Resultado.highestValuePalindrome(s, n, k);

        assertEquals("12921", resultado);
    }

    @Test
    public void testeHighestValuePalindromeCaso4() {
        String s = "12121";
        int n = s.length();
        int k = 0;

        String resultado = Resultado.highestValuePalindrome(s, n, k);

        assertEquals("12121", resultado);
    }
}