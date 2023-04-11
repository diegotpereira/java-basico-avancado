import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {

    @Test
    public void testAlternatingCharacters() {

        String s1 = "AAAA";
        String s2 = "BBBBB";
        String s3 = "ABABABAB";
        String s4 = "BABABA";
        String s5 = "AAABBB";

        assertEquals(3, Resultado.alternatingCharacters(s1));
        assertEquals(4, Resultado.alternatingCharacters(s2));
        assertEquals(0, Resultado.alternatingCharacters(s3));
        assertEquals(0, Resultado.alternatingCharacters(s4));
        assertEquals(4, Resultado.alternatingCharacters(s5));

    }

}
