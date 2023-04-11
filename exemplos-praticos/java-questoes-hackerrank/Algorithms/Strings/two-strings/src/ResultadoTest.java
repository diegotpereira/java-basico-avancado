import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTest {
    
    @Test
    public void testCompartilhamCaractere() {

        String s1 = "hello";
        String s2 = "world";

        String resultadoEsperado = "YES";
        String resultadoAtual = Resultado.twoStrings(s1, s2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testNaoCompartilhamCaractere() {

        String s1 = "hi";
        String s2 = "world";
        String resultadoEsperado = "NO";
        String resultadoAtual = Resultado.twoStrings(s1, s2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
}
