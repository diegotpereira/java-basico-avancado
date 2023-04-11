import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {

    @Test
    public void testAlternate() {

        String entrada = "beabeefeab";
        int experado = 5;
        int resultado = Resultado.alternate(entrada);

        assertEquals(experado, resultado);
    }
    
    @Test
    public void testAlternate2() {

        String entrada = "abcabcabc";
        int experado = 6;
        int resultado = Resultado.alternate(entrada);

        assertEquals(experado, resultado);
    }

    @Test
    public void testAlternate3() {

        String input = "aaaaaaa";
        int expectedOutput = 0;
        int actualOutput = Resultado.alternate(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
