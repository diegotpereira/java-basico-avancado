import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteGameOfStones {

    @Test
    public void casoTeste1() {

        int n = 1;
        String experado = "Second";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste2() {

        int n = 2;
        String experado = "First";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste3() {

        int n = 3;
        String experado = "First";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste4() {

        int n = 4;
        String experado = "First";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste5() {

        int n = 5;
        String experado = "First";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste6() {

        int n = 6;
        String experado = "First";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste7() {

        int n = 7;
        String experado = "Second";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

    @Test
    public void casoTeste8() {

        int n = 10;
        String experado = "First";
        String resultado = Resultado.gameOfStones(n);

        assertEquals(experado, resultado);
    }

}
