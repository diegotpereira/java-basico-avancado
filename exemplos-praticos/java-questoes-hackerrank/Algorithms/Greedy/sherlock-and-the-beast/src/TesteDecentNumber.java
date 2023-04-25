import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteDecentNumber {

    @Test
    public void testecaso1() {

        int entrada = 4;
        String experado = "-1";
        String resultado = Resultado.decentNumber(entrada);

        assertEquals(experado, resultado);

    }

    @Test
    public void testecaso2() {

        int entrada = 3;
        String experado = "555";
        String resultado = Resultado.decentNumber(entrada);

        assertEquals(experado, resultado);

    }

    @Test
    public void testecaso3() {

        int entrada = 5;
        String experado = "33333";
        String resultado = Resultado.decentNumber(entrada);

        assertEquals(experado, resultado);
    }
}
