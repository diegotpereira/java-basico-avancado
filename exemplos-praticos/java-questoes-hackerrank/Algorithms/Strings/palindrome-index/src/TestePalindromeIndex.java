import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestePalindromeIndex {

    @Test
    public void TestPalindromeIndex1() {

        String entrada = "aaab";
        int experado = 3;

        int resultado = Resultado.palindromeIndex(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestPalindromeIndex2() {

        String entrada = "baa";
        int experado = 0;

        int resultado = Resultado.palindromeIndex(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void TestPalindromeIndex3() {

        String entrada = "aaa";
        int experado = -1;

        int resultado = Resultado.palindromeIndex(entrada);

        assertEquals(experado, resultado);
    }

}
