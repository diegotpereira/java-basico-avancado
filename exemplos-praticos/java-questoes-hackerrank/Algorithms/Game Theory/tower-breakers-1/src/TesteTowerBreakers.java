import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteTowerBreakers {

    @Test
    public void testeCaso1() {

        int n = 2;
        int m = 2;
        int experado = 2;
        int resultado = Resultado.towerBreakers(n, m);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso2() {

        int n = 1;
        int m = 4;
        int experado = 1;
        int resultado = Resultado.towerBreakers(n, m);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso3() {

        int n = 1;
        int m = 7;
        int experado = 1;
        int resultado = Resultado.towerBreakers(n, m);

        assertEquals(experado, resultado);
    }

    @Test
    public void testeCaso4() {

        int n = 3;
        int m = 7;
        int experado = 1;
        int resultado = Resultado.towerBreakers(n, m);

        assertEquals(experado, resultado);
    }

}
