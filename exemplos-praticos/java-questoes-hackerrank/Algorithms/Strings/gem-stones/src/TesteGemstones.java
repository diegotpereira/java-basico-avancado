import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class TesteGemstones {

    @Test
    public void testGemstones() {

        List<String> arr = Arrays.asList("abcdde", "baccd", "eeabg");

        int experado = 2;
        int resultado = Resultado.gemstones(arr);

        assertEquals(experado, resultado);
    }

}
