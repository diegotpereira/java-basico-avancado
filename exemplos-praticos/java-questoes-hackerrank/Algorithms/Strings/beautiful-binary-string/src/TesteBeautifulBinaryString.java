import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteBeautifulBinaryString {

    @Test
    public void testBeautifulBinaryString() {

        String b = "0101010";
        int experado = 2;
        int resultado = Resultado.beautifulBinaryString(b);

        assertEquals(experado, resultado);
    }

}
