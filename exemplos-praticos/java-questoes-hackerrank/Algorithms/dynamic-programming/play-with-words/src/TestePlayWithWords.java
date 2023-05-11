import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestePlayWithWords {

    @Test
    public void testeCaso1() {

        String s = "eeegeeksforskeeggeeks";
        int esperado = 50;
        int resultado = Resultado.playWithWords(s);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso2() {

        String s = "dbcbcbededadecbcdecbaeadcecada";
        int esperado = 99;
        int resultado = Resultado.playWithWords(s);

        assertEquals(esperado, resultado);

    }

    @Test
    public void testeCaso3() {

        String s = "jcaabdovmuiwsjkskeyifhfjxebwqbuqkndxmrxpqdbnpecgdh";
        int esperado = 63;
        int resultado = Resultado.playWithWords(s);

        assertEquals(esperado, resultado);

    }

}
