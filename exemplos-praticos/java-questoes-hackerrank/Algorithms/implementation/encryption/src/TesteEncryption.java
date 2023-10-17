import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteEncryption {
    
    @Test
    public void testeCaso1() {

        String s = "haveaniceday";
        
        String esperada =  "hae and via ecy";

        String resultado = Resultado.encryption(s);

        assertEquals(esperada, resultado);
    }

    @Test
    public void testeCaso2() {

        String s = "feedthedog";
        
        String esperada =  "fto ehg ee dd";

        String resultado = Resultado.encryption(s);

        assertEquals(esperada, resultado);
    }

    @Test
    public void testeCaso3() {

        String s = "chillout";
        
        String esperada =  "clu hlt io";

        String resultado = Resultado.encryption(s);

        assertEquals(esperada, resultado);
    }
}
