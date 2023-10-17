import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteStringsXOR {

    @Test
    public void testeCaso1() {

        String s = "10101";
        String t = "00101";

        String esperado = "10000";

        String resultado = Resultado.stringsXOR(s, t);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        String s = "01010";
        String t = "10101";

        String esperado = "11111";

        String resultado = Resultado.stringsXOR(s, t);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        String s = "1";
        String t = "0";

        String esperado = "1";

        String resultado = Resultado.stringsXOR(s, t);

        assertEquals(esperado, resultado);
    }
    
}
