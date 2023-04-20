import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResultadoTeste {
    
    @Test
    public void testStringConstruction() {

        String s = "abcd";
        int resultado = Resultado.stringConstruction(s);

        assertEquals(4, resultado);

        s = "aaaa";
        resultado = Resultado.stringConstruction(s);
        assertEquals(1, resultado);

        s = "abab";
        resultado = Resultado.stringConstruction(s);
        assertEquals(2, resultado);

        
    }
}
