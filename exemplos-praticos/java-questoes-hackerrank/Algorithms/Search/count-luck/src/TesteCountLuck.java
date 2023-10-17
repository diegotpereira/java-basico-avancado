import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TesteCountLuck {

    @Test
    public void testeCaso1() {
        List<String> matriz = Arrays.asList("*.M", ".X.", "X..");
        int palpites = 1;
        String resultado = Resultado.countLuck(matriz, palpites);
        assertEquals("Impressed", resultado);
    }

    @Test
    public void testeCaso2() {
        List<String> matriz = Arrays.asList(".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX.");
        int palpites = 3;
        String resultado = Resultado.countLuck(matriz, palpites);
        assertEquals("Impressed", resultado);
    }

    @Test
    public void testeCaso3() {
        List<String> matriz = Arrays.asList(".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX.");
        int palpites = 4;
        String resultado = Resultado.countLuck(matriz, palpites);
        assertEquals("Oops!", resultado);
    }


    @Test
    public void testeCaso4() {
        List<String> matriz = Arrays.asList("*.X", "X.X", "X.M");
        int palpites = 0;
        String resultado = Resultado.countLuck(matriz, palpites);
        assertEquals("Impressed", resultado);
    }

    @Test
    public void testeCaso5() {
        List<String> matriz = Arrays.asList("*.X", "X.X", "..M");
        int palpites = 1;
        String resultado = Resultado.countLuck(matriz, palpites);
        assertEquals("Impressed", resultado);
    }

    @Test
    public void testeCaso6() {
        List<String> matriz = Arrays.asList("*..", "X.X", "..M");
        int palpites = 1;
        String resultado = Resultado.countLuck(matriz, palpites);
        assertEquals("Oops!", resultado);
    }
}
