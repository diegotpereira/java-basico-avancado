import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRedJohn {

    @Test
    public void testeCaso1() {

        int n = 1;
        int esperado = 0;
        int resultado = Resultado.redJohn(n);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso2() {

        int n = 7;
        int esperado = 3;
        int resultado = Resultado.redJohn(n);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso3() {

        int n = 5;
        int esperado = 2;
        int resultado = Resultado.redJohn(n);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso4() {

        int n = 8;
        int esperado = 4;
        int resultado = Resultado.redJohn(n);

        assertEquals(esperado, resultado);
    }

    @Test
    public void testeCaso5() {

        int n = 3;
        int esperado = 0;
        int resultado = Resultado.redJohn(n);

        assertEquals(esperado, resultado);
    }
}
