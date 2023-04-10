import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {

    @Test
    public void testFunnyString() {

        assertEquals("FUNNY", Resultado.funnyString("acxz"));
        assertEquals("NOT FUNNY", Resultado.funnyString("bcxz"));
        assertEquals("FUNNY", Resultado.funnyString("aaaaa"));
        assertEquals("FUNNY", Resultado.funnyString("ab"));
        assertEquals("NOT FUNNY", Resultado.funnyString("abce"));
    }
}
