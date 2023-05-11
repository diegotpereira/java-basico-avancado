import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteChessboardGame {

    @Test
    public void testeCaso1() {

        int x = 5;
        int y = 2;
        String esperado = "Second";
        String resposta = Resultado.chessboardGame(x, y);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso2() {

        int x = 5;
        int y = 3;
        String esperado = "First";
        String resposta = Resultado.chessboardGame(x, y);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso3() {

        int x = 8;
        int y = 8;
        String esperado = "First";
        String resposta = Resultado.chessboardGame(x, y);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso4() {

        int x = 7;
        int y = 3;
        String esperado = "First";
        String resposta = Resultado.chessboardGame(x, y);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso5() {

        int x = 8;
        int y = 12;
        String esperado = "First";
        String resposta = Resultado.chessboardGame(x, y);

        assertEquals(esperado, resposta);
    }

    @Test
    public void testeCaso6() {

        int x = 9;
        int y = 7;
        String esperado = "First";
        String resposta = Resultado.chessboardGame(x, y);

        assertEquals(esperado, resposta);
    }

}
