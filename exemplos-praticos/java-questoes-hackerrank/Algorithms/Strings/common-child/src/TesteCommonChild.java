import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCommonChild {

    @Test
    public void testeCaso1() {

        String s1 = "HARRY";
        String s2 = "SALLY";
        int esperado = 2;
        int resultado = Resultado.commonChild(s1, s2);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        String s1 = "AA";
        String s2 = "BB";
        int esperado = 0;
        int resultado = Resultado.commonChild(s1, s2);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso() {

        String s1 = "SHINCHAN";
        String s2 = "NOHARAAA";
        int esperado = 3;
        int resultado = Resultado.commonChild(s1, s2);

        assertEquals(esperado, resultado);

    }

}
